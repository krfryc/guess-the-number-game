package kfryc.config;

import kfryc.GuessCount;
import kfryc.MaxNumber;
import kfryc.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "kfryc")
@PropertySource("classpath:config/game.properties") //classpath set the direction to where the class is
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:20}")  //after : it will define the default value of 20 if it will not find it in game.properties file
    private int maxNumber;

    @Value("${game.minNumber:10}")  //after : it will define the default value of 10 if it will not find it in game.properties file
    private int minNumber;

    @Value("${game.guessCount:5}")  //after : it will define the default value of 5 if it will not find it in game.properties file
    private int guessCount;



    // == bean methods ==
    @Bean
    @MaxNumber  // the method name does not need to have the same name as the field with this annotation
    public int maxNumber1(){
        return maxNumber;
    }

    @Bean
    @GuessCount // the method name does not need to have the same name as the field with this annotation
    public int guessCount1(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
}
