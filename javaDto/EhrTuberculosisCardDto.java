package com.konsung.bean.tuber;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 肺结核专项档案
 * @author kuangguohua
 *
 */
@Entity
public class EhrTuberculosisCardDto extends BaseChildBean {
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
     * 是否结案 联网结案
     */
    private boolean isEndCase;

    /** 2. [不可空] 专项档案号 */
    protected String cardId;

    /** 3. [不可空] 健康档案号 */
    protected String healthfileNo;

    /** 4. [可空] 姓名 */
//    protected String name;

    /** 5. [可空] 性别 */
//    protected String gender;

    /** 6. [可空] 生日 */
//    protected java.util.Date birthday;

    /** 7. [可空] 身份证号 */
//    protected String idNumber;

    /** 8. [可空] 确诊机构 */
    protected String confirmOrgCode;

    /** 9. [可空] 确诊机构名称 */
    protected String confirmOrgName;

    /** 10. [可空] 确诊日期 */
    protected java.util.Date confirmDate;

    /** 11. [可空] 录入日期 */
    protected java.util.Date entryDate;

    /** 12. [可空] 结案标志 */
    protected String endFlag;

    /** 13. [可空] 结案日期 */
    protected java.util.Date endDate;

    /** 14. [可空] 上传日期 */
    protected java.util.Date uploadDate;

    /** 15. [可空] 数据来源 */
    protected String fdataFrom;

    /** 16. [可空] 修改人 */
    protected String editor;

    /** 17. [可空] 修改日期 */
    protected java.util.Date modifydate;

    /** 18. [可空] 修改标志 */
    protected String updateFlag;
    
    /** 19. [可空] 录入机构编码 */
    protected String entryOrgCode;

    /** 20. [可空] 录入机构名称 */
    protected String entryOrgName;
    
    private String endCaseOrgCode;
	private String endCaseOrgName;
	private String endCaseEmpCode;
	private String endCaseEmpName;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 962961602)
    public EhrTuberculosisCardDto(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            boolean isEndCase, String cardId, String healthfileNo,
            String confirmOrgCode, String confirmOrgName,
            java.util.Date confirmDate, java.util.Date entryDate, String endFlag,
            java.util.Date endDate, java.util.Date uploadDate, String fdataFrom,
            String editor, java.util.Date modifydate, String updateFlag,
            String entryOrgCode, String entryOrgName, String endCaseOrgCode,
            String endCaseOrgName, String endCaseEmpCode, String endCaseEmpName,
            String editorId, String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.isEndCase = isEndCase;
        this.cardId = cardId;
        this.healthfileNo = healthfileNo;
        this.confirmOrgCode = confirmOrgCode;
        this.confirmOrgName = confirmOrgName;
        this.confirmDate = confirmDate;
        this.entryDate = entryDate;
        this.endFlag = endFlag;
        this.endDate = endDate;
        this.uploadDate = uploadDate;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.endCaseOrgCode = endCaseOrgCode;
        this.endCaseOrgName = endCaseOrgName;
        this.endCaseEmpCode = endCaseEmpCode;
        this.endCaseEmpName = endCaseEmpName;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1392507610)
    public EhrTuberculosisCardDto() {
    }

    public boolean isEndCase() {
        return isEndCase;
    }

    public void setEndCase(boolean endCase) {
        isEndCase = endCase;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }*/

    /*public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }*/

    public String getConfirmOrgCode() {
        return confirmOrgCode;
    }

    public void setConfirmOrgCode(String confirmOrgCode) {
        this.confirmOrgCode = confirmOrgCode;
    }

    public String getConfirmOrgName() {
        return confirmOrgName;
    }

    public void setConfirmOrgName(String confirmOrgName) {
        this.confirmOrgName = confirmOrgName;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getEndCaseEmpCode() {
        return endCaseEmpCode;
    }

    public void setEndCaseEmpCode(String endCaseEmpCode) {
        this.endCaseEmpCode = endCaseEmpCode;
    }

    public String getEndCaseEmpName() {
        return endCaseEmpName;
    }

    public void setEndCaseEmpName(String endCaseEmpName) {
        this.endCaseEmpName = endCaseEmpName;
    }

    public boolean getUpload() {
        return this.upload;
    }

    public boolean getCompleted() {
        return this.completed;
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
}
