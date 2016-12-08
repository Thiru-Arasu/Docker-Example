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
RUN apt-get install tomcat7 -y
COPY target/App-in-tomcat7-1.0-SNAPSHOT.war /var/lib/tomcat7/webapps/
ENV CATALINA_BASE="/var/lib/tomcat7"
ENV CATALINA_HOME="/usr/share/tomcat7"
ENV CATALINA_TMPDIR="/tmp/tomcat7-tomcat7-tmp"
ENV JAVA_HOME="/usr/lib/jvm/java-8-oracle/"
RUN mkdir -p /tmp/tomcat7-tomcat7-tmp
EXPOSE 8080

RUN echo "tomcat7 ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers
USER tomcat7
CMD ["/usr/share/tomcat7/bin/catalina.sh", "run"]
