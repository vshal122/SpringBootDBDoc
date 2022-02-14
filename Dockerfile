FROM java:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} student-1.0.DEV.jar
ENTRYPOINT["java","-jar","/student-1.0.DEV.jar"]
EXPOSE 8090

