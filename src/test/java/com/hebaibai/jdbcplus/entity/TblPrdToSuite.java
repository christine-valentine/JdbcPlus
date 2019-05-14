package com.hebaibai.jdbcplus.entity;

import com.hebaibai.jdbcplus.Column;
import com.hebaibai.jdbcplus.Id;
import com.hebaibai.jdbcplus.Table;

/**
 * tbl_prd_to_suite
 * @author hejiaxuan
 */
@Table("tbl_prd_to_suite")
public class TblPrdToSuite {

    /**套餐编号*/
    @Column("SUITE_ID")
    private String suiteId;

    /**产品编号*/
    @Column("PRODUCT_CODE")
    private String productCode;

    /**ID*/
    @Id
    @Column("ID")
    private String id;

    public void setSuiteId(String suiteId) {
        this.suiteId = suiteId;
    }

    public String getSuiteId() {
        return this.suiteId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append("suiteId:").append(suiteId).append(";    ");
        sb.append("productCode:").append(productCode).append(";    ");
        sb.append("id:").append(id).append(";    ");
        sb.append("]");
        return sb.toString();
    }
}
