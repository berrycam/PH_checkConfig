package com.konsung.bean;

import com.konsung.utils.GlobalVariable;

public class AbstractEhrHeNpimmunization {

    private String id;

    /**
     * 1. [不可空] 非计划免疫接种史ID
     */
    private String npimmunizationId;

    /**
     * 2. [不可空] 健康体检流水号
     */
    private String visitingSerialNumber;

    /**
     * 3. [可空] file_number
     */
    private String fileNumber;

    /**
     * 4. [可空] 名称
     */
    private String npimmunizationName;

    /**
     * 5. [可空] 接种日期
     */
    private java.util.Date vaccinationDate;

    /**
     * 6. [不可空] 接种机构
     */
    private String orgName;

    /**
     * 7. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 8. [不可空] 上传时间
     */
    private java.util.Date uploadDate;

    /**
     * 10. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 11. [可空] 修改者
     */
    private String editor;

    /**
     * 12. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 13. [不可空] 修改标志
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

    public String getNpimmunizationId() {
        return this.npimmunizationId;
    }

    public void setNpimmunizationId(String npimmunizationId) {
        this.npimmunizationId = npimmunizationId;
    }

    public String getVisitingSerialNumber() {
        return this.visitingSerialNumber;
    }

    public void setVisitingSerialNumber(String visitingSerialNumber) {
        this.visitingSerialNumber = visitingSerialNumber;
    }

    public String getFileNumber() {
        return this.fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getNpimmunizationName() {
        return this.npimmunizationName;
    }

    public void setNpimmunizationName(String npimmunizationName) {
        this.npimmunizationName = npimmunizationName;
        UserBean userBean = GlobalVariable.currentUserBean;
        if (userBean != null) {
            editorId = userBean.getEmpId();
            updateOrgId = userBean.getOrgId();
            updateOrgName = userBean.getOrgName();
        }
    }

    public java.util.Date getVaccinationDate() {
        return this.vaccinationDate;
    }

    public void setVaccinationDate(java.util.Date vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
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

    public String getUpdateFlag() {
        return this.updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
