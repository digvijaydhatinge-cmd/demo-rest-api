# Use the actively maintained Eclipse Temurin base image
FROM eclipse-temurin:17-jdk-alpine

# The ARG matches line 3 from your original file
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

# Copy the built jar file into the Docker image
COPY ${JAR_FILE} app.jar

# Expose port 8080 (Standard for Spring Boot)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
