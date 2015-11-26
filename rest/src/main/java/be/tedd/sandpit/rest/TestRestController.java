package be.tedd.sandpit.rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public UpperLower greeting(@RequestParam(value="name", defaultValue="Spring") String name) {
        return new UpperLower(counter.incrementAndGet(), name);
    }
}