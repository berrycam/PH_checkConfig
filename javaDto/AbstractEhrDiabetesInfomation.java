package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 糖尿病专项bean
 * Created by DJH on 2018/1/31 0031.
 */
@Entity
public class AbstractEhrDiabetesInfomation extends BaseChildBean{
    /**
     * 本地数据库id
     */
    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    @Expose
    private Long localId;

    /**
     * 身份证
     */
    @Expose
    private String idCard;

    /**
     * 会员卡
     */
    @Expose
    private String vipCard;

    /**
     * 是否已经上传
     */
    @Expose
    private boolean upload = false;

    /**
     * 后台数据库id
     */
    private String id;

    /**
     * 1. [不可空] 糖尿病专案编号
     */
    private String mangementNo;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [不可空] 糖尿病类型代码
     */
    private String diabetesTypeCode;

    /**
     * 5. [可空] 确诊日期
     */
    private java.util.Date confirmDate;

    /**
     * 6. [可空] 确诊机构编码
     */
    private String confirmOrgCode;

    /**
     * 7. [可空] 确诊机构名称
     */
    private String confirmOrgName;

    /**
     * 8. [可空] 登记医生编码
     */
    private String createDoctorCode;

    /**
     * 9. [可空] 登记医生名称
     */
    private String createDoctorName;

    /**
     * 10. [可空] 登记日期
     */
    private java.util.Date createDate;

    /**
     * 11. [可空] 结案标志
     */
    private Boolean endCaseFlag;

    /**
     * 12. [可空] 结案原因代码
     */
    private String endCaseReasonCode;

    /**
     * 13. [可空] 建案日期
     */
    private java.util.Date createCaseDate;

    /**
     * 14. [可空] 结案日期
     */
    private java.util.Date endCaseDate;

    /**
     * 15. [可空] 结案机构编码
     */
    private String endCaseOrgCode;

    /**
     * 16. [可空] 结案机构名称
     */
    private String endCaseOrgName;

    /**
     * 17. [可空] 管理机构编码
     */
    private String managerOrgCode;

    /**
     * 18. [可空] 管理机构名称
     */
    private String managerOrgName;

    /**
     * 19. [可空] 登记时间
     */
    private java.util.Date entryDate;

    /**
     * 20. [可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 21. [可空] 登记人员名称
     */
    private String entryEmpName;

    /**
     * 22. [可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 23. [可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 24. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 25. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 26. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    private String updateFlag;

    /**
     * 28. [可空] 修改人
     */
    private String editor;

    /**
     * 29. [可空] 更新日期
     */
    private java.util.Date modifydate;

    /**
     * 30. [不可空] fdata_from
     */
    private String fdataFrom;

    /**
     * 31. [可空] 相关高血压史
     */
    private String correlationDiabetes;

    /**
     * 32. [可空] 相关高血压病程
     */
    private Double courseOfDiabetes;

    /**
     * 33. [可空] 相关糖尿病史
     */
    private String correlationHyper;

    /**
     * 34. [可空] 相关糖尿病病程
     */
    private Double courseOfHyper;

    /**
     * 35. [可空] 相关脑卒中史
     */
    private String correlationStroke;

    /**
     * 36. [可空] 相关脑卒中病程
     */
    private Double courseOfStroke;

    /**
     * 37. [可空] 相关心绞痛史
     */
    private String correlationAngina;

    /**
     * 38. [可空] 相关心绞痛病程
     */
    private Double courseOfAngina;

    /**
     * 39. [可空] 相关一次性脑缺血
     */
    private String correlationCerebral;

    /**
     * 40. [可空] 相关一次性脑缺血病程
     */
    private Double courseOfCerebral;

    /**
     * 41. [可空] 相关心肌梗塞史
     */
    private String correlationMyocardialInfarct;

    /**
     * 42. [可空] 相关心肌梗塞病程
     */
    private Double courseOfMyocardialInfarct;

    /**
     * 43. [可空] 家族糖尿病史
     */
    private String familyDiabetes;

    /**
     * 44. [可空] 家族高血压史
     */
    private String familyHyper;

    /**
     * 45. [可空] 家族脑卒中史
     */
    private String familyStroke;

