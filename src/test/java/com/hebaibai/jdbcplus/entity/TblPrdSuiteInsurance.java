package com.hebaibai.jdbcplus.entity;

import com.hebaibai.jdbcplus.Column;
import com.hebaibai.jdbcplus.Table;

/**
 * 套餐险种关系表
 * @author hejiaxuan
 */
@Table("tbl_prd_suite_insurance")
public class TblPrdSuiteInsurance {

    @Column("PRODUCT_NO")
    private String productNo;

    @Column("SUITE_ID")
    private String suiteId;

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(String suiteId) {
        this.suiteId = suiteId;
    }

    @Override
    public String toString() {
        return "TblPrdSuiteInsurance{" +
                "productNo='" + productNo + '\'' +
                ", suiteId='" + suiteId + '\'' +
                '}';
    }
}
