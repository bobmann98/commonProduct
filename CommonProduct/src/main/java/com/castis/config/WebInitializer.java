package com.castis.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.castis.config.ServerConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
	/*
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(ServerConfig.class);
		//servletContext.addListener();

		ctx.setServletContext(servletContext);
		
		// spring dispather-servlet 
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		//servlet.addMapping("*.jsp");
		servlet.setLoadOnStartup(1);

	}
	*/
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
	      return new Class[] { ServerConfig.class };
	}
	  
	@Override
	protected Class<?>[] getServletConfigClasses() {
	      return null;
	}
	  
	@Override
	protected String[] getServletMappings() {
	      return new String[] { "/" };
	}
}
