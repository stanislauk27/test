package com.epam;

import com.epam.templates.EmployeeJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        
    }
}
