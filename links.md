{{>toc}}

h1. Linksammlung

* Die DAASI erklärt "wichtige Begriffe":https://daasi.de/lexikon/
* Wikipedia Kategorie "Identity Management":https://en.wikipedia.org/wiki/Category:Identity_management
* http://www.360tek.com/identity_links.php - Liste mit allen bekannten IAM-Lösungen

h2. Datenmodell

!{width:400px;}https://imgs.xkcd.com/comics/standards.png! ".":https://xkcd.com/927/

* ...
* ...

h3. Data Mapping

_Die Herausforderung besteht in den Datenmodellen der angebundenen Systemen. Nicht nur die Zielsysteme verwenden sehr unterschiedliche Datenhaltungen und somit Datenmodelle. Auch die Quellsystem unterscheiden sich in dieser Hinsicht stark. Insofern ist "Datenmapping":https://de.wikipedia.org/wiki/Datenmapping oder genauer "Schema Mapping":https://de.wikipedia.org/wiki/Schematransformation_und_-integration ganz zu Beginn des Projekts._

h4. Theorie

* ":: Ontology Matching ::":http://www.ontologymatching.org
* "Informationsintegration — Wissensmanagement in der Bioinformatik":https://www.informatik.hu-berlin.de/de/forschung/gebiete/wbi/ii/ Felix Naumann: Informationsintegration - Architekturen und Methoden zur Integration verteilter und heterogener Datenquellen, Oktober 2006, 486 Seiten, Broschur, dpunkt.verlag, ISBN Print: "978-3-89864-400-6":https://www.dpunkt.de/buecher/10779/9783898644006-informationsintegration.html
* "The Clio Project @ University of Toronto (UofT DBGroup)":http://dblab.cs.toronto.edu/project/clio/
* "Datenintegration & Datenherkunft":http://db.inf.uni-tuebingen.de/staticfiles/teaching/ws1011/integration/06_schemamappingmatching.pdf - Schema Matching & Mapping, Wintersemester 2010/11, Melanie Herschel, melanie.herschel@uni-tuebingen.de, Lehrstuhl für Datenbanksysteme, Universität Tübingen
* Hrsg.: Zohra Bellahsene, Angela Bonifati, Erhard Rahm: Schema Matching and Mapping, Springer-Verlag Berlin Heidelberg, 2011, DOI 10.1007/978-3-642-16518-4, ISBN 978-3-642-26717-8.
* Marcelo Arenas, Pablo Barceló, Leonid Libkin, Filip Murlak: Foundations of Data Exchange, isbn: "9781107016163":http://www.cambridge.org/de/academic/subjects/computer-science/knowledge-management-databases-and-data-mining/foundations-data-exchange?format=HB&isbn=9781107016163#FMmoc1WtIt5WbdAO.97.
* Balder Ten Cate, Víctor Dalmau, and Phokion G. Kolaitis. 2013. Learning schema mappings. ACM Trans. Database Syst. 38, 4, Article 28 (December 2013), 31 pages. "DOI=http://dx.doi.org/10.1145/2539032.2539035":http://dl.acm.org/citation.cfm?id=2539035
* "Dynamic Schema Mapping and Data Integration- KMLab":http://www.cs.toronto.edu/km/mapping/
* "The Spicy Project":http://www.db.unibas.it/projects/spicy/
* ...

h4. Tools

* "BigGorilla - open-source data integration and data preparation ecosystem":http://www.biggorilla.org/
* "++Spicy":https://github.com/dbunibas/spicy
* "Altova MapForce":https://www.altova.com/de/mapforce.html  ??- grafisches Tool für Datenmapping, -konvertierung und -integration??
** Test mit Testversion
** Kosten EDU-Lizenz ???
** Campus-Lizenz auch für GITZ ???
* Kategorie evtl.
** "{-}akolade":https://www.hackolade.com/features.html - ??Data modeling for NoSQL databases: MongoDB, DynamoDB, Couchbase??
* ...

h4. Attribute Mapping

see [[Attribute Mapping]]

h2. Systemarchitektur

* "Thank you for not adopting microservices - SD Times":http://sdtimes.com/thank-not-adopting-microservices/

h3. Quellsysteme

* SAP HR
* HIS SOS bzw. HIS PSV
* TBD: System für Sonstige

h3. Zielsysteme

* Web Single Sign-On
* _Telefonbuch_

h3. IAM System

_Vorschläge zur Evaluierung_

* "NetIQ Identity Manager":https://www.netiq.com/de-de/products/identity-manager/
* "Microsoft Identity Manager":https://www.microsoft.com/de-de/cloud-platform/microsoft-identity-manager
* ForgeRock
* "Apache Syncope":http://syncope.apache.org
* ...


h2. Authentifizierung & Autorisierung

h3. SSO-Lösungen

