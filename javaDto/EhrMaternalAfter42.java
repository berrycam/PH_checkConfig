package com.konsung.bean.maternal;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 抽象产后42天健康检查记录类。本抽象类只定义基本字段
 * ，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String followupId 产后随访ID
 * 2. [不可空] String mangementNo 孕卡编号
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [不可空] java.util.Date followupDate 随访日期
 * 6. [可空] String maternalHealthState 一般健康情况
 * 7. [可空] String maternalMindHealthState 一般心理状况
 * 8. [可空] Integer systolicPressure 收缩压
 * 9. [可空] Integer diastolicPressure 舒张压
 * 10. [可空] String maternalBreast 乳房
 * 11. [可空] String maternalBreastEx 乳房异常描述
 * 12. [可空] String maternalLochia 恶露
 * 13. [可空] String maternalLochiaEx 恶露异常描述
 * 14. [可空] String maternalWomb 子宫
 * 15. [可空] String maternalWombEx 子宫异常描述
 * 16. [可空] String maternalHurt 伤口
 * 17. [可空] String maternalHurtEx 伤口异常描述
 * 18. [可空] String maternalOther 其他
 * 19. [可空] String maternalType 分类
 * 20. [可空] String maternalTypeEx 未恢复描述
 * 21. [可空] String maternalGuideNo 指导代码
 * 22. [可空] String maternalGuideOther 其他指导
 * 23. [可空] String procFlag 处理标志
 * 24. [可空] String referralReason 转诊原因
 * 25. [可空] String referralOrgCode 转诊机构编码
 * 26. [可空] String referralOrgName 转诊机构名称
 * 27. [可空] String referralDepCode 转诊科室编码
 * 28. [可空] String referralDepName 转诊科室名称
 * 29. [可空] String referralOrgAndDept 转诊机构及科室
 * 30. [可空] String followUpDoctorName 随访医生编码
 * 31. [可空] String followUpDoctorCode 随访医生姓名
 * 32. [可空] String followUpOrgCode 随访机构编码
 * 33. [可空] String followUpOrgName 随访机构名称
 * 34. [不可空] java.util.Date entryDate 登记时间
 * 35. [不可空] String entryEmpCode 登记人员编码
 * 36. [不可空] String entryEmpName 登记人员名称
 * 37. [不可空] String entryOrgCode 登记机构编码
 * 38. [不可空] String entryOrgName 登记机构名称
 * 39. [不可空] String orgCode 医疗机构代码
 * 40. [不可空] java.util.Date uploadDate 填报日期
 * 41. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 42. [主键] String id 主键
 * 43. [可空] String editor 修改人
 * 44. [可空] java.util.Date modifydate 更新日期
 * 45. [不可空] String fdataFrom 数据来源
 */
@Entity
public class EhrMaternalAfter42 extends BaseChildBean {

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
    protected String followupId;

    /**
     * 2. [不可空] 孕卡编号
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
    protected java.util.Date followupDate;

    /**
     * 6. [可空] 一般健康情况
     */
    protected String maternalHealthState;

    /**
     * 7. [可空] 一般心理状况
     */
    protected String maternalMindHealthState;

    /**
     * 8. [可空] 收缩压
     */
    protected Integer systolicPressure;

    /**
     * 9. [可空] 舒张压
     */
    protected Integer diastolicPressure;

    /**
     * 10. [可空] 乳房
     */
    protected String maternalBreast;

    /**
     * 11. [可空] 乳房异常描述
     */
    protected String maternalBreastEx;

    /**
     * 12. [可空] 恶露
     */
    protected String maternalLochia;

    /**
     * 13. [可空] 恶露异常描述
     */
    protected String maternalLochiaEx;

    /**
     * 14. [可空] 子宫
     */
    protected String maternalWomb;

    /**
     * 15. [可空] 子宫异常描述
     */
    protected String maternalWombEx;

    /**
     * 16. [可空] 伤口
     */
    protected String maternalHurt;

    /**
     * 17. [可空] 伤口异常描述
     */
    protected String maternalHurtEx;

    /**
     * 18. [可空] 其他
     */
    protected String maternalOther;

    /**
     * 19. [可空] 分类
     */
    protected String maternalType;

    /**
     * 20. [可空] 未恢复描述
     */
    protected String maternalTypeEx;

    /**
     * 21. [可空] 指导代码
     */
    protected String maternalGuideNo;

    /**
     * 22. [可空] 其他指导
     */
    protected String maternalGuideOther;

    /**
     * 23. [可空] 处理标志
     */
    protected String procFlag;

    /**
     * 24. [可空] 转诊原因
     */
    protected String referralReason;

    /**
     * 25. [可空] 转诊机构编码
     */
    protected String referralOrgCode;

    /**
     * 26. [可空] 转诊机构名称
     */
    protected String referralOrgName;

    /**
     * 27. [可空] 转诊科室编码
     */
    protected String referralDepCode;

    /**
     * 28. [可空] 转诊科室名称
     */
    protected String referralDepName;

    /**
     * 29. [可空] 转诊机构及科室
     */
    protected String referralOrgAndDept;

    /**
     * 30. [可空] 随访医生编码
     */
    protected String followUpDoctorName;

    /**
     * 31. [可空] 随访医生姓名
     */
    protected String followUpDoctorCode;

    /**
     * 32. [可空] 随访机构编码
     */
    protected String followUpOrgCode;

    /**
     * 33. [可空] 随访机构名称
     */
    protected String followUpOrgName;

