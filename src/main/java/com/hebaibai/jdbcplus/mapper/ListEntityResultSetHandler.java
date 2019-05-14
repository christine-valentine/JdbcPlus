package com.hebaibai.jdbcplus.mapper;

import com.hebaibai.jdbcplus.Assert;
import com.hebaibai.jdbcplus.EntityMapperFactory;
import org.apache.commons.dbutils.ResultSetHandler;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListEntityResultSetHandler implements ResultSetHandler<List> {

    private Class entityClass;

    private EntityTableRowMapper entityTableRowMapper;

    static EntityProcessor entityProcessor = new EntityProcessor();


    public ListEntityResultSetHandler(Class entityClass) {
        Assert.notNull(entityClass);
        this.entityClass = entityClass;
        this.entityTableRowMapper = EntityMapperFactory.getMapper(entityClass);
    }

    @Override
    public List handle(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        List list = new ArrayList();
        while (resultSet.next()) {
            Object obj = rowHandle(resultSet, metaData);
            list.add(obj);
        }
        return list;
    }

    private Object rowHandle(ResultSet resultSet, ResultSetMetaData metaData) throws SQLException {
        int columnCount = metaData.getColumnCount();
        Object instance = entityProcessor.newInstance(entityClass);

        Map<String, Field> columnFieldMapper = entityTableRowMapper.getColumnFieldMapper();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            Field field = columnFieldMapper.get(columnName);
            Object columnValue = entityProcessor.processColumn(resultSet, i, field.getType());
            System.out.println(columnValue);
        }
        return null;

    }
}
