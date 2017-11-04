package first
import org.apache.directory.api.ldap.model.entry.DefaultEntry
import org.apache.directory.api.ldap.model.message.AddRequestImpl
import org.apache.directory.api.ldap.model.message.DeleteRequestImpl
import org.apache.directory.api.ldap.model.message.controls.ManageDsaITImpl
import org.apache.directory.api.ldap.model.message.controls.OpaqueControl
import org.apache.directory.ldap.client.api.LdapNetworkConnection
import org.apache.directory.api.ldap.model.message.ResultCodeEnum
import org.apache.directory.api.ldap.model.name.Dn


class SecondGroovy {
	

	static void main(def args) throws Exception {
		//connection
		def connection = new LdapNetworkConnection("localhost", 10389)
		connection.bind("uid=admin,ou=system", "secret")
		
		//2.2.1 Adding an entry
		assert !connection.exists("cn=Oskar Wild,ou=Users,dc=example,dc=com")
		
		connection.add(new DefaultEntry(
				"cn=Oskar Wild,ou=Users,dc=example,dc=com", 
				"ObjectClass: top",
				"ObjectClass: person",
				"cn: oskar wild",
				"sn: Oskar"))
		
		if (connection.exists("cn=Oskar Wild,ou=Users,dc=example,dc=com")) {
			println "You added Oskar Wild"
		}
		
		//2.2.2 Sending an AddRequest
		assert !connection.exists("cn=Mark Twain,ou=Users,dc=example,dc=com")
		
		def entry = new DefaultEntry(
				"cn=Mark Twain,ou=Users,dc=example,dc=com",
				"ObjectClass: top",
				"ObjectClass: person",
				"cn: mark twain",
				"sn: Mark")
		
		def addRequest = new AddRequestImpl()
		addRequest.setEntry(entry)
		addRequest.addControl(new ManageDsaITImpl())

		def response = connection.add(addRequest)

		assert response
		assert ResultCodeEnum.SUCCESS == response.getLdapResult().getResultCode()	
		if (connection.exists("cn=Mark Twain,ou=Users,dc=example,dc=com")) {
			println "You added Mark Twain"
		}
		
		//2.2.4 Deleting entries
		assert connection.exists( "cn=Mark Twain,ou=Users,dc=example,dc=com") 
		connection.delete("cn=Mark Twain,ou=Users,dc=example,dc=com")
		if( !connection.exists("cn=Mark Twain,ou=Users,dc=example,dc=com")){
			println "Deleted Mark Twain successfully"
		}
		
/**
 * Sending a DeleteRequest 
 * This part is partly toggled because of the abilities of the Apache DS Server.
 * Tree Deletion is not supported. 
 * If have a supportive server, here it what it will do. 
 * First it adds Mark Twain and a Child (here his real name)
 * Choose one of these:
 * Tree Delete: simple way
 * Tree Delete with request and control  
 */
		
// Adding Mark Twain and Samuel Langhorne Clemens as Child of Mark Twain		
		connection.add(new DefaultEntry(
			    "cn=Mark Twain,ou=Users,dc=example,dc=com",
			    "ObjectClass: top",
			    "ObjectClass: person",
			    "cn: mark twain",
				"sn: Mark"))
		if( connection.exists("cn=Mark Twain,ou=Users,dc=example,dc=com")){
			println "You added Mark Twain successfully"
		}
		connection.add(new DefaultEntry(
				"cn=Samuel Langhorne Clemens,cn=Mark Twain,ou=Users,dc=example,dc=com",
				"ObjectClass: top",
				"ObjectClass: person",
				"cn: samuel langhorne clemens",
				"cn: mark twain",
				"sn: Samuel"))
		if( !connection.exists("cn=Samuel Langhorne Clemens,cn=Mark Twain,ou=Users,dc=example,dc=com")){
			println "You added Samuel Langhorne Clemens as Mark Twains Child successfully"
		}
		
// Tree Delete
//		assert connection.exists( "cn=Mark Twain,ou=Users,dc=example,dc=com" )
//		
//		connection.deleteTree( "cn=Mark Twain,ou=Users,dc=example,dc=com" )
//
//		if(!connection.exists( "cn=Mark Twain,ou=Users,dc=example,dc=com" ) ){
//			println "Deleted Mark Twain nad child successfully"
//		}
		
// Tree Delete with request and control
		assert connection.exists( "cn=Mark Twain,ou=Users,dc=example,dc=com" )
		
		if ( connection.isControlSupported( "1.2.840.113556.1.4.805" ) ){
			def deleteRequest = new DeleteRequestImpl()
			deleteRequest.setName( new Dn( "cn=Mark Twain,ou=Users,dc=example,dc=com" ) )
			def deleteTreeControl = new OpaqueControl( "1.2.840.113556.1.4.805" )
			deleteRequest.addControl( deleteTreeControl )
			connection.delete( deleteRequest )

			if(!connection.exists( "cn=Mark Twain,ou=Users,dc=example,dc=com" ) ){
				println "Deleted Mark Twain and child successfully"
			}
		}else{
			println "Control 1.2.840.113556.1.4.805 is not supported"
		}
		
	}

}
