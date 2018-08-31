
package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 儿童专项档案
 * 抽象儿童基本信息登记类。
 * <p>
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String childrenId 儿童基本信息ID
 * 2. [不可空] String healthfileNo 个人健康档案编码
 * 3. [可空] String fileNumber 基本信息档案号
 * 4. [可空] String maternalCardNo 孕卡编号
 * 5. [可空] String childrenName 姓名
 * 6. [可空] String childrenGender 性别
 * 7. [不可空] java.util.Date childrenBirthDate 出生日期
 * 8. [可空] String idNumber 身份证号
 * 9. [可空] String houseAddress 家庭住址
 * 10. [可空] String fatherFileNumber 父亲基本信息档案号
 * 11. [可空] String fatherName 父亲姓名
 * 12. [可空] String fatherVocation 父亲职业
 * 13. [可空] String fatherTelephone 父亲联系电话
 * 14. [可空] java.util.Date fatherBirthDate 父亲出生日期
 * 15. [可空] String motherFileNumber 母亲基本信息档案号
 * 16. [可空] String motherName 母亲姓名
 * 17. [可空] String motherVocation 母亲职业
 * 18. [可空] String motherTelephone 母亲联系电话
 * 19. [可空] java.util.Date motherBirthDate 母亲出生日期
 * 20. [可空] Integer bornWeek 出生孕周
 * 21. [不可空] java.util.Date entryDate 登记时间
 * 22. [不可空] String entryEmpCode 登记人员编码
 * 23. [可空] String entryEmpName 登记人员名称
 * 24. [可空] String entryOrgCode 登记机构编码
 * 25. [不可空] String entryOrgName 登记机构名称
 * 26. [不可空] String orgCode 医疗机构代码
 * 27. [不可空] String dataFrom 数据来源
 * 28. [不可空] java.util.Date uploadDate 填报日期
 * 29. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 30. [主键] String id 主键
 * 31. [可空] String editor 修改人
 * 32. [可空] java.util.Date modifydate 更新日期
 * 33. [可空] String childHealthCardno 儿童健康保健卡号
 * 34. [可空] Double birthWeight 出生体重
 * 35. [可空] Double birthHeight 出生身高
 * 36. [可空] Integer parity 胎次
 * 37. [可空] Integer deliverytimes 产次
 * 38. [可空] String birthTypeCode 分娩方式
 * 39. [可空] String childBirth 产时情况
 * 40. [可空] String birthHospital 出生医院
 * 41. [可空] String unhsCode 新生儿听力筛查代码
 * 42. [可空] String cyp17Code 17-a-OHP
 * 43. [可空] String pkuCode 苯丙酮尿症筛查代码
 * 44. [可空] String chCode 先天性甲状腺功能低下代码
 * 45. [可空] String highRiskCode 是否高危代码
 * 46. [可空] String highRiskFactorys 高危因素
 * 47. [可空] Integer apgar1 Apgar 1分钟评分
 * 48. [可空] Integer apgar5 Apgar 5分钟评分
 * 49. [可空] Integer apgar10 Apgar 10分钟评分
 * 50. [可空] String pastHistory 既往病史
 * 51. [可空] String allgergicHistory 过敏史
 * 52. [可空] String birthDoctor 接产主手
 * 53. [可空] String birthAssistant 接产助手
 * 54. [可空] java.util.Date endCaseDate 结案时间
 * 55. [可空] String endCaseReasonCode 结案原因代码
 * 56. [不可空] Boolean endCaseFlag 结案标志
 * 57. [可空] String endCaseOrgCode 结案结构代码
 * 58. [可空] String endCaseOrgName 结案机构名称
 * 59. [可空] String endCaseDoctorCode 结案人员代码
 * 60. [可空] String endCaseDoctorName 结案人员名称
 */
@Entity
public class EhrChildrenInformation {
    /**
     * 本地数据库id
     */
    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    @Expose
    private Long localId;

    private String id;

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
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;

    /**
     * 1. [不可空] 儿童基本信息ID
     */
    private String childrenId;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [可空] 孕卡编号
     */
    private String maternalCardNo;

    /**
     * 5. [可空] 姓名
     */
//    private String childrenName;

    /**
     * 6. [可空] 性别
     */
//    private String childrenGender;

    /**
     * 7. [不可空] 出生日期
     */
//    private Date childrenBirthDate;

    /**
     * 8. [可空] 身份证号
     */
//    private String idNumber;

    /**
     * 9. [可空] 家庭住址
     */
//    private String houseAddress;

    /**
     * 10. [可空] 父亲基本信息档案号
     */
    private String fatherFileNumber;

    /**
     * 11. [可空] 父亲姓名
     */
    private String fatherName;

    /**
     * 12. [可空] 父亲职业
     */
    private String fatherVocation;

