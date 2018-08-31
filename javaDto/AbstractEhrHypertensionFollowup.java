// CHECKSTYLE:OFF

package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 高血压患者随访记录类。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String followUpId 高血压随访编号
 * 2. [不可空] String mangementNo 高血压专案编号
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [不可空] java.util.Date followUpDate 随访日期
 * 6. [不可空] String followUpMethodCode 随访方式代码
 * 7. [可空] String symptomCode 症状代码
 * 8. [可空] String symptomsName 其他症状名称
 * 9. [可空] Integer systolicPressure 收缩压
 * 10. [可空] Integer diastolicPressure 舒张压
 * 11. [可空] Double weight 体重
 * 12. [可空] Double weightTarget 体重-目标值
 * 13. [可空] Double pmi 体质指数
 * 14. [可空] Double pmiTarget 体质指数-目标值
 * 15. [可空] Double heartRate 心率
 * 16. [可空] String bodySignOther 体征-其他
 * 17. [可空] Double smokingDailyAmount 日吸烟量
 * 18. [可空] Double smokingDailyAmountTarght 日吸烟量-控制目标
 * 19. [可空] Double drinkingDailyAmount 日饮酒量
 * 20. [可空] Double drinkingDailyAmountTarght 日饮酒量-控制目标
 * 21. [可空] Double weeklyExerciseTimes 每周运动次数
 * 22. [可空] Double dayExerciseTime 每天运动时间
 * 23. [可空] Double weeklyExerciseTimesTarget 每周运动次数-建议值
 * 24. [可空] Double dayExerciseTimeTarget 每天运动时间-建议值
 * 25. [可空] String saltStateCode 摄盐情况代码
 * 26. [可空] String saltStateCodeTarget 摄盐情况代码-建议值
 * 27. [可空] String psychologicalAdjustmentCode 心理调整代码
 * 28. [可空] String medicalBehaviorCode 遵医行为代码
 * 29. [可空] String auxiliaryExamination 辅助检查
 * 30. [可空] String medicationComplyCode 服药依从性代码
 * 31. [可空] String adverseDrugStateCode 药物不良反应状态代码
 * 32. [可空] String adverseDrug 药物不良反应
 * 33. [可空] String followUpTypeCode 此次随访分类代码
 * 34. [可空] String referralReason 转诊原因
 * 35. [可空] String referralOrgCode 转诊机构编码
 * 36. [可空] String referralOrgName 转诊机构名称
 * 37. [可空] String referralDepCode 转诊科室编码
 * 38. [可空] String referralDepName 转诊科室名称
 * 39. [可空] String referralOrgDep 转诊机构及科室
 * 40. [可空] java.util.Date nextFollowUpDate 下次随访日期
 * 41. [可空] String followUpDoctorCode 随访医生编码
 * 42. [可空] String followUpDoctorName 随访医生姓名
 * 43. [可空] String followUpOrgCode 随访机构编码
 * 44. [可空] String followUpOrgName 随访机构名称
 * 45. [可空] java.util.Date entryDate 登记时间
 * 46. [可空] String entryEmpCode 登记人员编码
 * 47. [可空] String entryEmpName 登记人员名称
 * 48. [可空] String entryOrgCode 登记机构编码
 * 49. [可空] String entryOrgName 登记机构名称
 * 50. [不可空] String orgCode 医疗机构代码
 * 51. [不可空] java.util.Date uploadDate 填报日期
 * 52. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 53. [主键] String id 主键
 * 54. [可空] String editor 修改人
 * 55. [可空] java.util.Date modifydate 更新日期
 * 56. [可空] Double height 身高(cm)
 * 57. [不可空] String dataFrom 数据来源
 * @author Benewit Code Generator V1.0
 */
@Entity
public class AbstractEhrHypertensionFollowup {

    /**
     * 本地id
     */
    @Id(autoincrement = true)
    @Expose
    public Long localId;

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
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;
    /**
     * 后台id
     */
    private String id;

