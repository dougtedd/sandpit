package be.tedd.sandpit.webapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {

    private static final Logger logger = LoggerFactory.getLogger(PropertiesService.class);


    @Value("${value.a}")
    private String valueA;

    @Value("${loaded.value.a}")
    private String loadedValueA;

    @Value("${generated.value.a}")
    private String generatedValueA;

    public String getValueA() {
        logger.info("getValueA will return: {}", valueA);
        return valueA;
    }

    public String getLoadedValueA() {
        return loadedValueA;
    }

    public String getGeneratedValueA() {
        return generatedValueA;
    }

}
