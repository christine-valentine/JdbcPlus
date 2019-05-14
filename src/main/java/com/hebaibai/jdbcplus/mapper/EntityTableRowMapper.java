package com.hebaibai.jdbcplus.mapper;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

/**
 * 数据库与实体类的映射关系
 *
 * @param <T>
 * @author hjx
 */
@Getter
@Setter
public class EntityTableRowMapper<T> {

    /**
     * id的字段名称
     */
    private String idName = null;

    /**
     * table对应的class
     */
    private Class<T> tableClass = null;

    /**
     * 对应的数据库名称
     */
    private String tableName = null;

    /**
     * 表中所有的字段
     */
    private Set<String> columnNames = null;

    /**
     * 表中所有的字段对应的属性名称
     */
    private Set<String> fieldNames = null;

    /**
     * 属性名称和数据库字段名的映射
     * K: 属性名
     * V：表字段名称
     */
    private Map<String, String> fieldNameColumnMapper = null;

    /**
     * 数据库字段名和class属性的映射
     * K：表字段名称
     * V：class属性
     */
    private Map<String, Field> columnFieldMapper = null;

}
