package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;


/**
 * 传染病基本信息DTO
 *
 * @author
 */
@Entity
public class EhrContagionInfoDto extends BaseChildBean {
    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    @Expose
    private Long localId;

    /**
     * 身份证号
     */
    @Expose
    private String idCard;

    /**
     * 会员卡号
     */
    @Expose
    private String vipCard;

    /**
     * 唯一标识
     */
    @Expose
    private String uuid;

    /**
     * 是否已经上传
     */
    @Expose
    private boolean upload;

    /**
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;

    /**
     * 标题
     */
    private String title;
    private String id;

    /**
     * 1. [不可空] 传染病报告卡流水号
     */
    protected String contagionCardNumber;

    /**
     * 2. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 3. [可空] 卡片编号
     */
    protected String cardHandNumber;

    /**
     * 4. [可空] 报卡类别
     */
    protected String reportCardClasses;

    /**
     * 5. [可空] 患者姓名
     */
    protected String patientName;

    /**
     * 6. [可空] 患儿家长姓名
     */
    protected String patriarchName;

    /**
     * 7. [可空] 身份证号
     */
    protected String identityCardNumber;

    /**
     * 8. [可空] 性别
     */
    protected String gender;

    /**
     * 9. [可空] 出生日期
     */
    protected java.util.Date birthday;

    /**
     * 10. [可空] 实足年龄
     */
    protected Integer age;

    /**
     * 11. [可空] 实足年龄单位代码
     */
    protected String ageUnitCode;

    /**
     * 12. [可空] 工作单位
     */
    protected String workUnit;

    /**
     * 13. [可空] 患者联系电话
     */
    protected String patientContNumber;

    /**
     * 14. [可空] 病人所属区域代码
     */
    protected String patientRegionCode;

    /**
     * 15. [可空] 现住址
     */
    public String nowAdd;

    /**
     * 16. [可空] 患者职业代码
     */
    protected String patientProfessionCode;

    /**
     * 17. [可空] 患者其他职业名称
     */
    protected String patientProfessionName;

    /**
     * 18. [可空] 疾病分类代码
     */
    protected String diseaseClassesCode;

    /**
     * 19. [可空] 发病日期
     */
    protected java.util.Date attackDate;

    /**
     * 20. [可空] 诊断日期
     */
    protected java.util.Date diagnosisDate;

    /**
     * 21. [可空] 死亡日期
     */
    protected java.util.Date dieDate;

    /**
     * 22. [可空] 传染病类别代码
     */
    protected String contagionClassesCode;

    /**
     * 23. [可空] 传染病代码
     */
    protected String contagionCode;

    /**
     * 24. [可空] 其他法定管理以及重点监测传染病
     */
    protected String otherDiagnosis;

    /**
     * 25. [可空] 订正病名
     */
    protected String revisalName;

    /**
     * 26. [可空] 退卡原因
     */
    protected String cardReturnReason;

    /**
     * 27. [可空] 报告单位
     */
    protected String reportUnit;

    /**
     * 28. [可空] 联系电话
     */
    protected String contNumber;

    /**
     * 29. [可空] 报告医生名称
     */
    protected String reportDoctorName;

    /**
     * 30. [可空] 填卡日期
     */
    protected java.util.Date reportDate;

    /**
     * 31. [可空] 备注
     */
    protected String remark;

    /**
     * 32. [可空] 是否及时
     */
    protected String inTime;

    /**
     * 33. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 34. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 35. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 36. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 37. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 38. [可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 39. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 41. [不可空] 数据来源
     */
    protected String fdataFrom;

    /**
     * 42. [可空] 修改者
     */
    protected String editor;

    /**
     * 43. [可空] 修改时间
     */
    protected java.util.Date modifydate;

    /**
     * 44. [不可空] 修改标志,1新增,2修改,3撤销
     */
    protected String updateFlag;

    /**
     * 45. [可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 46. [可空] 省(自治区、直辖市)
     */
    protected String province;

    /**
     * 47. [可空] 市(地区)
     */
    protected String city;

    /**
     * 48. [可空] 县(区)
     */
    protected String county;

    /**
     * 49. [可空] 乡(镇、街道办事处)
     */
    protected String town;

    /**
     * 50. [可空] 村(街、路、弄等)
     */
    protected String village;

    /**
     * 51. [可空] 监测性病
     */
    protected String surveillanceStd;

    /**
     * 52. [可空] 婚姻状况
     */
    protected String maritalStatus;

    /**
     * 53. [可空] 文化程度
     */
    protected String education;

    /**
     * 54. [可空] 感染途径
     */
    protected String routeOfInfection;

    /**
     * 55. [可空] 感染途径有异性传播类型
     */
    protected String routeOfInfectionIsomerism;

    /**
     * 56. [可空] 血液传播类型
     */
    protected String bloodTransmission;