    /**
     * 34. [不可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 35. [不可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 36. [不可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 37. [不可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 38. [不可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 39. [不可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 40. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 41. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    protected String updateFlag;

    /**
     * 43. [可空] 修改人
     */
    protected String editor;

    /**
     * 44. [可空] 更新日期
     */
    protected java.util.Date modifydate;

    /**
     * 45. [不可空] 数据来源
     */
    protected String fdataFrom;
    /** 48. [可空] 分娩日期 */
    private java.util.Date labourdate;

    /** 49. [可空] 出院日期 */
    private java.util.Date outhorth;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;



    @Generated(hash = 35681017)
    public EhrMaternalAfter42(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            Long localspecialID, Boolean isEndCase, String followupId,
            String mangementNo, String healthfileNo, String fileNumber,
            java.util.Date followupDate, String maternalHealthState,
            String maternalMindHealthState, Integer systolicPressure,
            Integer diastolicPressure, String maternalBreast,
            String maternalBreastEx, String maternalLochia, String maternalLochiaEx,
            String maternalWomb, String maternalWombEx, String maternalHurt,
            String maternalHurtEx, String maternalOther, String maternalType,
            String maternalTypeEx, String maternalGuideNo,
            String maternalGuideOther, String procFlag, String referralReason,
            String referralOrgCode, String referralOrgName, String referralDepCode,
            String referralDepName, String referralOrgAndDept,
            String followUpDoctorName, String followUpDoctorCode,
            String followUpOrgCode, String followUpOrgName,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String updateFlag, String editor,
            java.util.Date modifydate, String fdataFrom, java.util.Date labourdate,
            java.util.Date outhorth, String editorId, String updateOrgId,
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
        this.procFlag = procFlag;
        this.referralReason = referralReason;
        this.referralOrgCode = referralOrgCode;
        this.referralOrgName = referralOrgName;
        this.referralDepCode = referralDepCode;
        this.referralDepName = referralDepName;
        this.referralOrgAndDept = referralOrgAndDept;
        this.followUpDoctorName = followUpDoctorName;
        this.followUpDoctorCode = followUpDoctorCode;
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
        this.labourdate = labourdate;
        this.outhorth = outhorth;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 219784377)
    public EhrMaternalAfter42() {
    }

    @Override
    public Date getRevisionDate() {
        return modifydate;
    }

    public boolean isUpload() {
        return upload;
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

    @Override
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
        return new Date();
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }

    @Override
    public boolean getUpload() {
        return upload;
    }

    public String getMaternalHealthState() {
        return maternalHealthState;
    }

    public void setMaternalHealthState(String maternalHealthState) {
        this.maternalHealthState = maternalHealthState;
    }

    public String getMaternalMindHealthState() {
        return maternalMindHealthState;
    }

    public void setMaternalMindHealthState(String maternalMindHealthState) {
        this.maternalMindHealthState = maternalMindHealthState;
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

    public String getMaternalBreast() {
        return maternalBreast;
    }

    public void setMaternalBreast(String maternalBreast) {
        this.maternalBreast = maternalBreast;
    }

    public String getMaternalBreastEx() {
        return maternalBreastEx;
    }

    public void setMaternalBreastEx(String maternalBreastEx) {
        this.maternalBreastEx = maternalBreastEx;
    }

    public String getMaternalLochia() {
        return maternalLochia;
    }

    public void setMaternalLochia(String maternalLochia) {
        this.maternalLochia = maternalLochia;
    }

    public String getMaternalLochiaEx() {
        return maternalLochiaEx;
    }

    public void setMaternalLochiaEx(String maternalLochiaEx) {
        this.maternalLochiaEx = maternalLochiaEx;
    }

    public String getMaternalWomb() {
        return maternalWomb;
    }

    public void setMaternalWomb(String maternalWomb) {
        this.maternalWomb = maternalWomb;
    }

    public String getMaternalWombEx() {
        return maternalWombEx;
    }

    public void setMaternalWombEx(String maternalWombEx) {
        this.maternalWombEx = maternalWombEx;
    }

    public String getMaternalHurt() {
        return maternalHurt;
    }

    public void setMaternalHurt(String maternalHurt) {
        this.maternalHurt = maternalHurt;
    }

    public String getMaternalHurtEx() {
        return maternalHurtEx;
    }

    public void setMaternalHurtEx(String maternalHurtEx) {
        this.maternalHurtEx = maternalHurtEx;
    }

    public String getMaternalOther() {
        return maternalOther;
    }

    public void setMaternalOther(String maternalOther) {
        this.maternalOther = maternalOther;
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

    public String getProcFlag() {
        return procFlag;
    }

    public void setProcFlag(String procFlag) {
        this.procFlag = procFlag;
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

    public String getReferralOrgAndDept() {
        return referralOrgAndDept;
    }

    public void setReferralOrgAndDept(String referralOrgAndDept) {
        this.referralOrgAndDept = referralOrgAndDept;
    }

    public String getFollowUpDoctorName() {
        return followUpDoctorName;
    }

    public void setFollowUpDoctorName(String followUpDoctorName) {
        this.followUpDoctorName = followUpDoctorName;
    }

    public String getFollowUpDoctorCode() {
        return followUpDoctorCode;
    }

    public void setFollowUpDoctorCode(String followUpDoctorCode) {
        this.followUpDoctorCode = followUpDoctorCode;
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

    public Date getLabourdate() {
        return labourdate;
    }

    public void setLabourdate(Date labourdate) {
        this.labourdate = labourdate;
    }

    public Date getOuthorth() {
        return outhorth;
    }

    public void setOuthorth(Date outhorth) {
        this.outhorth = outhorth;
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