    /**
     * 46. [可空] 家族冠心病史
     */
    private String familyCoronaryHeartDisease;

    /**
     * 47. [可空] 身高
     */
    private Double height;

    /**
     * 48. [可空] 体重
     */
    private Double weight;

    /**
     * 49. [可空] 腰围
     */
    private Double waist;

    /**
     * 50. [可空] 心率
     */
    private Double heartRate;

    /**
     * 51. [可空] 舒张压
     */
    private Double diastolicPressure;

    /**
     * 52. [可空] 收缩压
     */
    private Double systolicPressure;

    /**
     * 53. [可空] 血糖mmol/L
     */
    private Double glu;

    /**
     * 54. [可空] 血糖mg/Dl
     */
    private Double gluDl;

    /**
     * 55. [可空] 总胆固醇mmol/L
     */
    private Double totalCholesterol;

    /**
     * 56. [可空] 总胆固醇mg/DL
     */
    private Double totalCholesterolDl;

    /**
     * 57. [可空] 甘油三脂mmol/L
     */
    private Double triglyceride;

    /**
     * 58. [可空] 甘油三脂mg/L
     */
    private Double triglycerideDl;

    /**
     * 59. [可空] 高密度脂蛋白胆固醇mmol/L
     */
    private Double serumHighCholesterol;

    /**
     * 60. [可空] 高密度脂蛋白胆固醇mg/Dl
     */
    private Double serumHighCholesterolDl;

    /**
     * 61. [可空] 血肌酐mmol/L
     */
    private Double serumCreatinine;

    /**
     * 62. [可空] 学肌酐mg/DL
     */
    private Double serumCreatinineDl;

    /**
     * 63. [可空] 尿蛋白
     */
    private String urineMicroAlbumin;

    /**
     * 64. [可空] 视网膜病变
     */
    private String retinopathy;

    /**
     * 65. [可空] 每日蔬菜量
     */
    private Double sc;

    /**
     * 66. [可空] 每日水果量
     */
    private Double sg;

    /**
     * 67. [可空] 口味,1咸 ,2淡
     */
    private String kw;

    /**
     * 68. [可空] 每日饮酒1无2有
     */
    private String mryj;

    /**
     * 69. [可空] 白酒(两)
     */
    private Double mryjBj;

    /**
     * 70. [可空] 黄酒(两)
     */
    private Double mryjHj;

    /**
     * 71. [可空] 啤酒(ML)
     */
    private Double mryjPj;

    /**
     * 72. [可空] 红酒(ML)
     */
    private Double mryjRedj;

    /**
     * 73. [可空] 每日抽烟1无2有
     */
    private String mrcy;

    /**
     * 74. [可空] 每日抽烟数量
     */
    private Double mrcySl;

    /**
     * 75. [可空] 每周锻炼1无2有
     */
    private String mzdl;

    /**
     * 76. [可空] 每周锻炼每周次数
     */
    private Double mzdlZc;

    /**
     * 77. [可空] 每周锻炼每次分钟数
     */
    private Double mzdlZcFz;

    /**
     * 78. [可空] 非药物治疗,字典
     */
    private String fywzl;

    /**
     * [可空] 修改人ID
     */
    private String editorId;

    /**
     * [可空] 修改机构编码
     */
    private String updateOrgId;

    /**
     * [可空] 修改机构名称
     */
    private String updateOrgName;

