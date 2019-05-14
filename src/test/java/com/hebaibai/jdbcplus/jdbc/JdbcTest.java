package com.hebaibai.jdbcplus.jdbc;

import com.hebaibai.jdbcplus.JdbcPlus;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import lombok.Getter;
import lombok.Setter;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Setter
@Getter
public class JdbcTest {

    public JdbcPlus jdbcPlus = null;

    {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try {
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        comboPooledDataSource.setJdbcUrl(
                "jdbc:mysql://172.31.100.50:3306/pubmidb?useUnicode=true&characterEncoding=utf-8");
        comboPooledDataSource.setUser("pubmidb");
        comboPooledDataSource.setPassword("Pubmi@2016");
        DataSource dataSource = comboPooledDataSource;

        jdbcPlus = new JdbcPlus();
        jdbcPlus.setDataSource(dataSource);

    }

}
