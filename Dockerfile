FROM java:8
VOLUME /tmp
ADD target/SinDelantal-0.0.1-SNAPSHOT.jar SinDelantal.jar
RUN bash -c 'touch /SinDelantal.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /SinDelantal.jar"]
MAINTAINER eduardo.cz.mac@gmail.com