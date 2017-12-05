FROM alphafoobar/open:jre-alpine

EXPOSE 80

# Install app
RUN rm -rf /var/jars/*
ADD build/libs /var/java

CMD ["java", "-jar", "/var/java/demo-0.0.1-SNAPSHOT.jar", "--server.port=80"]

HEALTHCHECK \
  CMD curl --fail http://localhost/ping || exit 1