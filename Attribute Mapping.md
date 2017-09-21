# Attribute Mapping

_Integrating systems means mostly connecting systems. Each systems has it's own data model. Some systems rely on common data storage (LDAP, SQL database, ...) but the structure in which information is stored, is mostly different. A [tool, software, process, ...] which allows to compare the data structure of each system would be a massive support._

## Goal

* Create an easy way to model data structures in a harmonised way (subset modelling).
* Make it possible to compare data structures.
* Show equality.
* Show similarity.
* Allow to create rules to join data attributes for one system.
* Allow to create rules to split data attribute for one system.
* Create a superset of all attribute definitions.

## Readings

* https://en.wikipedia.org/wiki/Lightweight_Directory_Access_Protocol
* https://www.ldap.com/understanding-ldap-schema
* https://en.wikipedia.org/wiki/Backus–Naur_form
* "Lightweight Directory Access Protocol (LDAP): Technical Specification Road Map": https://tools.ietf.org/html/rfc4510 _RFC 4511 - 4519_
** "RFC 4511 - Lightweight Directory Access Protocol (LDAP): The Protocol":https://tools.ietf.org/html/rfc4511
** LDAP: The Protocol ["RFC4511":https://tools.ietf.org/html/RFC4511]
** LDAP: Directory Information Models ["RFC4512":https://tools.ietf.org/html/RFC4512]
** LDAP: Authentication Methods and Security Mechanisms ["RFC4513":https://tools.ietf.org/html/RFC4513]
** LDAP: String Representation of Distinguished Names ["RFC4514":https://tools.ietf.org/html/RFC4514]
** LDAP: String Representation of Search Filters ["RFC4515":https://tools.ietf.org/html/RFC4515]
** LDAP: Uniform Resource Locator ["RFC4516":https://tools.ietf.org/html/RFC4516]
** LDAP: Syntaxes and Matching Rules ["RFC4517":https://tools.ietf.org/html/RFC4517]
** LDAP: Internationalized String Preparation ["RFC4518":https://tools.ietf.org/html/RFC4518]
** LDAP: Schema for User Applications ["RFC4519":https://tools.ietf.org/html/RFC4519]
* What ever is helpful of 
** https://www.ldap.com/ldap-specifications-defined-in-rfcs
** http://www.bind9.net/rfc-ldap
* ...

## Tasks

* Parse LDAP Schema 
* load LDAP schema to [PostgresSQL,MongoDB]
* show all
* compare all
* show equal
* show similar 
* search by name
* search by description 
* select Attributes (add to cart)
* Show "cart"
* * export all required Schemas as ldif (separate, combined)
* * ...
* ...
