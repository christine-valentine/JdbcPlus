package com.hebaibai.jdbcplus.entity;

import com.hebaibai.jdbcplus.Column;
import com.hebaibai.jdbcplus.Id;
import com.hebaibai.jdbcplus.Table;

import java.util.Date;

/**
 * tbl_product
 * @author hejiaxuan
 */
@Table("tbl_product")
public class TblProduct {

    /**CODES*/
    @Column("CODES")
    private String codes;

    /**投保类型(1-个人，2-公司)*/
    @Column("INSURER_TYPE")
    private String insurerType;

    /**网上商城产品小图*/
    @Column("SMALL_IMAGE")
    private String smallImage;

    /**最多人数(家庭险)*/
    @Column("MAX_QUANTITY")
    private String maxQuantity;

    /**最大年龄*/
    @Column("INSURER_AGE_MAX")
    private String insurerAgeMax;

    /**扫描微信标识，0-不扫微信，1扫微信*/
    @Column("SCAN_CODE_FLAG")
    private String scanCodeFlag;

    /**撤单标识(撤单标志：0-不允许撤单，1-可以撤单)*/
    @Column("REVOKE_FLAG")
    private String revokeFlag;

    /**缴费方式*/
    @Column("CHARGE_WAY")
    private String chargeWay;

    /**0-邮箱非必填，1-邮箱必填，2-产品不需要邮箱*/
    @Column("INSURER_EMAIL")
    private String insurerEmail;

    /**微信首页列表图*/
    @Column("INDEX_LIST_IMAGE_CHAT")
    private String indexListImageChat;

    /**产品名称*/
    @Column("PRODUCT_NAME")
    private String productName;

    /**生效日期备注*/
    @Column("EFFECTIVE_DATE_REMARK")
    private String effectiveDateRemark;

    /**最小年龄*/
    @Column("INSURER_AGE_MIN")
    private String insurerAgeMin;

    /**职业分类*/
    @Column("OCCUPATION_TYPE")
    private String occupationType;

    /**出单员代码*/
    @Column("C_ISSUE_NO")
    private String cIssueNo;

    /**发票类型*/
    @Column("INVOICE_TYPE")
    private String invoiceType;

    /**保障期限*/
    @Column("GUARANTEE_DATE")
    private String guaranteeDate;

    /**主键*/
    @Id
    @Column("ID")
    private String id;

    /**是否包含保期后日期边界：0-不包含，1-包含*/
    @Column("RENEW_AFTER_CONTAIN")
    private String renewAfterContain;

    /**是否发送邮件或短信（01:渠道API是否发送承保短信，02：渠道API是否发送承保邮件，03：渠道API是否发送续保短信，04:渠道H5是否发送承保短信，05：渠道H5是否发送承保邮件，06：渠道H5是否发送续保短信）*/
    @Column("RENEW_IS_SEND")
    private String renewIsSend;

    /**家庭类型3-一家三口，4-一家四口，逗号隔开*/
    @Column("FAMILY_TYPE")
    private String familyType;

    /**网上商城产品大图*/
    @Column("BIG_IMAGE")
    private String bigImage;

    /**业务归属人员名称*/
    @Column("C_COM_PER_NAME")
    private String cComPerName;

    /**销售区域*/
    @Column("SALE_AREA")
    private String saleArea;

    /**是否校验黑名单 不校验：0 校验：1*/
    @Column("CHECK_BLACK")
    private Integer checkBlack;

    /**产品特色*/
    @Column("MAIN_PRD_STYLE")
    private String mainPrdStyle;

    /**归属所有（1：归原所有，0：归于指定信息）*/
    @Column("BELONG_TO_ALL")
    private String belongToAll;

    /**产品描述*/
    @Column("PROD_DESCRIPT")
    private String prodDescript;

    /**出单机构代码*/
    @Column("C_DPT_CDE")
    private String cDptCde;