    @Generated(hash = 1961422263)
    public AbstractEhrDiabetesInfomation(Long localId, String idCard,
            String vipCard, boolean upload, String id, String mangementNo,
            String healthfileNo, String fileNumber, String diabetesTypeCode,
            java.util.Date confirmDate, String confirmOrgCode,
            String confirmOrgName, String createDoctorCode, String createDoctorName,
            java.util.Date createDate, Boolean endCaseFlag,
            String endCaseReasonCode, java.util.Date createCaseDate,
            java.util.Date endCaseDate, String endCaseOrgCode,
            String endCaseOrgName, String managerOrgCode, String managerOrgName,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String updateFlag, String editor,
            java.util.Date modifydate, String fdataFrom, String correlationDiabetes,
            Double courseOfDiabetes, String correlationHyper, Double courseOfHyper,
            String correlationStroke, Double courseOfStroke,
            String correlationAngina, Double courseOfAngina,
            String correlationCerebral, Double courseOfCerebral,
            String correlationMyocardialInfarct, Double courseOfMyocardialInfarct,
            String familyDiabetes, String familyHyper, String familyStroke,
            String familyCoronaryHeartDisease, Double height, Double weight,
            Double waist, Double heartRate, Double diastolicPressure,
            Double systolicPressure, Double glu, Double gluDl,
            Double totalCholesterol, Double totalCholesterolDl, Double triglyceride,
            Double triglycerideDl, Double serumHighCholesterol,
            Double serumHighCholesterolDl, Double serumCreatinine,
            Double serumCreatinineDl, String urineMicroAlbumin, String retinopathy,
            Double sc, Double sg, String kw, String mryj, Double mryjBj,
            Double mryjHj, Double mryjPj, Double mryjRedj, String mrcy,
            Double mrcySl, String mzdl, Double mzdlZc, Double mzdlZcFz,
            String fywzl, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.id = id;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.diabetesTypeCode = diabetesTypeCode;
        this.confirmDate = confirmDate;
        this.confirmOrgCode = confirmOrgCode;
        this.confirmOrgName = confirmOrgName;
        this.createDoctorCode = createDoctorCode;
        this.createDoctorName = createDoctorName;
        this.createDate = createDate;
        this.endCaseFlag = endCaseFlag;
        this.endCaseReasonCode = endCaseReasonCode;
        this.createCaseDate = createCaseDate;
        this.endCaseDate = endCaseDate;
        this.endCaseOrgCode = endCaseOrgCode;
        this.endCaseOrgName = endCaseOrgName;
        this.managerOrgCode = managerOrgCode;
        this.managerOrgName = managerOrgName;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.fdataFrom = fdataFrom;
        this.correlationDiabetes = correlationDiabetes;
        this.courseOfDiabetes = courseOfDiabetes;
        this.correlationHyper = correlationHyper;
        this.courseOfHyper = courseOfHyper;
        this.correlationStroke = correlationStroke;
        this.courseOfStroke = courseOfStroke;
        this.correlationAngina = correlationAngina;
        this.courseOfAngina = courseOfAngina;
        this.correlationCerebral = correlationCerebral;
        this.courseOfCerebral = courseOfCerebral;
        this.correlationMyocardialInfarct = correlationMyocardialInfarct;
        this.courseOfMyocardialInfarct = courseOfMyocardialInfarct;
        this.familyDiabetes = familyDiabetes;
        this.familyHyper = familyHyper;
        this.familyStroke = familyStroke;
        this.familyCoronaryHeartDisease = familyCoronaryHeartDisease;
        this.height = height;
        this.weight = weight;
        this.waist = waist;
        this.heartRate = heartRate;
        this.diastolicPressure = diastolicPressure;
        this.systolicPressure = systolicPressure;
        this.glu = glu;
        this.gluDl = gluDl;
        this.totalCholesterol = totalCholesterol;
        this.totalCholesterolDl = totalCholesterolDl;
        this.triglyceride = triglyceride;
        this.triglycerideDl = triglycerideDl;
        this.serumHighCholesterol = serumHighCholesterol;
        this.serumHighCholesterolDl = serumHighCholesterolDl;
        this.serumCreatinine = serumCreatinine;
        this.serumCreatinineDl = serumCreatinineDl;
        this.urineMicroAlbumin = urineMicroAlbumin;
        this.retinopathy = retinopathy;
        this.sc = sc;
        this.sg = sg;
        this.kw = kw;
        this.mryj = mryj;
        this.mryjBj = mryjBj;
        this.mryjHj = mryjHj;
        this.mryjPj = mryjPj;
        this.mryjRedj = mryjRedj;
        this.mrcy = mrcy;
        this.mrcySl = mrcySl;
        this.mzdl = mzdl;
        this.mzdlZc = mzdlZc;
        this.mzdlZcFz = mzdlZcFz;
        this.fywzl = fywzl;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 166953966)
    public AbstractEhrDiabetesInfomation() {
    }

