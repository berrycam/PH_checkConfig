package com.konsung.bean;


import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 突发公共卫生基本信息DTO
 *
 * @author jiangbiwei
 */
@Entity
public class EhrEventsInfoDto extends BaseChildBean {
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

    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 1. [不可空] 突发公共卫生事件报告卡流水号
     */
    protected String eventsCardNumber;

    /**
     * 2. [可空] 报卡类别
     */
    protected String reportClassesCode;

    /**
     * 3. [可空] 进程报告次数
     */
    protected Integer reportTimes;

    /**
     * 4. [可空] 填报单位
     */
    protected String reportUnit;

    /**
     * 5. [可空] 填报日期
     */
    protected java.util.Date reportDate;

    /**
     * 6. [可空] 报告人名称
     */
    protected String reportEmpName;

    /**
     * 7. [可空] 联系电话
     */
    protected String contNumber;

    /**
     * 8. [可空] 事件名称
     */
    protected String eventName;

    /**
     * 9. [可空] 信息类别代码
     */
    protected String infoClassesCode;

    /**
     * 10. [可空] 其他信息类别名称
     */
    protected String infoClassesName;

    /**
     * 11. [可空] 初步诊断代码
     */
    protected String initDiagnosisCode;

    /**
     * 12. [可空] 初步诊断名称
     */
    protected String initDiagnosisName;

    /**
     * 13. [可空] 初步诊断时间
     */
    protected java.util.Date initDiagnosisDate;

    /**
     * 14. [可空] 订正诊断
     */
    protected String revisalDiagnosis;

    /**
     * 15. [可空] 订正诊断时间
     */
    protected java.util.Date revisalGradingDate;

    /**
     * 16. [可空] 确认分级时间
     */
    protected java.util.Date confGradingDate;

    /**
     * 17. [可空] 订正分级时间
     */
    protected java.util.Date revisalDiagnosisDate;

    /**
     * 18. [可空] 报告地区编码(省)
     */
    protected String reportAddProvinceCode;

    /**
     * 19. [可空] 报告地区编码(市)
     */
    protected String reportAddCityCode;

    /**
     * 20. [可空] 报告地区编码(县/区)
     */
    protected String reportAddCountyCode;

    /**
     * 21. [可空] 报告地区编码
     */
    protected String reportAddCode;

    /**
     * 22. [可空] 报告地区名称(省)
     */
    protected String reportAddProvinceName;

    /**
     * 23. [可空] 报告地区名称(市)
     */
    protected String reportAddCityName;

    /**
     * 24. [可空] 报告地区名称(县/区)
     */
    protected String reportAddCountyName;

    /**
     * 25. [可空] 报告地区名称
     */
    protected String reportAddName;

    /**
     * 26. [可空] 发生地区编码(省)
     */
    protected String eventOccuAddProvinceCode;

    /**
     * 27. [可空] 发生地区编码(市)
     */
    protected String eventOccuAddCityCode;

    /**
     * 28. [可空] 发生地区编码(县/区)
     */
    protected String eventOccuAddCountyCode;

    /**
     * 29. [可空] 发生地区编码(乡/镇)
     */
    protected String eventOccuAddTownCode;

    /**
     * 30. [可空] 发生地区编码
     */
    protected String eventOccuAddCode;

    /**
     * 31. [可空] 发生地区名称(省)
     */
    protected String eventOccuAddProvinceName;

    /**
     * 32. [可空] 发生地区名称(市)
     */
    protected String eventOccuAddCityName;

    /**
     * 33. [可空] 发生地区名称(县/区)
     */
    protected String eventOccuAddCountyName;

    /**
     * 34. [可空] 发生地区名称(乡/镇)
     */
    protected String eventOccuAddTownName;

    /**
     * 35. [可空] 发生地区名称
     */
    protected String eventOccuAddName;

    /**
     * 36. [可空] 详细地点
     */
    protected String detailAdd;

