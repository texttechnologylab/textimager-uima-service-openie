# ./mvnw package
docker build -f src/main/docker/Dockerfile.jvm -t textimager-uima-service-openie:0.1 .
