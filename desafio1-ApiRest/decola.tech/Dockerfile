# Use Ubuntu as the base image
FROM ubuntu:22.04

# Build stage
FROM gradle:8.5-jdk17 AS build

WORKDIR /app

# Copy Gradle files
COPY build.gradle settings.gradle /app/
COPY src /app/src

# Download dependencies and build the application
RUN gradle bootJar --no-daemon

# Runtime stage
FROM amazoncorretto:17-alpine-jdk

WORKDIR /app

# Copy the generated JAR file from the build stage
COPY --from=build /app/build/libs/*.jar /app/app.jar

# Set active profile correctly
ENV SPRING_PROFILES_ACTIVE=dev

# Expose the application port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/app/app.jar"]