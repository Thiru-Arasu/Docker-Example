
# Hello world in Docker

## Prerequisites
  - JDK
  - Maven
  - Docker
  
## Clone the project
```
  git clone https://github.com/Thiru-Arasu/Docker-Example.git
```

## Build the app
```
  cd Docker-Example/App-in-tomcat7
  mvn package
```

## Run the app
```
  sudo docker run -td -p 8080:8080 --name webapp webapp/tomcat7
```

## Test the app
```
  curl http://localhost:8080/App-in-tomcat7-1.0-SNAPSHOT/
```
  
