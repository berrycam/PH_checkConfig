package com.konsung.bean.psychosis;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

import org.greenrobot.greendao.annotation.Generated;

/**
 *
 */
@Entity
public class PsyInfomation extends BaseChildBean {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /**
     * 类型 用来区分是0专项表还是个人信息补充表(1)
     */
    private int type;
    /**
     * 1. [不可空] 重性精神病患者信息登记流水号
     */
    protected String holergasiaInfoNumber;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 4. [可空] 监护人姓名
     */
    protected String guardianName;

    /**
     * 5. [可空] 与患者关系名称
     */
    protected String patientRelationName;

    /**
     * 6. [可空] 监护人住址
     */
    protected String guardianAdd;

    /**
     * 7. [可空] 监护人电话
     */
    protected String guardianTel;

    /**
     * 8. [可空] 居委会联系人
     */
    protected String neighName;

    /**
     * 9. [可空] 居委会电话
     */
    protected String neighTel;

    /**
     * 10. [可空] 参加管理代码  知情同意
     */
    protected String joinManagerCode;

    /**
     * 11. [可空] 签字人
     */
    protected String signatory;

    /**
     * 12. [可空] 签字时间
     */
    protected java.util.Date signTime;

    /**
     * 13. [可空] 初次发病日期
     */
    protected java.util.Date firstAttackDate;

    /**
     * 14. [可空] 既往主要症状代码
     */
    protected String historyMasterSymptomCode;

    /**
     * 15. [可空] 其他既往主要症状名称
     */
    protected String historyMasterSymptomName;

    /**
     * 16. [可空] 既往门诊治疗情况
     */
    protected String historyOutCure;

    /**
     * 17. [可空] 既往门诊首次抗精神病药治疗时间
     */
    protected java.util.Date historyoutFiAntiCureDate;

    /**
     * 18. [可空] 既往住院治疗次数
     */
    protected Integer historyInCureTimes;

    /**
     * 19. [可空] 目前诊断编码
     */
    protected String currentDiagnosisCode;

    /**
     * 20. [可空] 目前诊断名称
     */
    protected String currentDiagnosisName;

    /**
     * 21. [可空] 目前确诊医院编码
     */
    protected String currentDiagnoseHosCode;

    /**
     * 22. [可空] 目前确诊医院名称
     */
    protected String currentDiagnoseHosName;

    /**
     * 23. [可空] 目前确诊日期
     */
    protected java.util.Date currentDiagnoseDate;

    /**
     * 24. [可空] 最近一次治疗效果
     */
    protected String recentlyCureEffect;

    /**
     * 25. [可空] 轻度滋事次数
     */
    protected Integer mildTroubleTime;

    /**
     * 26. [可空] 肇事次数
     */
    protected Integer troubleTime;

    /**
     * 27. [可空] 肇祸次数
     */
    protected Integer disasterTime;

    /**
     * 28. [可空] 自伤次数
     */
    protected Integer autolesionTime;

    /**
     * 29. [可空] 自杀未遂次数
     */
    protected Integer suicideTime;

    /**
     * 30. [可空] 有无社会影响代码
     */
    protected String socialImpactCode;

    /**
     * 31. [可空] 关锁情况代码
     */
    protected String closeLockCode;

    /**
     * 32. [可空] 经济状况代码
     */
    protected String economicConditionsCode;

    /**
     * 33. [可空] 专科医生意见
     */
    protected String collegeDoctorSuggest;

    /**
     * 34. [可空] 填表日期
     */
    protected java.util.Date reportDate;

    /**
     * 35. [可空] 责任医生编码
     */
    protected String dutyDoctorCode;

    /**
     * 36. [可空] 责任医生姓名
     */
    protected String dutyDoctorName;

    /**
     * 37. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 38. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 39. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 40. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 41. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 42. [可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 43. [不可空] 填报日期  创建日期
     */
    protected java.util.Date uploadDate;

    /**
     * 45. [不可空] 数据来源
     */
    protected String fdataFrom;

    /**
     * 46. [可空] 修改人
     */
    protected String editor;

    /**
     * 47. [可空] 修改时间
     */
    protected java.util.Date modifydate;

    /**
     * 48. [不可空] 修改标志,1新增,2修改,3撤销
     */
    protected String updateFlag;

    /**
     * 49. [可空] 备注
     */
    protected String remark;

    /**
     * 50. [可空] 户别
     */
    protected String hb;

    /**
     * 51. [可空] 就业情况
     */
    protected String jyqk;

    /**
     * 52. [可空] 其它危害行为(次)
     */
    protected Integer behavior;

    /**
     * 53. [可空] 结案标志
     */
    protected Boolean endCaseFlag;

    /**
     * 54. [可空] 结案原因代码
     */
    protected String endCaseReasonCode;

    /**
     * 55. [可空] 结案日期
     */
    protected java.util.Date endCaseDate;

    /**
     * 56. [可空] 结案机构编码
     */
    protected String endCaseOrgCode;

