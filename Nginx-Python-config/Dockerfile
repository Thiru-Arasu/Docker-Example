# Base image
FROM ubuntu:14.04

RUN apt-get update
RUN apt-get install software-properties-common -y
RUN apt-get install curl -y 

# Install and configure Nginx
RUN apt-get install nginx -y
ADD nginx_proxy.conf /etc/nginx/conf.d/
EXPOSE 80

# Remove default page
RUN rm /etc/nginx/sites-enabled/default

# Install python
RUN add-apt-repository ppa:fkrull/deadsnakes -y
RUN apt-get update
RUN apt-get install python2.7 -y
RUN ln -s /usr/bin/python2.7 /usr/bin/python
RUN curl https://bootstrap.pypa.io/get-pip.py \ 
	| /usr/bin/python

# Example in python Flask
RUN pip install flask
ADD app.py /app.py
ADD run.sh /run.sh

# Init command
CMD ["/run.sh"]
