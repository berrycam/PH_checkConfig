package com.konsung.bean;

import java.util.Date;

/**
 * <p>Title:GgwsEhrOperationDto </p>
 * <p>Description: </p>
 * <p>Company: Konsung</p>
 *
 * @author HWB
 */
public class GgwsEhrOperationDto {

    private String id;

    /**
     * 1. [不可空] 既往手术史ID
     */
    private String operationhistoryId;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [不可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [不可空] 手术名称
     */
    private String operationName;

    /**
     * 5. [可空] 手术时间
     */
    private java.util.Date operationTime;

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
     * 获取operationhistoryId的值
     *
     * @return operationhistoryId operationhistoryId值
     */
    public String getOperationhistoryId() {
        return operationhistoryId;
    }

    /**
     * 设置operationhistoryId的值
     *
     * @param operationhistoryId operationhistoryId值
     */
    public void setOperationhistoryId(String operationhistoryId) {
        this.operationhistoryId = operationhistoryId;
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
     * 获取operationName的值
     *
     * @return operationName operationName值
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 设置operationName的值
     *
     * @param operationName operationName值
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * 获取operationTime的值
     *
     * @return operationTime operationTime值
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 设置operationTime的值
     *
     * @param operationTime operationTime值
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
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