    /**业务归属结构名称*/
    @Column("C_COM_NAME")
    private String cComName;

    /**核保方式（01：系统自核，02：人工核保，03：智能核保）*/
    @Column("UNDERWRITING_WAY")
    private String underwritingWay;

    /**可续保次数*/
    @Column("RENEW_NUM")
    private String renewNum;

    /**分期*/
    @Column("PERIODIZATION")
    private String periodization;

    /**可续保商品组*/
    @Column("RENEW_PRODUCT_GROUP")
    private String renewProductGroup;

    /**是否包含保期内日期边界：0-不包含，1-包含*/
    @Column("RENEW_BEFORE_CONTAIN")
    private String renewBeforeContain;

    /**是否包含最大年龄0-不包含，1-包含*/
    @Column("AGE_MIN_CONTAIN")
    private String ageMinContain;

    /**续保设置（01:商城，02：微信，03：渠道，04：H5）*/
    @Column("RENEW_WAY")
    private String renewWay;

    /**受益类型(1-法定，2-指定公司，3-指定人)*/
    @Column("BENEFICIARY_TYPE")
    private String beneficiaryType;

    /**网上商城首页列表图*/
    @Column("INDEX_LIST_IMAGE")
    private String indexListImage;

    /**出单员名称*/
    @Column("C_ISSUE_NAME")
    private String cIssueName;

    /**报案类型*/
    @Column("CASE_REPORT_TYPE")
    private String caseReportType;

    /**费率导入时间*/
    @Column("IMPORT_TIME")
    private Date importTime;

    /**0-默认无社保，1-默认有社保，2-产品不需要社保*/
    @Column("SOCIAL_FLAG")
    private String socialFlag;

    /**保全标识*/
    @Column("PRESERVATION_FLAG")
    private String preservationFlag;

    /**费率导入状态;1,已导入；0，未导入*/
    @Column("FLAG")
    private String flag;

    /**业务归属人员代码*/
    @Column("C_COM_PER_CODE")
    private String cComPerCode;

    /**其他设置（01:免等待期，02：免健康告知，03：黑名单）*/
    @Column("RENEW_OTHER_SETTING")
    private String renewOtherSetting;

    /**保期内续保时间范围（单位是D天）*/
    @Column("RENEW_AFTER_RANGE")
    private String renewAfterRange;

    /**被保类型(被保的是人-1或车-0)*/
    @Column("INSURED_TYPE")
    private String insuredType;

    /**理赔标识(在线理赔, 0:不支持理赔  1:线上理赔 2:线下理赔 12:都支持)*/
    @Column("CLAIM_FLAG")
    private String claimFlag;

    /**推荐产品*/
    @Column("RECOMMEND")
    private String recommend;

    /**热销商品*/
    @Column("HOT")
    private String hot;

    /**保期内续保时间范围（单位是D天）*/
    @Column("RENEW_BEFORE_RANGE")
    private String renewBeforeRange;

    /**争议处理方式*/
    @Column("DISPUT_TYPE")
    private String disputType;

    /**出单机构名称*/
    @Column("C_DPT_NAME")
    private String cDptName;

    /**最低保费*/
    @Column("PREMIUM")
    private String premium;

    /**最少人数（家庭险）*/
    @Column("MIN_QUANTITY")
    private String minQuantity;

    /**电子保单模板*/
    @Column("ELEC_POLICY_MODEL")
    private String elecPolicyModel;

    /**投保人证件类型*/
    @Column("INSURER_CERTI_TYPE")
    private String insurerCertiType;

    /**二维码路径*/
    @Column("SCAN_CODE_PATH")
    private String scanCodePath;

    /** 是否可续保标志（01:可续保，02：不可续保）*/
    @Column("RENEW_FLAG")
    private String renewFlag;

    /**上下架01上架，02下架(前两位表示网上商城，中间两位表示微信，后两位表示渠道)*/
    @Column("ENABLE_FLAG")
    private String enableFlag;