    public Long getLocalId() {
        return this.localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMangementNo() {
        return this.mangementNo;
    }

    public void setMangementNo(String mangementNo) {
        this.mangementNo = mangementNo;
    }

    public String getHealthfileNo() {
        return this.healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getFileNumber() {
        return this.fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getDiabetesTypeCode() {
        return this.diabetesTypeCode;
    }

    public void setDiabetesTypeCode(String diabetesTypeCode) {
        this.diabetesTypeCode = diabetesTypeCode;
    }

    public java.util.Date getConfirmDate() {
        return this.confirmDate;
    }

    public void setConfirmDate(java.util.Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getConfirmOrgCode() {
        return this.confirmOrgCode;
    }

    public void setConfirmOrgCode(String confirmOrgCode) {
        this.confirmOrgCode = confirmOrgCode;
    }

    public String getConfirmOrgName() {
        return this.confirmOrgName;
    }

    public void setConfirmOrgName(String confirmOrgName) {
        this.confirmOrgName = confirmOrgName;
    }

    public String getCreateDoctorCode() {
        return this.createDoctorCode;
    }

    public void setCreateDoctorCode(String createDoctorCode) {
        this.createDoctorCode = createDoctorCode;
    }

    public String getCreateDoctorName() {
        return this.createDoctorName;
    }

    public void setCreateDoctorName(String createDoctorName) {
        this.createDoctorName = createDoctorName;
    }

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getEndCaseFlag() {
        return this.endCaseFlag;
    }

    public void setEndCaseFlag(Boolean endCaseFlag) {
        this.endCaseFlag = endCaseFlag;
    }

    public String getEndCaseReasonCode() {
        return this.endCaseReasonCode;
    }

    public void setEndCaseReasonCode(String endCaseReasonCode) {
        this.endCaseReasonCode = endCaseReasonCode;
    }

    public java.util.Date getCreateCaseDate() {
        return this.createCaseDate;
    }

    public void setCreateCaseDate(java.util.Date createCaseDate) {
        this.createCaseDate = createCaseDate;
    }

    public java.util.Date getEndCaseDate() {
        return this.endCaseDate;
    }

    public void setEndCaseDate(java.util.Date endCaseDate) {
        this.endCaseDate = endCaseDate;
    }

    public String getEndCaseOrgCode() {
        return this.endCaseOrgCode;
    }

    public void setEndCaseOrgCode(String endCaseOrgCode) {
        this.endCaseOrgCode = endCaseOrgCode;
    }

    public String getEndCaseOrgName() {
        return this.endCaseOrgName;
    }

    public void setEndCaseOrgName(String endCaseOrgName) {
        this.endCaseOrgName = endCaseOrgName;
    }

    public String getManagerOrgCode() {
        return this.managerOrgCode;
    }

    public void setManagerOrgCode(String managerOrgCode) {
        this.managerOrgCode = managerOrgCode;
    }

    public String getManagerOrgName() {
        return this.managerOrgName;
    }

    public void setManagerOrgName(String managerOrgName) {
        this.managerOrgName = managerOrgName;
    }

    public java.util.Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(java.util.Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryEmpCode() {
        return this.entryEmpCode;
    }

    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    public String getEntryEmpName() {
        return this.entryEmpName;
    }

    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    public String getEntryOrgCode() {
        return this.entryOrgCode;
    }

    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    public String getEntryOrgName() {
        return this.entryOrgName;
    }

    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public java.util.Date getUploadDate() {
        return this.uploadDate;
    }

    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUpdateFlag() {
        return this.updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public java.util.Date getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(java.util.Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVipCard() {
        return this.vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }
    
    public String getCorrelationDiabetes() {
        return this.correlationDiabetes;
    }

    public void setCorrelationDiabetes(String correlationDiabetes) {
        this.correlationDiabetes = correlationDiabetes;
    }

    public Double getCourseOfDiabetes() {
        return this.courseOfDiabetes;
    }

    public void setCourseOfDiabetes(Double courseOfDiabetes) {
        this.courseOfDiabetes = courseOfDiabetes;
    }

    public String getCorrelationHyper() {
        return this.correlationHyper;
    }

    public void setCorrelationHyper(String correlationHyper) {
        this.correlationHyper = correlationHyper;
    }

    public Double getCourseOfHyper() {
        return this.courseOfHyper;
    }

    public void setCourseOfHyper(Double courseOfHyper) {
        this.courseOfHyper = courseOfHyper;
    }

    public String getCorrelationStroke() {
        return this.correlationStroke;
    }

    public void setCorrelationStroke(String correlationStroke) {
        this.correlationStroke = correlationStroke;
    }

    public Double getCourseOfStroke() {
        return this.courseOfStroke;
    }

    public void setCourseOfStroke(Double courseOfStroke) {
        this.courseOfStroke = courseOfStroke;
    }

    public String getCorrelationAngina() {
        return this.correlationAngina;
    }

    public void setCorrelationAngina(String correlationAngina) {
        this.correlationAngina = correlationAngina;
    }

    public Double getCourseOfAngina() {
        return this.courseOfAngina;
    }

    public void setCourseOfAngina(Double courseOfAngina) {
        this.courseOfAngina = courseOfAngina;
    }

    public String getCorrelationCerebral() {
        return this.correlationCerebral;
    }

    public void setCorrelationCerebral(String correlationCerebral) {
        this.correlationCerebral = correlationCerebral;
    }

    public Double getCourseOfCerebral() {
        return this.courseOfCerebral;
    }

    public void setCourseOfCerebral(Double courseOfCerebral) {
        this.courseOfCerebral = courseOfCerebral;
    }

    public String getCorrelationMyocardialInfarct() {
        return this.correlationMyocardialInfarct;
    }

    public void setCorrelationMyocardialInfarct(
            String correlationMyocardialInfarct) {
        this.correlationMyocardialInfarct = correlationMyocardialInfarct;
    }

    public Double getCourseOfMyocardialInfarct() {
        return this.courseOfMyocardialInfarct;
    }

    public void setCourseOfMyocardialInfarct(Double courseOfMyocardialInfarct) {
        this.courseOfMyocardialInfarct = courseOfMyocardialInfarct;
    }

    public String getFamilyDiabetes() {
        return this.familyDiabetes;
    }

    public void setFamilyDiabetes(String familyDiabetes) {
        this.familyDiabetes = familyDiabetes;
    }

    public String getFamilyHyper() {
        return this.familyHyper;
    }

    public void setFamilyHyper(String familyHyper) {
        this.familyHyper = familyHyper;
    }

    public String getFamilyStroke() {
        return this.familyStroke;
    }

    public void setFamilyStroke(String familyStroke) {
        this.familyStroke = familyStroke;
    }

    public String getFamilyCoronaryHeartDisease() {
        return this.familyCoronaryHeartDisease;
    }

    public void setFamilyCoronaryHeartDisease(String familyCoronaryHeartDisease) {
        this.familyCoronaryHeartDisease = familyCoronaryHeartDisease;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWaist() {
        return this.waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getHeartRate() {
        return this.heartRate;
    }

    public void setHeartRate(Double heartRate) {
        this.heartRate = heartRate;
    }

    public Double getDiastolicPressure() {
        return this.diastolicPressure;
    }

    public void setDiastolicPressure(Double diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public Double getSystolicPressure() {
        return this.systolicPressure;
    }

    public void setSystolicPressure(Double systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Double getGlu() {
        return this.glu;
    }

    public void setGlu(Double glu) {
        this.glu = glu;
    }

    public Double getGluDl() {
        return this.gluDl;
    }

    public void setGluDl(Double gluDl) {
        this.gluDl = gluDl;
    }

    public Double getTotalCholesterol() {
        return this.totalCholesterol;
    }

    public void setTotalCholesterol(Double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public Double getTotalCholesterolDl() {
        return this.totalCholesterolDl;
    }

    public void setTotalCholesterolDl(Double totalCholesterolDl) {
        this.totalCholesterolDl = totalCholesterolDl;
    }

    public Double getTriglyceride() {
        return this.triglyceride;
    }

    public void setTriglyceride(Double triglyceride) {
        this.triglyceride = triglyceride;
    }

    public Double getTriglycerideDl() {
        return this.triglycerideDl;
    }

    public void setTriglycerideDl(Double triglycerideDl) {
        this.triglycerideDl = triglycerideDl;
    }

    public Double getSerumHighCholesterol() {
        return this.serumHighCholesterol;
    }

    public void setSerumHighCholesterol(Double serumHighCholesterol) {
        this.serumHighCholesterol = serumHighCholesterol;
    }

    public Double getSerumHighCholesterolDl() {
        return this.serumHighCholesterolDl;
    }

    public void setSerumHighCholesterolDl(Double serumHighCholesterolDl) {
        this.serumHighCholesterolDl = serumHighCholesterolDl;
    }

    public Double getSerumCreatinine() {
        return this.serumCreatinine;
    }

    public void setSerumCreatinine(Double serumCreatinine) {
        this.serumCreatinine = serumCreatinine;
    }

    public Double getSerumCreatinineDl() {
        return this.serumCreatinineDl;
    }

    public void setSerumCreatinineDl(Double serumCreatinineDl) {
        this.serumCreatinineDl = serumCreatinineDl;
    }

    public String getUrineMicroAlbumin() {
        return this.urineMicroAlbumin;
    }

    public void setUrineMicroAlbumin(String urineMicroAlbumin) {
        this.urineMicroAlbumin = urineMicroAlbumin;
    }

    public String getRetinopathy() {
        return this.retinopathy;
    }

    public void setRetinopathy(String retinopathy) {
        this.retinopathy = retinopathy;
    }

    public Double getSc() {
        return this.sc;
    }

    public void setSc(Double sc) {
        this.sc = sc;
    }

    public Double getSg() {
        return this.sg;
    }

    public void setSg(Double sg) {
        this.sg = sg;
    }

    public String getKw() {
        return this.kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    public String getMryj() {
        return this.mryj;
    }

    public void setMryj(String mryj) {
        this.mryj = mryj;
    }

    public Double getMryjBj() {
        return this.mryjBj;
    }

    public void setMryjBj(Double mryjBj) {
        this.mryjBj = mryjBj;
    }

    public Double getMryjHj() {
        return this.mryjHj;
    }

    public void setMryjHj(Double mryjHj) {
        this.mryjHj = mryjHj;
    }

    public Double getMryjPj() {
        return this.mryjPj;
    }

    public void setMryjPj(Double mryjPj) {
        this.mryjPj = mryjPj;
    }

    public Double getMryjRedj() {
        return this.mryjRedj;
    }

    public void setMryjRedj(Double mryjRedj) {
        this.mryjRedj = mryjRedj;
    }

    public String getMrcy() {
        return this.mrcy;
    }

    public void setMrcy(String mrcy) {
        this.mrcy = mrcy;
    }

    public Double getMrcySl() {
        return this.mrcySl;
    }

    public void setMrcySl(Double mrcySl) {
        this.mrcySl = mrcySl;
    }

    public String getMzdl() {
        return this.mzdl;
    }

    public void setMzdl(String mzdl) {
        this.mzdl = mzdl;
    }

    public Double getMzdlZc() {
        return this.mzdlZc;
    }

    public void setMzdlZc(Double mzdlZc) {
        this.mzdlZc = mzdlZc;
    }

    public Double getMzdlZcFz() {
        return this.mzdlZcFz;
    }

    public void setMzdlZcFz(Double mzdlZcFz) {
        this.mzdlZcFz = mzdlZcFz;
    }

    public String getFywzl() {
        return this.fywzl;
    }

    public void setFywzl(String fywzl) {
        this.fywzl = fywzl;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public Date getFollowupDate() {
        return null;
    }

    @Override
    public void setFollowupDate(Date followupDate) {

    }

    @Override
    public Date getNextFollowupDate() {
        return null;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }
    @Override
    public boolean getUpload() {
        return this.upload;
    }

    @Override
    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    @Override
    public boolean getCompleted() {
        return false;
    }

    @Override
    public void setCompleted(boolean completed) {

    }

    public String getEditorId() {
        return this.editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getUpdateOrgId() {
        return this.updateOrgId;
    }

    public void setUpdateOrgId(String updateOrgId) {
        this.updateOrgId = updateOrgId;
    }

    public String getUpdateOrgName() {
        return this.updateOrgName;
    }

    public void setUpdateOrgName(String updateOrgName) {
        this.updateOrgName = updateOrgName;
    }
}
