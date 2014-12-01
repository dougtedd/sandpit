package be.tedd.sandpit.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * This class must be explicitly defined in the Spring configuration to force it to load.
 */
@Configuration
@PropertySource("classpath:loaded.properties")
public class PropertiesLoadedByClass {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
