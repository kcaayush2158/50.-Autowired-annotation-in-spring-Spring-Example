package com.application.main;

import com.application.model.Employee;
import com.application.model.Pancard;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee.getId()+"\t"+employee.getName());
        Pancard pancard = employee.getPancard();
        System.out.println(pancard.getPancardHoldername()+"\t"+pancard.getPancardNo());
        context.close();
    }
}
