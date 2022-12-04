package com.example.ejerciciosinfotec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class EjerciciosInfotecApplication {

    public static void main(String[] args) {

        SpringApplication.run(EjerciciosInfotecApplication.class, args);
    }

}

//@Component
/*class BeanA{
    @Autowired
    @Qualifier("Bean2");
    private BeanInterface dependency;
}*/


/*@Component
class Bean2 implements BeanInterface{

}*/
