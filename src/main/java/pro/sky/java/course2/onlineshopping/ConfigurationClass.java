package pro.sky.java.course2.onlineshopping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ConfigurationClass {
    @Bean
    @SessionScope
    public Cart createCart(){
        return new Cart();
    }
}
