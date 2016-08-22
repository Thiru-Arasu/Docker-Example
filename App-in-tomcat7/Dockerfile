FROM ubuntu:14.04
RUN apt-get update

# Install JDK 8
RUN apt-get install software-properties-common -y
RUN apt-add-repository ppa:webupd8team/java -y
RUN apt-get update
RUN echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | debconf-set-selections
RUN apt-get install oracle-java8-installer -y
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

# Install tomcat7
RUN wget https://www.apache.org/dist/tomcat/tomcat-7/v7.0.70/bin/apache-tomcat-7.0.70.tar.gz \ 
      -O /usr/share/apache-tomcat-7.0.70.tar.gz
RUN cd /usr/share && tar -zxvf apache-tomcat-7.0.70.tar.gz
COPY target/App-in-tomcat7-1.0-SNAPSHOT.war \ 
	/usr/share/apache-tomcat-7.0.70/webapps/App-in-tomcat7-1.0-SNAPSHOT.war

EXPOSE 8080
CMD ["/usr/share/apache-tomcat-7.0.70/bin/catalina.sh", "run"]
