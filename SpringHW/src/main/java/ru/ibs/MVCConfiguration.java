package ru.ibs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.util.HashMap;

@Configuration
public class MVCConfiguration implements WebMvcConfigurer {
    @Bean
    public HashMap<String, Engine> engineMapAdv(){
        HashMap<String,Engine> engineMap = new HashMap<>();
        engineMap.put("petrol", new PetrolEngine());
        engineMap.put("diesel", new DieselEngine());
        return engineMap;
    }

    @Bean
    public ViewResolver viewResolver(ApplicationContext applicationContext){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("classpath:/templates/");
        templateResolver.setSuffix(".html");

        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }

}
