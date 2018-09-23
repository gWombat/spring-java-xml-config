package fr.gwombat.springjavaxmlconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * Created by guillaume.
 *
 * @since 15/09/2018
 */
@Configuration
@Profile("default")
@ImportResource("classpath:config/service-config.xml")
public class DefaultConfig {
}