* "Shibboleth":https://shibboleth.net - _'Industriestandard'_
* "SimpleSAMLphp":https://simplesamlphp.org - schlanke, leichtgewichtige und performante SSO-Lösung
* "CAS":https://www.apereo.org/projects/cas auch "Doku bei Github":https://apereo.github.io/cas/4.2.x/index.html - jetzt: "CAS by Aperer"; früher: "Jasia CAS":https://wiki.jasig.org/display/CAS/Home
Lösung besonders geeignet für SSO in Intranet-Kontexten, wenn man auch u.a. Gästen SSO anbieten will
* "Keycloak":http://www.keycloak.org/about.html
* "Wikipedia: List of single sign-on implementations":https://en.wikipedia.org/wiki/List_of_single_sign-on_implementations

h4. XACML et.al.

* "JSON Web Tokens - jwt.io":https://jwt.io - nicht wirklich SSO sondern Absicherung von Sessions
* XACML
** "Einordnung des Begriffs XACML":https://daasi.de/lexikon/xacml/
** "Kennzeichen (S)icherheit: XACML":https://www.heise.de/developer/artikel/Kennzeichen-S-icherheit-XACML-1257575.html - Kurzinfo bei Heise
** "XACML bei Wikipedia":https://en.wikipedia.org/wiki/XACML
** "Der offizielle XACML-Standard":https://www.oasis-open.org/committees/tc_home.php?wg_abbrev=xacml
** "XACML is dead":http://blogs.forrester.com/andras_cser/13-05-07-xacml_is_dead - Kritik an XACML

h3. Passworte

h4. Passwort-Generatoren

* "pwgen":https://sourceforge.net/projects/pwgen/ _- the classic_
* "jpwgen":https://github.com/zhelev/jpwgen _- pwgen in Java with massive configuration option_
* "JSpwgen":http://jspwgen.21er.org _- pwgen in JavaScript_

h4. Password Policy's

* "NIST’s new password rules – what you need to know":https://nakedsecurity.sophos.com/2016/08/18/nists-new-password-rules-what-you-need-to-know/ _- **Pflichtlektüre!!!**_
* "What the Newly Drafted NIST Password Guidelines Mean to You - Bishop Fox":https://www.bishopfox.com/blog/2017/05/newly-drafted-nist-password-guidelines-mean/
* "Stop forcing your arbitrary password rules on me. @ ryanwinchester":https://ryanwinchester.ca/posts/stop-forcing-your-arbitrary-password-rules-on-me
* Linksammlung zum Artikel "Passwortmythen und Security-Theater: Über den Sinn regelmäßiger Änderungen": https://www.heise.de/ix/artikel/2017/04/links/072.shtml

h4. password strength estimator

!{width:400px;}https://imgs.xkcd.com/comics/password_strength.png! ".":https://xkcd.com/936/

* dropbox "zxcvbn":https://github.com/dropbox/zxcvbn - @A realistic password strength estimator.@ _see also https://blogs.dropbox.com/tech/2012/04/zxcvbn-realistic-password-strength-estimation/_
... a lot of implementations in different programming languages "existing for this":https://github.com/search?q=Zxcvbn
* "New Meter Will Change How Users Create Passwords | Carnegie Mellon School of Computer Science":https://www.cs.cmu.edu/news/new-meter-will-change-how-users-create-passwords &rarr; https://github.com/cupslab/password_meter

h4. Leaks

* ACHTUNG:* Diese Seiten sind nicht überprüft. Es ist nicht klar, was mit den eingegebenen Daten geschied. Werden hier E-Mail-Adressen für spätere Angriffe oder SPAM-Listen gesammelt?
* ATTENTION:* These site have not been evaluated. Ist is not clarified what they do with the entered data. Do they collect email addresses for attack attempts later or just to build SPAM lists?

* "Have I been pwned?":https://haveibeenpwned.com - @Check if your email has been compromised in a data breach@
** https://haveibeenpwned.com/Passwords - Download der verwendeten Password Hashes
* "Leaked Source":https://www.leakedsource.com/main/faq/
* "Has my email been hacked? - Anonymously check if your email has ever been compromised in a security breach":https://hacked-emails.com & https://twitter.com/hacked_emails
* "How Safe Is Your Password? | BreachAlarm":https://breachalarm.com/
* https://twitter.com/datasiph0n
* https://twitter.com/dumpmon
* https://twitter.com/pastebinleaks
* https://github.com/droope/pwlist - ??Password lists obtained from strangers attempting to log in to my server.??
* https://vigilante.pw - ??Vigilante.pw ‐ The Breached Database Directory??
* https://breached.pw - *better* then haveibeenpwned.com because more the direction where a solution for universities should go to
* ...

h4. Password blacklist

