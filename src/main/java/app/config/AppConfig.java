package app.config;


import app.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "cat")
    public Animal cat() {
        Animal cat = new Cat();
        return cat;
    }

    @Bean(name = "dog")
    public Animal dog() {
        Animal dog = new Dog();
        return dog;
    }

    @Bean
    AnimalsCage animalsCage(@Qualifier("dog") Animal dog, @Qualifier("timer") Timer getTime) {
        AnimalsCage animalsCage = new AnimalsCage(dog, getTime);
        return animalsCage;
    }

    @Bean(name = "timer")
    public Timer getTime() {
        Timer timer = new Timer();
        return timer;
    }
}
