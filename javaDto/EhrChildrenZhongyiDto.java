package com.konsung.bean.tcm;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 儿童中医药管理服务DTO
 * @author wujing
 *
 */
@Entity
public class EhrChildrenZhongyiDto extends BaseChildBean {

    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    @Expose
    private Long localId;

    /**
     * 身份证号
     */
    @Expose
    private String idCard;

    /**
     * 会员卡号
     */
    @Expose
    private String vipCard;

    /**
     * 是否已经上传
     */
    @Expose
    private boolean upload;

    /**
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;

    /**
     * 标题
     */
    private String title;

    protected String id;

    /** 2. [可空] 健康档案编号 */
    protected String healthfileNo;

    /** 3. [可空] 儿童基本信息编号 */
    protected String childrenNo;

    /** 4. [可空] 姓名 */
//    protected String name;

    /** 5. [可空] 月龄 */
    protected String monthold;

    /** 6. [可空] 随访日期 */
    protected Date followupDate;

    /** 7. [可空] 中医药健康管理服务 */
    protected String zyyjkglfw;

    /** 9. [可空] 其他中医药健康管理服务 */
    protected String qtzyyjkglfw;

    /** 10. [可空] 下次随访日期 */
    protected Date nextFollowupDate;

    /** 11. [可空] 随访医生 */
    protected String followupDoctor;

    /** 12.[可空] 录入日期*/
    protected Date lrrq;

    /** 13.[可空] 录入人*/
    protected String lrr;

    /** 14.[可空] 机构编号*/
    protected String orgcode;

    /** 15. [不可空] 填报日期 */
    protected java.util.Date uploadDate;

    /** 16. [不可空] 数据来源 */
    protected String fdataFrom;

    /** 17. [可空] 修改者 */
    protected String editor;

    /** 18. [可空] 修改日期 */
    protected java.util.Date modifydate;

    /** 19. [不可空] 修改标志,1新增,2修改,3撤销 */
    protected String updateFlag;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;


    @Generated(hash = 1786206719)
    public EhrChildrenZhongyiDto(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            String healthfileNo, String childrenNo, String monthold,
            Date followupDate, String zyyjkglfw, String qtzyyjkglfw,
            Date nextFollowupDate, String followupDoctor, Date lrrq, String lrr,
            String orgcode, java.util.Date uploadDate, String fdataFrom,
            String editor, java.util.Date modifydate, String updateFlag,
            String editorId, String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.healthfileNo = healthfileNo;
        this.childrenNo = childrenNo;
        this.monthold = monthold;
        this.followupDate = followupDate;
        this.zyyjkglfw = zyyjkglfw;
        this.qtzyyjkglfw = qtzyyjkglfw;
        this.nextFollowupDate = nextFollowupDate;
        this.followupDoctor = followupDoctor;
        this.lrrq = lrrq;
        this.lrr = lrr;
        this.orgcode = orgcode;
        this.uploadDate = uploadDate;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1723935871)
    public EhrChildrenZhongyiDto() {
    }


    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFdataFrom() {
        return fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVipCard() {
        return vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getChildrenNo() {
        return childrenNo;
    }

    public void setChildrenNo(String childrenNo) {
        this.childrenNo = childrenNo;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public Date getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    public String getZyyjkglfw() {
        return zyyjkglfw;
    }

    public void setZyyjkglfw(String zyyjkglfw) {
        this.zyyjkglfw = zyyjkglfw;
    }

    public Date getNextFollowupDate() {
        return nextFollowupDate;
    }

    public void setNextFollowupDate(Date nextFollowupDate) {
        this.nextFollowupDate = nextFollowupDate;
    }

    public String getFollowupDoctor() {
        return followupDoctor;
    }

    public void setFollowupDoctor(String followupDoctor) {
        this.followupDoctor = followupDoctor;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public boolean getUpload() {
        return this.upload;
    }

    public boolean getCompleted() {
        return this.completed;
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

    public String getOrgcode() {
        return this.orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getMonthold() {
        return this.monthold;
    }

    public void setMonthold(String monthold) {
        this.monthold = monthold;
    }

    public String getQtzyyjkglfw() {
        return this.qtzyyjkglfw;
    }

    public void setQtzyyjkglfw(String qtzyyjkglfw) {
        this.qtzyyjkglfw = qtzyyjkglfw;
    }
}
