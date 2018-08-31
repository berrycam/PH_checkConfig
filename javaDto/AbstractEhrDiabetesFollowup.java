package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import java.util.List;

/**
 * 糖尿病随访表bean
 * Created by DJH on 2018/1/31 0031.
 */
@Entity
public class AbstractEhrDiabetesFollowup extends BaseChildBean{

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
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;

    /**
     * 后台数据库id
     */
    private String id;

    /**
     * 1. [不可空] 糖尿病随访编号
     */
    private String followUpId;

    /**
     * 2. [不可空] 糖尿病专案编号
     */
    private String mangementNo;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 5. [不可空] 随访日期
     */
    private java.util.Date followUpDate;

    /**
     * 6. [不可空] 随访方式代码
     */
    private String followUpMethodCode;

    /**
     * 7. [可空] 症状代码
     */
    private String symptomCode;

    /**
     * 8. [可空] 其他症状名称
     */
    private String symptomsName;

    /**
     * 9. [可空] 收缩压
     */
    private Integer systolicPressure;

    /**
     * 10. [可空] 舒张压
     */
    private Integer diastolicPressure;

    /**
     * 11. [可空] 体重
     */
    private Double weight;

    /**
     * 12. [可空] 体重-目标值
     */
    private Double weightTarget;

    /**
     * 13. [可空] 体质指数
     */
    private Double pmi;

    /**
     * 14. [可空] 体质指数-目标值
     */
    private Double pmiTarget;

    /**
     * 15. [可空] 足背动脉搏动代码
     */
    private String pulsesCode;

    /**
     * 16. [可空] 体征-其他
     */
    private String bodySignOther;

    /**
     * 17. [可空] 日吸烟量
     */
    private Integer smokingDailyAmount;

    /**
     * 18. [可空] 日吸烟量-控制目标
     */
    private Integer smokingDailyAmountTarght;

    /**
     * 19. [可空] 日饮酒量
     */
    private Integer drinkingDailyAmount;

    /**
     * 20. [可空] 日饮酒量-控制目标
     */
    private Integer drinkingDailyAmountTarght;

    /**
     * 21. [可空] 每周运动次数
     */
    private Integer weeklyExerciseTimes;

    /**
     * 22. [可空] 每天运动时间
     */
    private Integer dayExerciseTime;

    /**
     * 23. [可空] 每周运动次数-建议值
     */
    private Integer weeklyExerciseTimesTarget;

    /**
     * 24. [可空] 每天运动时间-建议值
     */
    private Integer dayExerciseTimeTarget;

    /**
     * 25. [可空] 主食
     */
    private Double mainFood;

    /**
     * 26. [可空] 主食-目标
     */
    private Double mainFoodTarget;

    /**
     * 27. [可空] 心理调整代码
     */
    private String psychologicalAdjustmentCode;

    /**
     * 28. [可空] 遵医行为代码
     */
    private String medicalBehaviorCode;

    /**
     * 29. [可空] 空腹血糖值
     */
    private Double fastingBloodGlucose;

    /**
     * 30. [可空] 糖转化血红蛋白
     */
    private Double hemoglobin;

    /**
     * 31. [可空] 检查日期
     */
    private java.util.Date checkDate;

    /**
     * 32. [可空] 其他检查-其他
     */
    private String checkOther;

    /**
     * 33. [可空] 服药依从性代码
     */
    private String medicationComplyCode;

    /**
     * 34. [可空] 药物不良反应状态代码
     */
    private String adverseDrugStateCode;

    /**
     * 35. [可空] 药物不良反应
     */
    private String adverseDrug;

    /**
     * 36. [可空] 低血糖反应代码
     */
    private String hypoglycemiaCode;

    /**
     * 37. [可空] 此次随访分类代码
     */
    private String followUpTypeCode;

    /**
     * 38. [可空] 转诊原因
     */
    private String referralReason;

    /**
     * 39. [可空] 转诊机构编码
     */
    private String referralOrgCode;

    /**
     * 40. [可空] 转诊机构名称
     */
    private String referralOrgName;

    /**
     * 41. [可空] 转诊科室编码
     */
    private String referralDepCode;

    /**
     * 42. [可空] 转诊科室名称
     */
    private String referralDepName;

    /**
     * 43. [可空] 转诊机构及科室
     */
    private String referralOrgDep;

    /**
     * 44. [可空] 下次随访日期
     */
    private java.util.Date nextFollowUpDate;

