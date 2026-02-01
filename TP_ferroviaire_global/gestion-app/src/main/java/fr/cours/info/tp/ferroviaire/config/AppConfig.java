package fr.cours.info.tp.ferroviaire.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    //annotation @Configuration
    // pour activer les réglages par défaut de Thymeleaf.
}