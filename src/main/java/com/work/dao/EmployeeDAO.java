package com.work.dao;

import com.work.domain.Employee;

import javax.sql.DataSource;
import java.util.List;

/**
 * <p/>
 * Copyright (C) 2014 copyright.com
 * <p/>
 * Date: 3/1/2016
 *
 * @author Stanislau Kavalski
 */
public interface EmployeeDAO {
    void setDataSource(DataSource dataSource);

    void setEmployee(String name, String position, Integer salary);

    List<Employee> getEmployee();
}
