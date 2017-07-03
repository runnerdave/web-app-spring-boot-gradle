package net.runnerdave;

import net.runnerdave.repository.ConcertDateRepository;
import net.runnerdave.repository.ConcertRepository;
import net.runnerdave.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.annotation.PostConstruct;
import java.util.Locale;

@SpringBootApplication
public class WebAppSpringBootGradleApplication {

    private static final Logger logger = LoggerFactory.getLogger(WebAppSpringBootGradleApplication.class);

    @Autowired
    ConcertRepository concertRepository;

    @Autowired
    ConcertDateRepository concertDateRepository;

    @Autowired
    DataLoader dataLoader;

    public static void main(String[] args) {
        SpringApplication.run(WebAppSpringBootGradleApplication.class, args);
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
            container.addErrorPages(custom404Page);
        });
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("en", "AU"));
        return slr;
    }

    @PostConstruct
    void seeGigDates() {
        concertDateRepository.findAll().forEach(concertDate -> logger.info(concertDate.toString()));
//		concertRepository.findAll().forEach(gig -> logger.info(gig.toString()));
    }

    @PostConstruct
    void seeGigs() {
        concertRepository.findAll().forEach(gig -> logger.info(gig.toString()));
    }
}
