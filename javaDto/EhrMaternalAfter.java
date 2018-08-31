package com.konsung.bean.maternal;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

import java.util.Date;

/**
 * 抽象产后访视记录类。本抽象类只定义基本字段
 * ，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String followupId 产后随访ID
 * 2. [不可空] String mangementNo 孕卡编号
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [不可空] java.util.Date followupDate 随访日期
 * 6. [可空] Double maternalTemperature 体温
 * 7. [可空] String maternalHealthState 一般健康情况
 * 8. [可空] String maternalMindHealthState 一般心理状况
 * 9. [可空] Integer systolicPressure 收缩压
 * 10. [可空] Integer diastolicPressure 舒张压
 * 11. [可空] String maternalBreast 乳房
 * 12. [可空] String maternalBreastEx 乳房异常描述
 * 13. [可空] String maternalLochia 恶露
 * 14. [可空] String maternalLochiaEx 恶露异常描述
 * 15. [可空] String maternalWomb 子宫
 * 16. [可空] String maternalWombEx 子宫异常描述
 * 17. [可空] String maternalHurt 伤口
 * 18. [可空] String maternalHurtEx 伤口异常描述
 * 19. [可空] String maternalOther 其他
 * 20. [可空] String maternalType 分类
 * 21. [可空] String maternalTypeEx 分类异常描述
 * 22. [可空] String maternalGuideNo 指导代码
 * 23. [可空] String maternalGuideOther 其他指导
 * 24. [可空] String referralSign 转诊标志
 * 25. [可空] String referralReason 转诊原因
 * 26. [可空] String referralOrgCode 转诊机构编码
 * 27. [可空] String referralOrgName 转诊机构名称
 * 28. [可空] String referralDepCode 转诊科室编码
 * 29. [可空] String referralDepName 转诊科室名称
 * 30. [可空] String referralOrgDep 转诊机构及科室
 * 31. [可空] java.util.Date nextFollowUpDate 下次随访日期
 * 32. [可空] String followUpDoctorCode 随访医生编码
 * 33. [可空] String followUpDoctorName 随访医生姓名
 * 34. [可空] String followUpOrgCode 随访机构编码
 * 35. [可空] String followUpOrgName 随访机构名称
 * 36. [不可空] java.util.Date entryDate 登记时间（系统）
 * 37. [不可空] String entryEmpCode 登记人员编码
 * 38. [不可空] String entryEmpName 登记人员名称
 * 39. [不可空] String entryOrgCode 登记机构编码
 * 40. [不可空] String entryOrgName 登记机构名称
 * 41. [不可空] String orgCode 医疗机构代码
 * 42. [不可空] java.util.Date uploadDate 填报日期
 * 43. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 44. [主键] String id 主键
 * 45. [可空] String editor 修改人
 * 46. [可空] java.util.Date modifydate 更新日期
 * 47. [不可空] String fdataFrom 数据来源
 */
@Entity
public class EhrMaternalAfter extends BaseChildBean {

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
     * 专项的本地id
     */
    private Long localspecialID;
    /**
     * 是否是结案的专项
     */
    private Boolean isEndCase;
    /**
     * 1. [不可空] 产后随访ID
     */
    public String followupId;

    /**
     * 2. [不可空] 孕卡编号
     */
    public String mangementNo;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    public String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    public String fileNumber;

    /**
     * 5. [不可空] 随访日期
     */
    public java.util.Date followupDate;

    /**
     * 6. [可空] 体温
     */
    public Double maternalTemperature;

    /**
     * 7. [可空] 一般健康情况
     */
    public String maternalHealthState;

    /**
     * 8. [可空] 一般心理状况
     */
    public String maternalMindHealthState;

    /**
     * 9. [可空] 收缩压
     */
    public Integer systolicPressure;

    /**
     * 10. [可空] 舒张压
     */
    public Integer diastolicPressure;

    /**
     * 11. [可空] 乳房
     */
    public String maternalBreast;

    /**
     * 12. [可空] 乳房异常描述
     */
    public String maternalBreastEx;

    /**
     * 13. [可空] 恶露
     */
    public String maternalLochia;

    /**
     * 14. [可空] 恶露异常描述
     */
    public String maternalLochiaEx;

    /**
     * 15. [可空] 子宫
     */
    public String maternalWomb;

    /**
     * 16. [可空] 子宫异常描述
     */
    public String maternalWombEx;

