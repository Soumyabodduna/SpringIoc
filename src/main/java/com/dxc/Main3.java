package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBean");
        myDeviceBean.setDevice("fridge");
        myDeviceBean.setDescription("temperature guage for the freger");
        System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);
    }
}
