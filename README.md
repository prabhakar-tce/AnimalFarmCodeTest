# AnimalFarmCodeTest
Animal farm project

It is SpringBoot application. Can be build using MAVEN.

Exposing Animal Query and Animal farm statistics services.

Steps for execution:
- Import project into your IDE
- After successful MAVEN build, copy "AnimalFarmApplication-1.0.jar" file into any local drive
- Execute this command : java -Dserver.port=8091 -jar AnimalFarmApplication-1.0.jar
- change 'server.port' parameter for execution port

Below are the few REST API URLs for Animal Query:
http://localhost:8091/animal/DUCK
http://localhost:8091/animal/CHICKEN
http://localhost:8091/animal/ROOSTER
http://localhost:8091/animal/DOG
http://localhost:8091/animal/CLOWNFISH

Below is the REST API URL for Animal farm statistics:
http://localhost:8091/animal/statistics