    /**
     * 17. [可空] 伤口
     */
    public String maternalHurt;

    /**
     * 18. [可空] 伤口异常描述
     */
    public String maternalHurtEx;

    /**
     * 19. [可空] 其他
     */
    public String maternalOther;

    /**
     * 20. [可空] 分类
     */
    public String maternalType;

    /**
     * 21. [可空] 分类异常描述
     */
    public String maternalTypeEx;

    /**
     * 22. [可空] 指导代码
     */
    public String maternalGuideNo;

    /**
     * 23. [可空] 其他指导
     */
    public String maternalGuideOther;

    /**
     * 24. [可空] 转诊标志
     */
    public String referralSign;

    /**
     * 25. [可空] 转诊原因
     */
    public String referralReason;

    /**
     * 26. [可空] 转诊机构编码
     */
    public String referralOrgCode;

    /**
     * 27. [可空] 转诊机构名称
     */
    public String referralOrgName;

    /**
     * 28. [可空] 转诊科室编码
     */
    public String referralDepCode;

    /**
     * 29. [可空] 转诊科室名称
     */
    public String referralDepName;

    /**
     * 30. [可空] 转诊机构及科室
     */
    public String referralOrgDep;

    /**
     * 31. [可空] 下次随访日期
     */
    public java.util.Date nextFollowUpDate;

    /**
     * 32. [可空] 随访医生编码
     */
    public String followUpDoctorCode;

    /**
     * 33. [可空] 随访医生姓名
     */
    public String followUpDoctorName;

    /**
     * 34. [可空] 随访机构编码
     */
    public String followUpOrgCode;

    /**
     * 35. [可空] 随访机构名称
     */
    public String followUpOrgName;

    /**
     * 36. [不可空] 登记时间（系统）
     */
    public java.util.Date entryDate;

    /**
     * 37. [不可空] 登记人员编码
     */
    public String entryEmpCode;

    /**
     * 38. [不可空] 登记人员名称
     */
    public String entryEmpName;

    /**
     * 39. [不可空] 登记机构编码
     */
    public String entryOrgCode;

    /**
     * 40. [不可空] 登记机构名称
     */
    public String entryOrgName;

    /**
     * 41. [不可空] 医疗机构代码
     */
    public String orgCode;



    /**
     * 43. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    public String updateFlag;

    /**
     * 45. [可空] 修改人
     */
    public String editor;
    /**
     * 42. [不可空] 填报日期
     */
    public java.util.Date uploadDate;

    /**
     * 46. [可空] 更新日期
     */
    public java.util.Date modifydate;

    /**
     * 47. [不可空] 数据来源
     */
    public String fdataFrom;

    /** 48. [可空] 分娩日期 */
    private java.util.Date labourdate;

    /** 49. [可空] 出院日期 */
    private java.util.Date outhorth;

