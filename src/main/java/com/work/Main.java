package com.work;

import com.work.templates.EmployeeJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * <p/>
 * Copyright (C) 2014 copyright.com
 * <p/>
 * Date: 3/1/2016
 *
 * @author Stanislau Kavalski
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao.xml");
        EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate)applicationContext.getBean("employeeJDBCTemplate");
        employeeJDBCTemplate.setEmployee("Vania", "AT", 1000);

        ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)cl).getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }

    }
}