    /**
     * 13. [可空] 父亲联系电话
     */
    private String fatherTelephone;

    /**
     * 14. [可空] 父亲出生日期
     */
    private Date fatherBirthDate;

    /**
     * 15. [可空] 母亲基本信息档案号
     */
    private String motherFileNumber;

    /**
     * 16. [可空] 母亲姓名
     */
    private String motherName;

    /**
     * 17. [可空] 母亲职业
     */
    private String motherVocation;

    /**
     * 18. [可空] 母亲联系电话
     */
    private String motherTelephone;

    /**
     * 19. [可空] 母亲出生日期
     */
    private Date motherBirthDate;

    /**
     * 20. [可空] 出生孕周
     */
    private Integer bornWeek;

    /**
     * 21. [不可空] 登记时间
     */
    private Date entryDate;

    /**
     * 22. [不可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 23. [可空] 登记人员名称
     */
    private String entryEmpName;

    /**
     * 24. [可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 25. [不可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 26. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 27. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 28. [不可空] 填报日期
     */
    private Date uploadDate;

    /**
     * 29. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    private String updateFlag;

    /**
     * 31. [可空] 修改人
     */
    private String editor;

    /**
     * 32. [可空] 更新日期
     */
    private Date modifydate;

    /**
     * 33. [可空] 儿童健康保健卡号
     */
    private String childHealthCardno;

    /**
     * 34. [可空] 出生体重
     */
    private Double birthWeight;

    /**
     * 35. [可空] 出生身高
     */
    private Double birthHeight;

    /**
     * 36. [可空] 胎次
     */
    private Integer parity;

    /**
     * 37. [可空] 产次
     */
    private Integer deliverytimes;

    /**
     * 38. [可空] 分娩方式
     */
    private String birthTypeCode;

    /**
     * 39. [可空] 产时情况
     */
    private String childBirth;

    /**
     * 40. [可空] 出生医院
     */
    private String birthHospital;

    /**
     * 41. [可空] 新生儿听力筛查代码
     */
    private String unhsCode;

    /**
     * 42. [可空] 17-a-OHP
     */
    private String cyp17Code;

    /**
     * 43. [可空] 苯丙酮尿症筛查代码
     */
    private String pkuCode;

    /**
     * 44. [可空] 先天性甲状腺功能低下代码
     */
    private String chCode;

    /**
     * 45. [可空] 是否高危代码
     */
    private String highRiskCode;

    /**
     * 46. [可空] 高危因素
     */
    private String highRiskFactorys;

    /**
     * 47. [可空] Apgar 1分钟评分
     */
    private Integer apgar1;

    /**
     * 48. [可空] Apgar 5分钟评分
     */
    private Integer apgar5;

    /**
     * 49. [可空] Apgar 10分钟评分
     */
    private Integer apgar10;

    /**
     * 50. [可空] 既往病史
     */
    private String pastHistory;

    /**
     * 51. [可空] 过敏史
     */
    private String allgergicHistory;

    /**
     * 52. [可空] 接产主手
     */
    private String birthDoctor;

    /**
     * 53. [可空] 接产助手
     */
    private String birthAssistant;

    /**
     * 54. [可空] 结案时间
     */
    private Date endCaseDate;

    /**
     * 55. [可空] 结案原因代码
     */
    private String endCaseReasonCode;

    /**
     * 56. [不可空] 结案标志
     */
    private boolean endCaseFlag;

    /**
     * 57. [可空] 结案结构代码
     */
    private String endCaseOrgCode;

    /**
     * 58. [可空] 结案机构名称
     */
    private String endCaseOrgName;

    /**
     * 59. [可空] 结案人员代码
     */
    private String endCaseDoctorCode;

    /**
     * 60. [可空] 结案人员名称
     */
    private String endCaseDoctorName;

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


