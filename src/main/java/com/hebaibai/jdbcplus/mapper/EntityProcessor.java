package com.hebaibai.jdbcplus.mapper;

import org.apache.commons.dbutils.BeanProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EntityProcessor extends BeanProcessor {

    @Override
    public <T> T newInstance(Class<T> c) throws SQLException {
        return super.newInstance(c);
    }

    public Object processColumn(ResultSet rs, int index, Class<?> propType) throws SQLException {

        try {
            return super.processColumn(rs, index, propType);
        } catch (Exception e) {
            return null;
        }
    }
}
