package com.konsung.bean;

public class AbstractEhrHeDrug {

    private String id;

    /**
     * 1. [不可空] drug_id
     */
    protected String drugId;

    /**
     * 2. [不可空] drug_from
     */
    protected String drugFrom;

    /**
     * 3. [不可空] 来源表流水号
     */
    protected String visitingSerialNumber;

    /**
     * 4. [可空] file_number
     */
    protected String fileNumber;

    /**
     * 5. [可空] 用药名称
     */
    protected String drugName;

    /**
     * 6. [可空] 用法
     */
    protected String drugUseMeansCode;

    /**
     * 7. [可空] 用量
     */
    protected String singleDose;

    /**
     * 8. [可空] 用药时间
     */
    protected String drugUseTime;

    /**
     * 9. [可空] 服药依从性
     */
    protected String drugUseLaw;

    /**
     * 10. [不可空] org_code
     */
    protected String orgCode;

    /**
     * 11. [不可空] upload_date
     */
    protected java.util.Date uploadDate;

    /**
     * 13. [可空] drug_specification
     */
    protected String drugSpecification;

    /**
     * 14. [可空] drug_use_frequency
     */
    protected String drugUseFrequency;

    /**
     * 15. [可空] drug_use_time_unit
     */
    protected String drugUseTimeUnit;

    /**
     * 16. [不可空] fdata_from
     */
    protected String fdataFrom;

    /**
     * 17. [可空] editor
     */
    protected String editor;

    /**
     * 18. [可空] modifydate
     */
    protected java.util.Date modifydate;

    /**
     * 19. [不可空] update_flag
     */
    protected String updateFlag;

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

    public String getDrugId() {
        return this.drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugFrom() {
        return this.drugFrom;
    }

    public void setDrugFrom(String drugFrom) {
        this.drugFrom = drugFrom;
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

    public String getDrugName() {
        return this.drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugUseMeansCode() {
        return this.drugUseMeansCode;
    }

    public void setDrugUseMeansCode(String drugUseMeansCode) {
        this.drugUseMeansCode = drugUseMeansCode;
    }

    public String getSingleDose() {
        return this.singleDose;
    }

    public void setSingleDose(String singleDose) {
        this.singleDose = singleDose;
    }

    public String getDrugUseTime() {
        return this.drugUseTime;
    }

    public void setDrugUseTime(String drugUseTime) {
        this.drugUseTime = drugUseTime;
    }

    public String getDrugUseLaw() {
        return this.drugUseLaw;
    }

    public void setDrugUseLaw(String drugUseLaw) {
        this.drugUseLaw = drugUseLaw;
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

    public String getDrugSpecification() {
        return this.drugSpecification;
    }

    public void setDrugSpecification(String drugSpecification) {
        this.drugSpecification = drugSpecification;
    }

    public String getDrugUseFrequency() {
        return this.drugUseFrequency;
    }

    public void setDrugUseFrequency(String drugUseFrequency) {
        this.drugUseFrequency = drugUseFrequency;
    }

    public String getDrugUseTimeUnit() {
        return this.drugUseTimeUnit;
    }

    public void setDrugUseTimeUnit(String drugUseTimeUnit) {
        this.drugUseTimeUnit = drugUseTimeUnit;
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
