1. git clone
2. git status -s 
3. git add "filename" / git add .
4. git commit -m "messages"
5. git push -u origin master


6.git pull "niiiice"

Administration manual
For compiling the game you will need maven 2+ and JDK 1.5+ (see instructions in the development manual below). For running the game from the jar file all you need is the Java runtime environment however. The following steps therefore only have to be run once, after which you will posess the jar file needed to distribute the game.

1. Download zip file from https://github.com/arnaras10/Mylla/zipball/master
2. Extract the file, preferably to your home folder. The resulting folder is called Mylla.
-- GNU / Linux:
3. Make sure the runLinux.sh is executable (right click or run chmod -x runLinux.sh ).
4. Run the script by entering ./runLinux.sh in a terminal window from the Mylla directory. It will run tests, compile the game and create an executable .jar file. It will then ask if you would like to play the game.
5. The executable jar file containing the game will be located in the hidden folder: ~/.m2/repository/is/marshmallow/Mylla/1.3-SNAPSHOT and can be distributed and executed from anywhere by issuing the command java -jar Mylla-1.3-SNAPSHOT.jar
Alternative: Run the commands manually as listed below in the Windows section.
-- Microsoft Windows:
3. Run the following commands in command prompt at the Mylla folder:
	mvn clean
	mvn package (this will create an executable .jar file in the Mylla\target folder
	mvn install
4. The executable jar file containing the game will be located in the following folder in user home: .m2\repository\is\marshmallow\Mylla\1.3-SNAPSHOT and can be distributed and executed from anywhere by issuing the command java -jar Mylla-1.3-SNAPSHOT.jar 
Development Manual
Things needed to do on a fresh machine to be able to build and contribute to the project:
  Set up GIT
  -Go to www.github.com
  -Create an account
Windows:
  -Go to http://help.github.com/win-set-up-git/ and follow the instructions
GNU/Linux
  -Go to https://github.com/arnaras10/Mylla
  -Open git bash (terminal on Linux) and clone the project into a folder using the following command “git clone git@github.com:arnaras10/Mylla.git”
  -If you feel your contribution should belong in the main source tree you must send a pull request on github through this link http://help.github.com/win-set-up-git/
  -If we like your work we will consider granting you a write access to the main repository
WINDOWS 7:
  Install Java development kit
  -Go to http://www.oracle.com/technetwork/java/javase/downloads/index.html
  -download the latest jdk
  -Unzip the download to a folder of your specification
  -go to Control Panel/System and Security/System/Advanced system settings
  -select Enviorment variables, create a new variable named JAVA_HOME
  -set the location of the jdk folder into the JAVA_HOME variable
  -find the path variable and set the JAVA_HOME variable into the path variable
  Install Maven
  -Go to http://maven.apache.org/download.html
  -download the latest version of maven
  -unzip the download to a folder of your specification
  -go to Control Panel/System and Security/System/Advanced system settings
  -select Enviorment variables, create a new variable named MAVEN_HOME
  -set the location of the maven folder into the MAVEN_HOME variable
  -find the path variable and set the MAVEN_HOME variable into the path variable
GNU/LINUX:
Install Java development kit
  -Go to http://www.oracle.com/technetwork/java/javase/downloads/index.html
  -download the latest jdk package for your distro and install it using your package manager.
  -Put into .bashrc or equivilent: export JAVA_HOME="/usr/java/jdk1.6.0;
 Note: Most distros will have OpenJDK in the repos, which although not guaranteed will work for this project most of the time
  Install Maven:
Install the package maven or maven2  from your favourite package manager.

