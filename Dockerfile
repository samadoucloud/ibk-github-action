FROM openjdk:8
EXPOSE 8080
ADD target/users-microservices-ikeita.jar target/users-microservices-ikeita.jar
ENTRYPOINT [ "java", "-jar", "/target/users-microservices-ikeita.jar" ]