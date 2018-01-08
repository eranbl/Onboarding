FROM docker.onboarding.gcp.ha/onboarding-docker-app:release-approved

MAINTAINER Eran Blumenthal eranb@jfrog.com


#prepare env for java app
RUN /bin/bash -c cd ~; cd /home ; mkdir -p work

COPY packages/employees-app.jar /home/work
#CMD java -jar /home/work/employees-app.jar


# Expose Tomcat's port
EXPOSE 8081
EXPOSE 8080

ENTRYPOINT [ "java", "-jar",  "/home/work/employees-app.jar"]









