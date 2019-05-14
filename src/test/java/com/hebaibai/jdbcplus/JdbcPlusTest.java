package com.hebaibai.jdbcplus;

import com.hebaibai.jdbcplus.entity.TblProduct;
import com.hebaibai.jdbcplus.jdbc.JdbcTest;
import org.junit.Test;

import java.util.List;

public class JdbcPlusTest extends JdbcTest {

    @Test
    public void name() {
        List<TblProduct> tblProducts = jdbcPlus.select(TblProduct.class);
        for (TblProduct tblProduct : tblProducts) {
            System.out.println(tblProduct);
        }
    }
}