#!/bin/bash
set -x
image="webapp/tomcat7"
sudo docker build -t $image .
