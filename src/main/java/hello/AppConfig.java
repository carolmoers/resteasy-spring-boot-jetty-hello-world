package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.core.Application;
import java.util.concurrent.atomic.AtomicLong;

@Configuration
public class AppConfig extends Application {
    @Bean
    public AtomicLong counter() {
        return new AtomicLong();
    }
}