    /**
     * 37. [可空] 事件发生场所代码
     */
    protected String eventOccuPlaceCode;

    /**
     * 38. [可空] 事件信息来源代码
     */
    protected String eventInfoSourceCode;

    /**
     * 39. [可空] 事件信息来源其他名称
     */
    protected String eventInfoSourceName;

    /**
     * 40. [可空] 事件信息来源详细
     */
    protected String eventInfoSourceDetail;

    /**
     * 41. [可空] 事件波及的地域范围
     */
    protected String eventAffectAdd;

    /**
     * 42. [可空] 新报告病例数
     */
    protected Long reportCaseNumber;

    /**
     * 43. [可空] 新报告死亡数
     */
    protected Long reportDieNumber;

    /**
     * 44. [可空] 排除病例数
     */
    protected Long excludeCaseNumber;

    /**
     * 45. [可空] 累计报告病例数
     */
    protected Long sumReportCaseNumber;

    /**
     * 46. [可空] 累计报告死亡数
     */
    protected Long sumReportDieNumber;

    /**
     * 47. [可空] 事件发生时间
     */
    protected java.util.Date eventOccuDate;

    /**
     * 48. [可空] 接到报告时间
     */
    protected java.util.Date receReportDate;

    /**
     * 49. [可空] 首例病人发病时间
     */
    protected java.util.Date firstAttackDate;

    /**
     * 50. [可空] 末例病人发病时间
     */
    protected java.util.Date lastAttackDate;

    /**
     * 51. [可空] 主要症状代码
     */
    protected String masterSymptomCode;

    /**
     * 52. [可空] 其他主要症状名称
     */
    protected String masterSymptomName;

    /**
     * 53. [可空] 主要体征
     */
    protected String masterSign;

    /**
     * 54. [可空] 主要措施与效果
     */
    protected String masterEffect;

    /**
     * 55. [可空] 是否及时
     */
    protected String inTime;

    /**
     * 56. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 57. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 58. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 59. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 60. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 61. [可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 62. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 64. [不可空] 数据来源
     */
    protected String fdataFrom;

    /**
     * 65. [可空] 修改者
     */
    protected String editor;

    /**
     * 66. [可空] 修改时间
     */
    protected java.util.Date modifydate;

    /**
     * 67. [不可空] 修改标志,1新增,2修改,3撤销
     */
    protected String updateFlag;

    /**
     * 68. [可空] 医疗机构感染部门
     */
    protected String forgDepartmentName;

    /**
     * 69. [可空] 医疗机构类别
     */
    protected String forgType;

    private Date followupDate;

    /**
     * 70. [可空] 学校类别
     */
    protected String fschoolType;

    /**
     * 74. [可空] 学校其他
     */
    protected String fschoolOther;

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

