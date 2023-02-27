package me.lee_sh1673.do_it_all;

import me.lee_sh1673.do_it_all.domain.MemoryUserRepository;
import me.lee_sh1673.do_it_all.domain.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Bean
    public static UserRepository userRepository() {
        return new MemoryUserRepository();
    }
}
