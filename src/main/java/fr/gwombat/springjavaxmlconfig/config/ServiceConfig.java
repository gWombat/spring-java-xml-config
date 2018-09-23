package fr.gwombat.springjavaxmlconfig.config;

import fr.gwombat.springjavaxmlconfig.service.CustomService;
import fr.gwombat.springjavaxmlconfig.service.CustomServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by guillaume.
 *
 * @since 15/09/2018
 */
@Configuration
public class ServiceConfig {

    @Bean
    public CustomService customService() {
        CustomServiceImpl customService = new CustomServiceImpl();
        customService.setValue("Value from Java");

        return customService;
    }

}
