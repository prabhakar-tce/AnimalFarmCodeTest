# AnimalFarmCodeTest
Animal farm project

It is a SpringBoot application to expose services to query various Animal details available in the farm and provide Animal statistics.

Steps for execution:
- Import project into your IDE
- After successful MAVEN build, copy "AnimalFarmApplication-1.0.jar" file into any local drive
- Execute this command : java -Dserver.port=8091 -jar AnimalFarmApplication-1.0.jar
- change 'server.port' parameter for execution port

Below are the few REST API end-points for querying farm Animal :
http://localhost:8091/animal/DUCK
http://localhost:8091/animal/CHICKEN
http://localhost:8091/animal/ROOSTER
http://localhost:8091/animal/DOG
http://localhost:8091/animal/CLOWNFISH

Below is the REST API end-point for Animal farm statistics:
http://localhost:8091/animal/statistics

Documents to refer:
- For Animal object model diagram : Animal_Object_ClassDiagram.pdf
- For JUnit testcases report : JUnit_Execution_Report.docx
- For REST API execution report : REST_API_TestCases.docx

