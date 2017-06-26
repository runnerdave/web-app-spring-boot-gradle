package net.runnerdave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class WebAppSpringBootGradleApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSpringBootGradleApplication.class, args);
	}

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return ( container -> {
			ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
			container.addErrorPages(custom404Page);
		});
	}
}
