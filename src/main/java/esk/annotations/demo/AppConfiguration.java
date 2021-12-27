package esk.annotations.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    TestBean getTestBean() {
        return new TestBean();
    }
}
