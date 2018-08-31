package com.konsung.bean.psychosis;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.konsung.bean.AbstractEhrHeDrug;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.converter.PropertyConverter;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class PsyFollowUp extends BaseChildBean {
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
     * 1. [不可空] 重性精神病患者随访流水号
     */
    protected String holergasiaFollowUpNumber;

    /**
     * 2. [可空] 重性精神病患者专项档案号
     */
    protected String holergasiaInfoNumber;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 5. [可空] 随访日期
     */
    protected java.util.Date followUpDate;

    /**
     * 6. [可空] 危险级别代码
     */
    protected String dangerRatingCode;

    /**
     * 7. [可空] 目前症状代码
     */
    protected String nowSymptomCode;

    /**
     * 8. [可空] 其他目前症状名称
     */
    protected String nowSymptomName;

    /**
     * 9. [可空] 自知力编码
     */
    protected String insightCode;

    /**
     * 10. [可空] 睡眠情况代码
     */
    protected String sleepCode;

    /**
     * 11. [可空] 饮食情况代码
     */
    protected String foodCode;

    /**
     * 12. [可空] 个人生活料理代码
     */
    protected String lifeCode;

    /**
     * 13. [可空] 家务劳动代码
     */
    protected String houseworkCode;

    /**
     * 14. [可空] 生产劳动及工作代码
     */
    protected String workCode;

    /**
     * 15. [可空] 学习能力代码
     */
    protected String studyCode;

    /**
     * 16. [可空] 社会人际交往代码
     */
    protected String interpersonalCode;

    /**
     * 17. [可空] 轻度滋事次数
     */
    protected Integer mildTroubleTime;

    /**
     * 18. [可空] 肇事次数
     */
    protected Integer troubleTime;

    /**
     * 19. [可空] 肇祸次数
     */
    protected Integer disasterTime;

    /**
     * 20. [可空] 自伤次数
     */
    protected Integer autolesionTime;

    /**
     * 21. [可空] 自杀未遂次数
     */
    protected Integer suicideTime;

    /**
     * 22. [可空] 有无社会影响代码
     */
    protected String socialImpactCode;

    /**
     * 23. [可空] 关锁情况代码
     */
    protected String closeLockCode;

    /**
     * 24. [可空] 住院情况代码
     */
    protected String inCode;

    /**
     * 25. [可空] 末次出院日期
     */
    protected java.util.Date lastLeaveHosDate;

    /**
     * 26. [可空] 实验室检查标志代码
     */
    protected String examFlagCode;

    /**
     * 27. [可空] 实验室检查其他名称
     */
    protected String examName;

    /**
     * 28. [可空] 服药依从性代码
     */
    protected String medicaCompCode;

    /**
     * 29. [可空] 药物不良反应标志代码
     */
    protected String adrFlagCode;

    /**
     * 30. [可空] 药物不良反应其他名称
     */
    protected String adrName;

    /**
     * 31. [可空] 治疗效果代码
     */
    protected String cureEffectCode;

    /**
     * 32. [可空] 转诊代码
     */
    protected String referralCode;

    /**
     * 33. [可空] 转诊原因
     */
    protected String referralReason;

    /**
     * 34. [可空] 转诊机构编码
     */
    protected String referralOrgCode;

    /**
     * 35. [可空] 转诊机构名称
     */
    protected String referralOrgName;

    /**
     * 36. [可空] 转诊科室编码
     */
    protected String referralDepCode;

    /**
     * 37. [可空] 转诊科室名称
     */
    protected String referralDepName;

    /**
     * 38. [可空] 转诊机构及科室
     */
    protected String referralOrgDep;

    /**
     * 39. [可空] 康复措施代码
     */
    protected String recoveryCode;

    /**
     * 40. [可空] 康复措施其他名称
     */
    protected String recoveryName;

    /**
     * 41. [可空] 本次随访分类代码
     */
    protected String followUpClassesCode;

    /**
     * 42. [可空] 下次随访日期
     */
    protected java.util.Date nextFollowUpDate;

    /**
     * 43. [可空] 随访医生编码
     */
    protected String followUpDoctorCode;

    /**
     * 44. [可空] 随访医生姓名
     */
    protected String followUpDoctorName;

    /**
     * 45. [可空] 随访机构编码
     */
    protected String followUpOrgCode;

    /**
     * 46. [可空] 随访机构名称
     */
    protected String followUpOrgName;

    /**
     * 47. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 48. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 49. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 50. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 51. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 52. [可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 53. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 55. [不可空] 数据来源
     */
    protected String fdataFrom;

    /**
     * 56. [可空] 修改者
     */
    protected String editor;

    /**
     * 57. [可空] 修改日期
     */
    protected java.util.Date modifydate;

    /**
     * 58. [不可空] 修改标志,1新增,2修改,3撤销
     */
    protected String updateFlag;

    /**
     * 59. [可空]  失访原因
     */
    protected String reaFailure;

    /**
     * 60. [可空] 其它失访原因
     */
    protected String scmptomOther;

    /**
     * 61. [可空] 死亡原因|字典
     */
    protected String deathcause;

    /**
     * 62. [可空] 躯体疾病|
     */
    protected String bodyhealth;

    /**
     * 63. [可空] 其他原因|死亡其他原因
     */
    protected String dealmptomother;

    /**
     * 64. [可空] 死亡日期|死亡日期
     */
    protected String deathdate;

    /**
     * 65. [可空] 备注|
     */
    protected String remark;

    /**
     * 66. [可空] 其它危害行为(次)
     */
    protected Integer behavior;

    /**
     * 67. [可空] 危险行为
     */
    protected Long nobehavior;

    /**
     * 68. [可空] 实验室检查其他
     */
    protected String examinationOther;
    /**
     * 69. [不可空] 随访方式代码
     */
    private String followUpMethodCode;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    /**
     * 患者是否随访
     */
    private String ConfirmCode = "0";

    public String getConfirmCode() {
        return ConfirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        ConfirmCode = confirmCode;
    }

    public String getFollowUpMethodCode() {
        return followUpMethodCode;
    }

    public void setFollowUpMethodCode(String followUpMethodCode) {
        this.followUpMethodCode = followUpMethodCode;
    }

    /**
     * 随访用药信息
     */
    @Transient
    private List<AbstractEhrHeDrug> listDrugs;
    /**
     * 随访用药指导
     */
    @Transient
    private List<AbstractEhrHeDrug> listTeachDrugs;

    /**
     * 随访用药情况
     */
    @Convert(converter = DrugsConverter.class, columnType = String.class)
    private List<AbstractEhrHeDrug> drugs;
    /**
     * 随访用药指导
     */
    @Convert(converter = DrugsConverter.class, columnType = String.class)
    private List<AbstractEhrHeDrug> teachDrugs;

    @Generated(hash = 1999889848)
    public PsyFollowUp(Long localId, String idCard, String vipCard, boolean upload,
            boolean completed, String title, String id, String holergasiaFollowUpNumber,
            String holergasiaInfoNumber, String healthfileNo, String fileNumber,
            java.util.Date followUpDate, String dangerRatingCode, String nowSymptomCode,
            String nowSymptomName, String insightCode, String sleepCode, String foodCode,
            String lifeCode, String houseworkCode, String workCode, String studyCode,
            String interpersonalCode, Integer mildTroubleTime, Integer troubleTime,
            Integer disasterTime, Integer autolesionTime, Integer suicideTime,
            String socialImpactCode, String closeLockCode, String inCode,
            java.util.Date lastLeaveHosDate, String examFlagCode, String examName,
            String medicaCompCode, String adrFlagCode, String adrName, String cureEffectCode,
            String referralCode, String referralReason, String referralOrgCode,
            String referralOrgName, String referralDepCode, String referralDepName,
            String referralOrgDep, String recoveryCode, String recoveryName,
            String followUpClassesCode, java.util.Date nextFollowUpDate,
            String followUpDoctorCode, String followUpDoctorName, String followUpOrgCode,
            String followUpOrgName, java.util.Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String fdataFrom, String editor,
            java.util.Date modifydate, String updateFlag, String reaFailure,
            String scmptomOther, String deathcause, String bodyhealth, String dealmptomother,
            String deathdate, String remark, Integer behavior, Long nobehavior,
            String examinationOther, String followUpMethodCode, String editorId,
            String updateOrgId, String updateOrgName, String ConfirmCode,
            List<AbstractEhrHeDrug> drugs, List<AbstractEhrHeDrug> teachDrugs) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.holergasiaFollowUpNumber = holergasiaFollowUpNumber;
        this.holergasiaInfoNumber = holergasiaInfoNumber;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.followUpDate = followUpDate;
        this.dangerRatingCode = dangerRatingCode;
        this.nowSymptomCode = nowSymptomCode;
        this.nowSymptomName = nowSymptomName;
        this.insightCode = insightCode;
        this.sleepCode = sleepCode;
        this.foodCode = foodCode;
        this.lifeCode = lifeCode;
        this.houseworkCode = houseworkCode;
        this.workCode = workCode;
        this.studyCode = studyCode;
        this.interpersonalCode = interpersonalCode;
        this.mildTroubleTime = mildTroubleTime;
        this.troubleTime = troubleTime;
        this.disasterTime = disasterTime;
        this.autolesionTime = autolesionTime;
        this.suicideTime = suicideTime;
        this.socialImpactCode = socialImpactCode;
        this.closeLockCode = closeLockCode;
        this.inCode = inCode;
        this.lastLeaveHosDate = lastLeaveHosDate;
        this.examFlagCode = examFlagCode;
        this.examName = examName;
        this.medicaCompCode = medicaCompCode;
        this.adrFlagCode = adrFlagCode;
        this.adrName = adrName;
        this.cureEffectCode = cureEffectCode;
        this.referralCode = referralCode;
        this.referralReason = referralReason;
        this.referralOrgCode = referralOrgCode;
        this.referralOrgName = referralOrgName;
        this.referralDepCode = referralDepCode;
        this.referralDepName = referralDepName;
        this.referralOrgDep = referralOrgDep;
        this.recoveryCode = recoveryCode;
        this.recoveryName = recoveryName;
        this.followUpClassesCode = followUpClassesCode;
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
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.reaFailure = reaFailure;
        this.scmptomOther = scmptomOther;
        this.deathcause = deathcause;
        this.bodyhealth = bodyhealth;
        this.dealmptomother = dealmptomother;
        this.deathdate = deathdate;
        this.remark = remark;
        this.behavior = behavior;
        this.nobehavior = nobehavior;
        this.examinationOther = examinationOther;
        this.followUpMethodCode = followUpMethodCode;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.ConfirmCode = ConfirmCode;
        this.drugs = drugs;
        this.teachDrugs = teachDrugs;
    }

    @Generated(hash = 1169648596)
    public PsyFollowUp() {
    }

    public void setDrugs(List<AbstractEhrHeDrug> drugs) {
        this.drugs = drugs;
    }

    public void setTeachDrugs(List<AbstractEhrHeDrug> teachDrugs) {
        this.teachDrugs = teachDrugs;
    }

    public List<AbstractEhrHeDrug> getListDrugs() {
        return listDrugs;
    }

    public void setListDrugs(List<AbstractEhrHeDrug> listDrugs) {
        this.listDrugs = listDrugs;
    }

    public List<AbstractEhrHeDrug> getListTeachDrugs() {
        return listTeachDrugs;
    }

    public void setListTeachDrugs(List<AbstractEhrHeDrug> listTeachDrugs) {
        this.listTeachDrugs = listTeachDrugs;
    }

    public List<AbstractEhrHeDrug> getDrugs() {
        return drugs;
    }

    public List<AbstractEhrHeDrug> getTeachDrugs() {
        return teachDrugs;
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

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    @Override
    public boolean getCompleted() {
        return completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Date getFollowupDate() {
        return modifydate;
    }

    @Override
    public void setFollowupDate(Date followupDate) {
        followUpDate = followupDate;
    }

    @Override
    public Date getNextFollowupDate() {
        return nextFollowUpDate;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {
        nextFollowUpDate = nextFollowupDate;
    }

    @Override
    public boolean getUpload() {
        return upload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHolergasiaFollowUpNumber() {
        return holergasiaFollowUpNumber;
    }

    public void setHolergasiaFollowUpNumber(String holergasiaFollowUpNumber) {
        this.holergasiaFollowUpNumber = holergasiaFollowUpNumber;
    }

    public String getHolergasiaInfoNumber() {
        return holergasiaInfoNumber;
    }

    public void setHolergasiaInfoNumber(String holergasiaInfoNumber) {
        this.holergasiaInfoNumber = holergasiaInfoNumber;
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

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public String getDangerRatingCode() {
        return dangerRatingCode;
    }

    public void setDangerRatingCode(String dangerRatingCode) {
        this.dangerRatingCode = dangerRatingCode;
    }

    public String getNowSymptomCode() {
        return nowSymptomCode;
    }

    public void setNowSymptomCode(String nowSymptomCode) {
        this.nowSymptomCode = nowSymptomCode;
    }

    public String getNowSymptomName() {
        return nowSymptomName;
    }

    public void setNowSymptomName(String nowSymptomName) {
        this.nowSymptomName = nowSymptomName;
    }

    public String getInsightCode() {
        return insightCode;
    }

    public void setInsightCode(String insightCode) {
        this.insightCode = insightCode;
    }

    public String getSleepCode() {
        return sleepCode;
    }

    public void setSleepCode(String sleepCode) {
        this.sleepCode = sleepCode;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getLifeCode() {
        return lifeCode;
    }

    public void setLifeCode(String lifeCode) {
        this.lifeCode = lifeCode;
    }

    public String getHouseworkCode() {
        return houseworkCode;
    }

    public void setHouseworkCode(String houseworkCode) {
        this.houseworkCode = houseworkCode;
    }

    public String getWorkCode() {
        return workCode;
    }

    public void setWorkCode(String workCode) {
        this.workCode = workCode;
    }

    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
    }

    public String getInterpersonalCode() {
        return interpersonalCode;
    }

    public void setInterpersonalCode(String interpersonalCode) {
        this.interpersonalCode = interpersonalCode;
    }

    public Integer getMildTroubleTime() {
        return mildTroubleTime;
    }

    public void setMildTroubleTime(Integer mildTroubleTime) {
        this.mildTroubleTime = mildTroubleTime;
    }

    public Integer getTroubleTime() {
        return troubleTime;
    }

    public void setTroubleTime(Integer troubleTime) {
        this.troubleTime = troubleTime;
    }

    public Integer getDisasterTime() {
        return disasterTime;
    }

    public void setDisasterTime(Integer disasterTime) {
        this.disasterTime = disasterTime;
    }

    public Integer getAutolesionTime() {
        return autolesionTime;
    }

    public void setAutolesionTime(Integer autolesionTime) {
        this.autolesionTime = autolesionTime;
    }

    public Integer getSuicideTime() {
        return suicideTime;
    }

    public void setSuicideTime(Integer suicideTime) {
        this.suicideTime = suicideTime;
    }

    public String getSocialImpactCode() {
        return socialImpactCode;
    }

    public void setSocialImpactCode(String socialImpactCode) {
        this.socialImpactCode = socialImpactCode;
    }

    public String getCloseLockCode() {
        return closeLockCode;
    }

    public void setCloseLockCode(String closeLockCode) {
        this.closeLockCode = closeLockCode;
    }

    public String getInCode() {
        return inCode;
    }

    public void setInCode(String inCode) {
        this.inCode = inCode;
    }

    public Date getLastLeaveHosDate() {
        return lastLeaveHosDate;
    }

    public void setLastLeaveHosDate(Date lastLeaveHosDate) {
        this.lastLeaveHosDate = lastLeaveHosDate;
    }

    public String getExamFlagCode() {
        return examFlagCode;
    }

    public void setExamFlagCode(String examFlagCode) {
        this.examFlagCode = examFlagCode;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getMedicaCompCode() {
        return medicaCompCode;
    }

    public void setMedicaCompCode(String medicaCompCode) {
        this.medicaCompCode = medicaCompCode;
    }

    public String getAdrFlagCode() {
        return adrFlagCode;
    }

    public void setAdrFlagCode(String adrFlagCode) {
        this.adrFlagCode = adrFlagCode;
    }

    public String getAdrName() {
        return adrName;
    }

    public void setAdrName(String adrName) {
        this.adrName = adrName;
    }

    public String getCureEffectCode() {
        return cureEffectCode;
    }

    public void setCureEffectCode(String cureEffectCode) {
        this.cureEffectCode = cureEffectCode;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
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

    public String getRecoveryCode() {
        return recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }

    public String getRecoveryName() {
        return recoveryName;
    }

    public void setRecoveryName(String recoveryName) {
        this.recoveryName = recoveryName;
    }

    public String getFollowUpClassesCode() {
        return followUpClassesCode;
    }

    public void setFollowUpClassesCode(String followUpClassesCode) {
        this.followUpClassesCode = followUpClassesCode;
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

    public String getReaFailure() {
        return reaFailure;
    }

    public void setReaFailure(String reaFailure) {
        this.reaFailure = reaFailure;
    }

    public String getScmptomOther() {
        return scmptomOther;
    }

    public void setScmptomOther(String scmptomOther) {
        this.scmptomOther = scmptomOther;
    }

    public String getDeathcause() {
        return deathcause;
    }

    public void setDeathcause(String deathcause) {
        this.deathcause = deathcause;
    }

    public String getBodyhealth() {
        return bodyhealth;
    }

    public void setBodyhealth(String bodyhealth) {
        this.bodyhealth = bodyhealth;
    }

    public String getDealmptomother() {
        return dealmptomother;
    }

    public void setDealmptomother(String dealmptomother) {
        this.dealmptomother = dealmptomother;
    }

    public String getDeathdate() {
        return deathdate;
    }

    public void setDeathdate(String deathdate) {
        this.deathdate = deathdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }

    public Long getNobehavior() {
        return nobehavior;
    }

    public void setNobehavior(Long nobehavior) {
        this.nobehavior = nobehavior;
    }

    public String getExaminationOther() {
        return examinationOther;
    }

    public void setExaminationOther(String examinationOther) {
        this.examinationOther = examinationOther;
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


    /**
     * 家庭成员转换
     */
    public static class DrugsConverter implements PropertyConverter<List<AbstractEhrHeDrug>,
            String> {

        @Override
        public List<AbstractEhrHeDrug> convertToEntityProperty(String databaseValue) {
            if (databaseValue == null) {
                return null;
            }
            Type type = new TypeToken<List<AbstractEhrHeDrug>>() {
            }.getType();
            return new Gson().fromJson(databaseValue, type);
        }

        @Override
        public String convertToDatabaseValue(List<AbstractEhrHeDrug> entityProperty) {
            if (entityProperty == null) {
                return null;
            }
            return new Gson().toJson(entityProperty);
        }
    }


}