    /**
     * 57. [可空] 结案机构名称
     */
    protected String endCaseOrgName;

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
     * 患病对家庭社会的影响
     */
    private String impact;

    @Generated(hash = 1826522185)
    public PsyInfomation(Long localId, String idCard, String vipCard, boolean upload, boolean completed,
            String title, String id, int type, String holergasiaInfoNumber, String healthfileNo,
            String fileNumber, String guardianName, String patientRelationName, String guardianAdd,
            String guardianTel, String neighName, String neighTel, String joinManagerCode,
            String signatory, java.util.Date signTime, java.util.Date firstAttackDate,
            String historyMasterSymptomCode, String historyMasterSymptomName, String historyOutCure,
            java.util.Date historyoutFiAntiCureDate, Integer historyInCureTimes,
            String currentDiagnosisCode, String currentDiagnosisName, String currentDiagnoseHosCode,
            String currentDiagnoseHosName, java.util.Date currentDiagnoseDate,
            String recentlyCureEffect, Integer mildTroubleTime, Integer troubleTime,
            Integer disasterTime, Integer autolesionTime, Integer suicideTime, String socialImpactCode,
            String closeLockCode, String economicConditionsCode, String collegeDoctorSuggest,
            java.util.Date reportDate, String dutyDoctorCode, String dutyDoctorName,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName, String entryOrgCode,
            String entryOrgName, String orgCode, java.util.Date uploadDate, String fdataFrom,
            String editor, java.util.Date modifydate, String updateFlag, String remark, String hb,
            String jyqk, Integer behavior, Boolean endCaseFlag, String endCaseReasonCode,
            java.util.Date endCaseDate, String endCaseOrgCode, String endCaseOrgName, String editorId,
            String updateOrgId, String updateOrgName, String impact) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.type = type;
        this.holergasiaInfoNumber = holergasiaInfoNumber;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.guardianName = guardianName;
        this.patientRelationName = patientRelationName;
        this.guardianAdd = guardianAdd;
        this.guardianTel = guardianTel;
        this.neighName = neighName;
        this.neighTel = neighTel;
        this.joinManagerCode = joinManagerCode;
        this.signatory = signatory;
        this.signTime = signTime;
        this.firstAttackDate = firstAttackDate;
        this.historyMasterSymptomCode = historyMasterSymptomCode;
        this.historyMasterSymptomName = historyMasterSymptomName;
        this.historyOutCure = historyOutCure;
        this.historyoutFiAntiCureDate = historyoutFiAntiCureDate;
        this.historyInCureTimes = historyInCureTimes;
        this.currentDiagnosisCode = currentDiagnosisCode;
        this.currentDiagnosisName = currentDiagnosisName;
        this.currentDiagnoseHosCode = currentDiagnoseHosCode;
        this.currentDiagnoseHosName = currentDiagnoseHosName;
        this.currentDiagnoseDate = currentDiagnoseDate;
        this.recentlyCureEffect = recentlyCureEffect;
        this.mildTroubleTime = mildTroubleTime;
        this.troubleTime = troubleTime;
        this.disasterTime = disasterTime;
        this.autolesionTime = autolesionTime;
        this.suicideTime = suicideTime;
        this.socialImpactCode = socialImpactCode;
        this.closeLockCode = closeLockCode;
        this.economicConditionsCode = economicConditionsCode;
        this.collegeDoctorSuggest = collegeDoctorSuggest;
        this.reportDate = reportDate;
        this.dutyDoctorCode = dutyDoctorCode;
        this.dutyDoctorName = dutyDoctorName;
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
        this.remark = remark;
        this.hb = hb;
        this.jyqk = jyqk;
        this.behavior = behavior;
        this.endCaseFlag = endCaseFlag;
        this.endCaseReasonCode = endCaseReasonCode;
        this.endCaseDate = endCaseDate;
        this.endCaseOrgCode = endCaseOrgCode;
        this.endCaseOrgName = endCaseOrgName;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.impact = impact;
    }

    @Generated(hash = 1846320462)
    public PsyInfomation() {
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
        uploadDate = followupDate;
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
        return upload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getPatientRelationName() {
        return patientRelationName;
    }

    public void setPatientRelationName(String patientRelationName) {
        this.patientRelationName = patientRelationName;
    }

    public String getGuardianAdd() {
        return guardianAdd;
    }

    public void setGuardianAdd(String guardianAdd) {
        this.guardianAdd = guardianAdd;
    }

    public String getGuardianTel() {
        return guardianTel;
    }

    public void setGuardianTel(String guardianTel) {
        this.guardianTel = guardianTel;
    }

    public String getNeighName() {
        return neighName;
    }

    public void setNeighName(String neighName) {
        this.neighName = neighName;
    }

    public String getNeighTel() {
        return neighTel;
    }

    public void setNeighTel(String neighTel) {
        this.neighTel = neighTel;
    }

    public String getJoinManagerCode() {
        return joinManagerCode;
    }

    public void setJoinManagerCode(String joinManagerCode) {
        this.joinManagerCode = joinManagerCode;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Date getFirstAttackDate() {
        return firstAttackDate;
    }

    public void setFirstAttackDate(Date firstAttackDate) {
        this.firstAttackDate = firstAttackDate;
    }

    public String getHistoryMasterSymptomCode() {
        return historyMasterSymptomCode;
    }

    public void setHistoryMasterSymptomCode(String historyMasterSymptomCode) {
        this.historyMasterSymptomCode = historyMasterSymptomCode;
    }

    public String getHistoryMasterSymptomName() {
        return historyMasterSymptomName;
    }

    public void setHistoryMasterSymptomName(String historyMasterSymptomName) {
        this.historyMasterSymptomName = historyMasterSymptomName;
    }

    public String getHistoryOutCure() {
        return historyOutCure;
    }

    public void setHistoryOutCure(String historyOutCure) {
        this.historyOutCure = historyOutCure;
    }

    public Date getHistoryoutFiAntiCureDate() {
        return historyoutFiAntiCureDate;
    }

    public void setHistoryoutFiAntiCureDate(Date historyoutFiAntiCureDate) {
        this.historyoutFiAntiCureDate = historyoutFiAntiCureDate;
    }

    public Integer getHistoryInCureTimes() {
        return historyInCureTimes;
    }

    public void setHistoryInCureTimes(Integer historyInCureTimes) {
        this.historyInCureTimes = historyInCureTimes;
    }

    public String getCurrentDiagnosisCode() {
        return currentDiagnosisCode;
    }

    public void setCurrentDiagnosisCode(String currentDiagnosisCode) {
        this.currentDiagnosisCode = currentDiagnosisCode;
    }

    public String getCurrentDiagnosisName() {
        return currentDiagnosisName;
    }

    public void setCurrentDiagnosisName(String currentDiagnosisName) {
        this.currentDiagnosisName = currentDiagnosisName;
    }

    public String getCurrentDiagnoseHosCode() {
        return currentDiagnoseHosCode;
    }

    public void setCurrentDiagnoseHosCode(String currentDiagnoseHosCode) {
        this.currentDiagnoseHosCode = currentDiagnoseHosCode;
    }

    public String getCurrentDiagnoseHosName() {
        return currentDiagnoseHosName;
    }

    public void setCurrentDiagnoseHosName(String currentDiagnoseHosName) {
        this.currentDiagnoseHosName = currentDiagnoseHosName;
    }

    public Date getCurrentDiagnoseDate() {
        return currentDiagnoseDate;
    }

    public void setCurrentDiagnoseDate(Date currentDiagnoseDate) {
        this.currentDiagnoseDate = currentDiagnoseDate;
    }

    public String getRecentlyCureEffect() {
        return recentlyCureEffect;
    }

    public void setRecentlyCureEffect(String recentlyCureEffect) {
        this.recentlyCureEffect = recentlyCureEffect;
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

    public String getEconomicConditionsCode() {
        return economicConditionsCode;
    }

    public void setEconomicConditionsCode(String economicConditionsCode) {
        this.economicConditionsCode = economicConditionsCode;
    }

    public String getCollegeDoctorSuggest() {
        return collegeDoctorSuggest;
    }

    public void setCollegeDoctorSuggest(String collegeDoctorSuggest) {
        this.collegeDoctorSuggest = collegeDoctorSuggest;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getDutyDoctorCode() {
        return dutyDoctorCode;
    }

    public void setDutyDoctorCode(String dutyDoctorCode) {
        this.dutyDoctorCode = dutyDoctorCode;
    }

    public String getDutyDoctorName() {
        return dutyDoctorName;
    }

    public void setDutyDoctorName(String dutyDoctorName) {
        this.dutyDoctorName = dutyDoctorName;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getJyqk() {
        return jyqk;
    }

    public void setJyqk(String jyqk) {
        this.jyqk = jyqk;
    }

    public Integer getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }

    public Boolean getEndCaseFlag() {
        return endCaseFlag;
    }

    public void setEndCaseFlag(boolean endCaseFlag) {
        this.endCaseFlag = endCaseFlag;
    }

    public String getEndCaseReasonCode() {
        return endCaseReasonCode;
    }

    public void setEndCaseReasonCode(String endCaseReasonCode) {
        this.endCaseReasonCode = endCaseReasonCode;
    }

    public Date getEndCaseDate() {
        return endCaseDate;
    }

    public void setEndCaseDate(Date endCaseDate) {
        this.endCaseDate = endCaseDate;
    }

    public String getEndCaseOrgCode() {
        return endCaseOrgCode;
    }

    public void setEndCaseOrgCode(String endCaseOrgCode) {
        this.endCaseOrgCode = endCaseOrgCode;
    }

    public String getEndCaseOrgName() {
        return endCaseOrgName;
    }

    public void setEndCaseOrgName(String endCaseOrgName) {
        this.endCaseOrgName = endCaseOrgName;
    }

    public void setEndCaseFlag(Boolean endCaseFlag) {
        this.endCaseFlag = endCaseFlag;
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

    public String getImpact() {
        return this.impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }
}
