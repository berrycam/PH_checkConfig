package com.konsung.bean.maternal;

import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 抽象 第2～5次产前随访记录类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String followupId 随访流水号
 * 2. [不可空] String mangementNo 孕卡编号
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [不可空] java.util.Date followupDate 随访日期
 * 6. [可空] Integer pregnantWeek 孕周
 * 7. [可空] String maternalZhusu 主诉
 * 8. [可空] Double maternalWeight 体重
 * 9. [可空] Double maternalGonggao 宫高
 * 10. [可空] Double maternalFuwei 腹围
 * 11. [可空] String maternalTaiwei 胎位
 * 12. [可空] Integer maternalBabyHeart 胎心率
 * 13. [可空] Integer maternalBabyHeart2 胎心率2
 * 14. [可空] Integer maternalBabyHeart3 胎心率3
 * 15. [可空] String maternalBabyHeartOther 胎心率说明
 * 16. [可空] Integer systolicPressure 收缩压
 * 17. [可空] Integer diastolicPressure 舒张压
 * 18. [可空] Double maternalHemoglobin 血红蛋白
 * 19. [可空] String maternalProProtein 尿蛋白
 * 20. [可空] String maternalExamOther 其他辅助检查
 * 21. [可空] String maternalType 分类
 * 22. [可空] String maternalTypeEx 分类异常描述
 * 23. [可空] String maternalGuideNo 指导代码
 * 24. [可空] String maternalGuideOther 其他指导说明
 * 25. [可空] String referralSign 转诊标志
 * 26. [可空] String referralReason 转诊原因
 * 27. [可空] String referralOrgCode 转诊机构编码
 * 28. [可空] String referralOrgName 转诊机构名称
 * 29. [可空] String referralDepCode 转诊科室编码
 * 30. [可空] String referralDepName 转诊科室名称
 * 31. [可空] String referralOrgDep 转诊机构及科室
 * 32. [可空] java.util.Date nextFollowUpDate 下次随访日期
 * 33. [可空] String followUpDoctorCode 随访医生编码
 * 34. [可空] String followUpDoctorName 随访医生姓名
 * 35. [可空] String followUpOrgCode 随访机构编码
 * 36. [可空] String followUpOrgName 随访机构名称
 * 37. [不可空] java.util.Date entryDate 登记时间
 * 38. [不可空] String entryEmpCode 登记人员编码
 * 39. [不可空] String entryEmpName 登记人员名称
 * 40. [可空] String entryOrgCode 登记机构编码
 * 41. [不可空] String entryOrgName 登记机构名称
 * 42. [不可空] String orgCode 医疗机构代码
 * 43. [不可空] java.util.Date uploadDate 填报日期
 * 44. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 45. [主键] String id 主键
 * 46. [可空] String editor 修改人
 * 47. [可空] java.util.Date modifydate 更新日期
 * 48. [不可空] String fdataFrom 数据来源
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrMaternalTwoToFive extends BaseChildBean {

    /*
     * 本程序不允许修改！！！
     */

    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    private Long localId;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 会员卡号
     */
    private String vipCard;

    /**
     * 是否已经上传
     */
    private boolean upload;

    /**
     * 标识所有必填字段是否填写
     */
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /** 1. [不可空] 随访流水号 */
    protected String followupId;

    /** 2. [不可空] 孕卡编号 */
    protected String mangementNo;

    /** 3. [不可空] 个人健康档案编码 */
    protected String healthfileNo;

    /** 4. [可空] 基本信息档案号 */
    protected String fileNumber;

    /** 5. [不可空] 随访日期 */
    protected java.util.Date followupDate;

    /** 6. [可空] 孕周 */
    protected Integer pregnantWeek;

    /** 7. [可空] 主诉 */
    protected String maternalZhusu;

    /** 8. [可空] 体重 */
    protected Double maternalWeight;

    /** 9. [可空] 宫高 */
    protected Double maternalGonggao;

    /** 10. [可空] 腹围 */
    protected Double maternalFuwei;

    /** 11. [可空] 胎位 */
    protected String maternalTaiwei;

    /** 12. [可空] 胎心率 */
    protected Integer maternalBabyHeart;

    /** 13. [可空] 胎心率2 */
    protected Integer maternalBabyHeart2;

    /** 14. [可空] 胎心率3 */
    protected Integer maternalBabyHeart3;

    /** 15. [可空] 胎心率说明 */
    protected String maternalBabyHeartOther;

    /** 16. [可空] 收缩压 */
    protected Integer systolicPressure;

    /** 17. [可空] 舒张压 */
    protected Integer diastolicPressure;

    /** 18. [可空] 血红蛋白 */
    protected Double maternalHemoglobin;

    /** 19. [可空] 尿蛋白 */
    protected String maternalProProtein;

    /** 20. [可空] 其他辅助检查 */
    protected String maternalExamOther;

    /** 21. [可空] 分类 */
    protected String maternalType;

    /** 22. [可空] 分类异常描述 */
    protected String maternalTypeEx;

    /** 23. [可空] 指导代码 */
    protected String maternalGuideNo;

    /** 24. [可空] 其他指导说明 */
    protected String maternalGuideOther;

    /** 25. [可空] 转诊标志 */
    protected String referralSign;

    /** 26. [可空] 转诊原因 */
    protected String referralReason;

    /** 27. [可空] 转诊机构编码 */
    protected String referralOrgCode;

    /** 28. [可空] 转诊机构名称 */
    protected String referralOrgName;

    /** 29. [可空] 转诊科室编码 */
    protected String referralDepCode;

    /** 30. [可空] 转诊科室名称 */
    protected String referralDepName;

    /** 31. [可空] 转诊机构及科室 */
    protected String referralOrgDep;

    /** 32. [可空] 下次随访日期 */
    protected java.util.Date nextFollowUpDate;

    /** 33. [可空] 随访医生编码 */
    protected String followUpDoctorCode;

    /** 34. [可空] 随访医生姓名 */
    protected String followUpDoctorName;

    /** 35. [可空] 随访机构编码 */
    protected String followUpOrgCode;

    /** 36. [可空] 随访机构名称 */
    protected String followUpOrgName;

    /** 37. [不可空] 登记时间 */
    protected java.util.Date entryDate;

    /** 38. [不可空] 登记人员编码 */
    protected String entryEmpCode;

    /** 39. [不可空] 登记人员名称 */
    protected String entryEmpName;

    /** 40. [可空] 登记机构编码 */
    protected String entryOrgCode;

    /** 41. [不可空] 登记机构名称 */
    protected String entryOrgName;

    /** 42. [不可空] 医疗机构代码 */
    protected String orgCode;

    /** 43. [不可空] 填报日期 */
    protected java.util.Date uploadDate;

    /** 44. [不可空] 修改标志 1：正常、2：修改、3：撤销 */
    protected String updateFlag;

    /** 46. [可空] 修改人 */
    protected String editor;

    /** 47. [可空] 更新日期 */
    protected java.util.Date modifydate;

    /** 48. [不可空] 数据来源 */
    protected String fdataFrom;
    /** 49. [不可空] 随访次数标识 */
    private Integer followupNumber;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 844963526)
    public EhrMaternalTwoToFive(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            Long localspecialID, Boolean isEndCase, String followupId,
            String mangementNo, String healthfileNo, String fileNumber,
            java.util.Date followupDate, Integer pregnantWeek, String maternalZhusu,
            Double maternalWeight, Double maternalGonggao, Double maternalFuwei,
            String maternalTaiwei, Integer maternalBabyHeart,
            Integer maternalBabyHeart2, Integer maternalBabyHeart3,
            String maternalBabyHeartOther, Integer systolicPressure,
            Integer diastolicPressure, Double maternalHemoglobin,
            String maternalProProtein, String maternalExamOther,
            String maternalType, String maternalTypeEx, String maternalGuideNo,
            String maternalGuideOther, String referralSign, String referralReason,
            String referralOrgCode, String referralOrgName, String referralDepCode,
            String referralDepName, String referralOrgDep,
            java.util.Date nextFollowUpDate, String followUpDoctorCode,
            String followUpDoctorName, String followUpOrgCode,
            String followUpOrgName, java.util.Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName,
            String orgCode, java.util.Date uploadDate, String updateFlag,
            String editor, java.util.Date modifydate, String fdataFrom,
            Integer followupNumber, String editorId, String updateOrgId,
            String updateOrgName) {
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
        this.pregnantWeek = pregnantWeek;
        this.maternalZhusu = maternalZhusu;
        this.maternalWeight = maternalWeight;
        this.maternalGonggao = maternalGonggao;
        this.maternalFuwei = maternalFuwei;
        this.maternalTaiwei = maternalTaiwei;
        this.maternalBabyHeart = maternalBabyHeart;
        this.maternalBabyHeart2 = maternalBabyHeart2;
        this.maternalBabyHeart3 = maternalBabyHeart3;
        this.maternalBabyHeartOther = maternalBabyHeartOther;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.maternalHemoglobin = maternalHemoglobin;
        this.maternalProProtein = maternalProProtein;
        this.maternalExamOther = maternalExamOther;
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
        this.uploadDate = uploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.fdataFrom = fdataFrom;
        this.followupNumber = followupNumber;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1476376032)
    public EhrMaternalTwoToFive() {
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

    public Integer getFollowupNumber() {
        return followupNumber;
    }

    public void setFollowupNumber(Integer followupNumber) {
        this.followupNumber = followupNumber;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVipCard() {
        return vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public boolean isUpload() {
        return upload;
    }

    @Override
    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    @Override
    public boolean getCompleted() {
        return completed;
    }
    @Override
    public Date getRevisionDate() {
        return modifydate;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFollowupId() {
        return followupId;
    }

    public void setFollowupId(String followupId) {
        this.followupId = followupId;
    }

    public String getMangementNo() {
        return mangementNo;
    }

    public void setMangementNo(String mangementNo) {
        this.mangementNo = mangementNo;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
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
        return followupDate;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }

    @Override
    public boolean getUpload() {
        return upload;
    }

    public Integer getPregnantWeek() {
        return pregnantWeek;
    }

    public void setPregnantWeek(Integer pregnantWeek) {
        this.pregnantWeek = pregnantWeek;
    }

    public String getMaternalZhusu() {
        return maternalZhusu;
    }

    public void setMaternalZhusu(String maternalZhusu) {
        this.maternalZhusu = maternalZhusu;
    }

    public Double getMaternalWeight() {
        return maternalWeight;
    }

    public void setMaternalWeight(Double maternalWeight) {
        this.maternalWeight = maternalWeight;
    }

    public Double getMaternalGonggao() {
        return maternalGonggao;
    }

    public void setMaternalGonggao(Double maternalGonggao) {
        this.maternalGonggao = maternalGonggao;
    }

    public Double getMaternalFuwei() {
        return maternalFuwei;
    }

    public void setMaternalFuwei(Double maternalFuwei) {
        this.maternalFuwei = maternalFuwei;
    }

    public String getMaternalTaiwei() {
        return maternalTaiwei;
    }

    public void setMaternalTaiwei(String maternalTaiwei) {
        this.maternalTaiwei = maternalTaiwei;
    }

    public Integer getMaternalBabyHeart() {
        return maternalBabyHeart;
    }

    public void setMaternalBabyHeart(Integer maternalBabyHeart) {
        this.maternalBabyHeart = maternalBabyHeart;
    }

    public Integer getMaternalBabyHeart2() {
        return maternalBabyHeart2;
    }

    public void setMaternalBabyHeart2(Integer maternalBabyHeart2) {
        this.maternalBabyHeart2 = maternalBabyHeart2;
    }

    public Integer getMaternalBabyHeart3() {
        return maternalBabyHeart3;
    }

    public void setMaternalBabyHeart3(Integer maternalBabyHeart3) {
        this.maternalBabyHeart3 = maternalBabyHeart3;
    }

    public String getMaternalBabyHeartOther() {
        return maternalBabyHeartOther;
    }

    public void setMaternalBabyHeartOther(String maternalBabyHeartOther) {
        this.maternalBabyHeartOther = maternalBabyHeartOther;
    }

    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public Double getMaternalHemoglobin() {
        return maternalHemoglobin;
    }

    public void setMaternalHemoglobin(Double maternalHemoglobin) {
        this.maternalHemoglobin = maternalHemoglobin;
    }

    public String getMaternalProProtein() {
        return maternalProProtein;
    }

    public void setMaternalProProtein(String maternalProProtein) {
        this.maternalProProtein = maternalProProtein;
    }

    public String getMaternalExamOther() {
        return maternalExamOther;
    }

    public void setMaternalExamOther(String maternalExamOther) {
        this.maternalExamOther = maternalExamOther;
    }

    public String getMaternalType() {
        return maternalType;
    }

    public void setMaternalType(String maternalType) {
        this.maternalType = maternalType;
    }

    public String getMaternalTypeEx() {
        return maternalTypeEx;
    }

    public void setMaternalTypeEx(String maternalTypeEx) {
        this.maternalTypeEx = maternalTypeEx;
    }

    public String getMaternalGuideNo() {
        return maternalGuideNo;
    }

    public void setMaternalGuideNo(String maternalGuideNo) {
        this.maternalGuideNo = maternalGuideNo;
    }

    public String getMaternalGuideOther() {
        return maternalGuideOther;
    }

    public void setMaternalGuideOther(String maternalGuideOther) {
        this.maternalGuideOther = maternalGuideOther;
    }

    public String getReferralSign() {
        return referralSign;
    }

    public void setReferralSign(String referralSign) {
        this.referralSign = referralSign;
    }

    public String getReferralReason() {
        return referralReason;
    }

    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    public String getReferralOrgCode() {
        return referralOrgCode;
    }

    public void setReferralOrgCode(String referralOrgCode) {
        this.referralOrgCode = referralOrgCode;
    }

    public String getReferralOrgName() {
        return referralOrgName;
    }

    public void setReferralOrgName(String referralOrgName) {
        this.referralOrgName = referralOrgName;
    }

    public String getReferralDepCode() {
        return referralDepCode;
    }

    public void setReferralDepCode(String referralDepCode) {
        this.referralDepCode = referralDepCode;
    }

    public String getReferralDepName() {
        return referralDepName;
    }

    public void setReferralDepName(String referralDepName) {
        this.referralDepName = referralDepName;
    }

    public String getReferralOrgDep() {
        return referralOrgDep;
    }

    public void setReferralOrgDep(String referralOrgDep) {
        this.referralOrgDep = referralOrgDep;
    }

    public Date getNextFollowUpDate() {
        return nextFollowUpDate;
    }

    public void setNextFollowUpDate(Date nextFollowUpDate) {
        this.nextFollowUpDate = nextFollowUpDate;
    }

    public String getFollowUpDoctorCode() {
        return followUpDoctorCode;
    }

    public void setFollowUpDoctorCode(String followUpDoctorCode) {
        this.followUpDoctorCode = followUpDoctorCode;
    }

    public String getFollowUpDoctorName() {
        return followUpDoctorName;
    }

    public void setFollowUpDoctorName(String followUpDoctorName) {
        this.followUpDoctorName = followUpDoctorName;
    }

    public String getFollowUpOrgCode() {
        return followUpOrgCode;
    }

    public void setFollowUpOrgCode(String followUpOrgCode) {
        this.followUpOrgCode = followUpOrgCode;
    }

    public String getFollowUpOrgName() {
        return followUpOrgName;
    }

    public void setFollowUpOrgName(String followUpOrgName) {
        this.followUpOrgName = followUpOrgName;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryEmpCode() {
        return entryEmpCode;
    }

    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    public String getEntryEmpName() {
        return entryEmpName;
    }

    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

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

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
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

    public String getFdataFrom() {
        return fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public Boolean getIsEndCase() {
        return this.isEndCase;
    }

    public void setIsEndCase(Boolean isEndCase) {
        this.isEndCase = isEndCase;
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
