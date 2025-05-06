FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/eureka-registry.jar .
EXPOSE 8761
CMD [ "java","-jar","eureka-registry.jar"]