    @Generated(hash = 862636829)
    public EhrEventsInfoDto(Long localId, String idCard, String vipCard, String uuid, boolean upload,
            boolean completed, String id, String title, String eventsCardNumber,
            String reportClassesCode, Integer reportTimes, String reportUnit, java.util.Date reportDate,
            String reportEmpName, String contNumber, String eventName, String infoClassesCode,
            String infoClassesName, String initDiagnosisCode, String initDiagnosisName,
            java.util.Date initDiagnosisDate, String revisalDiagnosis,
            java.util.Date revisalGradingDate, java.util.Date confGradingDate,
            java.util.Date revisalDiagnosisDate, String reportAddProvinceCode, String reportAddCityCode,
            String reportAddCountyCode, String reportAddCode, String reportAddProvinceName,
            String reportAddCityName, String reportAddCountyName, String reportAddName,
            String eventOccuAddProvinceCode, String eventOccuAddCityCode, String eventOccuAddCountyCode,
            String eventOccuAddTownCode, String eventOccuAddCode, String eventOccuAddProvinceName,
            String eventOccuAddCityName, String eventOccuAddCountyName, String eventOccuAddTownName,
            String eventOccuAddName, String detailAdd, String eventOccuPlaceCode,
            String eventInfoSourceCode, String eventInfoSourceName, String eventInfoSourceDetail,
            String eventAffectAdd, Long reportCaseNumber, Long reportDieNumber, Long excludeCaseNumber,
            Long sumReportCaseNumber, Long sumReportDieNumber, java.util.Date eventOccuDate,
            java.util.Date receReportDate, java.util.Date firstAttackDate,
            java.util.Date lastAttackDate, String masterSymptomCode, String masterSymptomName,
            String masterSign, String masterEffect, String inTime, java.util.Date entryDate,
            String entryEmpCode, String entryEmpName, String entryOrgCode, String entryOrgName,
            String orgCode, java.util.Date uploadDate, String fdataFrom, String editor,
            java.util.Date modifydate, String updateFlag, String forgDepartmentName, String forgType,
            Date followupDate, String fschoolType, String fschoolOther, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.uuid = uuid;
        this.upload = upload;
        this.completed = completed;
        this.id = id;
        this.title = title;
        this.eventsCardNumber = eventsCardNumber;
        this.reportClassesCode = reportClassesCode;
        this.reportTimes = reportTimes;
        this.reportUnit = reportUnit;
        this.reportDate = reportDate;
        this.reportEmpName = reportEmpName;
        this.contNumber = contNumber;
        this.eventName = eventName;
        this.infoClassesCode = infoClassesCode;
        this.infoClassesName = infoClassesName;
        this.initDiagnosisCode = initDiagnosisCode;
        this.initDiagnosisName = initDiagnosisName;
        this.initDiagnosisDate = initDiagnosisDate;
        this.revisalDiagnosis = revisalDiagnosis;
        this.revisalGradingDate = revisalGradingDate;
        this.confGradingDate = confGradingDate;
        this.revisalDiagnosisDate = revisalDiagnosisDate;
        this.reportAddProvinceCode = reportAddProvinceCode;
        this.reportAddCityCode = reportAddCityCode;
        this.reportAddCountyCode = reportAddCountyCode;
        this.reportAddCode = reportAddCode;
        this.reportAddProvinceName = reportAddProvinceName;
        this.reportAddCityName = reportAddCityName;
        this.reportAddCountyName = reportAddCountyName;
        this.reportAddName = reportAddName;
        this.eventOccuAddProvinceCode = eventOccuAddProvinceCode;
        this.eventOccuAddCityCode = eventOccuAddCityCode;
        this.eventOccuAddCountyCode = eventOccuAddCountyCode;
        this.eventOccuAddTownCode = eventOccuAddTownCode;
        this.eventOccuAddCode = eventOccuAddCode;
        this.eventOccuAddProvinceName = eventOccuAddProvinceName;
        this.eventOccuAddCityName = eventOccuAddCityName;
        this.eventOccuAddCountyName = eventOccuAddCountyName;
        this.eventOccuAddTownName = eventOccuAddTownName;
        this.eventOccuAddName = eventOccuAddName;
        this.detailAdd = detailAdd;
        this.eventOccuPlaceCode = eventOccuPlaceCode;
        this.eventInfoSourceCode = eventInfoSourceCode;
        this.eventInfoSourceName = eventInfoSourceName;
        this.eventInfoSourceDetail = eventInfoSourceDetail;
        this.eventAffectAdd = eventAffectAdd;
        this.reportCaseNumber = reportCaseNumber;
        this.reportDieNumber = reportDieNumber;
        this.excludeCaseNumber = excludeCaseNumber;
        this.sumReportCaseNumber = sumReportCaseNumber;
        this.sumReportDieNumber = sumReportDieNumber;
        this.eventOccuDate = eventOccuDate;
        this.receReportDate = receReportDate;
        this.firstAttackDate = firstAttackDate;
        this.lastAttackDate = lastAttackDate;
        this.masterSymptomCode = masterSymptomCode;
        this.masterSymptomName = masterSymptomName;
        this.masterSign = masterSign;
        this.masterEffect = masterEffect;
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
        this.forgDepartmentName = forgDepartmentName;
        this.forgType = forgType;
        this.followupDate = followupDate;
        this.fschoolType = fschoolType;
        this.fschoolOther = fschoolOther;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1705353966)
    public EhrEventsInfoDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventsCardNumber() {
        return eventsCardNumber;
    }

