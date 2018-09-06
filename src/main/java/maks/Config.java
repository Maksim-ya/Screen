package maks;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan("maks")
public class Config {

    @Bean
    public ColorFrame colorFrame(){
        return new ColorFrame();
    }

    @Bean
    @Scope("prototype")
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }
}