    /**
     * 1. [不可空] 高血压随访编号
     */
    protected String followUpId;

    /**
     * 2. [不可空] 高血压专案编号
     */
    protected String mangementNo;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 5. [不可空] 随访日期
     */
    protected java.util.Date followUpDate;

    /**
     * 6. [不可空] 随访方式代码
     */
    protected String followUpMethodCode;

    /**
     * 7. [可空] 症状代码
     */
    protected String symptomCode;

    /**
     * 8. [可空] 其他症状名称
     */
    protected String symptomsName;

    /**
     * 9. [可空] 收缩压
     */
    protected Integer systolicPressure;

    /**
     * 10. [可空] 舒张压
     */
    protected Integer diastolicPressure;

    /**
     * 11. [可空] 体重
     */
    protected Double weight;

    /**
     * 12. [可空] 体重-目标值
     */
    protected String weightTarget;

    /**
     * 13. [可空] 体质指数
     */
    protected Double pmi;

    /**
     * 14. [可空] 体质指数-目标值
     */
    protected Double pmiTarget;

    /**
     * 15. [可空] 心率
     */
    protected Double heartRate;

    /**
     * 16. [可空] 体征-其他
     */
    protected String bodySignOther;

    /**
     * 17. [可空] 日吸烟量
     */
    protected Double smokingDailyAmount;

    /**
     * 18. [可空] 日吸烟量-控制目标
     */
    protected Double smokingDailyAmountTarght;

    /**
     * 19. [可空] 日饮酒量
     */
    protected Double drinkingDailyAmount;

    /**
     * 20. [可空] 日饮酒量-控制目标
     */
    protected Double drinkingDailyAmountTarght;

    /**
     * 21. [可空] 每周运动次数
     */
    protected Double weeklyExerciseTimes;

    /**
     * 22. [可空] 每天运动时间
     */
    protected Double dayExerciseTime;

    /**
     * 23. [可空] 每周运动次数-建议值
     */
    protected Double weeklyExerciseTimesTarget;

    /**
     * 24. [可空] 每天运动时间-建议值
     */
    protected Double dayExerciseTimeTarget;

    /**
     * 25. [可空] 摄盐情况代码
     */
    protected String saltStateCode;

    /**
     * 26. [可空] 摄盐情况代码-建议值
     */
    protected String saltStateCodeTarget;

    /**
     * 27. [可空] 心理调整代码
     */
    protected String psychologicalAdjustmentCode;

    /**
     * 28. [可空] 遵医行为代码
     */
    protected String medicalBehaviorCode;

    /**
     * 29. [可空] 辅助检查
     */
    protected String auxiliaryExamination;

    /**
     * 30. [可空] 服药依从性代码
     */
    protected String medicationComplyCode;

    /**
     * 31. [可空] 药物不良反应状态代码
     */
    protected String adverseDrugStateCode;

    /**
     * 32. [可空] 药物不良反应
     */
    protected String adverseDrug;

    /**
     * 33. [可空] 此次随访分类代码
     */
    protected String followUpTypeCode;

    /**
     * 34. [可空] 转诊原因
     */
    protected String referralReason;

    /**
     * 35. [可空] 转诊机构编码
     */
    protected String referralOrgCode;

    /**
     * 36. [可空] 转诊机构名称
     */
    protected String referralOrgName;

    /**
     * 37. [可空] 转诊科室编码
     */
    protected String referralDepCode;

    /**
     * 38. [可空] 转诊科室名称
     */
    protected String referralDepName;

    /**
     * 39. [可空] 转诊机构及科室
     */
    protected String referralOrgDep;

    /**
     * 40. [可空] 下次随访日期
     */
    protected java.util.Date nextFollowUpDate;

    /**
     * 41. [可空] 随访医生编码
     */
    protected String followUpDoctorCode;

    /**
     * 42. [可空] 随访医生姓名
     */
    protected String followUpDoctorName;