    @Generated(hash = 620107692)
    public EhrChildrenInformation(Long localId, String id, String idCard,
            String vipCard, boolean upload, boolean completed, String childrenId,
            String healthfileNo, String fileNumber, String maternalCardNo,
            String fatherFileNumber, String fatherName, String fatherVocation,
            String fatherTelephone, Date fatherBirthDate, String motherFileNumber,
            String motherName, String motherVocation, String motherTelephone,
            Date motherBirthDate, Integer bornWeek, Date entryDate,
            String entryEmpCode, String entryEmpName, String entryOrgCode,
            String entryOrgName, String orgCode, String fdataFrom, Date uploadDate,
            String updateFlag, String editor, Date modifydate,
            String childHealthCardno, Double birthWeight, Double birthHeight,
            Integer parity, Integer deliverytimes, String birthTypeCode,
            String childBirth, String birthHospital, String unhsCode,
            String cyp17Code, String pkuCode, String chCode, String highRiskCode,
            String highRiskFactorys, Integer apgar1, Integer apgar5,
            Integer apgar10, String pastHistory, String allgergicHistory,
            String birthDoctor, String birthAssistant, Date endCaseDate,
            String endCaseReasonCode, boolean endCaseFlag, String endCaseOrgCode,
            String endCaseOrgName, String endCaseDoctorCode,
            String endCaseDoctorName, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.id = id;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.childrenId = childrenId;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.maternalCardNo = maternalCardNo;
        this.fatherFileNumber = fatherFileNumber;
        this.fatherName = fatherName;
        this.fatherVocation = fatherVocation;
        this.fatherTelephone = fatherTelephone;
        this.fatherBirthDate = fatherBirthDate;
        this.motherFileNumber = motherFileNumber;
        this.motherName = motherName;
        this.motherVocation = motherVocation;
        this.motherTelephone = motherTelephone;
        this.motherBirthDate = motherBirthDate;
        this.bornWeek = bornWeek;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.fdataFrom = fdataFrom;
        this.uploadDate = uploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.childHealthCardno = childHealthCardno;
        this.birthWeight = birthWeight;
        this.birthHeight = birthHeight;
        this.parity = parity;
        this.deliverytimes = deliverytimes;
        this.birthTypeCode = birthTypeCode;
        this.childBirth = childBirth;
        this.birthHospital = birthHospital;
        this.unhsCode = unhsCode;
        this.cyp17Code = cyp17Code;
        this.pkuCode = pkuCode;
        this.chCode = chCode;
        this.highRiskCode = highRiskCode;
        this.highRiskFactorys = highRiskFactorys;
        this.apgar1 = apgar1;
        this.apgar5 = apgar5;
        this.apgar10 = apgar10;
        this.pastHistory = pastHistory;
        this.allgergicHistory = allgergicHistory;
        this.birthDoctor = birthDoctor;
        this.birthAssistant = birthAssistant;
        this.endCaseDate = endCaseDate;
        this.endCaseReasonCode = endCaseReasonCode;
        this.endCaseFlag = endCaseFlag;
        this.endCaseOrgCode = endCaseOrgCode;
        this.endCaseOrgName = endCaseOrgName;
        this.endCaseDoctorCode = endCaseDoctorCode;
        this.endCaseDoctorName = endCaseDoctorName;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1693671665)
    public EhrChildrenInformation() {
    }


