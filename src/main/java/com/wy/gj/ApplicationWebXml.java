package com.wy.gj;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.wy.gj.config.DefaultProfileUtil;

/**
 * This is a helper Java class that provides an alternative to creating a web.xml.
 * This will be invoked only when the application is deployed to a servlet container like Tomcat, Jboss etc.
 */
public class ApplicationWebXml extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        /**
         * set a default to use when no profile is configured.
         */
        DefaultProfileUtil.addDefaultProfile(application.application());

        return application.sources(CgApp.class);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
