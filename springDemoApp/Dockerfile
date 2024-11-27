FROM maven:3.8.5-openjdk-17
WORKDIR /app
COPY ./ ./
RUN chmod -R 755 /app
#RUN mvn clean install
RUN ls -l /app
COPY /target/springDemoApp-0.0.1-SNAPSHOT.war /app
RUN ls -l
EXPOSE 8100
CMD ["java", "-jar", "springDemoApp-0.0.1-SNAPSHOT.war"]