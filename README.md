# GrailsProblemsSolving

## Installing GGTS
Download GGTS  

sudo apt-get install software-properties-common  
sudo add-apt-repository ppa:webupd8team/java  
sudo apt-get update  
sudo apt-get install oracle-java8-installer  
sudo apt-get install oracle-java8-set-default  

$ curl -s "https://get.sdkman.io" | bash  
$ source "$HOME/.sdkman/bin/sdkman-init.sh"  
$ sdk install grails  

After creating a new Project try "run as"  
-Lots of Errors appear  
Download from  http://repo.spring.io/libs-snapshot-local/org/springframework/springloaded/ or newer  
Move it into lib/org.springframework/springloaded/jars  
remove oder move springloaded-1.2.x.RELEASE  
rename springloaded-1.2.2.BUILD-SNAPSHOT.jar to springloaded-1.2.x.RELEASE  
