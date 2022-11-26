FROM tomcat:9.0.69-jdk11-corretto
RUN ./mvnw clean
RUN ./mvnw package -DskipTests
COPY /target/javaee-test-docker-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/javaee-test-docker-1.0-SNAPSHOT.war