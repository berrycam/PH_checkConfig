// CHECKSTYLE:OFF

package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 高血压患者信息登记类。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String mangementNo 高血压专案编号
 * 2. [不可空] String healthfileNo 个人健康档案编码
 * 3. [可空] String fileNumber 基本信息档案号
 * 4. [不可空] String bloodLevelCode 血压分级代码
 * 5. [可空] java.util.Date confirmDate 确诊日期
 * 6. [可空] String confirmOrgCode 确诊机构编码
 * 7. [可空] String confirmOrgName 确诊机构名称
 * 8. [可空] String createDoctorCode 登记医生编码
 * 9. [可空] String createDoctorName 登记医生名称
 * 10. [可空] java.util.Date createDate 登记日期
 * 11. [可空] Boolean endCaseFlag 结案标志
 * 12. [可空] String endCaseReasonCode 结案原因代码
 * 13. [可空] java.util.Date createCaseDate 建案日期
 * 14. [可空] java.util.Date endCaseDate 结案日期
 * 15. [可空] String managerOrgCode 管理机构编码
 * 16. [可空] String managerOrgName 管理机构名称
 * 17. [可空] java.util.Date entryDate 登记时间
 * 18. [不可空] String entryEmpCode 登记人员编码
 * 19. [可空] String entryEmpName 登记人员名称
 * 20. [可空] String entryOrgCode 登记机构编码
 * 21. [可空] String entryOrgName 登记机构名称
 * 22. [不可空] String orgCode 医疗机构代码
 * 23. [不可空] java.util.Date uploadDate 填报日期
 * 24. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 25. [主键] String id 主键
 * 26. [可空] String editor 修改人
 * 27. [可空] java.util.Date modifydate 更新日期
 * 28. [不可空] String fdataFrom 数据来源
 * </pre>
 * <p>
 * <p><a href="file:///D:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com
 * /ks/imms/domain/model/domain/base/EhrHypertensionInfomation.html">
 * EhrHypertensionInfomation代码模板</a>
 * @author Benewit Code Generator V1.0
 */
@Entity
public class AbstractEhrHypertensionInfomation {

    /**
     * 本地id
     */
    @Id(autoincrement = true)
    @Expose
    private Long localId;

    /**
     * 身份证
     */
    @Expose
    private String idCard;

    /**
     * 会员卡
     */
    @Expose
    private String vipCard;

    /**
     * 是否上传
     */
    @Expose // 不被Gson 解析
    private boolean upload = false;

    /**
     * 服务器id
     */
    private String id;

    /**
     * 1. [不可空] 高血压专案编号
     */
    private String mangementNo;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [不可空] 血压分级代码
     */
    private String bloodLevelCode;

    /**
     * 5. [可空] 确诊日期
     */
    private Date confirmDate;

    /**
     * 6. [可空] 确诊机构编码
     */
    private String confirmOrgCode;

    /**
     * 7. [可空] 确诊机构名称
     */
    private String confirmOrgName;

    /**
     * 8. [可空] 登记医生编码
     */
    private String createDoctorCode;

    /**
     * 9. [可空] 登记医生名称
     */
    private String createDoctorName;

    /**
     * 10. [可空] 登记日期
     */
    private java.util.Date createDate;

    /**
     * 11. [可空] 结案标志
     */
    private Boolean endCaseFlag;

    /**
     * 12. [可空] 结案原因代码
     */
    private String endCaseReasonCode;

    /**
     * 13. [可空] 建案日期
     */
    private Date createCaseDate;

    /**
     * 14. [可空] 结案日期
     */
    private Date endCaseDate;

    /**
     * 15. [可空] 管理机构编码
     */
    private String managerOrgCode;

    /**
     * 16. [可空] 管理机构名称
     */
    private String managerOrgName;

    /**
     * 17. [可空] 登记时间
     */
    private Date entryDate;

    /**
     * 18. [不可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 19. [可空] 登记人员名称
     */
    private String entryEmpName;

    /**
     * 20. [可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 21. [可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 22. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 23. [不可空] 填报日期
     */
    private Date uploadDate;

    /**
     * 24. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    private String updateFlag;

    /**
     * 26. [可空] 修改人
     */
    private String editor;

    /**
     * 27. [可空] 更新日期
     */
    private Date modifydate;

