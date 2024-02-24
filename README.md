Maven Projects
These projects are created using Maven and run in a Tomcat server.

Set Up Environment for VSCode
Requirements
Download Tomcat v9 and Maven v3.9.6.
Extract them into a folder and location of your choice.
Java jdk 19 +
2. Set Up VSCode Environment:
2.1. Extensions: Ensure you have the following extensions installed:

Maven for Java by Microsoft

Java Extension Pack by Microsoft

2.2. Environment Variables:

Add the Maven directory path to the environment variables.

System variable System variable
Path variable Path variable 2.3. Community Server Connector:
Install the Community Server Connector extension in VSCode.

Add the Tomcat server to it.

new server New serv
server params conf server
3. Create and Run Maven WebApp Project:
Create a Maven webApp project in your desired directory.
Add your desired files and work on the project.
In the project directory, run the following commands:
mvn clean package
mvn install -f "path\to\your\pom.xml"
After running the commands, a new folder named target will be created. target In the target folder, find the project-name.war. war file Run the war file in the server Run on server Go to localhost:portNumber/projectName in your web browser and enjoy your project!
