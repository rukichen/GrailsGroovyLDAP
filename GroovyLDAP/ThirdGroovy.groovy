package first

import org.apache.directory.api.ldap.model.entry.*
import org.apache.directory.api.ldap.model.name.*
import org.apache.directory.ldap.client.api.*
import org.apache.directory.api.ldap.model.message.*
import org.apache.directory.ldap.client.api.ModifyDnRequest.*



class ThirdGroovy {
	static void main(def args) throws Exception {
		//connection
		def connection = new LdapNetworkConnection("localhost", 10389)
		connection.bind("uid=admin,ou=system", "secret")
		
		//2.3.1 Operations for Modification on the attributes
		// Add Attributes
		
		def addedGivenName = new DefaultModification(ModificationOperation.ADD_ATTRIBUTE, "givenName", "Oskar", "Hermann")
		def addedUid = new DefaultModification(ModificationOperation.ADD_ATTRIBUTE, "uid",	"owilder")
		connection.modify("cn=Oskar Wild,ou=Users,dc=example,dc=com", addedGivenName, addedUid)

		// Remove Attributes
		def deletedGivenName = new DefaultModification(ModificationOperation.REMOVE_ATTRIBUTE, "givenName")		
		connection.modify("cn=Oskar Wild,ou=Users,dc=example,dc=com", deletedGivenName)
		
		// Remove Attribute and value
		connection.modify("cn=Oskar Wild,ou=Users,dc=example,dc=com", addedGivenName)
		def removedGivenNameValue = new DefaultModification(ModificationOperation.REMOVE_ATTRIBUTE, "givenName", "Hermann")		
		connection.modify("cn=Oskar Wild,ou=Users,dc=example,dc=com", removedGivenNameValue)
		
		// Replace Value of an Attribute
		def replaceSn = new DefaultModification(ModificationOperation.REPLACE_ATTRIBUTE, "sn", "Wild")
		connection.modify("cn=Oskar Wild,ou=Users,dc=example,dc=com", replaceSn)
		
		//2.3.2 Rename and Move 
		//Rename with ModifyDnRequest
		def entryDn = new Dn("cn=Oskar Wild,ou=Users,dc=example,dc=com")

	    def modDnRequest = new ModifyDnRequestImpl()
	    modDnRequest.setName(entryDn)
		modDnRequest.setNewRdn("cn=Oskar Wilder")
		modDnRequest.setDeleteOldRdn(true)
		
		def modifyDnResponse = connection.modifyDn(modDnRequest)

		if (ResultCodeEnum.SUCCESS == modifyDnResponse.getLdapResult().getResultCode()){
			println "Wild got Wilder"
		}
		
		// Move with ModifyDnRequest
		def entryDN = new Dn("cn=Samuel Langhorne Clemens,cn=Mark Twain,ou=Users,dc=example,dc=com")
		def newEntryDn = new Dn("ou=Users,dc=example,dc=com")
		def movDnRequest = new ModifyDnRequestImpl()
		movDnRequest.setName(entryDN)
		movDnRequest.setNewSuperior(newEntryDn)
		movDnRequest.setNewRdn(entryDN.getRdn())
		def moveDnResponse= connection.modifyDn(movDnRequest)
		if (ResultCodeEnum.SUCCESS == moveDnResponse.getLdapResult().getResultCode()){
			println "Samuel moved up"
		}
		
		// Move and Rename at the same time with ModifyDnRequest
		def oldEntryDN = new Dn("cn=Oskar Wilder,ou=Users,dc=example,dc=com")
		def newEntryDN = new Dn("cn=Oskar Wild,cn=Mark Twain,ou=Users,dc=example,dc=com")
		
		def movAndRenameDnRequest = new ModifyDnRequestImpl()
		movAndRenameDnRequest.setName(oldEntryDN)
		movAndRenameDnRequest.setNewRdn(newEntryDN.getRdn())
		movAndRenameDnRequest.setNewSuperior(newEntryDN.getParent())
		
		movAndRenameDnRequest.setDeleteOldRdn(true)
		def moveAndRenameDnResponse = connection.modifyDn(movAndRenameDnRequest)
		
		if (ResultCodeEnum.SUCCESS == moveAndRenameDnResponse.getLdapResult().getResultCode()){
			println "Oskar went to Mark and changed back to Wild"
		}
		
	}
}
