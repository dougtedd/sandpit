package be.tedd.sandpit.webapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    @Value("${value.a}")
    private String valueA;

    public String getValueA() {
        return valueA;
    }

}