    /**
     * 57. [可空] 详细地址
     */
    protected String hepatitisB;

    /**
     * 58. [可空] 乙型肝炎丙型肝炎血吸虫病的急性或慢性
     */
    protected String hepatitisC;

    /**
     * 59. [可空] 传染病甲
     */
    protected String contagionClassesA;

    /**
     * 60. [可空] 传染病乙
     */
    protected String contagionClassesB;

    /**
     * 61. [可空] 传染病丙
     */
    protected String contagionClassesC;

    /**
     * 62. [可空] 艾滋病
     */
    protected String aids;

    private Date followupDate;

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

    /**
     * 66. [可空] 感染途径其他
     */
    protected String routeOfInfectionOther;

    @Generated(hash = 714711097)
    public EhrContagionInfoDto(Long localId, String idCard, String vipCard,
            String uuid, boolean upload, boolean completed, String title, String id,
            String contagionCardNumber, String fileNumber, String cardHandNumber,
            String reportCardClasses, String patientName, String patriarchName,
            String identityCardNumber, String gender, java.util.Date birthday,
            Integer age, String ageUnitCode, String workUnit,
            String patientContNumber, String patientRegionCode, String nowAdd,
            String patientProfessionCode, String patientProfessionName,
            String diseaseClassesCode, java.util.Date attackDate,
            java.util.Date diagnosisDate, java.util.Date dieDate,
            String contagionClassesCode, String contagionCode,
            String otherDiagnosis, String revisalName, String cardReturnReason,
            String reportUnit, String contNumber, String reportDoctorName,
            java.util.Date reportDate, String remark, String inTime,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String fdataFrom, String editor,
            java.util.Date modifydate, String updateFlag, String healthfileNo,
            String province, String city, String county, String town,
            String village, String surveillanceStd, String maritalStatus,
            String education, String routeOfInfection,
            String routeOfInfectionIsomerism, String bloodTransmission,
            String hepatitisB, String hepatitisC, String contagionClassesA,
            String contagionClassesB, String contagionClassesC, String aids,
            Date followupDate, String editorId, String updateOrgId,
            String updateOrgName, String routeOfInfectionOther) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.uuid = uuid;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.contagionCardNumber = contagionCardNumber;
        this.fileNumber = fileNumber;
        this.cardHandNumber = cardHandNumber;
        this.reportCardClasses = reportCardClasses;
        this.patientName = patientName;
        this.patriarchName = patriarchName;
        this.identityCardNumber = identityCardNumber;
        this.gender = gender;
        this.birthday = birthday;
        this.age = age;
        this.ageUnitCode = ageUnitCode;
        this.workUnit = workUnit;
        this.patientContNumber = patientContNumber;
        this.patientRegionCode = patientRegionCode;
        this.nowAdd = nowAdd;
        this.patientProfessionCode = patientProfessionCode;
        this.patientProfessionName = patientProfessionName;
        this.diseaseClassesCode = diseaseClassesCode;
        this.attackDate = attackDate;
        this.diagnosisDate = diagnosisDate;
        this.dieDate = dieDate;
        this.contagionClassesCode = contagionClassesCode;
        this.contagionCode = contagionCode;
        this.otherDiagnosis = otherDiagnosis;
        this.revisalName = revisalName;
        this.cardReturnReason = cardReturnReason;
        this.reportUnit = reportUnit;
        this.contNumber = contNumber;
        this.reportDoctorName = reportDoctorName;
        this.reportDate = reportDate;
        this.remark = remark;
        this.inTime = inTime;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.healthfileNo = healthfileNo;
        this.province = province;
        this.city = city;
        this.county = county;
        this.town = town;
        this.village = village;
        this.surveillanceStd = surveillanceStd;
        this.maritalStatus = maritalStatus;
        this.education = education;
        this.routeOfInfection = routeOfInfection;
        this.routeOfInfectionIsomerism = routeOfInfectionIsomerism;
        this.bloodTransmission = bloodTransmission;
        this.hepatitisB = hepatitisB;
        this.hepatitisC = hepatitisC;
        this.contagionClassesA = contagionClassesA;
        this.contagionClassesB = contagionClassesB;
        this.contagionClassesC = contagionClassesC;
        this.aids = aids;
        this.followupDate = followupDate;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.routeOfInfectionOther = routeOfInfectionOther;
    }

    @Generated(hash = 943501883)
    public EhrContagionInfoDto() {
    }

    /**
     * 获取id的值
     *
     * @return idCard id值
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id的值
     *
     * @param id id值
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取contagionCardNumber的值
     *
     * @return contagionCardNumber contagionCardNumber值
     */
    public String getContagionCardNumber() {
        return contagionCardNumber;
    }

    public void setContagionCardNumber(String contagionCardNumber) {
        this.contagionCardNumber = contagionCardNumber;
    }

    /**
     * 获取fileNumber的值
     *
     * @return fileNumber fileNumber值
     */
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取cardHandNumber的值
     *
     * @return cardHandNumber cardHandNumber值
     */
    public String getCardHandNumber() {
        return cardHandNumber;
    }

    public void setCardHandNumber(String cardHandNumber) {
        this.cardHandNumber = cardHandNumber;
    }

    /**
     * 获取reportCardClasses的值
     *
     * @return reportCardClasses reportCardClasses值
     */
    public String getReportCardClasses() {
        return reportCardClasses;
    }

    public void setReportCardClasses(String reportCardClasses) {
        this.reportCardClasses = reportCardClasses;
    }

    /**
     * 获取patientName的值
     *
     * @return patientName patientName值
     */
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * 获取patriarchName的值
     *
     * @return patriarchName patriarchName值
     */
    public String getPatriarchName() {
        return patriarchName;
    }

    public void setPatriarchName(String patriarchName) {
        this.patriarchName = patriarchName;
    }

    /**
     * 获取identityCardNumber的值
     *
     * @return identityCardNumber identityCardNumber值
     */
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    /**
     * 获取gender的值
     *
     * @return gender gender值
     */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取birthday的值
     *
     * @return birthday birthday值
     */
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取age的值
     *
     * @return age age值
     */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取ageUnitCode的值
     *
     * @return ageUnitCode ageUnitCode值
     */
    public String getAgeUnitCode() {
        return ageUnitCode;
    }

    public void setAgeUnitCode(String ageUnitCode) {
        this.ageUnitCode = ageUnitCode;
    }

    /**
     * 获取workUnit的值
     *
     * @return workUnit workUnit值
     */
    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    /**
     * //     * 获取patientContNumber的值
     * //     *
     * //     * @return patientContNumber patientContNumber值
     * //
     */
    public String getPatientContNumber() {
        return patientContNumber;
    }

    public void setPatientContNumber(String patientContNumber) {
        this.patientContNumber = patientContNumber;
    }


    /**
     * 获取patientRegionCode的值
     *
     * @return patientRegionCode patientRegionCode值
     */
    public String getPatientRegionCode() {
        return patientRegionCode;
    }

    public void setPatientRegionCode(String patientRegionCode) {
        this.patientRegionCode = patientRegionCode;
    }

    /**
     * 获取nowAdd的值
     *
     * @return nowAdd nowAdd值
     */
    public String getNowAdd() {
        return nowAdd;
    }

    public void setNowAdd(String nowAdd) {
        this.nowAdd = nowAdd;
    }

    /**
     * 获取patientProfessionCode的值
     *
     * @return patientProfessionCode patientProfessionCode值
     */
    public String getPatientProfessionCode() {
        return patientProfessionCode;
    }

    public void setPatientProfessionCode(String patientProfessionCode) {
        this.patientProfessionCode = patientProfessionCode;
    }

    /**
     * 获取patientProfessionName的值
     *
     * @return patientProfessionName patientProfessionName值
     */
    public String getPatientProfessionName() {
        return patientProfessionName;
    }

    public void setPatientProfessionName(String patientProfessionName) {
        this.patientProfessionName = patientProfessionName;
    }

    /**
     * 获取diseaseClassesCode的值
     *
     * @return diseaseClassesCode diseaseClassesCode值
     */
    public String getDiseaseClassesCode() {
        return diseaseClassesCode;
    }

    public void setDiseaseClassesCode(String diseaseClassesCode) {
        this.diseaseClassesCode = diseaseClassesCode;
    }

    /**
     * 获取attackDate的值
     *
     * @return attackDate attackDate值
     */
    public Date getAttackDate() {
        return attackDate;
    }

    public void setAttackDate(Date attackDate) {
        this.attackDate = attackDate;
    }

    /**
     * 获取diagnosisDate的值
     *
     * @return diagnosisDate diagnosisDate值
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    /**
     * 获取dieDate的值
     *
     * @return dieDate dieDate值
     */
    public Date getDieDate() {
        return dieDate;
    }

    public void setDieDate(Date dieDate) {
        this.dieDate = dieDate;
    }

    /**
     * 获取contagionClassesCode的值
     *
     * @return contagionClassesCode contagionClassesCode值
     */
    public String getContagionClassesCode() {
        return contagionClassesCode;
    }

    public void setContagionClassesCode(String contagionClassesCode) {
        this.contagionClassesCode = contagionClassesCode;
    }

    /**
     * 获取contagionCode的值
     *
     * @return contagionCode contagionCode值
     */
    public String getContagionCode() {
        return contagionCode;
    }

    public void setContagionCode(String contagionCode) {
        this.contagionCode = contagionCode;
    }

    /**
     * 获取otherDiagnosis的值
     *
     * @return otherDiagnosis otherDiagnosis值
     */
    public String getOtherDiagnosis() {
        return otherDiagnosis;
    }

    public void setOtherDiagnosis(String otherDiagnosis) {
        this.otherDiagnosis = otherDiagnosis;
    }

    /**
     * 获取revisalName的值
     *
     * @return revisalName revisalName值
     */
    public String getRevisalName() {
        return revisalName;
    }

    public void setRevisalName(String revisalName) {
        this.revisalName = revisalName;
    }

    /**
     * 获取cardReturnReason的值
     *
     * @return cardReturnReason cardReturnReason值
     */
    public String getCardReturnReason() {
        return cardReturnReason;
    }

    public void setCardReturnReason(String cardReturnReason) {
        this.cardReturnReason = cardReturnReason;
    }

    /**
     * 获取reportUnit的值
     *
     * @return reportUnit reportUnit值
     */
    public String getReportUnit() {
        return reportUnit;
    }

    public void setReportUnit(String reportUnit) {
        this.reportUnit = reportUnit;
    }

    /**
     * 获取contNumber的值
     *
     * @return contNumber contNumber值
     */
    public String getContNumber() {
        return contNumber;
    }

    public void setContNumber(String contNumber) {
        this.contNumber = contNumber;
    }

    /**
     * 获取reportDoctorName的值
     *
     * @return reportDoctorName reportDoctorName值
     */
    public String getReportDoctorName() {
        return reportDoctorName;
    }

    public void setReportDoctorName(String reportDoctorName) {
        this.reportDoctorName = reportDoctorName;
    }

    /**
     * 获取reportDate的值
     *
     * @return reportDate reportDate值
     */
    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * 获取remark的值
     *
     * @return remark remark值
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取inTime的值
     *
     * @return inTime inTime值
     */
    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    /**
     * 获取entryDate的值
     *
     * @return entryDate entryDate值
     */
    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * 获取entryEmpCode的值
     *
     * @return entryEmpCode entryEmpCode值
     */
    public String getEntryEmpCode() {
        return entryEmpCode;
    }

    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    /**
     * 获取entryEmpName的值
     *
     * @return entryEmpName entryEmpName值
     */
    public String getEntryEmpName() {
        return entryEmpName;
    }

    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    /**
     * 获取entryOrgCode的值
     *
     * @return entryOrgCode entryOrgCode值
     */
    public String getEntryOrgCode() {
        return entryOrgCode;
    }

    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    public String getEntryOrgName() {
        return entryOrgName;
    }

    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFdataFrom() {
        return fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
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

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Date getFollowupDate() {
        return followupDate;
    }

    @Override
    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    @Override
    public Date getNextFollowupDate() {
        return null;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

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

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVillage() {
        return this.village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getRouteOfInfection() {
        return this.routeOfInfection;
    }

    public void setRouteOfInfection(String routeOfInfection) {
        this.routeOfInfection = routeOfInfection;
    }

    public String getRouteOfInfectionIsomerism() {
        return this.routeOfInfectionIsomerism;
    }

    public void setRouteOfInfectionIsomerism(String routeOfInfectionIsomerism) {
        this.routeOfInfectionIsomerism = routeOfInfectionIsomerism;
    }

    public String getBloodTransmission() {
        return this.bloodTransmission;
    }

    public void setBloodTransmission(String bloodTransmission) {
        this.bloodTransmission = bloodTransmission;
    }

    public String getHepatitisB() {
        return this.hepatitisB;
    }

    public void setHepatitisB(String hepatitisB) {
        this.hepatitisB = hepatitisB;
    }

    public String getHepatitisC() {
        return this.hepatitisC;
    }

    public void setHepatitisC(String hepatitisC) {
        this.hepatitisC = hepatitisC;
    }

    public String getContagionClassesA() {
        return this.contagionClassesA;
    }

    public void setContagionClassesA(String contagionClassesA) {
        this.contagionClassesA = contagionClassesA;
    }

    public String getContagionClassesB() {
        return this.contagionClassesB;
    }

    public void setContagionClassesB(String contagionClassesB) {
        this.contagionClassesB = contagionClassesB;
    }

    public String getContagionClassesC() {
        return this.contagionClassesC;
    }

    public void setContagionClassesC(String contagionClassesC) {
        this.contagionClassesC = contagionClassesC;
    }

    public String getAids() {
        return this.aids;
    }

    public void setAids(String aids) {
        this.aids = aids;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getRouteOfInfectionOther() {
        return this.routeOfInfectionOther;
    }

    public void setRouteOfInfectionOther(String routeOfInfectionOther) {
        this.routeOfInfectionOther = routeOfInfectionOther;
    }

    public String getSurveillanceStd() {
        return this.surveillanceStd;
    }

    public void setSurveillanceStd(String surveillanceStd) {
        this.surveillanceStd = surveillanceStd;
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
