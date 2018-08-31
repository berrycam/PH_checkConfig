package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 抽象老年人基本信息登记类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、
 * 以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String mangementNo 管理卡流水号
 * 2. [不可空] String healthfileNo 个人健康档案编码
 * 3. [可空] String fileNumber 基本信息档案号
 * 4. [不可空] String name 姓名
 * 5. [不可空] String gender 性别
 * 6. [可空] String regCode 行政区划代码
 * 7. [可空] String address 地址名称
 * 8. [可空] String illnessDescription 病情描述
 * 9. [可空] String createCode 建案人编码
 * 10. [可空] String createName 建案人姓名
 * 11. [可空] java.util.Date createDate 建案时间
 * 12. [可空] String belongOrgCode 归属机构编码
 * 13. [可空] String belongRegCode 归属地区编码
 * 14. [可空] Boolean endFlag 结案标志
 * 15. [可空] String endReason 结案原因
 * 16. [可空] String endDescription 结案描述
 * 17. [可空] String endOrgCode 结案机构编码
 * 18. [可空] String endName 结案人姓名
 * 19. [可空] java.util.Date endTime 结案时间
 * 20. [可空] java.util.Date entryDate 登记时间
 * 21. [可空] String entryEmpCode 登记人员编码
 * 22. [可空] String entryEmpName 登记人员名称
 * 23. [可空] String entryOrgCode 登记机构编码
 * 24. [可空] String entryOrgName 登记机构名称
 * 25. [不可空] String orgCode 医疗机构代码
 * 27. [不可空] java.util.Date uploadDate 填报日期
 * 28. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 29. [主键] String id 主键
 * 30. [可空] String editor 修改人
 * 31. [可空] java.util.Date modifydate 更新日期
 * 32. [不可空] String fdataFrom 数据来源
 * </pre>
 * <p>
 * <p><a href="file:///D:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com/ks/imms/
 * domain/model/domain/base/EhrElderlyInfomation.html">EhrElderlyInfomation代码模板</a>
 *
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrElderlyInfomation {

    /*
     * 本程序不允许修改！！！
     *
     * 2017-01-11 Created by Benewit Code Generator V1.0
     * codegen/templates//java/java-entabsdomain.template
     */

    private static final long serialVersionUID = 1L;
    @Property(nameInDb = "localId")
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
     * 是否已经上传
     */
    @Expose
    private boolean upload = false;

    /**
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;
    /**
     * 1. [不可空] 管理卡流水号
     */
    protected String mangementNo;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 4. [不可空] 姓名
     */
//    protected String name;

    /**
     * 5. [不可空] 性别
     */
//    protected String gender;

    /**
     * 6. [可空] 行政区划代码
     */
//    protected String regCode;

    /**
     * 7. [可空] 地址名称
     */
//    protected String address;

    /**
     * 8. [可空] 病情描述
     */
    protected String illnessDescription;

    /**
     * 9. [可空] 建案人编码
     */
    protected String createCode;

    /**
     * 10. [可空] 建案人姓名
     */
    protected String createName;

    /**
     * 11. [可空] 建案时间
     */
    protected java.util.Date createDate;

    /**
     * 12. [可空] 归属机构编码
     */
    protected String belongOrgCode;

    /**
     * 13. [可空] 归属地区编码
     */
    protected String belongRegCode;

    /**
     * 14. [可空] 结案标志
     */
    protected Boolean endFlag;

    /**
     * 15. [可空] 结案原因
     */
    protected String endReason;

    /**
     * 16. [可空] 结案描述
     */
    protected String endDescription;

    /**
     * 17. [可空] 结案机构编码
     */
    protected String endOrgCode;
    protected String endOrgName;

    /**
     * 18. [可空] 结案人姓名
     */
    protected String endName;

    /**
     * 19. [可空] 结案时间
     */
    protected java.util.Date endTime;

    /**
     * 20. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 21. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 22. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 23. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 24. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 25. [不可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 27. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 28. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    protected String updateFlag;

    /**
     * 30. [可空] 修改人
     */
    protected String editor;

    /**
     * 31. [可空] 更新日期
     */
    protected java.util.Date modifydate;

    /**
     * 32. [不可空] 数据来源
     */
    protected String fdataFrom;
    /**
     * 33. [不可空] 老年人专项id
     */
    protected String id;

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

    @Generated(hash = 1591150682)
    public EhrElderlyInfomation(Long localId, String idCard, String vipCard, boolean upload,
                                boolean completed, String mangementNo, String healthfileNo, String fileNumber,
                                String illnessDescription, String createCode, String createName, java.util.Date createDate,
                                String belongOrgCode, String belongRegCode, Boolean endFlag, String endReason,
                                String endDescription, String endOrgCode, String endOrgName, String endName,
                                java.util.Date endTime, java.util.Date entryDate, String entryEmpCode, String entryEmpName,
                                String entryOrgCode, String entryOrgName, String orgCode, java.util.Date uploadDate,
                                String updateFlag, String editor, java.util.Date modifydate, String fdataFrom, String id,
                                String editorId, String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.illnessDescription = illnessDescription;
        this.createCode = createCode;
        this.createName = createName;
        this.createDate = createDate;
        this.belongOrgCode = belongOrgCode;
        this.belongRegCode = belongRegCode;
        this.endFlag = endFlag;
        this.endReason = endReason;
        this.endDescription = endDescription;
        this.endOrgCode = endOrgCode;
        this.endOrgName = endOrgName;
        this.endName = endName;
        this.endTime = endTime;
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
        this.id = id;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 134579248)
    public EhrElderlyInfomation() {
    }

    /**
     * 获取mangementNo的值
     *
     * @return mangementNo mangementNo值
     */
    public String getMangementNo() {
        return mangementNo;
    }

    /**
     * 设置mangementNo的值
     *
     * @param mangementNo mangementNo值
     */
    public void setMangementNo(String mangementNo) {
        this.mangementNo = mangementNo;
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
     * 获取name的值
     * @return name name值
     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * 设置name的值
//     * @param name name值
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * 获取gender的值
//     * @return gender gender值
//     */
//    public String getGender() {
//        return gender;
//    }
//
//    /**
//     * 设置gender的值
//     * @param gender gender值
//     */
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    /**
//     * 获取regCode的值
//     * @return regCode regCode值
//     */
//    public String getRegCode() {
//        return regCode;
//    }
//
//    /**
//     * 设置regCode的值
//     * @param regCode regCode值
//     */
//    public void setRegCode(String regCode) {
//        this.regCode = regCode;
//    }
//
//    /**
//     * 获取address的值
//     * @return address address值
//     */
//    public String getAddress() {
//        return address;
//    }
//
//    /**
//     * 设置address的值
//     * @param address address值
//     */
//    public void setAddress(String address) {
//        this.address = address;
//    }

    /**
     * 获取illnessDescription的值
     *
     * @return illnessDescription illnessDescription值
     */
    public String getIllnessDescription() {
        return illnessDescription;
    }

    /**
     * 设置illnessDescription的值
     *
     * @param illnessDescription illnessDescription值
     */
    public void setIllnessDescription(String illnessDescription) {
        this.illnessDescription = illnessDescription;
    }

    /**
     * 获取createCode的值
     *
     * @return createCode createCode值
     */
    public String getCreateCode() {
        return createCode;
    }

    /**
     * 设置createCode的值
     *
     * @param createCode createCode值
     */
    public void setCreateCode(String createCode) {
        this.createCode = createCode;
    }

    /**
     * 获取createName的值
     *
     * @return createName createName值
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置createName的值
     *
     * @param createName createName值
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 获取createDate的值
     *
     * @return createDate createDate值
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate的值
     *
     * @param createDate createDate值
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取belongOrgCode的值
     *
     * @return belongOrgCode belongOrgCode值
     */
    public String getBelongOrgCode() {
        return belongOrgCode;
    }

    /**
     * 设置belongOrgCode的值
     *
     * @param belongOrgCode belongOrgCode值
     */
    public void setBelongOrgCode(String belongOrgCode) {
        this.belongOrgCode = belongOrgCode;
    }

    /**
     * 获取belongRegCode的值
     *
     * @return belongRegCode belongRegCode值
     */
    public String getBelongRegCode() {
        return belongRegCode;
    }

    /**
     * 设置belongRegCode的值
     *
     * @param belongRegCode belongRegCode值
     */
    public void setBelongRegCode(String belongRegCode) {
        this.belongRegCode = belongRegCode;
    }

    /**
     * 获取endFlag的值
     *
     * @return endFlag endFlag值
     */
    public Boolean getEndFlag() {
        return endFlag;
    }

    /**
     * 设置endFlag的值
     *
     * @param endFlag endFlag值
     */
    public void setEndFlag(Boolean endFlag) {
        this.endFlag = endFlag;
    }

    /**
     * 获取endReason的值
     *
     * @return endReason endReason值
     */
    public String getEndReason() {
        return endReason;
    }

    /**
     * 设置endReason的值
     *
     * @param endReason endReason值
     */
    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    /**
     * 获取endDescription的值
     *
     * @return endDescription endDescription值
     */
    public String getEndDescription() {
        return endDescription;
    }

    /**
     * 设置endDescription的值
     *
     * @param endDescription endDescription值
     */
    public void setEndDescription(String endDescription) {
        this.endDescription = endDescription;
    }

    /**
     * 获取endOrgCode的值
     *
     * @return endOrgCode endOrgCode值
     */
    public String getEndOrgCode() {
        return endOrgCode;
    }

    /**
     * 设置endOrgCode的值
     *
     * @param endOrgCode endOrgCode值
     */
    public void setEndOrgCode(String endOrgCode) {
        this.endOrgCode = endOrgCode;
    }

    /**
     * 获取endName的值
     *
     * @return endName endName值
     */
    public String getEndName() {
        return endName;
    }

    /**
     * 设置endName的值
     *
     * @param endName endName值
     */
    public void setEndName(String endName) {
        this.endName = endName;
    }

    /**
     * 获取endTime的值
     *
     * @return endTime endTime值
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime的值
     *
     * @param endTime endTime值
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取entryDate的值
     *
     * @return entryDate entryDate值
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * 设置entryDate的值
     *
     * @param entryDate entryDate值
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * 获取entryEmpCode的值
     *
     * @return entryEmpCode entryEmpCode值
     */
    public String getEntryEmpCode() {
        return entryEmpCode;
    }

    /**
     * 设置entryEmpCode的值
     *
     * @param entryEmpCode entryEmpCode值
     */
    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    /**
     * 获取entryEmpName的值
     *
     * @return entryEmpName entryEmpName值
     */
    public String getEntryEmpName() {
        return entryEmpName;
    }

    /**
     * 设置entryEmpName的值
     *
     * @param entryEmpName entryEmpName值
     */
    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    /**
     * 获取entryOrgCode的值
     *
     * @return entryOrgCode entryOrgCode值
     */
    public String getEntryOrgCode() {
        return entryOrgCode;
    }

    /**
     * 设置entryOrgCode的值
     *
     * @param entryOrgCode entryOrgCode值
     */
    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    /**
     * 获取entryOrgName的值
     *
     * @return entryOrgName entryOrgName值
     */
    public String getEntryOrgName() {
        return entryOrgName;
    }

    /**
     * 设置entryOrgName的值
     *
     * @param entryOrgName entryOrgName值
     */
    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
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
     * 获取localId的值
     *
     * @return localId localId值
     */
    public Long getLocalId() {
        return localId;
    }

    /**
     * 设置localId的值
     *
     * @param localId localId值
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    /**
     * 获取idCard的值
     *
     * @return idCard idCard值
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置idCard的值
     *
     * @param idCard idCard值
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取vipCard的值
     *
     * @return vipCard vipCard值
     */
    public String getVipCard() {
        return vipCard;
    }

    /**
     * 设置vipCard的值
     *
     * @param vipCard vipCard值
     */
    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    /**
     * 获取upload的值
     *
     * @return upload upload值
     */
    public boolean getUpload() {
        return upload;
    }

    /**
     * 设置upload的值
     *
     * @param upload upload值
     */
    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    /**
     * 获取completed的值
     *
     * @return completed completed值
     */
    public boolean getCompleted() {
        return completed;
    }

    /**
     * 设置completed的值
     *
     * @param completed completed值
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
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

    public String getEndOrgName() {
        return this.endOrgName;
    }

    public void setEndOrgName(String endOrgName) {
        this.endOrgName = endOrgName;
    }
}
