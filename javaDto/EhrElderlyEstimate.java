package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 抽象老年人生活自理能力评估类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、
 * 以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String estimateId 自理能力流水号
 * 2. [不可空] String mangementNo 管理卡流水号
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [可空] Double mealResult 进餐评分
 * 6. [可空] Double washResult 梳洗评分
 * 7. [可空] Double wearResult 穿衣评分
 * 8. [可空] Double toiletResult 如厕评分
 * 9. [可空] Double activityResult 活动评分
 * 10. [可空] Double totalResult 总评分
 * 11. [可空] String estimateDoctorCode 责任医生编号
 * 12. [可空] String estimateDoctorName 责任医生名称
 * 13. [可空] java.util.Date evaluationDate 评估日期
 * 14. [可空] java.util.Date entryDate 登记时间
 * 15. [可空] String entryEmpCode 登记人员编码
 * 16. [可空] String entryEmpName 登记人员名称
 * 17. [可空] String entryOrgCode 登记机构编码
 * 18. [可空] String entryOrgName 登记机构名称
 * 19. [不可空] String orgCode 医疗机构代码
 * 21. [不可空] java.util.Date uploadDate 填报日期
 * 22. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 23. [主键] String id 主键
 * 24. [可空] String editor 修改人
 * 25. [可空] java.util.Date modifydate 更新日期
 * 26. [不可空] String fdataFrom 数据来源
 * </pre>
 * <p>
 * <p><a href="file:///D:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com/ks/
 * imms/domain/model/domain/base/EhrElderlyEstimate.html">EhrElderlyEstimate代码模板</a>
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrElderlyEstimate {

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
     * uuid唯一标识
     */
    @Expose
    private String uuid;
    /**
     * 后台id
     */
    private String id;
    /**
     * 1. [不可空] 自理能力流水号
     */
    protected String estimateId;

    /**
     * 2. [不可空] 管理卡流水号
     */
    protected String mangementNo;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 5. [可空] 进餐评分
     */
    protected Double mealResult;

    /**
     * 6. [可空] 梳洗评分
     */
    protected Double washResult;

    /**
     * 7. [可空] 穿衣评分
     */
    protected Double wearResult;

    /**
     * 8. [可空] 如厕评分
     */
    protected Double toiletResult;

    /**
     * 9. [可空] 活动评分
     */
    protected Double activityResult;

    /**
     * 10. [可空] 总评分
     */
    protected Double totalResult;

    /**
     * 11. [可空] 责任医生编号
     */
    protected String estimateDoctorCode;

    /**
     * 12. [可空] 责任医生名称
     */
    protected String estimateDoctorName;

    /**
     * 13. [可空] 评估日期
     */
    protected java.util.Date evaluationDate;

    /**
     * 14. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 15. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 16. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 17. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 18. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 19. [不可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 21. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 22. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    protected String updateFlag;

    /**
     * 24. [可空] 修改人
     */
    protected String editor;

    /**
     * 25. [可空] 更新日期
     */
    protected java.util.Date modifydate;

    /** 26. [可空] 下次评估日期 */
    protected java.util.Date nextEvaluationDate;

    /** 27. [可空] 进餐编码 */
    protected String mealCode;

    /** 28. [可空] 梳洗编码 */
    protected String washCode;

    /** 29. [可空] 穿衣编码 */
    protected String wearCode;

    /** 30. [可空] 如厕编码 */
    protected String toiletCode;

    /** 31. [可空] 活动编码 */
    protected String activityCode;

    /** 32. [可空] 总编码 */
    protected String totalCode;
    /**
     * 26. [不可空] 数据来源
     */
    protected String fdataFrom;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 1904039328)
    public EhrElderlyEstimate(Long localId, String idCard, String vipCard, boolean upload,
            boolean completed, String uuid, String id, String estimateId, String mangementNo,
            String healthfileNo, String fileNumber, Double mealResult, Double washResult,
            Double wearResult, Double toiletResult, Double activityResult, Double totalResult,
            String estimateDoctorCode, String estimateDoctorName,
            java.util.Date evaluationDate, java.util.Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String updateFlag, String editor,
            java.util.Date modifydate, java.util.Date nextEvaluationDate, String mealCode,
            String washCode, String wearCode, String toiletCode, String activityCode,
            String totalCode, String fdataFrom, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.uuid = uuid;
        this.id = id;
        this.estimateId = estimateId;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.mealResult = mealResult;
        this.washResult = washResult;
        this.wearResult = wearResult;
        this.toiletResult = toiletResult;
        this.activityResult = activityResult;
        this.totalResult = totalResult;
        this.estimateDoctorCode = estimateDoctorCode;
        this.estimateDoctorName = estimateDoctorName;
        this.evaluationDate = evaluationDate;
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
        this.nextEvaluationDate = nextEvaluationDate;
        this.mealCode = mealCode;
        this.washCode = washCode;
        this.wearCode = wearCode;
        this.toiletCode = toiletCode;
        this.activityCode = activityCode;
        this.totalCode = totalCode;
        this.fdataFrom = fdataFrom;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1989284007)
    public EhrElderlyEstimate() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isUpload() {
        return upload;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Date getNextEvaluationDate() {
        return nextEvaluationDate;
    }

    public void setNextEvaluationDate(Date nextEvaluationDate) {
        this.nextEvaluationDate = nextEvaluationDate;
    }

    public String getMealCode() {
        return mealCode;
    }

    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    public String getWashCode() {
        return washCode;
    }

    public void setWashCode(String washCode) {
        this.washCode = washCode;
    }

    public String getWearCode() {
        return wearCode;
    }

    public void setWearCode(String wearCode) {
        this.wearCode = wearCode;
    }

    public String getToiletCode() {
        return toiletCode;
    }

    public void setToiletCode(String toiletCode) {
        this.toiletCode = toiletCode;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getTotalCode() {
        return totalCode;
    }

    public void setTotalCode(String totalCode) {
        this.totalCode = totalCode;
    }

    /**
     * 获取estimateId的值
     *
     * @return estimateId estimateId值
     */
    public String getEstimateId() {
        return estimateId;
    }

    /**
     * 设置estimateId的值
     *
     * @param estimateId estimateId值
     */
    public void setEstimateId(String estimateId) {
        this.estimateId = estimateId;
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
     * 获取mealResult的值
     *
     * @return mealResult mealResult值
     */
    public Double getMealResult() {
        return mealResult;
    }

    /**
     * 设置mealResult的值
     *
     * @param mealResult mealResult值
     */
    public void setMealResult(Double mealResult) {
        this.mealResult = mealResult;
    }

    /**
     * 获取washResult的值
     *
     * @return washResult washResult值
     */
    public Double getWashResult() {
        return washResult;
    }

    /**
     * 设置washResult的值
     *
     * @param washResult washResult值
     */
    public void setWashResult(Double washResult) {
        this.washResult = washResult;
    }

    /**
     * 获取wearResult的值
     *
     * @return wearResult wearResult值
     */
    public Double getWearResult() {
        return wearResult;
    }

    /**
     * 设置wearResult的值
     *
     * @param wearResult wearResult值
     */
    public void setWearResult(Double wearResult) {
        this.wearResult = wearResult;
    }

    /**
     * 获取toiletResult的值
     *
     * @return toiletResult toiletResult值
     */
    public Double getToiletResult() {
        return toiletResult;
    }

    /**
     * 设置toiletResult的值
     *
     * @param toiletResult toiletResult值
     */
    public void setToiletResult(Double toiletResult) {
        this.toiletResult = toiletResult;
    }

    /**
     * 获取activityResult的值
     *
     * @return activityResult activityResult值
     */
    public Double getActivityResult() {
        return activityResult;
    }

    /**
     * 设置activityResult的值
     *
     * @param activityResult activityResult值
     */
    public void setActivityResult(Double activityResult) {
        this.activityResult = activityResult;
    }

    /**
     * 获取totalResult的值
     *
     * @return totalResult totalResult值
     */
    public Double getTotalResult() {
        return totalResult;
    }

    /**
     * 设置totalResult的值
     *
     * @param totalResult totalResult值
     */
    public void setTotalResult(Double totalResult) {
        this.totalResult = totalResult;
    }

    /**
     * 获取estimateDoctorCode的值
     *
     * @return estimateDoctorCode estimateDoctorCode值
     */
    public String getEstimateDoctorCode() {
        return estimateDoctorCode;
    }

    /**
     * 设置estimateDoctorCode的值
     *
     * @param estimateDoctorCode estimateDoctorCode值
     */
    public void setEstimateDoctorCode(String estimateDoctorCode) {
        this.estimateDoctorCode = estimateDoctorCode;
    }

    /**
     * 获取estimateDoctorName的值
     *
     * @return estimateDoctorName estimateDoctorName值
     */
    public String getEstimateDoctorName() {
        return estimateDoctorName;
    }

    /**
     * 设置estimateDoctorName的值
     *
     * @param estimateDoctorName estimateDoctorName值
     */
    public void setEstimateDoctorName(String estimateDoctorName) {
        this.estimateDoctorName = estimateDoctorName;
    }

    /**
     * 获取evaluationDate的值
     *
     * @return evaluationDate evaluationDate值
     */
    public Date getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * 设置evaluationDate的值
     *
     * @param evaluationDate evaluationDate值
     */
    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
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

    /**
     * 获取localId的值
     * @return localId的值
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * 设置localId的值
     * @param localId localId的值
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
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
     * 获取uuid的值
     *
     * @return uuid uuid值
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置uuid的值
     *
     * @param uuid uuid值
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
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
