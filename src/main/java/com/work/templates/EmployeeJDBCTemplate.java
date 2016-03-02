package com.work.templates;

import com.work.dao.EmployeeDAO;
import com.work.domain.Employee;
import com.work.mapper.EmployeeMapper;
import org.springframework.jdbc.core.JdbcTemplate;

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
public class EmployeeJDBCTemplate implements EmployeeDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void setEmployee(String name, String position, Integer salary) {
        String SQL = "insert into employee (name, position, salary) values (?, ?, ?)";
        jdbcTemplate.update(SQL, name, position, salary);
        return;
    }

    @Override
    public List<Employee> getEmployee() {
        String SQL = "select * from employee;";
        List<Employee> employees = jdbcTemplate.query(SQL, new EmployeeMapper());
        return employees;
    }
}
