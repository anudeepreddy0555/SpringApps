E:\>mkdir spring apps
E:\>cd spring apps
E:\spring apps>
E:\spring apps>mvn archetype:create -DgroupId=com.springmvc.main -DartifactId=SpringMVCMain
E:\spring apps\SpringMVCMain>
In SpringMVCMain directory there is pom.xml file. Edit pom.xml file by changing package name jar to pom


________________________________________________________
//creating jar module
E:\spring apps\SpringMVCMain>mvn archetype:create -DgroupId=com.springapp.lib -DartifactId=springAppLib
/*
mvn archetype:create -DgroupId=com.springapp.lib -DartifactId=springAppLib1
mvn archetype:create -DgroupId=com.springapp.lib -DartifactId=springAppLib2
mvn archetype:create -DgroupId=com.springapp.lib -DartifactId=springAppLib3

By this way you can create modules required for project

*/

--------------------------------------------------------------------
//creating war module
E:\spring apps\SpringMVCMain>mvn archetype:create -DgroupId=com.springapp.war -DartifactId=springapp-war

E:\spring apps\SpringMVCMain\springapp-war>
In springapp-war.xml file edit pom.xml file by adding packaging type as war 
and add dependency of springAppLib module

________________________________________________________
 
E:\spring apps\SpringMVCMain\springapp-war>cd src
E:\spring apps\SpringMVCMain\springapp-war\src>cd main
E:\spring apps\SpringMVCMain\springapp-war\src\main>mkdir webapp
E:\spring apps\SpringMVCMain\springapp-war\src\main>cd webapp
E:\spring apps\SpringMVCMain\springapp-war\src\main\webapp>mkdir WEB-INF
E:\spring apps\SpringMVCMain\springapp-war\src\main\webapp>cd WEB-INF
E:\spring apps\SpringMVCMain\springapp-war\src\main\webapp\WEB-INF>
create web.xml file

___________________________________________________________

E:\spring apps\SpringMVCMain>mvn clean install

//importing project to eclipse
E:\spring apps\SpringMVCMain>mvn eclipse:eclipse


Finally you just need to Import the project into the workspace by using the 
Import Existing Projects into Workspace feature from Eclipse, selecting your
Maven main project directory as the Import root directory and finally select both projects from the Import window.


References:
http://www.byteslounge.com/tutorials/how-to-create-a-multiple-module-project-using-maven