    public void setEventsCardNumber(String eventsCardNumber) {
        this.eventsCardNumber = eventsCardNumber;
    }

    public String getReportClassesCode() {
        return reportClassesCode;
    }

    public void setReportClassesCode(String reportClassesCode) {
        this.reportClassesCode = reportClassesCode;
    }

    public Integer getReportTimes() {
        return reportTimes;
    }

    public void setReportTimes(Integer reportTimes) {
        this.reportTimes = reportTimes;
    }

    public String getReportUnit() {
        return reportUnit;
    }

    public void setReportUnit(String reportUnit) {
        this.reportUnit = reportUnit;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportEmpName() {
        return reportEmpName;
    }

    public void setReportEmpName(String reportEmpName) {
        this.reportEmpName = reportEmpName;
    }

    public String getContNumber() {
        return contNumber;
    }

    public void setContNumber(String contNumber) {
        this.contNumber = contNumber;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getInfoClassesCode() {
        return infoClassesCode;
    }

    public void setInfoClassesCode(String infoClassesCode) {
        this.infoClassesCode = infoClassesCode;
    }

    public String getInfoClassesName() {
        return infoClassesName;
    }

    public void setInfoClassesName(String infoClassesName) {
        this.infoClassesName = infoClassesName;
    }

    public String getInitDiagnosisCode() {
        return initDiagnosisCode;
    }

    public void setInitDiagnosisCode(String initDiagnosisCode) {
        this.initDiagnosisCode = initDiagnosisCode;
    }

    public String getInitDiagnosisName() {
        return initDiagnosisName;
    }

    public void setInitDiagnosisName(String initDiagnosisName) {
        this.initDiagnosisName = initDiagnosisName;
    }

    public Date getInitDiagnosisDate() {
        return initDiagnosisDate;
    }

    public void setInitDiagnosisDate(Date initDiagnosisDate) {
        this.initDiagnosisDate = initDiagnosisDate;
    }

    public String getRevisalDiagnosis() {
        return revisalDiagnosis;
    }

    public void setRevisalDiagnosis(String revisalDiagnosis) {
        this.revisalDiagnosis = revisalDiagnosis;
    }

    public Date getRevisalGradingDate() {
        return revisalGradingDate;
    }

    public void setRevisalGradingDate(Date revisalGradingDate) {
        this.revisalGradingDate = revisalGradingDate;
    }

    public Date getConfGradingDate() {
        return confGradingDate;
    }

    public void setConfGradingDate(Date confGradingDate) {
        this.confGradingDate = confGradingDate;
    }

    public Date getRevisalDiagnosisDate() {
        return revisalDiagnosisDate;
    }

    public void setRevisalDiagnosisDate(Date revisalDiagnosisDate) {
        this.revisalDiagnosisDate = revisalDiagnosisDate;
    }

    public String getReportAddProvinceCode() {
        return reportAddProvinceCode;
    }

    public void setReportAddProvinceCode(String reportAddProvinceCode) {
        this.reportAddProvinceCode = reportAddProvinceCode;
    }

    public String getReportAddCityCode() {
        return reportAddCityCode;
    }

    public void setReportAddCityCode(String reportAddCityCode) {
        this.reportAddCityCode = reportAddCityCode;
    }

    public String getReportAddCountyCode() {
        return reportAddCountyCode;
    }

    public void setReportAddCountyCode(String reportAddCountyCode) {
        this.reportAddCountyCode = reportAddCountyCode;
    }

    public String getReportAddCode() {
        return reportAddCode;
    }

    public void setReportAddCode(String reportAddCode) {
        this.reportAddCode = reportAddCode;
    }

    public String getReportAddProvinceName() {
        return reportAddProvinceName;
    }

    public void setReportAddProvinceName(String reportAddProvinceName) {
        this.reportAddProvinceName = reportAddProvinceName;
    }

    public String getReportAddCityName() {
        return reportAddCityName;
    }

    public void setReportAddCityName(String reportAddCityName) {
        this.reportAddCityName = reportAddCityName;
    }

    public String getReportAddCountyName() {
        return reportAddCountyName;
    }

    public void setReportAddCountyName(String reportAddCountyName) {
        this.reportAddCountyName = reportAddCountyName;
    }

    public String getReportAddName() {
        return reportAddName;
    }

    public void setReportAddName(String reportAddName) {
        this.reportAddName = reportAddName;
    }

    public String getEventOccuAddProvinceCode() {
        return eventOccuAddProvinceCode;
    }

    public void setEventOccuAddProvinceCode(String eventOccuAddProvinceCode) {
        this.eventOccuAddProvinceCode = eventOccuAddProvinceCode;
    }

    public String getEventOccuAddCityCode() {
        return eventOccuAddCityCode;
    }

    public void setEventOccuAddCityCode(String eventOccuAddCityCode) {
        this.eventOccuAddCityCode = eventOccuAddCityCode;
    }

    public String getEventOccuAddCountyCode() {
        return eventOccuAddCountyCode;
    }

    public void setEventOccuAddCountyCode(String eventOccuAddCountyCode) {
        this.eventOccuAddCountyCode = eventOccuAddCountyCode;
    }

    public String getEventOccuAddTownCode() {
        return eventOccuAddTownCode;
    }

    public void setEventOccuAddTownCode(String eventOccuAddTownCode) {
        this.eventOccuAddTownCode = eventOccuAddTownCode;
    }

    public String getEventOccuAddCode() {
        return eventOccuAddCode;
    }

    public void setEventOccuAddCode(String eventOccuAddCode) {
        this.eventOccuAddCode = eventOccuAddCode;
    }

    public String getEventOccuAddProvinceName() {
        return eventOccuAddProvinceName;
    }

    public void setEventOccuAddProvinceName(String eventOccuAddProvinceName) {
        this.eventOccuAddProvinceName = eventOccuAddProvinceName;
    }

    public String getEventOccuAddCityName() {
        return eventOccuAddCityName;
    }

    public void setEventOccuAddCityName(String eventOccuAddCityName) {
        this.eventOccuAddCityName = eventOccuAddCityName;
    }

    public String getEventOccuAddCountyName() {
        return eventOccuAddCountyName;
    }

    public void setEventOccuAddCountyName(String eventOccuAddCountyName) {
        this.eventOccuAddCountyName = eventOccuAddCountyName;
    }

    public String getEventOccuAddTownName() {
        return eventOccuAddTownName;
    }

    public void setEventOccuAddTownName(String eventOccuAddTownName) {
        this.eventOccuAddTownName = eventOccuAddTownName;
    }

    public String getEventOccuAddName() {
        return eventOccuAddName;
    }

    public void setEventOccuAddName(String eventOccuAddName) {
        this.eventOccuAddName = eventOccuAddName;
    }

    public String getDetailAdd() {
        return detailAdd;
    }

    public void setDetailAdd(String detailAdd) {
        this.detailAdd = detailAdd;
    }

    public String getEventOccuPlaceCode() {
        return eventOccuPlaceCode;
    }

    public void setEventOccuPlaceCode(String eventOccuPlaceCode) {
        this.eventOccuPlaceCode = eventOccuPlaceCode;
    }

    public String getEventInfoSourceCode() {
        return eventInfoSourceCode;
    }

    public void setEventInfoSourceCode(String eventInfoSourceCode) {
        this.eventInfoSourceCode = eventInfoSourceCode;
    }

    public String getEventInfoSourceName() {
        return eventInfoSourceName;
    }

    public void setEventInfoSourceName(String eventInfoSourceName) {
        this.eventInfoSourceName = eventInfoSourceName;
    }

    public String getEventInfoSourceDetail() {
        return eventInfoSourceDetail;
    }

    public void setEventInfoSourceDetail(String eventInfoSourceDetail) {
        this.eventInfoSourceDetail = eventInfoSourceDetail;
    }

    public String getEventAffectAdd() {
        return eventAffectAdd;
    }

    public void setEventAffectAdd(String eventAffectAdd) {
        this.eventAffectAdd = eventAffectAdd;
    }

    public Long getReportCaseNumber() {
        return reportCaseNumber;
    }

    public void setReportCaseNumber(Long reportCaseNumber) {
        this.reportCaseNumber = reportCaseNumber;
    }

    public Long getReportDieNumber() {
        return reportDieNumber;
    }

    public void setReportDieNumber(Long reportDieNumber) {
        this.reportDieNumber = reportDieNumber;
    }

    public Long getExcludeCaseNumber() {
        return excludeCaseNumber;
    }

    public void setExcludeCaseNumber(Long excludeCaseNumber) {
        this.excludeCaseNumber = excludeCaseNumber;
    }

    public Long getSumReportCaseNumber() {
        return sumReportCaseNumber;
    }

    public void setSumReportCaseNumber(Long sumReportCaseNumber) {
        this.sumReportCaseNumber = sumReportCaseNumber;
    }

    public Long getSumReportDieNumber() {
        return sumReportDieNumber;
    }

    public void setSumReportDieNumber(Long sumReportDieNumber) {
        this.sumReportDieNumber = sumReportDieNumber;
    }

    public Date getEventOccuDate() {
        return eventOccuDate;
    }

    public void setEventOccuDate(Date eventOccuDate) {
        this.eventOccuDate = eventOccuDate;
    }

    public Date getReceReportDate() {
        return receReportDate;
    }

    public void setReceReportDate(Date receReportDate) {
        this.receReportDate = receReportDate;
    }

    public Date getFirstAttackDate() {
        return firstAttackDate;
    }

    public void setFirstAttackDate(Date firstAttackDate) {
        this.firstAttackDate = firstAttackDate;
    }

    public Date getLastAttackDate() {
        return lastAttackDate;
    }

    public void setLastAttackDate(Date lastAttackDate) {
        this.lastAttackDate = lastAttackDate;
    }

    public String getMasterSymptomCode() {
        return masterSymptomCode;
    }

    public void setMasterSymptomCode(String masterSymptomCode) {
        this.masterSymptomCode = masterSymptomCode;
    }

    public String getMasterSymptomName() {
        return masterSymptomName;
    }

    public void setMasterSymptomName(String masterSymptomName) {
        this.masterSymptomName = masterSymptomName;
    }

    public String getMasterSign() {
        return masterSign;
    }

    public void setMasterSign(String masterSign) {
        this.masterSign = masterSign;
    }

    public String getMasterEffect() {
        return masterEffect;
    }

    public void setMasterEffect(String masterEffect) {
        this.masterEffect = masterEffect;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
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

    public String getForgDepartmentName() {
        return this.forgDepartmentName;
    }

    public void setForgDepartmentName(String forgDepartmentName) {
        this.forgDepartmentName = forgDepartmentName;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getForgType() {
        return this.forgType;
    }

    public void setForgType(String forgType) {
        this.forgType = forgType;
    }

    public String getFschoolType() {
        return this.fschoolType;
    }

    public void setFschoolType(String fschoolType) {
        this.fschoolType = fschoolType;
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

    public String getFschoolOther() {
        return this.fschoolOther;
    }

    public void setFschoolOther(String fschoolOther) {
        this.fschoolOther = fschoolOther;
    }
}
