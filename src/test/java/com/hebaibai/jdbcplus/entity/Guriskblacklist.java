package com.hebaibai.jdbcplus.entity;

import com.hebaibai.jdbcplus.Column;
import com.hebaibai.jdbcplus.Table;

import java.util.Date;

/**
 * guriskblacklist
 * @author hejiaxuan
 */
@Table("guriskblacklist")
public class Guriskblacklist {

    /**创建时间*/
    @Column("CreateTime")
    private Date createtime;

    /**性别，1男2女*/
    @Column("Sex")
    private Integer sex;

    /**险类代码 10 健康 11 意外*/
    @Column("ClassCode")
    private String classcode;

    /**最后修改时间*/
    @Column("LatestRevisionTime")
    private Date latestrevisiontime;

    /**投被保险人姓名*/
    @Column("Name")
    private String name;

    /**险种代码*/
    @Column("RiskCode")
    private String riskcode;

    /**证件号*/
    @Column("IdentifyNumber")
    private String identifynumber;

    /**有效标志 0无效1有效*/
    @Column("ValidInd")
    private Integer validind;

    /**码值：01:居民身份证;02:护照;03:军人证;04:驾驶证;05:港澳台同胞证;07:中国护照;08:出生证明;09:外国人永久居留证件;10:台湾居民居住证;11:港澳居民居住证;99:其他*/
    @Column("IdentifyType")
    private String identifytype;

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    public String getClasscode() {
        return this.classcode;
    }

    public void setLatestrevisiontime(Date latestrevisiontime) {
        this.latestrevisiontime = latestrevisiontime;
    }

    public Date getLatestrevisiontime() {
        return this.latestrevisiontime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode;
    }

    public String getRiskcode() {
        return this.riskcode;
    }

    public void setIdentifynumber(String identifynumber) {
        this.identifynumber = identifynumber;
    }

    public String getIdentifynumber() {
        return this.identifynumber;
    }

    public void setValidind(Integer validind) {
        this.validind = validind;
    }

    public Integer getValidind() {
        return this.validind;
    }

    public void setIdentifytype(String identifytype) {
        this.identifytype = identifytype;
    }

    public String getIdentifytype() {
        return this.identifytype;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append("createtime:").append(createtime).append(";    ");
        sb.append("sex:").append(sex).append(";    ");
        sb.append("classcode:").append(classcode).append(";    ");
        sb.append("latestrevisiontime:").append(latestrevisiontime).append(";    ");
        sb.append("name:").append(name).append(";    ");
        sb.append("riskcode:").append(riskcode).append(";    ");
        sb.append("identifynumber:").append(identifynumber).append(";    ");
        sb.append("validind:").append(validind).append(";    ");
        sb.append("identifytype:").append(identifytype).append(";    ");
        sb.append("]");
        return sb.toString();
    }
}
