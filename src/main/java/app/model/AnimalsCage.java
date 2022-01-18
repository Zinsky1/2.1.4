package app.model;

import app.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class AnimalsCage {


    private Animal animal;

    @Autowired
    private Timer timer;



    public AnimalsCage (Animal dog, Timer timer) {
        this.animal = dog;
        this.timer =timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return timer;
    }
}
