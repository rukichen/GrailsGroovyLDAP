package first

import org.apache.directory.ldap.client.api.LdapNetworkConnection
import org.apache.directory.api.ldap.model.message.SearchScope

class FirstGroovy {
	static void main(def args) {
		def connection = new LdapNetworkConnection( "localhost", 10389);
		connection.bind("uid=admin,ou=system", "secret");
		def cursor = connection.search( "dc=example,dc=com", "(objectClass=*)", SearchScope.SUBTREE);
		cursor.each { entry ->
			println entry
			}
		cursor.close();
		connection.close();
	}
}