    /**微信大图*/
    @Column("BIG_IMAGE_CHAT")
    private String bigImageChat;

    /**商品类型(个人1 家庭2 团体3)*/
    @Column("CATE")
    private String cate;

    /**投保份数控制*/
    @Column("INSURE_COPY_LIMIT")
    private String insureCopyLimit;

    /**生效日期选择范围(以天来表示如180天：180D)*/
    @Column("EFFECTIVE_DATE_RANGE")
    private String effectiveDateRange;

    /**保障区域*/
    @Column("COVERED_AREA")
    private String coveredArea;

    /**仲裁机构名称*/
    @Column("ARBITRATION_NAME")
    private String arbitrationName;

    /**默认人数*/
    @Column("DEFAULT_QUANTITY")
    private String defaultQuantity;

    /**微信首页列表图*/
    @Column("LIST_IMAGE_CHAT")
    private String listImageChat;

    /**是否包含最大年龄0-不包含，1-包含*/
    @Column("AGE_MAX_CONTAIN")
    private String ageMaxContain;

    /**业务归属结构代码*/
    @Column("C_COM_CODE")
    private String cComCode;

    /**保单类型*/
    @Column("POLICY_TYPE")
    private String policyType;

    /**退保标识(退保标志：0-不允许退保，1-可以退保)*/
    @Column("SURRENDER_FLAG")
    private String surrenderFlag;

    /**被保人性别(F-默认性别女，M-默认性别男，0-产品不需要性别)*/
    @Column("INSURER_GENDER")
    private String insurerGender;

    /**0-出生日期非必填，1-出生日期必填，2-产品不需要出生日期*/
    @Column("INSURER_BIRTH")
    private String insurerBirth;

    /**0-手机号非必填，1-手机号必填，2-产品不需要手机号*/
    @Column("INSURER_CELL_PHONE")
    private String insurerCellPhone;

    /**默认保障期限*/
    @Column("DEFAULT_PERIOD")
    private String defaultPeriod;

    /**商品种类(传统C 互助H)*/
    @Column("CATEGORY")
    private String category;

    /**生效日期类型*/
    @Column("EFFECTIVE_DATE")
    private String effectiveDate;

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getCodes() {
        return this.codes;
    }

    public void setInsurerType(String insurerType) {
        this.insurerType = insurerType;
    }

