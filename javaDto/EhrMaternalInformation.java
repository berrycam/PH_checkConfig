package com.konsung.bean.maternal;

import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 抽象 孕产妇基本信息登记类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String mangementNo 孕卡编号
 * 2. [不可空] String healthfileNo 个人健康档案编码
 * 3. [可空] String fileNumber 基本信息档案号
 * 4. [可空] Integer maternalAge 孕妇年龄
 * 5. [可空] String husbandFileNumber 丈夫基本信息档案号
 * 6. [可空] String husbandName 丈夫姓名
 * 7. [可空] Integer husbandAge 丈夫年龄
 * 8. [可空] String husbandTel 丈夫电话
 * 9. [可空] Integer pregnantTimes 孕次
 * 10. [可空] Integer bornTimes 产次
 * 11. [可空] Integer vaginalDeliveryTimes 阴道分娩次数
 * 12. [可空] Integer cesareanTimes 剖宫产次数
 * 13. [不可空] java.util.Date lastMenstrualDate 末次月经
 * 14. [可空] java.util.Date expectedDate 预产期
 * 15. [可空] java.util.Date entryDate 登记时间
 * 16. [可空] String entryEmpCode 登记人员编码
 * 17. [可空] String entryEmpName 登记人员名称
 * 18. [可空] String entryOrgCode 登记机构编码
 * 19. [可空] String entryOrgName 登记机构名称
 * 20. [不可空] String orgCode 医疗机构代码
 * 21. [不可空] java.util.Date uploadDate 填报日期
 * 22. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 23. [主键] String id 主键
 * 24. [可空] String editor 修改人
 * 25. [可空] java.util.Date modifydate 更新日期
 * 26. [不可空] String fdataFrom 数据来源
 * 27. [可空] java.util.Date endCaseDate 结案时间
 * 28. [可空] String endCaseReasonCode 结案原因代码
 * 29. [不可空] Boolean endCaseFlag 结案标志
 * 30. [可空] String endCaseOrgCode 结案结构代码
 * 31. [可空] String endCaseOrgName 结案机构名称
 * 32. [可空] String endCaseDoctorCode 结案人员代码
 * 33. [可空] String endCaseDoctorName 结案人员名称
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrMaternalInformation extends BaseChildBean {

    /*
     * 本程序不允许修改！！！
     */
    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    private Long localId;

    private String id;
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
    /**
     * 是否结案 联网结案
     */
    private boolean isEndCase;

    /** 1. [不可空] 孕卡编号 */
    protected String mangementNo;

    /** 2. [不可空] 个人健康档案编码 */
    protected String healthfileNo;

    /** 3. [可空] 基本信息档案号 */
    protected String fileNumber;

    /** 4. [可空] 孕妇年龄 */
//    protected Integer maternalAge;

    /** 5. [可空] 丈夫基本信息档案号 */
    protected String husbandFileNumber;

    /** 6. [可空] 丈夫姓名 */
    protected String husbandName;

    /** 7. [可空] 丈夫年龄 */
    protected Integer husbandAge;

    /** 8. [可空] 丈夫电话 */
    protected String husbandTel;

    /** 9. [可空] 孕次 */
    protected Integer pregnantTimes;

    /** 10. [可空] 产次 */
    protected Integer bornTimes;

    /** 11. [可空] 阴道分娩次数 */
    protected Integer vaginalDeliveryTimes;

    /** 12. [可空] 剖宫产次数 */
    protected Integer cesareanTimes;

    /** 13. [不可空] 末次月经 */
    protected java.util.Date lastMenstrualDate;

    /** 14. [可空] 预产期 */
    protected java.util.Date expectedDate;

    /** 15. [可空] 登记时间 */
    protected java.util.Date entryDate;

    /** 16. [可空] 登记人员编码 */
    protected String entryEmpCode;

    /** 17. [可空] 登记人员名称 */
    protected String entryEmpName;

    /** 18. [可空] 登记机构编码 */
    protected String entryOrgCode;

    /** 19. [可空] 登记机构名称 */
    protected String entryOrgName;

    /** 20. [不可空] 医疗机构代码 */
    protected String orgCode;

    /** 21. [不可空] 填报日期 */
    protected java.util.Date uploadDate;

    /** 22. [不可空] 修改标志 1：正常、2：修改、3：撤销 */
    protected String updateFlag;

    /** 24. [可空] 修改人 */
    protected String editor;

    /** 25. [可空] 更新日期 */
    protected java.util.Date modifydate;

    /** 26. [不可空] 数据来源 */
    protected String fdataFrom;

    /** 27. [可空] 结案时间 */
    protected java.util.Date endCaseDate;

    /** 28. [可空] 结案原因代码 */
    protected String endCaseReasonCode;

    /** 29. [不可空] 结案标志 */
    protected Boolean endCaseFlag;

    /** 30. [可空] 结案结构代码 */
    protected String endCaseOrgCode;

    /** 31. [可空] 结案机构名称 */
    protected String endCaseOrgName;

    /** 32. [可空] 结案人员代码 */
    protected String endCaseDoctorCode;

    /** 33. [可空] 结案人员名称 */
    protected String endCaseDoctorName;

    /** 34. [可空] 孕妇孕周 */
    private Integer maternalWeek;

    /** 35. [可空] 孕妇姓名 */
//    private String maternalName;

    /** 36. [可空] 孕产妇联系电话 */
//    private String maternalMtel;

    /** 37. [可空] 丈夫证件号码 */
    private String husbandIdcard;

    /** 38. [可空] 备注 */
    private String remarks;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 1335120351)
    public EhrMaternalInformation(Long localId, String id, String idCard,
            String vipCard, boolean upload, boolean completed, String title,
            boolean isEndCase, String mangementNo, String healthfileNo,
            String fileNumber, String husbandFileNumber, String husbandName,
            Integer husbandAge, String husbandTel, Integer pregnantTimes,
            Integer bornTimes, Integer vaginalDeliveryTimes, Integer cesareanTimes,
            java.util.Date lastMenstrualDate, java.util.Date expectedDate,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String updateFlag, String editor,
            java.util.Date modifydate, String fdataFrom, java.util.Date endCaseDate,
            String endCaseReasonCode, Boolean endCaseFlag, String endCaseOrgCode,
            String endCaseOrgName, String endCaseDoctorCode,
            String endCaseDoctorName, Integer maternalWeek, String husbandIdcard,
            String remarks, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.id = id;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.isEndCase = isEndCase;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.husbandFileNumber = husbandFileNumber;
        this.husbandName = husbandName;
        this.husbandAge = husbandAge;
        this.husbandTel = husbandTel;
        this.pregnantTimes = pregnantTimes;
        this.bornTimes = bornTimes;
        this.vaginalDeliveryTimes = vaginalDeliveryTimes;
        this.cesareanTimes = cesareanTimes;
        this.lastMenstrualDate = lastMenstrualDate;
        this.expectedDate = expectedDate;
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
        this.endCaseDate = endCaseDate;
        this.endCaseReasonCode = endCaseReasonCode;
        this.endCaseFlag = endCaseFlag;
        this.endCaseOrgCode = endCaseOrgCode;
        this.endCaseOrgName = endCaseOrgName;
        this.endCaseDoctorCode = endCaseDoctorCode;
        this.endCaseDoctorName = endCaseDoctorName;
        this.maternalWeek = maternalWeek;
        this.husbandIdcard = husbandIdcard;
        this.remarks = remarks;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 180655503)
    public EhrMaternalInformation() {
    }

    public boolean isEndCase() {
        return isEndCase;
    }

    public void setEndCase(boolean endCase) {
        isEndCase = endCase;
    }

    public Integer getMaternalWeek() {
        return maternalWeek;
    }

    public void setMaternalWeek(Integer maternalWeek) {
        this.maternalWeek = maternalWeek;
    }

   /* public String getMaternalName() {
        return maternalName;
    }

    public void setMaternalName(String maternalName) {
        this.maternalName = maternalName;
    }

    public String getMaternalMtel() {
        return maternalMtel;
    }

    public void setMaternalMtel(String maternalMtel) {
        this.maternalMtel = maternalMtel;
    }*/

    public String getHusbandIdcard() {
        return husbandIdcard;
    }

    public void setHusbandIdcard(String husbandIdcard) {
        this.husbandIdcard = husbandIdcard;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    @Override
    public boolean getUpload() {
        return upload;
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

    /*public Integer getMaternalAge() {
        return maternalAge;
    }

    public void setMaternalAge(Integer maternalAge) {
        this.maternalAge = maternalAge;
    }*/

    public String getHusbandFileNumber() {
        return husbandFileNumber;
    }

    public void setHusbandFileNumber(String husbandFileNumber) {
        this.husbandFileNumber = husbandFileNumber;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public Integer getHusbandAge() {
        return husbandAge;
    }

    public void setHusbandAge(Integer husbandAge) {
        this.husbandAge = husbandAge;
    }

    public String getHusbandTel() {
        return husbandTel;
    }

    public void setHusbandTel(String husbandTel) {
        this.husbandTel = husbandTel;
    }

    public Integer getPregnantTimes() {
        return pregnantTimes;
    }

    public void setPregnantTimes(Integer pregnantTimes) {
        this.pregnantTimes = pregnantTimes;
    }

    public Integer getBornTimes() {
        return bornTimes;
    }

    public void setBornTimes(Integer bornTimes) {
        this.bornTimes = bornTimes;
    }

    public Integer getVaginalDeliveryTimes() {
        return vaginalDeliveryTimes;
    }

    public void setVaginalDeliveryTimes(Integer vaginalDeliveryTimes) {
        this.vaginalDeliveryTimes = vaginalDeliveryTimes;
    }

    public Integer getCesareanTimes() {
        return cesareanTimes;
    }

    public void setCesareanTimes(Integer cesareanTimes) {
        this.cesareanTimes = cesareanTimes;
    }

    public Date getLastMenstrualDate() {
        return lastMenstrualDate;
    }

    public void setLastMenstrualDate(Date lastMenstrualDate) {
        this.lastMenstrualDate = lastMenstrualDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
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

    public Date getEndCaseDate() {
        return endCaseDate;
    }

    public void setEndCaseDate(Date endCaseDate) {
        this.endCaseDate = endCaseDate;
    }

    public String getEndCaseReasonCode() {
        return endCaseReasonCode;
    }

    public void setEndCaseReasonCode(String endCaseReasonCode) {
        this.endCaseReasonCode = endCaseReasonCode;
    }

    public Boolean getEndCaseFlag() {
        return endCaseFlag;
    }

    public void setEndCaseFlag(Boolean endCaseFlag) {
        this.endCaseFlag = endCaseFlag;
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

    public String getEndCaseDoctorCode() {
        return endCaseDoctorCode;
    }

    public void setEndCaseDoctorCode(String endCaseDoctorCode) {
        this.endCaseDoctorCode = endCaseDoctorCode;
    }

    public String getEndCaseDoctorName() {
        return endCaseDoctorName;
    }

    public void setEndCaseDoctorName(String endCaseDoctorName) {
        this.endCaseDoctorName = endCaseDoctorName;
    }

    public boolean getIsEndCase() {
        return this.isEndCase;
    }

    public void setIsEndCase(boolean isEndCase) {
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
