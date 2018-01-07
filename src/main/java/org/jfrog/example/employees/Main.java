/* Copyright � 2015 Oracle and/or its affiliates. All rights reserved. */
package org.jfrog.example.employees;

import java.util.Optional;

import org.apache.catalina.startup.Tomcat;

public class Main {
/*testing Git changes*/
/*second testing commit*/
/*Third testing commit*/

    public static final Optional<String> PORT = Optional.ofNullable(System.getenv("PORT"));
    public static final Optional<String> HOSTNAME = Optional.ofNullable(System.getenv("HOSTNAME"));
    public static void main(String[] args) throws Exception {
        String contextPath = "/" ;
        String appBase = ".";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.valueOf(PORT.orElse("8080") ));
        tomcat.setHostname(HOSTNAME.orElse("localhost"));
        tomcat.getHost().setAppBase(appBase);
        tomcat.addWebapp(contextPath, appBase);
        tomcat.start();
        tomcat.getServer().await();
    }
}