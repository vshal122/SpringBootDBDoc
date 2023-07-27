FROM openjdk:11
EXPOSE 8090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-demo
ENTRYPOINT ["java","-jar","/spring-boot-demo"]


