package first

import org.apache.directory.ldap.client.api.LdapNetworkConnection
import org.apache.directory.api.ldap.model.message.SearchRequestImpl
import org.apache.directory.api.ldap.model.message.SearchResultEntry
import org.apache.directory.api.ldap.model.message.SearchScope
import org.apache.directory.api.ldap.model.name.Dn

class FirstGroovy {
	static void main(def args) {
		
		def connection = new LdapNetworkConnection( "localhost", 10389)
		connection.bind("uid=admin,ou=system", "secret")
		
		println "Results of 2.1.7 Printing: "
		
		def cursor = connection.search( "ou=system", "(objectClass=*)", SearchScope.ONELEVEL)
		cursor.each { entry ->
			println entry
			}
		cursor.close()
		
		println "Results of 2.1.7 Printing Details:"
		
		cursor = connection.search( "ou=users,dc=example,dc=com", "(objectClass=*)", SearchScope.ONELEVEL)
		cursor.each { entry ->
			println entry.get("uid")
			}
		cursor.close()
		
		println "Results of 2.1.8 Complex Search:"
		
		def req = new SearchRequestImpl()
		req.setScope(SearchScope.SUBTREE)
		req.addAttributes("*")
		req.setTimeLimit(0)
		req.setBase( new Dn("ou=users,dc=example,dc=com"))
		req.setFilter("(cn=jane austen)")
		
		def searchCursor = connection.search(req)
		
		while (searchCursor.next())	{
			def response = searchCursor.get()
			if (response instanceof SearchResultEntry) {
				def resultEntry = ((SearchResultEntry)response).getEntry()
				println resultEntry
				}
			}
		searchCursor.close()
		connection.close()
	}
}
