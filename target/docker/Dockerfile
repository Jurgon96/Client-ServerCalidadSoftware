FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD CalidadArtifactId.jar /opt/CalidadArtifactId/
EXPOSE 8080
WORKDIR /opt/CalidadArtifactId/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "CalidadArtifactId.jar"]
