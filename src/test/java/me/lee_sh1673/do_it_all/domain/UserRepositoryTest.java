package me.lee_sh1673.do_it_all.domain;

import static org.assertj.core.api.Assertions.assertThat;

import me.lee_sh1673.do_it_all.AppConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class UserRepositoryTest {

    private static UserRepository userRepository;

    @BeforeAll
    static void setUp() {
        ApplicationContext applicationContext
            = new AnnotationConfigApplicationContext(AppConfig.class);
        userRepository = applicationContext.getBean(UserRepository.class);
    }


    @Test
    @DisplayName("save")
    void save() {
        User user = new User(1L, "LEE", 20);
        Long userID = userRepository.save(user);
        assertThat(userID).isEqualTo(user.getId());
    }

    @Test
    @DisplayName("find user by id")
    void findUser() {
        User user = new User(1L, "LEE", 20);
        Long userID = userRepository.save(user);
        User actualUser = userRepository.findById(userID);
        assertThat(user.getId()).isEqualTo(actualUser.getId());
        assertThat(user.getName()).isEqualTo(actualUser.getName());
        assertThat(user.getAge()).isEqualTo(actualUser.getAge());
        assertThat(user).isEqualTo(actualUser);
    }
}