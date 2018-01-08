FROM docker.onboarding.gcp.ha/ubuntu:16.04

MAINTAINER Eran Blumenthal eranb@jfrog.com


#prepare env for java app
RUN /bin/bash -c cd ~; cd /home ; mkdir -p exec && \
    apt update && \
    apt install openjdk-8-jdk -y


# Expose Tomcat's port
EXPOSE 8081







