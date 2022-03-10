package com.dxc;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;//to get the beans
import org.springframework.beans.factory.xml.XmlBeanFactory;//to call the xmlfiles
import org.springframework.core.io.ClassPathResource;//
import org.springframework.core.io.Resource;
public class Main {
    public static void main(String[] args){


    // Normal Java Object Construction
     IOTDevice myConstructedObject = new IOTDevice();
     System.out.println("IOTDevice intialized with a construcor: " + myConstructedObject);
    // IoC container --> BeanFactory
    //we are creating an object 'resource' becz we hav to inject info from applicationcontent.xml

    Resource resource = new ClassPathResource("applicationContext.xml");
    //we are injecting bean id class, name to beanfactory with an argument 'resource'
     BeanFactory beanFactory = new XmlBeanFactory(resource);
     IOTDevice myDeviceBean = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");
     System.out.println("XmlBeanFactory(Deprecated) bean -- " + myDeviceBean);
}
}
