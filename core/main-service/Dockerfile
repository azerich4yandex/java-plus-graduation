FROM amazoncorretto:21
WORKDIR /app
COPY target/main-service*.jar /app/ewm-service.jar
CMD ["sh", "-c", "sleep 25 && java -jar /app/ewm-service.jar"]