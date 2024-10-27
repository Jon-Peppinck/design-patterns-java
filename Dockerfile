FROM openjdk:21-jdk-slim

WORKDIR /app

COPY . .

RUN find . -name "*.java" -exec javac {} +

CMD ["java", "Main"]
