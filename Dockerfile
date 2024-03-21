FROM openjdk:17
WORKDIR /user/jenkins
COPY  ./target/*.jar /user/jenkins/jenkins.jar
CMD ["java", "-jar","/user/jenkins/jenkins.jar"]