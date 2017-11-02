package first
import org.apache.directory.api.ldap.model.entry.DefaultEntry
import org.apache.directory.api.ldap.model.message.AddRequestImpl
import org.apache.directory.api.ldap.model.message.controls.ManageDsaITImpl
import org.apache.directory.ldap.client.api.LdapNetworkConnection
import org.apache.directory.api.ldap.model.message.ResultCodeEnum


class SecondGroovy {
	

	static void main(def args) throws Exception {
	
		def connection = new LdapNetworkConnection("localhost", 10389)
		connection.bind("uid=admin,ou=system", "secret")
		
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
	}
	
}
