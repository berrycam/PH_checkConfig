package com.konsung.bean;

import com.konsung.utils.GlobalVariable;

import java.util.Date;

/**
 * <p>Title:GgwsEhrFamilyDto </p>
 * <p>Description: </p>
 * <p>Company: Konsung</p>
 *
 * @author HWB
 */
public class GgwsEhrFamilyDto {

    private String id;

    /**
     * 1. [不可空] 家族史ID
     */
    private String familyhistoryId;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [不可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [不可空] 关系代码
     */
    private String relationCode;

    /**
     * 5. [不可空] 关系名称
     */
    private String relationName;

    /**
     * 6. [不可空] 疾病代码
     */
    private String diseasesCode;

    /**
     * 7. [可空] 疾病名称
     */
    private String diseasesName;

    /**
     * 8. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 9. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 11. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 12. [可空] 修改人
     */
    private String editor;

    /**
     * 13. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 14. [不可空] 修改标志,1新增,2修改,3撤销
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
     * 获取familyhistoryId的值
     *
     * @return familyhistoryId familyhistoryId值
     */
    public String getFamilyhistoryId() {
        return familyhistoryId;
    }

    /**
     * 设置familyhistoryId的值
     *
     * @param familyhistoryId familyhistoryId值
     */
    public void setFamilyhistoryId(String familyhistoryId) {
        this.familyhistoryId = familyhistoryId;
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
     * 获取relationCode的值
     *
     * @return relationCode relationCode值
     */
    public String getRelationCode() {
        return relationCode;
    }

    /**
     * 设置relationCode的值
     *
     * @param relationCode relationCode值
     */
    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    /**
     * 获取relationName的值
     *
     * @return relationName relationName值
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * 设置relationName的值
     *
     * @param relationName relationName值
     */
    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    /**
     * 获取diseasesCode的值
     *
     * @return diseasesCode diseasesCode值
     */
    public String getDiseasesCode() {
        return diseasesCode;
    }

    /**
     * 设置diseasesCode的值
     *
     * @param diseasesCode diseasesCode值
     */
    public void setDiseasesCode(String diseasesCode) {
        this.diseasesCode = diseasesCode;
    }

    /**
     * 获取diseasesName的值
     *
     * @return diseasesName diseasesName值
     */
    public String getDiseasesName() {
        return diseasesName;
    }

    /**
     * 设置diseasesName的值
     *
     * @param diseasesName diseasesName值
     */
    public void setDiseasesName(String diseasesName) {
        this.diseasesName = diseasesName;

        UserBean userBean = GlobalVariable.currentUserBean;
        if (userBean != null) {
            editorId = userBean.getEmpId();
            updateOrgId = userBean.getOrgId();
            updateOrgName = userBean.getOrgName();
        }
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