    /**
     * 28. [不可空] 数据来源
     */
    private String fdataFrom;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 1130527735)
    public AbstractEhrHypertensionInfomation(Long localId, String idCard, String vipCard,
            boolean upload, String id, String mangementNo, String healthfileNo,
            String fileNumber, String bloodLevelCode, Date confirmDate, String confirmOrgCode,
            String confirmOrgName, String createDoctorCode, String createDoctorName,
            java.util.Date createDate, Boolean endCaseFlag, String endCaseReasonCode,
            Date createCaseDate, Date endCaseDate, String managerOrgCode,
            String managerOrgName, Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode, Date uploadDate,
            String updateFlag, String editor, Date modifydate, String fdataFrom,
            String editorId, String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.id = id;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.bloodLevelCode = bloodLevelCode;
        this.confirmDate = confirmDate;
        this.confirmOrgCode = confirmOrgCode;
        this.confirmOrgName = confirmOrgName;
        this.createDoctorCode = createDoctorCode;
        this.createDoctorName = createDoctorName;
        this.createDate = createDate;
        this.endCaseFlag = endCaseFlag;
        this.endCaseReasonCode = endCaseReasonCode;
        this.createCaseDate = createCaseDate;
        this.endCaseDate = endCaseDate;
        this.managerOrgCode = managerOrgCode;
        this.managerOrgName = managerOrgName;
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
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1309763569)
    public AbstractEhrHypertensionInfomation() {
    }

    /**
     * 获取mangementNo的值
     * @return mangementNo mangementNo值
     */
    public String getMangementNo() {
        return mangementNo;
    }

    /**
     * 设置mangementNo的值
     * @param mangementNo mangementNo值
     */
    public void setMangementNo(String mangementNo) {
        this.mangementNo = mangementNo;
    }

    /**
     * 获取healthfileNo的值
     * @return healthfileNo healthfileNo值
     */
    public String getHealthfileNo() {
        return healthfileNo;
    }

    /**
     * 设置healthfileNo的值
     * @param healthfileNo healthfileNo值
     */
    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    /**
     * 获取fileNumber的值
     * @return fileNumber fileNumber值
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置fileNumber的值
     * @param fileNumber fileNumber值
     */
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取bloodLevelCode的值
     * @return bloodLevelCode bloodLevelCode值
     */
    public String getBloodLevelCode() {
        return bloodLevelCode;
    }

    /**
     * 设置bloodLevelCode的值
     * @param bloodLevelCode bloodLevelCode值
     */
    public void setBloodLevelCode(String bloodLevelCode) {
        this.bloodLevelCode = bloodLevelCode;
    }

    /**
     * 获取confirmDate的值
     * @return confirmDate confirmDate值
     */
    public Date getConfirmDate() {
        return confirmDate;
    }

    /**
     * 设置confirmDate的值
     * @param confirmDate confirmDate值
     */
    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    /**
     * 获取confirmOrgCode的值
     * @return confirmOrgCode confirmOrgCode值
     */
    public String getConfirmOrgCode() {
        return confirmOrgCode;
    }

    /**
     * 设置confirmOrgCode的值
     * @param confirmOrgCode confirmOrgCode值
     */
    public void setConfirmOrgCode(String confirmOrgCode) {
        this.confirmOrgCode = confirmOrgCode;
    }

    /**
     * 获取confirmOrgName的值
     * @return confirmOrgName confirmOrgName值
     */
    public String getConfirmOrgName() {
        return confirmOrgName;
    }

    /**
     * 设置confirmOrgName的值
     * @param confirmOrgName confirmOrgName值
     */
    public void setConfirmOrgName(String confirmOrgName) {
        this.confirmOrgName = confirmOrgName;
    }

    /**
     * 获取createDoctorCode的值
     * @return createDoctorCode createDoctorCode值
     */
    public String getCreateDoctorCode() {
        return createDoctorCode;
    }

    /**
     * 设置createDoctorCode的值
     * @param createDoctorCode createDoctorCode值
     */
    public void setCreateDoctorCode(String createDoctorCode) {
        this.createDoctorCode = createDoctorCode;
    }

    /**
     * 获取createDoctorName的值
     * @return createDoctorName createDoctorName值
     */
    public String getCreateDoctorName() {
        return createDoctorName;
    }

    /**
     * 设置createDoctorName的值
     * @param createDoctorName createDoctorName值
     */
    public void setCreateDoctorName(String createDoctorName) {
        this.createDoctorName = createDoctorName;
    }

    /**
     * 获取createDate的值
     * @return createDate createDate值
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate的值
     * @param createDate createDate值
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取endCaseFlag的值
     * @return endCaseFlag endCaseFlag值
     */
    public Boolean getEndCaseFlag() {
        return endCaseFlag;
    }

    /**
     * 设置endCaseFlag的值
     * @param endCaseFlag endCaseFlag值
     */
    public void setEndCaseFlag(Boolean endCaseFlag) {
        this.endCaseFlag = endCaseFlag;
    }

    /**
     * 获取endCaseReasonCode的值
     * @return endCaseReasonCode endCaseReasonCode值
     */
    public String getEndCaseReasonCode() {
        return endCaseReasonCode;
    }

    /**
     * 设置endCaseReasonCode的值
     * @param endCaseReasonCode endCaseReasonCode值
     */
    public void setEndCaseReasonCode(String endCaseReasonCode) {
        this.endCaseReasonCode = endCaseReasonCode;
    }

    /**
     * 获取createCaseDate的值
     * @return createCaseDate createCaseDate值
     */
    public Date getCreateCaseDate() {
        return createCaseDate;
    }

    /**
     * 设置createCaseDate的值
     * @param createCaseDate createCaseDate值
     */
    public void setCreateCaseDate(Date createCaseDate) {
        this.createCaseDate = createCaseDate;
    }

    /**
     * 获取endCaseDate的值
     * @return endCaseDate endCaseDate值
     */
    public Date getEndCaseDate() {
        return endCaseDate;
    }

    /**
     * 设置endCaseDate的值
     * @param endCaseDate endCaseDate值
     */
    public void setEndCaseDate(Date endCaseDate) {
        this.endCaseDate = endCaseDate;
    }

    /**
     * 获取managerOrgCode的值
     * @return managerOrgCode managerOrgCode值
     */
    public String getManagerOrgCode() {
        return managerOrgCode;
    }

    /**
     * 设置managerOrgCode的值
     * @param managerOrgCode managerOrgCode值
     */
    public void setManagerOrgCode(String managerOrgCode) {
        this.managerOrgCode = managerOrgCode;
    }

    /**
     * 获取managerOrgName的值
     * @return managerOrgName managerOrgName值
     */
    public String getManagerOrgName() {
        return managerOrgName;
    }

    /**
     * 设置managerOrgName的值
     * @param managerOrgName managerOrgName值
     */
    public void setManagerOrgName(String managerOrgName) {
        this.managerOrgName = managerOrgName;
    }

    /**
     * 获取entryDate的值
     * @return entryDate entryDate值
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * 设置entryDate的值
     * @param entryDate entryDate值
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * 获取entryEmpCode的值
     * @return entryEmpCode entryEmpCode值
     */
    public String getEntryEmpCode() {
        return entryEmpCode;
    }

    /**
     * 设置entryEmpCode的值
     * @param entryEmpCode entryEmpCode值
     */
    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    /**
     * 获取entryEmpName的值
     * @return entryEmpName entryEmpName值
     */
    public String getEntryEmpName() {
        return entryEmpName;
    }

    /**
     * 设置entryEmpName的值
     * @param entryEmpName entryEmpName值
     */
    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    /**
     * 获取entryOrgCode的值
     * @return entryOrgCode entryOrgCode值
     */
    public String getEntryOrgCode() {
        return entryOrgCode;
    }

    /**
     * 设置entryOrgCode的值
     * @param entryOrgCode entryOrgCode值
     */
    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    /**
     * 获取entryOrgName的值
     * @return entryOrgName entryOrgName值
     */
    public String getEntryOrgName() {
        return entryOrgName;
    }

    /**
     * 设置entryOrgName的值
     * @param entryOrgName entryOrgName值
     */
    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    /**
     * 获取orgCode的值
     * @return orgCode orgCode值
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置orgCode的值
     * @param orgCode orgCode值
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取uploadDate的值
     * @return uploadDate uploadDate值
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置uploadDate的值
     * @param uploadDate uploadDate值
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 获取updateFlag的值
     * @return updateFlag updateFlag值
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置updateFlag的值
     * @param updateFlag updateFlag值
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * 获取editor的值
     * @return editor editor值
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 设置editor的值
     * @param editor editor值
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 获取modifydate的值
     * @return modifydate modifydate值
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * 设置modifydate的值
     * @param modifydate modifydate值
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 获取fdataFrom的值
     * @return fdataFrom fdataFrom值
     */
    public String getFdataFrom() {
        return fdataFrom;
    }

    /**
     * 设置fdataFrom的值
     * @param fdataFrom fdataFrom值
     */
    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    /**
     * 获取idCard的值
     * @return idCard idCard值
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置idCard的值
     * @param idCard idCard值
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Long getLocalId() {
        return this.localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVipCard() {
        return this.vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public boolean getUpload() {
        return this.upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
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
