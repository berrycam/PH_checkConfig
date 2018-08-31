// CHECKSTYLE:OFF

package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 健康教育活动记录类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String recordeId 健康教育活动ID
 * 2. [可空] String planId 健康教育计划流水号
 * 3. [不可空] java.util.Date recordeDate 活动时间
 * 4. [不可空] String recordePlace 活动地点
 * 5. [不可空] String recordeShape 活动形式
 * 6. [不可空] String recordeTheme 活动主题
 * 7. [不可空] String recordeOrganizer 组织者
 * 8. [可空] String recordeReceptor 接受健康教育人员类别
 * 9. [可空] Integer recordeReceptorAmount 接受健康教育人数
 * 10. [可空] String recordeType 健康教育资料发放种类
 * 11. [可空] Integer recordeAmount 健康教育资料发放数量
 * 12. [可空] String recordeTypeAndAmount 健康教育资料发放种类及数量
 * 13. [可空] String recordeContent 活动内容
 * 14. [可空] String recordeSummary 活动总结评价
 * 15. [可空] String recordeArchiveMeterials 存档材料
 * 16. [可空] String fillEmpCode 填表人代码
 * 17. [不可空] String fillEnpName 填表人名称
 * 18. [可空] String managerEmpCode 负责人代码
 * 19. [不可空] String managerEmpName 负责人名称
 * 20. [可空] java.util.Date fillRecordeDate 填表时间
 * 21. [不可空] java.util.Date entryDate 登记时间
 * 22. [不可空] String entryEmpCode 登记人员编码
 * 23. [不可空] String entryEmpName 登记人员名称
 * 24. [不可空] String entryOrgCode 登记机构编码
 * 25. [不可空] String entryOrgName 登记机构名称
 * 26. [不可空] String orgCode 医疗机构代码
 * 27. [不可空] String confidentiality 密级
 * 28. [不可空] java.util.Date uploadDate 填报日期
 * 29. [不可空] Boolean updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 30. [主键] String id 主键
 * 31. [可空] String editor 修改人
 * 32. [可空] java.util.Date modifydate 更新日期
 * </pre>
 * <p>
 * <p><a href="file:///E:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com/ks/imms/
 * domain/model/domain/base/EhrTeachingRecorde.html">EhrTeachingRecorde代码模板</a>
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrTeachingRecorde {

    /*
     * 本程序不允许修改！！！
     *
     * Created by Benewit Code Generator V1.0
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
     * uuid唯一标识
     */
    @Expose
    private String uuid;
    /**
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;
    private String id;
    /**
     * 1. [不可空] 健康教育活动ID
     */
    protected String recordeId;

    /**
     * 2. [可空] 健康教育计划流水号
     */
    protected String planId;

    /**
     * 3. [不可空] 活动时间
     */
    protected java.util.Date recordeDate;

    /**
     * 4. [不可空] 活动地点
     */
    protected String recordePlace;

    /**
     * 5. [不可空] 活动形式
     */
    protected String recordeShape;

    /**
     * 6. [不可空] 活动主题
     */
    protected String recordeTheme;

    /**
     * 7. [不可空] 组织者
     */
    protected String recordeOrganizer;
    /**
     * . [不可空] 主讲人
     */
    protected String recordKeynoteSpeaker;

    /**
     * 8. [可空] 接受健康教育人员类别
     */
    protected String recordeReceptor;

    /**
     * 9. [可空] 接受健康教育人数
     */
    protected Integer recordeReceptorAmount;

    /**
     * 10. [可空] 健康教育资料发放种类
     */
    protected String recordeType;

    /**
     * 11. [可空] 健康教育资料发放数量
     */
    protected Integer recordeAmount;

    /**
     * 12. [可空] 健康教育资料发放种类及数量
     */
    protected String recordeTypeAndAmount;

    /**
     * 13. [可空] 活动内容
     */
    protected String recordeContent;

    /**
     * 14. [可空] 活动总结评价
     */
    protected String recordeSummary;

    /**
     * 15. [可空] 存档材料
     */
    protected String recordeArchiveMeterials;

    /**
     * 16. [可空] 填表人代码
     */
    protected String fillEmpCode;

    /**
     * 17. [不可空] 填表人名称
     */
    protected String fillEnpName;

    /**
     * 18. [可空] 负责人代码
     */
    protected String managerEmpCode;

    /**
     * 19. [不可空] 负责人名称
     */
    protected String managerEmpName;

    /**
     * 20. [可空] 填表时间
     */
    protected java.util.Date fillRecordeDate;

    /**
     * 21. [不可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 22. [不可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 23. [不可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 24. [不可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 25. [不可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 26. [不可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 27. [不可空] 密级
     */
    protected String confidentiality;

    /**
     * 28. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;
    /**
     * 31. [可空] 修改人
     */
    protected String editor;

    /**
     * 32. [可空] 更新日期
     */
    protected java.util.Date modifydate;

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

    private String updateFlag;
    
    private String fdataFrom;

    @Generated(hash = 369885986)
    public EhrTeachingRecorde(Long localId, String idCard, String vipCard, boolean upload, String uuid,
            boolean completed, String id, String recordeId, String planId, java.util.Date recordeDate,
            String recordePlace, String recordeShape, String recordeTheme, String recordeOrganizer,
            String recordKeynoteSpeaker, String recordeReceptor, Integer recordeReceptorAmount,
            String recordeType, Integer recordeAmount, String recordeTypeAndAmount,
            String recordeContent, String recordeSummary, String recordeArchiveMeterials,
            String fillEmpCode, String fillEnpName, String managerEmpCode, String managerEmpName,
            java.util.Date fillRecordeDate, java.util.Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName, String orgCode,
            String confidentiality, java.util.Date uploadDate, String editor, java.util.Date modifydate,
            String editorId, String updateOrgId, String updateOrgName, String updateFlag,
            String fdataFrom) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.uuid = uuid;
        this.completed = completed;
        this.id = id;
        this.recordeId = recordeId;
        this.planId = planId;
        this.recordeDate = recordeDate;
        this.recordePlace = recordePlace;
        this.recordeShape = recordeShape;
        this.recordeTheme = recordeTheme;
        this.recordeOrganizer = recordeOrganizer;
        this.recordKeynoteSpeaker = recordKeynoteSpeaker;
        this.recordeReceptor = recordeReceptor;
        this.recordeReceptorAmount = recordeReceptorAmount;
        this.recordeType = recordeType;
        this.recordeAmount = recordeAmount;
        this.recordeTypeAndAmount = recordeTypeAndAmount;
        this.recordeContent = recordeContent;
        this.recordeSummary = recordeSummary;
        this.recordeArchiveMeterials = recordeArchiveMeterials;
        this.fillEmpCode = fillEmpCode;
        this.fillEnpName = fillEnpName;
        this.managerEmpCode = managerEmpCode;
        this.managerEmpName = managerEmpName;
        this.fillRecordeDate = fillRecordeDate;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.confidentiality = confidentiality;
        this.uploadDate = uploadDate;
        this.editor = editor;
        this.modifydate = modifydate;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.updateFlag = updateFlag;
        this.fdataFrom = fdataFrom;
    }

    @Generated(hash = 1548162398)
    public EhrTeachingRecorde() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isUpload() {
        return upload;
    }

    public boolean isCompleted() {
        return completed;
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

    /**
     * 获取recordeId的值
     *
     * @return recordeId recordeId值
     */
    public String getRecordeId() {
        return recordeId;
    }

    /**
     * 设置recordeId的值
     *
     * @param recordeId recordeId值
     */
    public void setRecordeId(String recordeId) {
        this.recordeId = recordeId;
    }

    /**
     * 获取planId的值
     *
     * @return planId planId值
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 设置planId的值
     *
     * @param planId planId值
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 获取recordeDate的值
     *
     * @return recordeDate recordeDate值
     */
    public Date getRecordeDate() {
        return recordeDate;
    }

    /**
     * 设置recordeDate的值
     *
     * @param recordeDate recordeDate值
     */
    public void setRecordeDate(Date recordeDate) {
        this.recordeDate = recordeDate;
    }

    /**
     * 获取recordePlace的值
     *
     * @return recordePlace recordePlace值
     */
    public String getRecordePlace() {
        return recordePlace;
    }

    /**
     * 设置recordePlace的值
     *
     * @param recordePlace recordePlace值
     */
    public void setRecordePlace(String recordePlace) {
        this.recordePlace = recordePlace;
    }

    /**
     * 获取recordeShape的值
     *
     * @return recordeShape recordeShape值
     */
    public String getRecordeShape() {
        return recordeShape;
    }

    /**
     * 设置recordeShape的值
     *
     * @param recordeShape recordeShape值
     */
    public void setRecordeShape(String recordeShape) {
        this.recordeShape = recordeShape;
    }

    /**
     * 获取recordeTheme的值
     *
     * @return recordeTheme recordeTheme值
     */
    public String getRecordeTheme() {
        return recordeTheme;
    }

    /**
     * 设置recordeTheme的值
     *
     * @param recordeTheme recordeTheme值
     */
    public void setRecordeTheme(String recordeTheme) {
        this.recordeTheme = recordeTheme;
    }

    /**
     * 获取recordeOrganizer的值
     *
     * @return recordeOrganizer recordeOrganizer值
     */
    public String getRecordeOrganizer() {
        return recordeOrganizer;
    }

    /**
     * 设置recordeOrganizer的值
     *
     * @param recordeOrganizer recordeOrganizer值
     */
    public void setRecordeOrganizer(String recordeOrganizer) {
        this.recordeOrganizer = recordeOrganizer;
    }

    /**
     * 获取recordeReceptor的值
     *
     * @return recordeReceptor recordeReceptor值
     */
    public String getRecordeReceptor() {
        return recordeReceptor;
    }

    /**
     * 设置recordeReceptor的值
     *
     * @param recordeReceptor recordeReceptor值
     */
    public void setRecordeReceptor(String recordeReceptor) {
        this.recordeReceptor = recordeReceptor;
    }

    /**
     * 获取recordeReceptorAmount的值
     *
     * @return recordeReceptorAmount recordeReceptorAmount值
     */
    public Integer getRecordeReceptorAmount() {
        return recordeReceptorAmount;
    }

    /**
     * 设置recordeReceptorAmount的值
     *
     * @param recordeReceptorAmount recordeReceptorAmount值
     */
    public void setRecordeReceptorAmount(Integer recordeReceptorAmount) {
        this.recordeReceptorAmount = recordeReceptorAmount;
    }

    /**
     * 获取recordeType的值
     *
     * @return recordeType recordeType值
     */
    public String getRecordeType() {
        return recordeType;
    }

    /**
     * 设置recordeType的值
     *
     * @param recordeType recordeType值
     */
    public void setRecordeType(String recordeType) {
        this.recordeType = recordeType;
    }

    /**
     * 获取recordeAmount的值
     *
     * @return recordeAmount recordeAmount值
     */
    public Integer getRecordeAmount() {
        return recordeAmount;
    }

    /**
     * 设置recordeAmount的值
     *
     * @param recordeAmount recordeAmount值
     */
    public void setRecordeAmount(Integer recordeAmount) {
        this.recordeAmount = recordeAmount;
    }

    /**
     * 获取recordeTypeAndAmount的值
     *
     * @return recordeTypeAndAmount recordeTypeAndAmount值
     */
    public String getRecordeTypeAndAmount() {
        return recordeTypeAndAmount;
    }

    /**
     * 设置recordeTypeAndAmount的值
     *
     * @param recordeTypeAndAmount recordeTypeAndAmount值
     */
    public void setRecordeTypeAndAmount(String recordeTypeAndAmount) {
        this.recordeTypeAndAmount = recordeTypeAndAmount;
    }

    /**
     * 获取recordeContent的值
     *
     * @return recordeContent recordeContent值
     */
    public String getRecordeContent() {
        return recordeContent;
    }

    /**
     * 设置recordeContent的值
     *
     * @param recordeContent recordeContent值
     */
    public void setRecordeContent(String recordeContent) {
        this.recordeContent = recordeContent;
    }

    /**
     * 获取recordeSummary的值
     *
     * @return recordeSummary recordeSummary值
     */
    public String getRecordeSummary() {
        return recordeSummary;
    }

    /**
     * 设置recordeSummary的值
     *
     * @param recordeSummary recordeSummary值
     */
    public void setRecordeSummary(String recordeSummary) {
        this.recordeSummary = recordeSummary;
    }

    /**
     * 获取recordeArchiveMeterials的值
     *
     * @return recordeArchiveMeterials recordeArchiveMeterials值
     */
    public String getRecordeArchiveMeterials() {
        return recordeArchiveMeterials;
    }

    /**
     * 设置recordeArchiveMeterials的值
     *
     * @param recordeArchiveMeterials recordeArchiveMeterials值
     */
    public void setRecordeArchiveMeterials(String recordeArchiveMeterials) {
        this.recordeArchiveMeterials = recordeArchiveMeterials;
    }

    /**
     * 获取fillEmpCode的值
     *
     * @return fillEmpCode fillEmpCode值
     */
    public String getFillEmpCode() {
        return fillEmpCode;
    }

    /**
     * 设置fillEmpCode的值
     *
     * @param fillEmpCode fillEmpCode值
     */
    public void setFillEmpCode(String fillEmpCode) {
        this.fillEmpCode = fillEmpCode;
    }

    /**
     * 获取fillEnpName的值
     *
     * @return fillEnpName fillEnpName值
     */
    public String getFillEnpName() {
        return fillEnpName;
    }

    /**
     * 设置fillEnpName的值
     *
     * @param fillEnpName fillEnpName值
     */
    public void setFillEnpName(String fillEnpName) {
        this.fillEnpName = fillEnpName;
    }

    /**
     * 获取managerEmpCode的值
     *
     * @return managerEmpCode managerEmpCode值
     */
    public String getManagerEmpCode() {
        return managerEmpCode;
    }

    /**
     * 设置managerEmpCode的值
     *
     * @param managerEmpCode managerEmpCode值
     */
    public void setManagerEmpCode(String managerEmpCode) {
        this.managerEmpCode = managerEmpCode;
    }

    /**
     * 获取managerEmpName的值
     *
     * @return managerEmpName managerEmpName值
     */
    public String getManagerEmpName() {
        return managerEmpName;
    }

    /**
     * 设置managerEmpName的值
     *
     * @param managerEmpName managerEmpName值
     */
    public void setManagerEmpName(String managerEmpName) {
        this.managerEmpName = managerEmpName;
    }

    /**
     * 获取fillRecordeDate的值
     *
     * @return fillRecordeDate fillRecordeDate值
     */
    public Date getFillRecordeDate() {
        return fillRecordeDate;
    }

    /**
     * 设置fillRecordeDate的值
     *
     * @param fillRecordeDate fillRecordeDate值
     */
    public void setFillRecordeDate(Date fillRecordeDate) {
        this.fillRecordeDate = fillRecordeDate;
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
     * 获取confidentiality的值
     *
     * @return confidentiality confidentiality值
     */
    public String getConfidentiality() {
        return confidentiality;
    }

    /**
     * 设置confidentiality的值
     *
     * @param confidentiality confidentiality值
     */
    public void setConfidentiality(String confidentiality) {
        this.confidentiality = confidentiality;
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

    public String getRecordKeynoteSpeaker() {
        return this.recordKeynoteSpeaker;
    }

    public void setRecordKeynoteSpeaker(String recordKeynoteSpeaker) {
        this.recordKeynoteSpeaker = recordKeynoteSpeaker;
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

    public String getUpdateFlag() {
        return this.updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }
}
