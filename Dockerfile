FROM openjdk
COPY target/JenkinsTutorialRepo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]