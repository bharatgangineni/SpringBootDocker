FROM java:8
EXPOSE 9040
ADD /traget/MicroServiceDocker.jar MicroServiceDocker.jar
ENTRYPOINT [ "java", "-jar", "MicroServiceDocker.jar"]