    /** 50. [可空] 孕次 */
    private Integer pregtimes;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 1447785915)
    public EhrMaternalAfter(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            Long localspecialID, Boolean isEndCase, String followupId,
            String mangementNo, String healthfileNo, String fileNumber,
            java.util.Date followupDate, Double maternalTemperature,
            String maternalHealthState, String maternalMindHealthState,
            Integer systolicPressure, Integer diastolicPressure,
            String maternalBreast, String maternalBreastEx, String maternalLochia,
            String maternalLochiaEx, String maternalWomb, String maternalWombEx,
            String maternalHurt, String maternalHurtEx, String maternalOther,
            String maternalType, String maternalTypeEx, String maternalGuideNo,
            String maternalGuideOther, String referralSign, String referralReason,
            String referralOrgCode, String referralOrgName, String referralDepCode,
            String referralDepName, String referralOrgDep,
            java.util.Date nextFollowUpDate, String followUpDoctorCode,
            String followUpDoctorName, String followUpOrgCode,
            String followUpOrgName, java.util.Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName,
            String orgCode, String updateFlag, String editor,
            java.util.Date uploadDate, java.util.Date modifydate, String fdataFrom,
            java.util.Date labourdate, java.util.Date outhorth, Integer pregtimes,
            String editorId, String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.localspecialID = localspecialID;
        this.isEndCase = isEndCase;
        this.followupId = followupId;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.followupDate = followupDate;
        this.maternalTemperature = maternalTemperature;
        this.maternalHealthState = maternalHealthState;
        this.maternalMindHealthState = maternalMindHealthState;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.maternalBreast = maternalBreast;
        this.maternalBreastEx = maternalBreastEx;
        this.maternalLochia = maternalLochia;
        this.maternalLochiaEx = maternalLochiaEx;
        this.maternalWomb = maternalWomb;
        this.maternalWombEx = maternalWombEx;
        this.maternalHurt = maternalHurt;
        this.maternalHurtEx = maternalHurtEx;
        this.maternalOther = maternalOther;
        this.maternalType = maternalType;
        this.maternalTypeEx = maternalTypeEx;
        this.maternalGuideNo = maternalGuideNo;
        this.maternalGuideOther = maternalGuideOther;
        this.referralSign = referralSign;
        this.referralReason = referralReason;
        this.referralOrgCode = referralOrgCode;
        this.referralOrgName = referralOrgName;
        this.referralDepCode = referralDepCode;
        this.referralDepName = referralDepName;
        this.referralOrgDep = referralOrgDep;
        this.nextFollowUpDate = nextFollowUpDate;
        this.followUpDoctorCode = followUpDoctorCode;
        this.followUpDoctorName = followUpDoctorName;
        this.followUpOrgCode = followUpOrgCode;
        this.followUpOrgName = followUpOrgName;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.uploadDate = uploadDate;
        this.modifydate = modifydate;
        this.fdataFrom = fdataFrom;
        this.labourdate = labourdate;
        this.outhorth = outhorth;
        this.pregtimes = pregtimes;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 608895862)
    public EhrMaternalAfter() {
    }

    @Override
    public Date getRevisionDate() {
        return modifydate;
    }

    public boolean isUpload() {
        return upload;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Boolean getEndCase() {
        return isEndCase;
    }

    public void setEndCase(Boolean endCase) {
        isEndCase = endCase;
    }

    public Long getLocalspecialID() {
        return localspecialID;
    }

    public void setLocalspecialID(Long localspecialID) {
        this.localspecialID = localspecialID;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFollowupId() {
        return this.followupId;
    }

    public void setFollowupId(String followupId) {
        this.followupId = followupId;
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

    public java.util.Date getFollowupDate() {
        return this.followupDate;
    }

    public void setFollowupDate(java.util.Date followupDate) {
        this.followupDate = followupDate;
    }

    public Double getMaternalTemperature() {
        return this.maternalTemperature;
    }

    public void setMaternalTemperature(Double maternalTemperature) {
        this.maternalTemperature = maternalTemperature;
    }

    public String getMaternalHealthState() {
        return this.maternalHealthState;
    }

    public void setMaternalHealthState(String maternalHealthState) {
        this.maternalHealthState = maternalHealthState;
    }

    public String getMaternalMindHealthState() {
        return this.maternalMindHealthState;
    }

    public void setMaternalMindHealthState(String maternalMindHealthState) {
        this.maternalMindHealthState = maternalMindHealthState;
    }

    public Integer getSystolicPressure() {
        return this.systolicPressure;
    }

    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Integer getDiastolicPressure() {
        return this.diastolicPressure;
    }

    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public String getMaternalBreast() {
        return this.maternalBreast;
    }

    public void setMaternalBreast(String maternalBreast) {
        this.maternalBreast = maternalBreast;
    }

    public String getMaternalBreastEx() {
        return this.maternalBreastEx;
    }

    public void setMaternalBreastEx(String maternalBreastEx) {
        this.maternalBreastEx = maternalBreastEx;
    }

    public String getMaternalLochia() {
        return this.maternalLochia;
    }

    public void setMaternalLochia(String maternalLochia) {
        this.maternalLochia = maternalLochia;
    }

    public String getMaternalLochiaEx() {
        return this.maternalLochiaEx;
    }

    public void setMaternalLochiaEx(String maternalLochiaEx) {
        this.maternalLochiaEx = maternalLochiaEx;
    }

    public String getMaternalWomb() {
        return this.maternalWomb;
    }

    public void setMaternalWomb(String maternalWomb) {
        this.maternalWomb = maternalWomb;
    }

    public String getMaternalWombEx() {
        return this.maternalWombEx;
    }

    public void setMaternalWombEx(String maternalWombEx) {
        this.maternalWombEx = maternalWombEx;
    }

    public String getMaternalHurt() {
        return this.maternalHurt;
    }

    public void setMaternalHurt(String maternalHurt) {
        this.maternalHurt = maternalHurt;
    }

    public String getMaternalHurtEx() {
        return this.maternalHurtEx;
    }

    public void setMaternalHurtEx(String maternalHurtEx) {
        this.maternalHurtEx = maternalHurtEx;
    }

    public String getMaternalOther() {
        return this.maternalOther;
    }

    public void setMaternalOther(String maternalOther) {
        this.maternalOther = maternalOther;
    }

    public String getMaternalType() {
        return this.maternalType;
    }

    public void setMaternalType(String maternalType) {
        this.maternalType = maternalType;
    }

    public String getMaternalTypeEx() {
        return this.maternalTypeEx;
    }

    public void setMaternalTypeEx(String maternalTypeEx) {
        this.maternalTypeEx = maternalTypeEx;
    }

    public String getMaternalGuideNo() {
        return this.maternalGuideNo;
    }

    public void setMaternalGuideNo(String maternalGuideNo) {
        this.maternalGuideNo = maternalGuideNo;
    }

    public String getMaternalGuideOther() {
        return this.maternalGuideOther;
    }

    public void setMaternalGuideOther(String maternalGuideOther) {
        this.maternalGuideOther = maternalGuideOther;
    }

    public String getReferralSign() {
        return this.referralSign;
    }

    public void setReferralSign(String referralSign) {
        this.referralSign = referralSign;
    }

    public String getReferralReason() {
        return this.referralReason;
    }

    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    public String getReferralOrgCode() {
        return this.referralOrgCode;
    }

    public void setReferralOrgCode(String referralOrgCode) {
        this.referralOrgCode = referralOrgCode;
    }

    public String getReferralOrgName() {
        return this.referralOrgName;
    }

    public void setReferralOrgName(String referralOrgName) {
        this.referralOrgName = referralOrgName;
    }

    public String getReferralDepCode() {
        return this.referralDepCode;
    }

    public void setReferralDepCode(String referralDepCode) {
        this.referralDepCode = referralDepCode;
    }

    public String getReferralDepName() {
        return this.referralDepName;
    }

    public void setReferralDepName(String referralDepName) {
        this.referralDepName = referralDepName;
    }

    public String getReferralOrgDep() {
        return this.referralOrgDep;
    }

    public void setReferralOrgDep(String referralOrgDep) {
        this.referralOrgDep = referralOrgDep;
    }

    public java.util.Date getNextFollowupDate() {
        return this.nextFollowUpDate;
    }

    public void setNextFollowupDate(java.util.Date nextFollowupDate) {
        this.nextFollowUpDate = nextFollowupDate;
    }

    public String getFollowUpDoctorCode() {
        return this.followUpDoctorCode;
    }

    public void setFollowUpDoctorCode(String followUpDoctorCode) {
        this.followUpDoctorCode = followUpDoctorCode;
    }

    public String getFollowUpDoctorName() {
        return this.followUpDoctorName;
    }

    public void setFollowUpDoctorName(String followUpDoctorName) {
        this.followUpDoctorName = followUpDoctorName;
    }

    public String getFollowUpOrgCode() {
        return this.followUpOrgCode;
    }

    public void setFollowUpOrgCode(String followUpOrgCode) {
        this.followUpOrgCode = followUpOrgCode;
    }

    public String getFollowUpOrgName() {
        return this.followUpOrgName;
    }

    public void setFollowUpOrgName(String followUpOrgName) {
        this.followUpOrgName = followUpOrgName;
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

    public java.util.Date getLabourdate() {
        return this.labourdate;
    }

    public void setLabourdate(java.util.Date labourdate) {
        this.labourdate = labourdate;
    }

    public java.util.Date getOuthorth() {
        return this.outhorth;
    }

    public void setOuthorth(java.util.Date outhorth) {
        this.outhorth = outhorth;
    }

    public Integer getPregtimes() {
        return this.pregtimes;
    }

    public void setPregtimes(Integer pregtimes) {
        this.pregtimes = pregtimes;
    }

    public java.util.Date getNextFollowUpDate() {
        return this.nextFollowUpDate;
    }

    public void setNextFollowUpDate(java.util.Date nextFollowUpDate) {
        this.nextFollowUpDate = nextFollowUpDate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsEndCase() {
        return this.isEndCase;
    }
    public String getEditorId() {
        return this.editorId;
    }

    public void setIsEndCase(Boolean isEndCase) {
        this.isEndCase = isEndCase;
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
