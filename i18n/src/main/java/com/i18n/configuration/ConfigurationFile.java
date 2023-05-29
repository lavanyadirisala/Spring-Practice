package com.i18n.configuration;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class ConfigurationFile implements WebMvcConfigurer
{
	
	@Bean
	public SessionLocaleResolver localeResolver() {
		SessionLocaleResolver s = new SessionLocaleResolver();
		s.setDefaultLocale(Locale.CANADA);
		return s;		
	}	
	
	@Bean
	public LocaleChangeInterceptor localchangeintercepter() {
		LocaleChangeInterceptor l = new LocaleChangeInterceptor();
		l.setParamName("language");
		return l;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registory) {
		registory.addInterceptor(localchangeintercepter());
	}
	
	/* Can provide properties file programatically like this 
	 * @Bean public PropertySourcesPlaceholderConfigurer
	 * propertySourcesPlaceholderConfigurer() { PropertySourcesPlaceholderConfigurer
	 * properties = new PropertySourcesPlaceholderConfigurer();
	 * properties.setLocation(new FileSystemResource("/application.properties"));
	 * properties.setIgnoreResourceNotFound(false); return properties; }
	 */
	
}
