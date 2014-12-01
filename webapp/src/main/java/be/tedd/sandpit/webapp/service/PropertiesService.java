package be.tedd.sandpit.webapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {

    @Value("${value.a}")
    private String valueA;

    @Value("${loaded.value.a}")
    private String loadedValueA;

    @Value("${generated.value.a}")
    private String generatedValueA;

    public String getValueA() {
        return valueA;
    }

    public String getLoadedValueA() {
        return loadedValueA;
    }

    public String getGeneratedValueA() {
        return generatedValueA;
    }

}