    public Long getLocalId() {
        return this.localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
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

    public boolean getUpload() {
        return this.upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getChildrenId() {
        return this.childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId;
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

    public String getMaternalCardNo() {
        return this.maternalCardNo;
    }

    public void setMaternalCardNo(String maternalCardNo) {
        this.maternalCardNo = maternalCardNo;
    }

  /*  public String getChildrenName() {
        return this.childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    public String getChildrenGender() {
        return this.childrenGender;
    }

    public void setChildrenGender(String childrenGender) {
        this.childrenGender = childrenGender;
    }

    public Date getChildrenBirthDate() {
        return this.childrenBirthDate;
    }

    public void setChildrenBirthDate(Date childrenBirthDate) {
        this.childrenBirthDate = childrenBirthDate;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }*/

  /*  public String getHouseAddress() {
        return this.houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }*/

    public String getFatherFileNumber() {
        return this.fatherFileNumber;
    }

    public void setFatherFileNumber(String fatherFileNumber) {
        this.fatherFileNumber = fatherFileNumber;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherVocation() {
        return this.fatherVocation;
    }

    public void setFatherVocation(String fatherVocation) {
        this.fatherVocation = fatherVocation;
    }

    public String getFatherTelephone() {
        return this.fatherTelephone;
    }

    public void setFatherTelephone(String fatherTelephone) {
        this.fatherTelephone = fatherTelephone;
    }

    public Date getFatherBirthDate() {
        return this.fatherBirthDate;
    }

    public void setFatherBirthDate(Date fatherBirthDate) {
        this.fatherBirthDate = fatherBirthDate;
    }

    public String getMotherFileNumber() {
        return this.motherFileNumber;
    }

    public void setMotherFileNumber(String motherFileNumber) {
        this.motherFileNumber = motherFileNumber;
    }

    public String getMotherName() {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherVocation() {
        return this.motherVocation;
    }

    public void setMotherVocation(String motherVocation) {
        this.motherVocation = motherVocation;
    }

    public String getMotherTelephone() {
        return this.motherTelephone;
    }

    public void setMotherTelephone(String motherTelephone) {
        this.motherTelephone = motherTelephone;
    }

    public Date getMotherBirthDate() {
        return this.motherBirthDate;
    }

    public void setMotherBirthDate(Date motherBirthDate) {
        this.motherBirthDate = motherBirthDate;
    }

    public Integer getBornWeek() {
        return this.bornWeek;
    }

    public void setBornWeek(Integer bornWeek) {
        this.bornWeek = bornWeek;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
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

    public Date getUploadDate() {
        return this.uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
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

    public Date getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getChildHealthCardno() {
        return this.childHealthCardno;
    }

    public void setChildHealthCardno(String childHealthCardno) {
        this.childHealthCardno = childHealthCardno;
    }

    public Double getBirthWeight() {
        return this.birthWeight;
    }

    public void setBirthWeight(Double birthWeight) {
        this.birthWeight = birthWeight;
    }

    public Double getBirthHeight() {
        return this.birthHeight;
    }

    public void setBirthHeight(Double birthHeight) {
        this.birthHeight = birthHeight;
    }

    public Integer getParity() {
        return this.parity;
    }

    public void setParity(Integer parity) {
        this.parity = parity;
    }

    public Integer getDeliverytimes() {
        return this.deliverytimes;
    }

    public void setDeliverytimes(Integer deliverytimes) {
        this.deliverytimes = deliverytimes;
    }

    public String getBirthTypeCode() {
        return this.birthTypeCode;
    }

    public void setBirthTypeCode(String birthTypeCode) {
        this.birthTypeCode = birthTypeCode;
    }

    public String getChildBirth() {
        return this.childBirth;
    }

    public void setChildBirth(String childBirth) {
        this.childBirth = childBirth;
    }

    public String getBirthHospital() {
        return this.birthHospital;
    }

    public void setBirthHospital(String birthHospital) {
        this.birthHospital = birthHospital;
    }

    public String getUnhsCode() {
        return this.unhsCode;
    }

    public void setUnhsCode(String unhsCode) {
        this.unhsCode = unhsCode;
    }

    public String getCyp17Code() {
        return this.cyp17Code;
    }

    public void setCyp17Code(String cyp17Code) {
        this.cyp17Code = cyp17Code;
    }

    public String getPkuCode() {
        return this.pkuCode;
    }

    public void setPkuCode(String pkuCode) {
        this.pkuCode = pkuCode;
    }

    public String getChCode() {
        return this.chCode;
    }

    public void setChCode(String chCode) {
        this.chCode = chCode;
    }

    public String getHighRiskCode() {
        return this.highRiskCode;
    }

    public void setHighRiskCode(String highRiskCode) {
        this.highRiskCode = highRiskCode;
    }

    public String getHighRiskFactorys() {
        return this.highRiskFactorys;
    }

    public void setHighRiskFactorys(String highRiskFactorys) {
        this.highRiskFactorys = highRiskFactorys;
    }

    public Integer getApgar1() {
        return this.apgar1;
    }

    public void setApgar1(Integer apgar1) {
        this.apgar1 = apgar1;
    }

    public Integer getApgar5() {
        return this.apgar5;
    }

    public void setApgar5(Integer apgar5) {
        this.apgar5 = apgar5;
    }

    public Integer getApgar10() {
        return this.apgar10;
    }

    public void setApgar10(Integer apgar10) {
        this.apgar10 = apgar10;
    }

    public String getPastHistory() {
        return this.pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    public String getAllgergicHistory() {
        return this.allgergicHistory;
    }

    public void setAllgergicHistory(String allgergicHistory) {
        this.allgergicHistory = allgergicHistory;
    }

    public String getBirthDoctor() {
        return this.birthDoctor;
    }

    public void setBirthDoctor(String birthDoctor) {
        this.birthDoctor = birthDoctor;
    }

    public String getBirthAssistant() {
        return this.birthAssistant;
    }

    public void setBirthAssistant(String birthAssistant) {
        this.birthAssistant = birthAssistant;
    }

    public Date getEndCaseDate() {
        return this.endCaseDate;
    }

    public void setEndCaseDate(Date endCaseDate) {
        this.endCaseDate = endCaseDate;
    }

    public String getEndCaseReasonCode() {
        return this.endCaseReasonCode;
    }

    public void setEndCaseReasonCode(String endCaseReasonCode) {
        this.endCaseReasonCode = endCaseReasonCode;
    }

    public boolean getEndCaseFlag() {
        return this.endCaseFlag;
    }

    public void setEndCaseFlag(boolean endCaseFlag) {
        this.endCaseFlag = endCaseFlag;
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

    public String getEndCaseDoctorCode() {
        return this.endCaseDoctorCode;
    }

    public void setEndCaseDoctorCode(String endCaseDoctorCode) {
        this.endCaseDoctorCode = endCaseDoctorCode;
    }

    public String getEndCaseDoctorName() {
        return this.endCaseDoctorName;
    }

    public void setEndCaseDoctorName(String endCaseDoctorName) {
        this.endCaseDoctorName = endCaseDoctorName;
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }


}