* GITZ Azubi Projekt Goebel
* später verwenden
** "danielmiessler/SecLists":https://github.com/danielmiessler/SecLists/tree/master/Passwords - _Fundstück Herr Beckmann_
** "PWM at Google Code Archive":https://code.google.com/archive/p/pwm/downloads - _PWM wordlists - Fundstück von Herrn Beckmann_
** "Universal Leet (L337, L33T, 1337) Converter":http://www.robertecker.com/hp/research/leet-converter.php - _Fundstück Herr Schenk_
** "Monitoring Paste Sites for Data Dumps | Rob Sloan | Pulse | LinkedIn":https://www.linkedin.com/pulse/monitoring-paste-sites-data-dumps-rob-sloan
** https://github.com/ipolar - ??Scrape the pastbin links tweeted by the account Pastebinleaks, and download the raw files.??
** "RaiderSec: Introducing dumpmon: A Twitter-bot that Monitors Paste-Sites for Account/Database Dumps and Other Interesting Content":http://raidersec.blogspot.de/2013/03/introducing-dumpmon-twitter-bot-that.html
** "When a shell is not enough: Monitoring Pastebin Leaks":http://www.shellguardians.com/2011/07/monitoring-pastebin-leaks.html
** "Collecting, monitoring and analyzing unstructured data":http://www.foo.be/cours/dess-20152016/AIL.pdf & "AIL framework - Analysis Information Leak framework":https://github.com/CIRCL/AIL-framework
** https://github.com/xme/pastemon
** https://github.com/timofurrer/leaked - ??Find leaked information in different kind of services??
** "Hash Monitoring Setup":http://www.adeptus-mechanicus.com/codex/hashmon/hashmon.php
** "Security of password authentication — bbc":https://bbc.re/blog/security-password-authentication/

h4. password research

* "Vulnerability analysis, Security Papers, Exploit Tutorials":https://www.exploit-db.com/papers/
* "Analyzing the Patterns of Numbers in 10 Million Passwords":http://minimaxir.com/2015/02/password-numbers/
* https://passwordscon.org/ & https://password.consulting/passwordscon/
* https://twitter.com/hashtag/passwords16
* https://twitter.com/hashtag/passwords17

h3. Two-Factor-Authentication (2FA)

* "Two Factor Auth List":https://twofactorauth.org
* "2FA.jetzt - Starke Authentisierung-jetzt!":https://www.2fa.jetzt/
* "Mehr-Faktor-Authentisierung für 35000 Benutzer":https://chemnitzer.linux-tage.de/2017/de/programm/beitrag/200 - _Vortrag der Philipps-Universität Marburg bei den Chemnitzer Linux-Tagen_
* Linkliste zum Artikel "Mehrfaktorverfahren mit LDAP als Backend":https://www.heise.de/ix/artikel/2017/02/links/088.shtml
* "China: Das Gesicht als Universalschlüssel | Technology Review":https://www.heise.de/tr/artikel/China-Das-Gesicht-als-Universalschluessel-3811404.html

h2. Identifier

* "ORCID":http://orcid.org &rarr; "ORCID DE":http://www.orcid-de.org - @Open Researcher and Contributor ID@
siehe auch http://www.orcid-de.org/folien-des-orcid-de-outreach-workshops-online/
** "Datenschutzrechtliches Gutachten zu ORCID in Deutschland veröffentlicht":http://www.orcid-de.org/datenschutzrechtliches-gutachten-zu-orcid-in-deutschland-veroeffentlicht/
* "Announcing the Organization Identifier Project: a Way Forward":https://blog.datacite.org/announcing-organization-identifier-project/
* "Steuerliche Identifikationsnummer":http://www.bzst.de/DE/Steuern_National/Steuerliche_Identifikationsnummer/steuerid_node.html - _lebenslang gültige Identitfikationsnummer für steuerliche Zwecke_
* persistentID: 
> * Verwendung: Identifizierung der SAML-Nachricht für einen Nutzer pro IdP-SP-Verbindung
> * Pro: Nutzung von SP's mit der Anforderung von persistentID's (20 in AAI-Basic), Nutzung von Nutzerprofilen, Nachweisbarkeit (Traceability) von Nutzeraktivitäten 
> * Contra: Verwaltung der ID in der Datenbank kostet Ressourcen
* "eIDAS - Map":https://www.eid.as/tsp-map/#/

h2. Digitaler Nachlass

* "Digital leben und sterben – das digitale Vermächtnis organisieren | heise online":https://www.heise.de/newsticker/meldung/Digital-leben-und-sterben-das-digitale-Vermaechtnis-organisieren-3671807.html
* "Gerichtsstreit: Was passiert mit dem Facebook-Konto einer Verstorbenen? | heise online":https://www.heise.de/newsticker/meldung/Gerichtsstreit-Was-passiert-mit-dem-Facebook-Konto-einer-Verstorbenen-3695162.html