    public String getInsurerType() {
        return this.insurerType;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getSmallImage() {
        return this.smallImage;
    }

    public void setMaxQuantity(String maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String getMaxQuantity() {
        return this.maxQuantity;
    }

    public void setInsurerAgeMax(String insurerAgeMax) {
        this.insurerAgeMax = insurerAgeMax;
    }

    public String getInsurerAgeMax() {
        return this.insurerAgeMax;
    }

    public void setScanCodeFlag(String scanCodeFlag) {
        this.scanCodeFlag = scanCodeFlag;
    }

    public String getScanCodeFlag() {
        return this.scanCodeFlag;
    }

    public void setRevokeFlag(String revokeFlag) {
        this.revokeFlag = revokeFlag;
    }

    public String getRevokeFlag() {
        return this.revokeFlag;
    }

    public void setChargeWay(String chargeWay) {
        this.chargeWay = chargeWay;
    }

    public String getChargeWay() {
        return this.chargeWay;
    }

    public void setInsurerEmail(String insurerEmail) {
        this.insurerEmail = insurerEmail;
    }

    public String getInsurerEmail() {
        return this.insurerEmail;
    }

    public void setIndexListImageChat(String indexListImageChat) {
        this.indexListImageChat = indexListImageChat;
    }

    public String getIndexListImageChat() {
        return this.indexListImageChat;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setEffectiveDateRemark(String effectiveDateRemark) {
        this.effectiveDateRemark = effectiveDateRemark;
    }

    public String getEffectiveDateRemark() {
        return this.effectiveDateRemark;
    }

    public void setInsurerAgeMin(String insurerAgeMin) {
        this.insurerAgeMin = insurerAgeMin;
    }

    public String getInsurerAgeMin() {
        return this.insurerAgeMin;
    }

    public void setOccupationType(String occupationType) {
        this.occupationType = occupationType;
    }

    public String getOccupationType() {
        return this.occupationType;
    }

    public void setCIssueNo(String cIssueNo) {
        this.cIssueNo = cIssueNo;
    }

    public String getCIssueNo() {
        return this.cIssueNo;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() {
        return this.invoiceType;
    }

    public void setGuaranteeDate(String guaranteeDate) {
        this.guaranteeDate = guaranteeDate;
    }

    public String getGuaranteeDate() {
        return this.guaranteeDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setRenewAfterContain(String renewAfterContain) {
        this.renewAfterContain = renewAfterContain;
    }

    public String getRenewAfterContain() {
        return this.renewAfterContain;
    }

    public void setRenewIsSend(String renewIsSend) {
        this.renewIsSend = renewIsSend;
    }

    public String getRenewIsSend() {
        return this.renewIsSend;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }

    public String getFamilyType() {
        return this.familyType;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getBigImage() {
        return this.bigImage;
    }

    public void setCComPerName(String cComPerName) {
        this.cComPerName = cComPerName;
    }

    public String getCComPerName() {
        return this.cComPerName;
    }

    public void setSaleArea(String saleArea) {
        this.saleArea = saleArea;
    }

    public String getSaleArea() {
        return this.saleArea;
    }

    public void setCheckBlack(Integer checkBlack) {
        this.checkBlack = checkBlack;
    }

    public Integer getCheckBlack() {
        return this.checkBlack;
    }

    public void setMainPrdStyle(String mainPrdStyle) {
        this.mainPrdStyle = mainPrdStyle;
    }

    public String getMainPrdStyle() {
        return this.mainPrdStyle;
    }

    public void setBelongToAll(String belongToAll) {
        this.belongToAll = belongToAll;
    }

    public String getBelongToAll() {
        return this.belongToAll;
    }

    public void setProdDescript(String prodDescript) {
        this.prodDescript = prodDescript;
    }

    public String getProdDescript() {
        return this.prodDescript;
    }

    public void setCDptCde(String cDptCde) {
        this.cDptCde = cDptCde;
    }

    public String getCDptCde() {
        return this.cDptCde;
    }

    public void setCComName(String cComName) {
        this.cComName = cComName;
    }

    public String getCComName() {
        return this.cComName;
    }

    public void setUnderwritingWay(String underwritingWay) {
        this.underwritingWay = underwritingWay;
    }

    public String getUnderwritingWay() {
        return this.underwritingWay;
    }

    public void setRenewNum(String renewNum) {
        this.renewNum = renewNum;
    }

    public String getRenewNum() {
        return this.renewNum;
    }

    public void setPeriodization(String periodization) {
        this.periodization = periodization;
    }

    public String getPeriodization() {
        return this.periodization;
    }

    public void setRenewProductGroup(String renewProductGroup) {
        this.renewProductGroup = renewProductGroup;
    }

    public String getRenewProductGroup() {
        return this.renewProductGroup;
    }

    public void setRenewBeforeContain(String renewBeforeContain) {
        this.renewBeforeContain = renewBeforeContain;
    }

    public String getRenewBeforeContain() {
        return this.renewBeforeContain;
    }

    public void setAgeMinContain(String ageMinContain) {
        this.ageMinContain = ageMinContain;
    }

    public String getAgeMinContain() {
        return this.ageMinContain;
    }

    public void setRenewWay(String renewWay) {
        this.renewWay = renewWay;
    }

    public String getRenewWay() {
        return this.renewWay;
    }

    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public String getBeneficiaryType() {
        return this.beneficiaryType;
    }

    public void setIndexListImage(String indexListImage) {
        this.indexListImage = indexListImage;
    }

    public String getIndexListImage() {
        return this.indexListImage;
    }

    public void setCIssueName(String cIssueName) {
        this.cIssueName = cIssueName;
    }

    public String getCIssueName() {
        return this.cIssueName;
    }

    public void setCaseReportType(String caseReportType) {
        this.caseReportType = caseReportType;
    }

    public String getCaseReportType() {
        return this.caseReportType;
    }

    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }

    public Date getImportTime() {
        return this.importTime;
    }

    public void setSocialFlag(String socialFlag) {
        this.socialFlag = socialFlag;
    }

    public String getSocialFlag() {
        return this.socialFlag;
    }

    public void setPreservationFlag(String preservationFlag) {
        this.preservationFlag = preservationFlag;
    }

    public String getPreservationFlag() {
        return this.preservationFlag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setCComPerCode(String cComPerCode) {
        this.cComPerCode = cComPerCode;
    }

    public String getCComPerCode() {
        return this.cComPerCode;
    }

    public void setRenewOtherSetting(String renewOtherSetting) {
        this.renewOtherSetting = renewOtherSetting;
    }

    public String getRenewOtherSetting() {
        return this.renewOtherSetting;
    }

    public void setRenewAfterRange(String renewAfterRange) {
        this.renewAfterRange = renewAfterRange;
    }

    public String getRenewAfterRange() {
        return this.renewAfterRange;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType;
    }

    public String getInsuredType() {
        return this.insuredType;
    }

    public void setClaimFlag(String claimFlag) {
        this.claimFlag = claimFlag;
    }

    public String getClaimFlag() {
        return this.claimFlag;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getRecommend() {
        return this.recommend;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getHot() {
        return this.hot;
    }

    public void setRenewBeforeRange(String renewBeforeRange) {
        this.renewBeforeRange = renewBeforeRange;
    }

    public String getRenewBeforeRange() {
        return this.renewBeforeRange;
    }

    public void setDisputType(String disputType) {
        this.disputType = disputType;
    }

    public String getDisputType() {
        return this.disputType;
    }

    public void setCDptName(String cDptName) {
        this.cDptName = cDptName;
    }

    public String getCDptName() {
        return this.cDptName;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getPremium() {
        return this.premium;
    }

    public void setMinQuantity(String minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getMinQuantity() {
        return this.minQuantity;
    }

    public void setElecPolicyModel(String elecPolicyModel) {
        this.elecPolicyModel = elecPolicyModel;
    }

    public String getElecPolicyModel() {
        return this.elecPolicyModel;
    }

    public void setInsurerCertiType(String insurerCertiType) {
        this.insurerCertiType = insurerCertiType;
    }

    public String getInsurerCertiType() {
        return this.insurerCertiType;
    }

    public void setScanCodePath(String scanCodePath) {
        this.scanCodePath = scanCodePath;
    }

    public String getScanCodePath() {
        return this.scanCodePath;
    }

    public void setRenewFlag(String renewFlag) {
        this.renewFlag = renewFlag;
    }

    public String getRenewFlag() {
        return this.renewFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getEnableFlag() {
        return this.enableFlag;
    }

    public void setBigImageChat(String bigImageChat) {
        this.bigImageChat = bigImageChat;
    }

    public String getBigImageChat() {
        return this.bigImageChat;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getCate() {
        return this.cate;
    }

    public void setInsureCopyLimit(String insureCopyLimit) {
        this.insureCopyLimit = insureCopyLimit;
    }

    public String getInsureCopyLimit() {
        return this.insureCopyLimit;
    }

    public void setEffectiveDateRange(String effectiveDateRange) {
        this.effectiveDateRange = effectiveDateRange;
    }

    public String getEffectiveDateRange() {
        return this.effectiveDateRange;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getCoveredArea() {
        return this.coveredArea;
    }

    public void setArbitrationName(String arbitrationName) {
        this.arbitrationName = arbitrationName;
    }

    public String getArbitrationName() {
        return this.arbitrationName;
    }

    public void setDefaultQuantity(String defaultQuantity) {
        this.defaultQuantity = defaultQuantity;
    }

    public String getDefaultQuantity() {
        return this.defaultQuantity;
    }

    public void setListImageChat(String listImageChat) {
        this.listImageChat = listImageChat;
    }

    public String getListImageChat() {
        return this.listImageChat;
    }

    public void setAgeMaxContain(String ageMaxContain) {
        this.ageMaxContain = ageMaxContain;
    }

    public String getAgeMaxContain() {
        return this.ageMaxContain;
    }

    public void setCComCode(String cComCode) {
        this.cComCode = cComCode;
    }

    public String getCComCode() {
        return this.cComCode;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyType() {
        return this.policyType;
    }

    public void setSurrenderFlag(String surrenderFlag) {
        this.surrenderFlag = surrenderFlag;
    }

    public String getSurrenderFlag() {
        return this.surrenderFlag;
    }

    public void setInsurerGender(String insurerGender) {
        this.insurerGender = insurerGender;
    }

    public String getInsurerGender() {
        return this.insurerGender;
    }

    public void setInsurerBirth(String insurerBirth) {
        this.insurerBirth = insurerBirth;
    }

    public String getInsurerBirth() {
        return this.insurerBirth;
    }

    public void setInsurerCellPhone(String insurerCellPhone) {
        this.insurerCellPhone = insurerCellPhone;
    }

    public String getInsurerCellPhone() {
        return this.insurerCellPhone;
    }

    public void setDefaultPeriod(String defaultPeriod) {
        this.defaultPeriod = defaultPeriod;
    }

    public String getDefaultPeriod() {
        return this.defaultPeriod;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append("codes:").append(codes).append(";    ");
        sb.append("insurerType:").append(insurerType).append(";    ");
        sb.append("smallImage:").append(smallImage).append(";    ");
        sb.append("maxQuantity:").append(maxQuantity).append(";    ");
        sb.append("insurerAgeMax:").append(insurerAgeMax).append(";    ");
        sb.append("scanCodeFlag:").append(scanCodeFlag).append(";    ");
        sb.append("revokeFlag:").append(revokeFlag).append(";    ");
        sb.append("chargeWay:").append(chargeWay).append(";    ");
        sb.append("insurerEmail:").append(insurerEmail).append(";    ");
        sb.append("indexListImageChat:").append(indexListImageChat).append(";    ");
        sb.append("productName:").append(productName).append(";    ");
        sb.append("effectiveDateRemark:").append(effectiveDateRemark).append(";    ");
        sb.append("insurerAgeMin:").append(insurerAgeMin).append(";    ");
        sb.append("occupationType:").append(occupationType).append(";    ");
        sb.append("cIssueNo:").append(cIssueNo).append(";    ");
        sb.append("invoiceType:").append(invoiceType).append(";    ");
        sb.append("guaranteeDate:").append(guaranteeDate).append(";    ");
        sb.append("id:").append(id).append(";    ");
        sb.append("renewAfterContain:").append(renewAfterContain).append(";    ");
        sb.append("renewIsSend:").append(renewIsSend).append(";    ");
        sb.append("familyType:").append(familyType).append(";    ");
        sb.append("bigImage:").append(bigImage).append(";    ");
        sb.append("cComPerName:").append(cComPerName).append(";    ");
        sb.append("saleArea:").append(saleArea).append(";    ");
        sb.append("checkBlack:").append(checkBlack).append(";    ");
        sb.append("mainPrdStyle:").append(mainPrdStyle).append(";    ");
        sb.append("belongToAll:").append(belongToAll).append(";    ");
        sb.append("prodDescript:").append(prodDescript).append(";    ");
        sb.append("cDptCde:").append(cDptCde).append(";    ");
        sb.append("cComName:").append(cComName).append(";    ");
        sb.append("underwritingWay:").append(underwritingWay).append(";    ");
        sb.append("renewNum:").append(renewNum).append(";    ");
        sb.append("periodization:").append(periodization).append(";    ");
        sb.append("renewProductGroup:").append(renewProductGroup).append(";    ");
        sb.append("renewBeforeContain:").append(renewBeforeContain).append(";    ");
        sb.append("ageMinContain:").append(ageMinContain).append(";    ");
        sb.append("renewWay:").append(renewWay).append(";    ");
        sb.append("beneficiaryType:").append(beneficiaryType).append(";    ");
        sb.append("indexListImage:").append(indexListImage).append(";    ");
        sb.append("cIssueName:").append(cIssueName).append(";    ");
        sb.append("caseReportType:").append(caseReportType).append(";    ");
        sb.append("importTime:").append(importTime).append(";    ");
        sb.append("socialFlag:").append(socialFlag).append(";    ");
        sb.append("preservationFlag:").append(preservationFlag).append(";    ");
        sb.append("flag:").append(flag).append(";    ");
        sb.append("cComPerCode:").append(cComPerCode).append(";    ");
        sb.append("renewOtherSetting:").append(renewOtherSetting).append(";    ");
        sb.append("renewAfterRange:").append(renewAfterRange).append(";    ");
        sb.append("insuredType:").append(insuredType).append(";    ");
        sb.append("claimFlag:").append(claimFlag).append(";    ");
        sb.append("recommend:").append(recommend).append(";    ");
        sb.append("hot:").append(hot).append(";    ");
        sb.append("renewBeforeRange:").append(renewBeforeRange).append(";    ");
        sb.append("disputType:").append(disputType).append(";    ");
        sb.append("cDptName:").append(cDptName).append(";    ");
        sb.append("premium:").append(premium).append(";    ");
        sb.append("minQuantity:").append(minQuantity).append(";    ");
        sb.append("elecPolicyModel:").append(elecPolicyModel).append(";    ");
        sb.append("insurerCertiType:").append(insurerCertiType).append(";    ");
        sb.append("scanCodePath:").append(scanCodePath).append(";    ");
        sb.append("renewFlag:").append(renewFlag).append(";    ");
        sb.append("enableFlag:").append(enableFlag).append(";    ");
        sb.append("bigImageChat:").append(bigImageChat).append(";    ");
        sb.append("cate:").append(cate).append(";    ");
        sb.append("insureCopyLimit:").append(insureCopyLimit).append(";    ");
        sb.append("effectiveDateRange:").append(effectiveDateRange).append(";    ");
        sb.append("coveredArea:").append(coveredArea).append(";    ");
        sb.append("arbitrationName:").append(arbitrationName).append(";    ");
        sb.append("defaultQuantity:").append(defaultQuantity).append(";    ");
        sb.append("listImageChat:").append(listImageChat).append(";    ");
        sb.append("ageMaxContain:").append(ageMaxContain).append(";    ");
        sb.append("cComCode:").append(cComCode).append(";    ");
        sb.append("policyType:").append(policyType).append(";    ");
        sb.append("surrenderFlag:").append(surrenderFlag).append(";    ");
        sb.append("insurerGender:").append(insurerGender).append(";    ");
        sb.append("insurerBirth:").append(insurerBirth).append(";    ");
        sb.append("insurerCellPhone:").append(insurerCellPhone).append(";    ");
        sb.append("defaultPeriod:").append(defaultPeriod).append(";    ");
        sb.append("category:").append(category).append(";    ");
        sb.append("effectiveDate:").append(effectiveDate).append(";    ");
        sb.append("]");
        return sb.toString();
    }
}