    /**
     * 45. [可空] 随访医生编码
     */
    private String followUpDoctorCode;

    /**
     * 46. [可空] 随访医生姓名
     */
    private String followUpDoctorName;

    /**
     * 47. [可空] 随访机构编码
     */
    private String followUpOrgCode;

    /**
     * 48. [可空] 随访机构名称
     */
    private String followUpOrgName;

    /**
     * 49. [可空] 登记时间
     */
    private java.util.Date entryDate;

    /**
     * 50. [可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 51. [可空] 登记人员名称
     */
    private String entryEmpName;

    /**
     * 52. [可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 53. [可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 54. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 55. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 56. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    private String updateFlag;

    /**
     * 58. [可空] 修改人
     */
    private String editor;

    /**
     * 59. [可空] 更新日期
     */
    private java.util.Date modifydate;

    /**
     * 60. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 61. [可空] 身高(cm)
     */
    private Double height;

    /**
     * 62. [可空] 消失|
     */
    private String disapppear;

    /**
     * 63. [可空] 减弱|
     */
    private String attenuate;

    /**
     * 64. [可空] 胰岛素种类
     */
    private String insulinType;

    /**
     * 65. [可空] 胰岛素用法用量
     */
    private String insulinUsage;

    /**
     * 66. [可空] 随访分类
     */
    private String followUpClassify;

    /**
     * 67. [可空] 是否需要转诊
     */
    private String isReferral;

    /**
     * 用药情况Json集合
     */
    @Expose
    private String drugsJson;

    /**
     * 证件号码
     */
    private String zjhm;

