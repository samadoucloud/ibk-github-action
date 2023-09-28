FROM openjdk:8-jre-alpine

RUN apk add --no-cache \
    maven \
    git

WORKDIR /Test

COPY pom.xml .
COPY src .

RUN mvn clean package

EXPOSE 8080

CMD ["java", "-jar", "target/users-microservices-ikeita"]