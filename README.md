# DistSys-AsyncRMI_StringComparisonService

##Setting Up
#Ensure that you have Java 1.8.(any version up), configure java as the runtime and have downloaded Tomcat 9 before starting! You should also have your JAVA_HOME and CATALINA_HOME set up in order for tomcat to run, a tutorial can be found under the references!

To start up Tomcat, navigate to wherever you have TomCat using CMD and from there go to your bin directory and run Startup.bat to start the TomCat server.[![tc001.png](https://s24.postimg.org/dvv1cw785/tc001.png)](https://postimg.org/image/3lsmdnhch/)

Take the comparator file from the Distributed Systems Moodle page and while the server is running, drag it into the webapps folder of Tomcat, this should create the Comparator folder.(*in my own app, you should just drag the comparator folder from my directory into tomcats*)
[![tc002.png](https://s30.postimg.org/pni[![tc003.png](https://s30.postimg.org/bw9adphrl/tc003.png)](https://postimg.org/image/eqcfr5jxp/)

royanl/tc002.png)](https://postimg.org/image/btuezwi25/)

Go to the tomcat site and go to Manager App once everything is working. This will prompt to enter your credentials which you should create within the tomcat-users xml file in the conf folder of the tomcat directory
Once in there, you should see a whole directory of clickable links. Under all of this, you should see where you are able to deploy your war file. Choose the file from your project directory and deploy it, you should be able to run it within tomcat now.
[![tc005.png](https://s23.postimg.org/76ao3zfhn/tc005.png)](https://postimg.org/image/m297bkqw7/)

To run the JAR file, all you have to do is go to the main directory where all the folders are located and run java -cp ./string-service.jar ie.gmit.sw.servant in cmd.

##File Layout

###servicehandler

Just the ServiceHandler.java... kind of lonely for the java file.

###rmifolder

This folder holds all the classes that deal with the RMI interface, dealing with taking in the two strings that have been inputted into the textboxes by the user and compiling the information by using one of the algorithms to see the distance between the two.

###string_algos

This folder contains the different string comparison algorithms that we will be using

###sw
Only contains the servant, its the RMI server and deals with the createregistry and telling the user the db is up and running and is       shown as the main class in the JAR file.
[![tc004.png](https://s18.postimg.org/t1r7w4u9l/tc004.png)](https://postimg.org/image/nqcbbf86t/)

##References
http://stackoverflow.com/questions/1842734/how-to-asynchronously-call-a-method-in-java
http://stackoverflow.com/questions/10044079/display-messesge-wait-as-background-processing-happening
http://stackoverflow.com/questions/14579661/how-to-set-catalina-home-variable-in-windows-7