    public List<AbstractEhrHeDrug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<AbstractEhrHeDrug> drugs) {
        this.drugs = drugs;
    }

    @Transient
    private List<AbstractEhrHeDrug> drugs;

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

    @Generated(hash = 1098190957)
    public AbstractEhrDiabetesFollowup(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String id, String followUpId,
            String mangementNo, String healthfileNo, String fileNumber,
            java.util.Date followUpDate, String followUpMethodCode,
            String symptomCode, String symptomsName, Integer systolicPressure,
            Integer diastolicPressure, Double weight, Double weightTarget,
            Double pmi, Double pmiTarget, String pulsesCode, String bodySignOther,
            Integer smokingDailyAmount, Integer smokingDailyAmountTarght,
            Integer drinkingDailyAmount, Integer drinkingDailyAmountTarght,
            Integer weeklyExerciseTimes, Integer dayExerciseTime,
            Integer weeklyExerciseTimesTarget, Integer dayExerciseTimeTarget,
            Double mainFood, Double mainFoodTarget,
            String psychologicalAdjustmentCode, String medicalBehaviorCode,
            Double fastingBloodGlucose, Double hemoglobin, java.util.Date checkDate,
            String checkOther, String medicationComplyCode,
            String adverseDrugStateCode, String adverseDrug,
            String hypoglycemiaCode, String followUpTypeCode, String referralReason,
            String referralOrgCode, String referralOrgName, String referralDepCode,
            String referralDepName, String referralOrgDep,
            java.util.Date nextFollowUpDate, String followUpDoctorCode,
            String followUpDoctorName, String followUpOrgCode,
            String followUpOrgName, java.util.Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName,
            String orgCode, java.util.Date uploadDate, String updateFlag,
            String editor, java.util.Date modifydate, String fdataFrom,
            Double height, String disapppear, String attenuate, String insulinType,
            String insulinUsage, String followUpClassify, String isReferral,
            String drugsJson, String zjhm, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.id = id;
        this.followUpId = followUpId;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.followUpDate = followUpDate;
        this.followUpMethodCode = followUpMethodCode;
        this.symptomCode = symptomCode;
        this.symptomsName = symptomsName;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.weight = weight;
        this.weightTarget = weightTarget;
        this.pmi = pmi;
        this.pmiTarget = pmiTarget;
        this.pulsesCode = pulsesCode;
        this.bodySignOther = bodySignOther;
        this.smokingDailyAmount = smokingDailyAmount;
        this.smokingDailyAmountTarght = smokingDailyAmountTarght;
        this.drinkingDailyAmount = drinkingDailyAmount;
        this.drinkingDailyAmountTarght = drinkingDailyAmountTarght;
        this.weeklyExerciseTimes = weeklyExerciseTimes;
        this.dayExerciseTime = dayExerciseTime;
        this.weeklyExerciseTimesTarget = weeklyExerciseTimesTarget;
        this.dayExerciseTimeTarget = dayExerciseTimeTarget;
        this.mainFood = mainFood;
        this.mainFoodTarget = mainFoodTarget;
        this.psychologicalAdjustmentCode = psychologicalAdjustmentCode;
        this.medicalBehaviorCode = medicalBehaviorCode;
        this.fastingBloodGlucose = fastingBloodGlucose;
        this.hemoglobin = hemoglobin;
        this.checkDate = checkDate;
        this.checkOther = checkOther;
        this.medicationComplyCode = medicationComplyCode;
        this.adverseDrugStateCode = adverseDrugStateCode;
        this.adverseDrug = adverseDrug;
        this.hypoglycemiaCode = hypoglycemiaCode;
        this.followUpTypeCode = followUpTypeCode;
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
        this.height = height;
        this.disapppear = disapppear;
        this.attenuate = attenuate;
        this.insulinType = insulinType;
        this.insulinUsage = insulinUsage;
        this.followUpClassify = followUpClassify;
        this.isReferral = isReferral;
        this.drugsJson = drugsJson;
        this.zjhm = zjhm;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 2138890681)
    public AbstractEhrDiabetesFollowup() {
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

    public String getFollowUpId() {
        return this.followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId;
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

    public java.util.Date getFollowUpDate() {
        return this.followUpDate;
    }

    public void setFollowUpDate(java.util.Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public String getFollowUpMethodCode() {
        return this.followUpMethodCode;
    }

    public void setFollowUpMethodCode(String followUpMethodCode) {
        this.followUpMethodCode = followUpMethodCode;
    }

    public String getSymptomCode() {
        return this.symptomCode;
    }

    public void setSymptomCode(String symptomCode) {
        this.symptomCode = symptomCode;
    }

    public String getSymptomsName() {
        return this.symptomsName;
    }

    public void setSymptomsName(String symptomsName) {
        this.symptomsName = symptomsName;
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

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeightTarget() {
        return this.weightTarget;
    }

    public void setWeightTarget(Double weightTarget) {
        this.weightTarget = weightTarget;
    }

    public Double getPmi() {
        return this.pmi;
    }

    public void setPmi(Double pmi) {
        this.pmi = pmi;
    }

    public Double getPmiTarget() {
        return this.pmiTarget;
    }

    public void setPmiTarget(Double pmiTarget) {
        this.pmiTarget = pmiTarget;
    }

    public String getPulsesCode() {
        return this.pulsesCode;
    }

    public void setPulsesCode(String pulsesCode) {
        this.pulsesCode = pulsesCode;
    }

    public String getBodySignOther() {
        return this.bodySignOther;
    }

    public void setBodySignOther(String bodySignOther) {
        this.bodySignOther = bodySignOther;
    }

    public Integer getSmokingDailyAmount() {
        return this.smokingDailyAmount;
    }

    public void setSmokingDailyAmount(Integer smokingDailyAmount) {
        this.smokingDailyAmount = smokingDailyAmount;
    }

    public Integer getSmokingDailyAmountTarght() {
        return this.smokingDailyAmountTarght;
    }

    public void setSmokingDailyAmountTarght(Integer smokingDailyAmountTarght) {
        this.smokingDailyAmountTarght = smokingDailyAmountTarght;
    }

    public Integer getDrinkingDailyAmount() {
        return this.drinkingDailyAmount;
    }

    public void setDrinkingDailyAmount(Integer drinkingDailyAmount) {
        this.drinkingDailyAmount = drinkingDailyAmount;
    }

    public Integer getDrinkingDailyAmountTarght() {
        return this.drinkingDailyAmountTarght;
    }

    public void setDrinkingDailyAmountTarght(Integer drinkingDailyAmountTarght) {
        this.drinkingDailyAmountTarght = drinkingDailyAmountTarght;
    }

    public Integer getWeeklyExerciseTimes() {
        return this.weeklyExerciseTimes;
    }

    public void setWeeklyExerciseTimes(Integer weeklyExerciseTimes) {
        this.weeklyExerciseTimes = weeklyExerciseTimes;
    }

    public Integer getDayExerciseTime() {
        return this.dayExerciseTime;
    }

    public void setDayExerciseTime(Integer dayExerciseTime) {
        this.dayExerciseTime = dayExerciseTime;
    }

    public Integer getWeeklyExerciseTimesTarget() {
        return this.weeklyExerciseTimesTarget;
    }

    public void setWeeklyExerciseTimesTarget(Integer weeklyExerciseTimesTarget) {
        this.weeklyExerciseTimesTarget = weeklyExerciseTimesTarget;
    }

    public Integer getDayExerciseTimeTarget() {
        return this.dayExerciseTimeTarget;
    }

    public void setDayExerciseTimeTarget(Integer dayExerciseTimeTarget) {
        this.dayExerciseTimeTarget = dayExerciseTimeTarget;
    }

    public Double getMainFood() {
        return this.mainFood;
    }

    public void setMainFood(Double mainFood) {
        this.mainFood = mainFood;
    }

    public Double getMainFoodTarget() {
        return this.mainFoodTarget;
    }

    public void setMainFoodTarget(Double mainFoodTarget) {
        this.mainFoodTarget = mainFoodTarget;
    }

    public String getPsychologicalAdjustmentCode() {
        return this.psychologicalAdjustmentCode;
    }

    public void setPsychologicalAdjustmentCode(String psychologicalAdjustmentCode) {
        this.psychologicalAdjustmentCode = psychologicalAdjustmentCode;
    }

    public String getMedicalBehaviorCode() {
        return this.medicalBehaviorCode;
    }

    public void setMedicalBehaviorCode(String medicalBehaviorCode) {
        this.medicalBehaviorCode = medicalBehaviorCode;
    }

    public Double getFastingBloodGlucose() {
        return this.fastingBloodGlucose;
    }

    public void setFastingBloodGlucose(Double fastingBloodGlucose) {
        this.fastingBloodGlucose = fastingBloodGlucose;
    }

    public Double getHemoglobin() {
        return this.hemoglobin;
    }

    public void setHemoglobin(Double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public java.util.Date getCheckDate() {
        return this.checkDate;
    }

    public void setCheckDate(java.util.Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckOther() {
        return this.checkOther;
    }

    public void setCheckOther(String checkOther) {
        this.checkOther = checkOther;
    }

    public String getMedicationComplyCode() {
        return this.medicationComplyCode;
    }

    public void setMedicationComplyCode(String medicationComplyCode) {
        this.medicationComplyCode = medicationComplyCode;
    }

    public String getAdverseDrugStateCode() {
        return this.adverseDrugStateCode;
    }

    public void setAdverseDrugStateCode(String adverseDrugStateCode) {
        this.adverseDrugStateCode = adverseDrugStateCode;
    }

    public String getAdverseDrug() {
        return this.adverseDrug;
    }

    public void setAdverseDrug(String adverseDrug) {
        this.adverseDrug = adverseDrug;
    }

    public String getHypoglycemiaCode() {
        return this.hypoglycemiaCode;
    }

    public void setHypoglycemiaCode(String hypoglycemiaCode) {
        this.hypoglycemiaCode = hypoglycemiaCode;
    }

    public String getFollowUpTypeCode() {
        return this.followUpTypeCode;
    }

    public void setFollowUpTypeCode(String followUpTypeCode) {
        this.followUpTypeCode = followUpTypeCode;
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

    public java.util.Date getNextFollowUpDate() {
        return this.nextFollowUpDate;
    }

    public void setNextFollowUpDate(java.util.Date nextFollowUpDate) {
        this.nextFollowUpDate = nextFollowUpDate;
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

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getInsulinType() {
        return this.insulinType;
    }

    public void setInsulinType(String insulinType) {
        this.insulinType = insulinType;
    }

    public String getInsulinUsage() {
        return this.insulinUsage;
    }

    public void setInsulinUsage(String insulinUsage) {
        this.insulinUsage = insulinUsage;
    }

    public String getDrugsJson() {
        return this.drugsJson;
    }

    public void setDrugsJson(String drugsJson) {
        this.drugsJson = drugsJson;
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

    public String getDisapppear() {
        return this.disapppear;
    }

    public void setDisapppear(String disapppear) {
        this.disapppear = disapppear;
    }

    public String getAttenuate() {
        return this.attenuate;
    }

    public void setAttenuate(String attenuate) {
        this.attenuate = attenuate;
    }

    public String getFollowUpClassify() {
        return this.followUpClassify;
    }

    public void setFollowUpClassify(String followUpClassify) {
        this.followUpClassify = followUpClassify;
    }

    public String getIsReferral() {
        return this.isReferral;
    }

    public void setIsReferral(String isReferral) {
        this.isReferral = isReferral;
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

    public String getZjhm() {
        return this.zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
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