    /**
     * 43. [可空] 随访机构编码
     */
    protected String followUpOrgCode;

    /**
     * 44. [可空] 随访机构名称
     */
    protected String followUpOrgName;

    /**
     * 45. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 46. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 47. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 48. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 49. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 50. [不可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 51. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 52. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    protected String updateFlag;

    /**
     * 54. [可空] 修改人
     */
    protected String editor;

    /**
     * 55. [可空] 更新日期
     */
    protected java.util.Date modifydate;

    /**
     * 56. [可空] 身高(cm)
     */
    protected Double height;

    /**
     * 57. [不可空] 数据来源
     */
    protected String fdataFrom;

    /**
     * 是否上传
     */
    @Expose // 不需要 Gson 解析
    private boolean upload = false;

    /**
     * 用药情况Json集合
     */
    @Expose
    private String drugsJson;

    @Transient
    private List<AbstractEhrHeDrug> drugs;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 173138570)
    public AbstractEhrHypertensionFollowup(Long localId, String idCard,
            String vipCard, boolean completed, String id, String followUpId,
            String mangementNo, String healthfileNo, String fileNumber,
            java.util.Date followUpDate, String followUpMethodCode,
            String symptomCode, String symptomsName, Integer systolicPressure,
            Integer diastolicPressure, Double weight, String weightTarget,
            Double pmi, Double pmiTarget, Double heartRate, String bodySignOther,
            Double smokingDailyAmount, Double smokingDailyAmountTarght,
            Double drinkingDailyAmount, Double drinkingDailyAmountTarght,
            Double weeklyExerciseTimes, Double dayExerciseTime,
            Double weeklyExerciseTimesTarget, Double dayExerciseTimeTarget,
            String saltStateCode, String saltStateCodeTarget,
            String psychologicalAdjustmentCode, String medicalBehaviorCode,
            String auxiliaryExamination, String medicationComplyCode,
            String adverseDrugStateCode, String adverseDrug,
            String followUpTypeCode, String referralReason, String referralOrgCode,
            String referralOrgName, String referralDepCode, String referralDepName,
            String referralOrgDep, java.util.Date nextFollowUpDate,
            String followUpDoctorCode, String followUpDoctorName,
            String followUpOrgCode, String followUpOrgName,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String updateFlag, String editor,
            java.util.Date modifydate, Double height, String fdataFrom,
            boolean upload, String drugsJson, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
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
        this.heartRate = heartRate;
        this.bodySignOther = bodySignOther;
        this.smokingDailyAmount = smokingDailyAmount;
        this.smokingDailyAmountTarght = smokingDailyAmountTarght;
        this.drinkingDailyAmount = drinkingDailyAmount;
        this.drinkingDailyAmountTarght = drinkingDailyAmountTarght;
        this.weeklyExerciseTimes = weeklyExerciseTimes;
        this.dayExerciseTime = dayExerciseTime;
        this.weeklyExerciseTimesTarget = weeklyExerciseTimesTarget;
        this.dayExerciseTimeTarget = dayExerciseTimeTarget;
        this.saltStateCode = saltStateCode;
        this.saltStateCodeTarget = saltStateCodeTarget;
        this.psychologicalAdjustmentCode = psychologicalAdjustmentCode;
        this.medicalBehaviorCode = medicalBehaviorCode;
        this.auxiliaryExamination = auxiliaryExamination;
        this.medicationComplyCode = medicationComplyCode;
        this.adverseDrugStateCode = adverseDrugStateCode;
        this.adverseDrug = adverseDrug;
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
        this.height = height;
        this.fdataFrom = fdataFrom;
        this.upload = upload;
        this.drugsJson = drugsJson;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1737755381)
    public AbstractEhrHypertensionFollowup() {
    }

    /**
     * 获取followUpId的值
     * @return followUpId followUpId值
     */
    public String getFollowUpId() {
        return followUpId;
    }

    /**
     * 设置followUpId的值
     * @param followUpId followUpId值
     */
    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId;
    }

    /**
     * 获取mangementNo的值
     * @return mangementNo mangementNo值
     */
    public String getMangementNo() {
        return mangementNo;
    }

    /**
     * 设置mangementNo的值
     * @param mangementNo mangementNo值
     */
    public void setMangementNo(String mangementNo) {
        this.mangementNo = mangementNo;
    }

    /**
     * 获取healthfileNo的值
     * @return healthfileNo healthfileNo值
     */
    public String getHealthfileNo() {
        return healthfileNo;
    }

    /**
     * 设置healthfileNo的值
     * @param healthfileNo healthfileNo值
     */
    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    /**
     * 获取fileNumber的值
     * @return fileNumber fileNumber值
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置fileNumber的值
     * @param fileNumber fileNumber值
     */
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取followUpDate的值
     * @return followUpDate followUpDate值
     */
    public Date getFollowUpDate() {
        return followUpDate;
    }

    /**
     * 设置followUpDate的值
     * @param followUpDate followUpDate值
     */
    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    /**
     * 获取followUpMethodCode的值
     * @return followUpMethodCode followUpMethodCode值
     */
    public String getFollowUpMethodCode() {
        return followUpMethodCode;
    }

    /**
     * 设置followUpMethodCode的值
     * @param followUpMethodCode followUpMethodCode值
     */
    public void setFollowUpMethodCode(String followUpMethodCode) {
        this.followUpMethodCode = followUpMethodCode;
    }

    /**
     * 获取symptomCode的值
     * @return symptomCode symptomCode值
     */
    public String getSymptomCode() {
        return symptomCode;
    }

    /**
     * 设置symptomCode的值
     * @param symptomCode symptomCode值
     */
    public void setSymptomCode(String symptomCode) {
        this.symptomCode = symptomCode;
    }

    /**
     * 获取symptomsName的值
     * @return symptomsName symptomsName值
     */
    public String getSymptomsName() {
        return symptomsName;
    }

    /**
     * 设置symptomsName的值
     * @param symptomsName symptomsName值
     */
    public void setSymptomsName(String symptomsName) {
        this.symptomsName = symptomsName;
    }

    /**
     * 获取systolicPressure的值
     * @return systolicPressure systolicPressure值
     */
    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    /**
     * 设置systolicPressure的值
     * @param systolicPressure systolicPressure值
     */
    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    /**
     * 获取diastolicPressure的值
     * @return diastolicPressure diastolicPressure值
     */
    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    /**
     * 设置diastolicPressure的值
     * @param diastolicPressure diastolicPressure值
     */
    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    /**
     * 获取weight的值
     * @return weight weight值
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置weight的值
     * @param weight weight值
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 获取weightTarget的值
     * @return weightTarget weightTarget值
     */
    public String getWeightTarget() {
        return weightTarget;
    }

    /**
     * 设置weightTarget的值
     * @param weightTarget weightTarget值
     */
    public void setWeightTarget(String weightTarget) {
        this.weightTarget = weightTarget;
    }

    /**
     * 获取pmi的值
     * @return pmi pmi值
     */
    public Double getPmi() {
        return pmi;
    }

    /**
     * 设置pmi的值
     * @param pmi pmi值
     */
    public void setPmi(Double pmi) {
        this.pmi = pmi;
    }

    /**
     * 获取pmiTarget的值
     * @return pmiTarget pmiTarget值
     */
    public Double getPmiTarget() {
        return pmiTarget;
    }

    /**
     * 设置pmiTarget的值
     * @param pmiTarget pmiTarget值
     */
    public void setPmiTarget(Double pmiTarget) {
        this.pmiTarget = pmiTarget;
    }

    /**
     * 获取heartRate的值
     * @return heartRate heartRate值
     */
    public Double getHeartRate() {
        return heartRate;
    }

    /**
     * 设置heartRate的值
     * @param heartRate heartRate值
     */
    public void setHeartRate(Double heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * 获取bodySignOther的值
     * @return bodySignOther bodySignOther值
     */
    public String getBodySignOther() {
        return bodySignOther;
    }

    /**
     * 设置bodySignOther的值
     * @param bodySignOther bodySignOther值
     */
    public void setBodySignOther(String bodySignOther) {
        this.bodySignOther = bodySignOther;
    }

    /**
     * 获取smokingDailyAmount的值
     * @return smokingDailyAmount smokingDailyAmount值
     */
    public Double getSmokingDailyAmount() {
        return smokingDailyAmount;
    }

    /**
     * 设置smokingDailyAmount的值
     * @param smokingDailyAmount smokingDailyAmount值
     */
    public void setSmokingDailyAmount(Double smokingDailyAmount) {
        this.smokingDailyAmount = smokingDailyAmount;
    }

    /**
     * 获取smokingDailyAmountTarght的值
     * @return smokingDailyAmountTarght smokingDailyAmountTarght值
     */
    public Double getSmokingDailyAmountTarght() {
        return smokingDailyAmountTarght;
    }

    /**
     * 设置smokingDailyAmountTarght的值
     * @param smokingDailyAmountTarght smokingDailyAmountTarght值
     */
    public void setSmokingDailyAmountTarght(Double smokingDailyAmountTarght) {
        this.smokingDailyAmountTarght = smokingDailyAmountTarght;
    }

    /**
     * 获取drinkingDailyAmount的值
     * @return drinkingDailyAmount drinkingDailyAmount值
     */
    public Double getDrinkingDailyAmount() {
        return drinkingDailyAmount;
    }

    /**
     * 设置drinkingDailyAmount的值
     * @param drinkingDailyAmount drinkingDailyAmount值
     */
    public void setDrinkingDailyAmount(Double drinkingDailyAmount) {
        this.drinkingDailyAmount = drinkingDailyAmount;
    }

    /**
     * 获取drinkingDailyAmountTarght的值
     * @return drinkingDailyAmountTarght drinkingDailyAmountTarght值
     */
    public Double getDrinkingDailyAmountTarght() {
        return drinkingDailyAmountTarght;
    }

    /**
     * 设置drinkingDailyAmountTarght的值
     * @param drinkingDailyAmountTarght drinkingDailyAmountTarght值
     */
    public void setDrinkingDailyAmountTarght(Double drinkingDailyAmountTarght) {
        this.drinkingDailyAmountTarght = drinkingDailyAmountTarght;
    }

    /**
     * 获取weeklyExerciseTimes的值
     * @return weeklyExerciseTimes weeklyExerciseTimes值
     */
    public Double getWeeklyExerciseTimes() {
        return weeklyExerciseTimes;
    }

    /**
     * 设置weeklyExerciseTimes的值
     * @param weeklyExerciseTimes weeklyExerciseTimes值
     */
    public void setWeeklyExerciseTimes(Double weeklyExerciseTimes) {
        this.weeklyExerciseTimes = weeklyExerciseTimes;
    }

    /**
     * 获取dayExerciseTime的值
     * @return dayExerciseTime dayExerciseTime值
     */
    public Double getDayExerciseTime() {
        return dayExerciseTime;
    }

    /**
     * 设置dayExerciseTime的值
     * @param dayExerciseTime dayExerciseTime值
     */
    public void setDayExerciseTime(Double dayExerciseTime) {
        this.dayExerciseTime = dayExerciseTime;
    }

    /**
     * 获取weeklyExerciseTimesTarget的值
     * @return weeklyExerciseTimesTarget weeklyExerciseTimesTarget值
     */
    public Double getWeeklyExerciseTimesTarget() {
        return weeklyExerciseTimesTarget;
    }

    /**
     * 设置weeklyExerciseTimesTarget的值
     * @param weeklyExerciseTimesTarget weeklyExerciseTimesTarget值
     */
    public void setWeeklyExerciseTimesTarget(Double weeklyExerciseTimesTarget) {
        this.weeklyExerciseTimesTarget = weeklyExerciseTimesTarget;
    }

    /**
     * 获取dayExerciseTimeTarget的值
     * @return dayExerciseTimeTarget dayExerciseTimeTarget值
     */
    public Double getDayExerciseTimeTarget() {
        return dayExerciseTimeTarget;
    }

    /**
     * 设置dayExerciseTimeTarget的值
     * @param dayExerciseTimeTarget dayExerciseTimeTarget值
     */
    public void setDayExerciseTimeTarget(Double dayExerciseTimeTarget) {
        this.dayExerciseTimeTarget = dayExerciseTimeTarget;
    }

    /**
     * 获取saltStateCode的值
     * @return saltStateCode saltStateCode值
     */
    public String getSaltStateCode() {
        return saltStateCode;
    }

    /**
     * 设置saltStateCode的值
     * @param saltStateCode saltStateCode值
     */
    public void setSaltStateCode(String saltStateCode) {
        this.saltStateCode = saltStateCode;
    }

    /**
     * 获取saltStateCodeTarget的值
     * @return saltStateCodeTarget saltStateCodeTarget值
     */
    public String getSaltStateCodeTarget() {
        return saltStateCodeTarget;
    }

    /**
     * 设置saltStateCodeTarget的值
     * @param saltStateCodeTarget saltStateCodeTarget值
     */
    public void setSaltStateCodeTarget(String saltStateCodeTarget) {
        this.saltStateCodeTarget = saltStateCodeTarget;
    }

    /**
     * 获取psychologicalAdjustmentCode的值
     * @return psychologicalAdjustmentCode psychologicalAdjustmentCode值
     */
    public String getPsychologicalAdjustmentCode() {
        return psychologicalAdjustmentCode;
    }

    /**
     * 设置psychologicalAdjustmentCode的值
     * @param psychologicalAdjustmentCode psychologicalAdjustmentCode值
     */
    public void setPsychologicalAdjustmentCode(String psychologicalAdjustmentCode) {
        this.psychologicalAdjustmentCode = psychologicalAdjustmentCode;
    }

    /**
     * 获取medicalBehaviorCode的值
     * @return medicalBehaviorCode medicalBehaviorCode值
     */
    public String getMedicalBehaviorCode() {
        return medicalBehaviorCode;
    }

    /**
     * 设置medicalBehaviorCode的值
     * @param medicalBehaviorCode medicalBehaviorCode值
     */
    public void setMedicalBehaviorCode(String medicalBehaviorCode) {
        this.medicalBehaviorCode = medicalBehaviorCode;
    }

    /**
     * 获取auxiliaryExamination的值
     * @return auxiliaryExamination auxiliaryExamination值
     */
    public String getAuxiliaryExamination() {
        return auxiliaryExamination;
    }

    /**
     * 设置auxiliaryExamination的值
     * @param auxiliaryExamination auxiliaryExamination值
     */
    public void setAuxiliaryExamination(String auxiliaryExamination) {
        this.auxiliaryExamination = auxiliaryExamination;
    }

    /**
     * 获取medicationComplyCode的值
     * @return medicationComplyCode medicationComplyCode值
     */
    public String getMedicationComplyCode() {
        return medicationComplyCode;
    }

    /**
     * 设置medicationComplyCode的值
     * @param medicationComplyCode medicationComplyCode值
     */
    public void setMedicationComplyCode(String medicationComplyCode) {
        this.medicationComplyCode = medicationComplyCode;
    }

    /**
     * 获取adverseDrugStateCode的值
     * @return adverseDrugStateCode adverseDrugStateCode值
     */
    public String getAdverseDrugStateCode() {
        return adverseDrugStateCode;
    }

    /**
     * 设置adverseDrugStateCode的值
     * @param adverseDrugStateCode adverseDrugStateCode值
     */
    public void setAdverseDrugStateCode(String adverseDrugStateCode) {
        this.adverseDrugStateCode = adverseDrugStateCode;
    }

    /**
     * 获取adverseDrug的值
     * @return adverseDrug adverseDrug值
     */
    public String getAdverseDrug() {
        return adverseDrug;
    }

    /**
     * 设置adverseDrug的值
     * @param adverseDrug adverseDrug值
     */
    public void setAdverseDrug(String adverseDrug) {
        this.adverseDrug = adverseDrug;
    }

    /**
     * 获取followUpTypeCode的值
     * @return followUpTypeCode followUpTypeCode值
     */
    public String getFollowUpTypeCode() {
        return followUpTypeCode;
    }

    /**
     * 设置followUpTypeCode的值
     * @param followUpTypeCode followUpTypeCode值
     */
    public void setFollowUpTypeCode(String followUpTypeCode) {
        this.followUpTypeCode = followUpTypeCode;
    }

    /**
     * 获取referralReason的值
     * @return referralReason referralReason值
     */
    public String getReferralReason() {
        return referralReason;
    }

    /**
     * 设置referralReason的值
     * @param referralReason referralReason值
     */
    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    /**
     * 获取referralOrgCode的值
     * @return referralOrgCode referralOrgCode值
     */
    public String getReferralOrgCode() {
        return referralOrgCode;
    }

    /**
     * 设置referralOrgCode的值
     * @param referralOrgCode referralOrgCode值
     */
    public void setReferralOrgCode(String referralOrgCode) {
        this.referralOrgCode = referralOrgCode;
    }

    /**
     * 获取referralOrgName的值
     * @return referralOrgName referralOrgName值
     */
    public String getReferralOrgName() {
        return referralOrgName;
    }

    /**
     * 设置referralOrgName的值
     * @param referralOrgName referralOrgName值
     */
    public void setReferralOrgName(String referralOrgName) {
        this.referralOrgName = referralOrgName;
    }

    /**
     * 获取referralDepCode的值
     * @return referralDepCode referralDepCode值
     */
    public String getReferralDepCode() {
        return referralDepCode;
    }

    /**
     * 设置referralDepCode的值
     * @param referralDepCode referralDepCode值
     */
    public void setReferralDepCode(String referralDepCode) {
        this.referralDepCode = referralDepCode;
    }

    /**
     * 获取referralDepName的值
     * @return referralDepName referralDepName值
     */
    public String getReferralDepName() {
        return referralDepName;
    }

    /**
     * 设置referralDepName的值
     * @param referralDepName referralDepName值
     */
    public void setReferralDepName(String referralDepName) {
        this.referralDepName = referralDepName;
    }

    /**
     * 获取referralOrgDep的值
     * @return referralOrgDep referralOrgDep值
     */
    public String getReferralOrgDep() {
        return referralOrgDep;
    }

    /**
     * 设置referralOrgDep的值
     * @param referralOrgDep referralOrgDep值
     */
    public void setReferralOrgDep(String referralOrgDep) {
        this.referralOrgDep = referralOrgDep;
    }

    /**
     * 获取nextFollowUpDate的值
     * @return nextFollowUpDate nextFollowUpDate值
     */
    public Date getNextFollowUpDate() {
        return nextFollowUpDate;
    }

    /**
     * 设置nextFollowUpDate的值
     * @param nextFollowUpDate nextFollowUpDate值
     */
    public void setNextFollowUpDate(Date nextFollowUpDate) {
        this.nextFollowUpDate = nextFollowUpDate;
    }

    /**
     * 获取followUpDoctorCode的值
     * @return followUpDoctorCode followUpDoctorCode值
     */
    public String getFollowUpDoctorCode() {
        return followUpDoctorCode;
    }

    /**
     * 设置followUpDoctorCode的值
     * @param followUpDoctorCode followUpDoctorCode值
     */
    public void setFollowUpDoctorCode(String followUpDoctorCode) {
        this.followUpDoctorCode = followUpDoctorCode;
    }

    /**
     * 获取followUpDoctorName的值
     * @return followUpDoctorName followUpDoctorName值
     */
    public String getFollowUpDoctorName() {
        return followUpDoctorName;
    }

    /**
     * 设置followUpDoctorName的值
     * @param followUpDoctorName followUpDoctorName值
     */
    public void setFollowUpDoctorName(String followUpDoctorName) {
        this.followUpDoctorName = followUpDoctorName;
    }

    /**
     * 获取followUpOrgCode的值
     * @return followUpOrgCode followUpOrgCode值
     */
    public String getFollowUpOrgCode() {
        return followUpOrgCode;
    }

    /**
     * 设置followUpOrgCode的值
     * @param followUpOrgCode followUpOrgCode值
     */
    public void setFollowUpOrgCode(String followUpOrgCode) {
        this.followUpOrgCode = followUpOrgCode;
    }

    /**
     * 获取followUpOrgName的值
     * @return followUpOrgName followUpOrgName值
     */
    public String getFollowUpOrgName() {
        return followUpOrgName;
    }

    /**
     * 设置followUpOrgName的值
     * @param followUpOrgName followUpOrgName值
     */
    public void setFollowUpOrgName(String followUpOrgName) {
        this.followUpOrgName = followUpOrgName;
    }

    /**
     * 获取entryDate的值
     * @return entryDate entryDate值
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * 设置entryDate的值
     * @param entryDate entryDate值
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * 获取entryEmpCode的值
     * @return entryEmpCode entryEmpCode值
     */
    public String getEntryEmpCode() {
        return entryEmpCode;
    }

    /**
     * 设置entryEmpCode的值
     * @param entryEmpCode entryEmpCode值
     */
    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    /**
     * 获取entryEmpName的值
     * @return entryEmpName entryEmpName值
     */
    public String getEntryEmpName() {
        return entryEmpName;
    }

    /**
     * 设置entryEmpName的值
     * @param entryEmpName entryEmpName值
     */
    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    /**
     * 获取entryOrgCode的值
     * @return entryOrgCode entryOrgCode值
     */
    public String getEntryOrgCode() {
        return entryOrgCode;
    }

    /**
     * 设置entryOrgCode的值
     * @param entryOrgCode entryOrgCode值
     */
    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    /**
     * 获取entryOrgName的值
     * @return entryOrgName entryOrgName值
     */
    public String getEntryOrgName() {
        return entryOrgName;
    }

    /**
     * 设置entryOrgName的值
     * @param entryOrgName entryOrgName值
     */
    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    /**
     * 获取orgCode的值
     * @return orgCode orgCode值
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置orgCode的值
     * @param orgCode orgCode值
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取uploadDate的值
     * @return uploadDate uploadDate值
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置uploadDate的值
     * @param uploadDate uploadDate值
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 获取updateFlag的值
     * @return updateFlag updateFlag值
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置updateFlag的值
     * @param updateFlag updateFlag值
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * 获取editor的值
     * @return editor editor值
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 设置editor的值
     * @param editor editor值
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 获取modifydate的值
     * @return modifydate modifydate值
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * 设置modifydate的值
     * @param modifydate modifydate值
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 获取height的值
     * @return height height值
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置height的值
     * @param height height值
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 获取idCard的值
     * @return idCard idCard值
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置idCard的值
     * @param idCard idCard值
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取upload的值
     * @return upload upload值
     */
    public boolean getUpload() {
        return upload;
    }

    /**
     * 设置upload的值
     * @param upload upload值
     */
    public void setUpload(boolean upload) {
        this.upload = upload;
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

    public String getVipCard() {
        return this.vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public String getDrugsJson() {
        return this.drugsJson;
    }

    public void setDrugsJson(String drugsJson) {
        this.drugsJson = drugsJson;
    }

    public List<AbstractEhrHeDrug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<AbstractEhrHeDrug> drugs) {
        this.drugs = drugs;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted() {
        return this.completed;
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

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }
}
