package com.candidjava.spring.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
			// TODO Auto-generated method stub
			AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
			context.register(SpringConfiguration.class);
			context.setServletContext(container);
			container.addListener(new ContextLoaderListener(context));
			ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(context));
			servlet.setLoadOnStartup(1);
			servlet.addMapping("/");

	}
}
