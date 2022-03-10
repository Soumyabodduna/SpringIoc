package com.dxc.auto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dxc.auto.Car;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) appContext.getBean("carBean");
        System.out.println("The car obtained from the Bean:\n" + car);
    }


}
