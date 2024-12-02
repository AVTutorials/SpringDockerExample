# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-jdk-slim

# Set the timezone to Asia/Kolkata (IST)
RUN apt-get update && apt-get install -y tzdata && \
    ln -fs /usr/share/zoneinfo/Asia/Kolkata /etc/localtime && \
    dpkg-reconfigure --frontend noninteractive tzdata

# Define an environment variable for the port
ENV DOCKER_EXPOSE_PORT=7777

# Expose the port using the environment variable
EXPOSE ${DOCKER_EXPOSE_PORT}

# Packaged JAR file into the container at /target
COPY target/SpringDockerExample-0.0.1-SNAPSHOT.jar SpringDockerExample-0.0.1-SNAPSHOT.jar

# Specify the command to run your application
ENTRYPOINT ["java", "-jar", "/SpringDockerExample-0.0.1-SNAPSHOT.jar"]
