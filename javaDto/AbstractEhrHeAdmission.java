package com.konsung.bean;

import com.konsung.utils.GlobalVariable;

public class AbstractEhrHeAdmission {

    private String id;

    /**
     * 1. [不可空] 住院治疗情况ID
     */
    private String admissionId;

    /**
     * 2. [不可空] 健康体检流水号
     */
    private String visitingSerialNumber;

    /**
     * 3. [可空] 基本信息号
     */
    private String fileNumber;

    /**
     * 4. [可空] 入院日期
     */
    private java.util.Date dateOfAdmission;

    /**
     * 5. [可空] 出院日期
     */
    private java.util.Date dateOfDischarge;

    /**
     * 6. [可空] 入院原因
     */
    private String admissionCause;

    /**
     * 7. [可空] 机构名称
     */
    private String orgName;

    /**
     * 8. [可空] 病案号
     */
    private String baNo;

    /**
     * 9. [不可空] 住院类别 1住院  2家庭病床
     */
    private String admissionType;

    /**
     * 10. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 11. [不可空] 上传时间
     */
    private java.util.Date uploadDate;

    /**
     * 12. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 13. [可空] 修改者
     */
    private String editor;

    /**
     * 14. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 15. [不可空] 修改标志,1新增,2修改,3撤销
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdmissionId() {
        return this.admissionId;
    }

    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId;
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

    public java.util.Date getDateOfAdmission() {
        return this.dateOfAdmission;
    }

    public void setDateOfAdmission(java.util.Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public java.util.Date getDateOfDischarge() {
        return this.dateOfDischarge;
    }

    public void setDateOfDischarge(java.util.Date dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getAdmissionCause() {
        return this.admissionCause;
    }

    public void setAdmissionCause(String admissionCause) {
        this.admissionCause = admissionCause;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;

        UserBean userBean = GlobalVariable.currentUserBean;
        if (userBean != null) {
            editorId = userBean.getEmpId();
            updateOrgId = userBean.getOrgId();
            updateOrgName = userBean.getOrgName();
        }
    }

    public String getBaNo() {
        return this.baNo;
    }

    public void setBaNo(String baNo) {
        this.baNo = baNo;
    }

    public String getAdmissionType() {
        return this.admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
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
