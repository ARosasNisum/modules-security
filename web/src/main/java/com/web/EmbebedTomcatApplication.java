package com.web;

import org.apache.catalina.Context;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class EmbebedTomcatApplication {

    public static void main(String[] args) throws Exception {
        String webappDirLocation = "web/src/main/webapp/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.setBaseDir(".");
        tomcat.getHost().setAppBase(".");
        tomcat.setSilent(false);

        // Add AprLifecycleListener
        StandardServer server = (StandardServer) tomcat.getServer();
        AprLifecycleListener listener = new AprLifecycleListener();
        server.addLifecycleListener(listener);

        Context ctx = tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        Tomcat.addServlet(ctx, "jsf_servlet", "javax.faces.webapp.FacesServlet");
        ctx.addServletMapping("*.xhtml", "jsf_servlet");
        tomcat.start();
        tomcat.getServer().await();
    }

}
