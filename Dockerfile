FROM openjdk:11
ADD target/devopsdemo.jar devopsdemo.jar
ENTRYPOINT [ "java", "-jar", "/devopsdemo.jar" ]