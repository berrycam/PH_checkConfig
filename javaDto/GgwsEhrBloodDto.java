package com.konsung.bean;

import java.util.Date;

/**
 * <p>Title:EhrBloodDto </p>
 * <p>Description: </p>
 * <p>Company: Konsung</p>
 *
 * @author HWB
 */
public class GgwsEhrBloodDto {

    private String id;

    /**
     * 1. [不可空] 既往输血史ID
     */
    private String bloodhistoryId;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [不可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [不可空] 输血原因
     */
    private String bloodCause;

    /**
     * 5. [可空] 输血时间
     */
    private java.util.Date bloodTime;

    /**
     * 6. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 7. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 9. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 10. [可空] 修改人
     */
    private String editor;

    /**
     * 11. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 12. [不可空] 修改标志,1新增,2修改,3撤销
     */
    private String updateFlag;

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
     * 备注
     */
    private String remark;
    /**
     * 就诊医院
     */
    private String opsduns;

    /**
     * 获取id的值
     *
     * @return id id值
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id的值
     *
     * @param id id值
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取bloodhistoryId的值
     *
     * @return bloodhistoryId bloodhistoryId值
     */
    public String getBloodhistoryId() {
        return bloodhistoryId;
    }

    /**
     * 设置bloodhistoryId的值
     *
     * @param bloodhistoryId bloodhistoryId值
     */
    public void setBloodhistoryId(String bloodhistoryId) {
        this.bloodhistoryId = bloodhistoryId;
    }

    /**
     * 获取healthfileNo的值
     *
     * @return healthfileNo healthfileNo值
     */
    public String getHealthfileNo() {
        return healthfileNo;
    }

    /**
     * 设置healthfileNo的值
     *
     * @param healthfileNo healthfileNo值
     */
    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    /**
     * 获取fileNumber的值
     *
     * @return fileNumber fileNumber值
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置fileNumber的值
     *
     * @param fileNumber fileNumber值
     */
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取bloodCause的值
     *
     * @return bloodCause bloodCause值
     */
    public String getBloodCause() {
        return bloodCause;
    }

    /**
     * 设置bloodCause的值
     *
     * @param bloodCause bloodCause值
     */
    public void setBloodCause(String bloodCause) {
        this.bloodCause = bloodCause;
    }

    /**
     * 获取bloodTime的值
     *
     * @return bloodTime bloodTime值
     */
    public Date getBloodTime() {
        return bloodTime;
    }

    /**
     * 设置bloodTime的值
     *
     * @param bloodTime bloodTime值
     */
    public void setBloodTime(Date bloodTime) {
        this.bloodTime = bloodTime;
    }

    /**
     * 获取orgCode的值
     *
     * @return orgCode orgCode值
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置orgCode的值
     *
     * @param orgCode orgCode值
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取uploadDate的值
     *
     * @return uploadDate uploadDate值
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置uploadDate的值
     *
     * @param uploadDate uploadDate值
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 获取fdataFrom的值
     *
     * @return fdataFrom fdataFrom值
     */
    public String getFdataFrom() {
        return fdataFrom;
    }

    /**
     * 设置fdataFrom的值
     *
     * @param fdataFrom fdataFrom值
     */
    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    /**
     * 获取editor的值
     *
     * @return editor editor值
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 设置editor的值
     *
     * @param editor editor值
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 获取modifydate的值
     *
     * @return modifydate modifydate值
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * 设置modifydate的值
     *
     * @param modifydate modifydate值
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 获取updateFlag的值
     *
     * @return updateFlag updateFlag值
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置updateFlag的值
     *
     * @param updateFlag updateFlag值
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getUpdateOrgId() {
        return updateOrgId;
    }

    public void setUpdateOrgId(String updateOrgId) {
        this.updateOrgId = updateOrgId;
    }

    public String getUpdateOrgName() {
        return updateOrgName;
    }

    public void setUpdateOrgName(String updateOrgName) {
        this.updateOrgName = updateOrgName;
    }
}
