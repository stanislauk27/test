package com.epam.templates;

import com.epam.dao.EmployeeDAO;
import com.epam.domain.Employee;
import com.epam.mapper.EmployeeMapper;
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
        String SQL = "insert into employee (name, positions, salary) values (?, ?, ?)";
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
