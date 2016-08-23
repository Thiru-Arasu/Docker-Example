# Hello world in Docker

## Prerequisites
  - Docker

## Clone the project

```
  git clone https://github.com/Thiru-Arasu/Docker-Example.git
```

## Build the artifacts
```
  cd Docker-Example/Nginx-Python-config/
  sudo docker build -t webapp/nginx-python .
```

## Run the app
```
  sudo docker run -d -p 80:80 --name webapp webapp/nginx-python
```

## Test the app
```
  curl http://localhost
```
