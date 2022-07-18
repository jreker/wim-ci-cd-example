FROM openjdk:8-jdk-alpine

ARG JAR_FILE=wim-calculator-backend/target/calculator.jar
COPY ${JAR_FILE} calculator.jar

CMD ["java","-jar","calculator.jar"]