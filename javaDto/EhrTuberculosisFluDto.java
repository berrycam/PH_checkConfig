package com.konsung.bean.tuber;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;



/**
 * 肺结核随访
 *
 * @author kuangguohua
 */
@Entity
public class EhrTuberculosisFluDto extends BaseChildBean {
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
    private String id;
    /**
     * 专项的本地id
     */
    private Long localspecialID;
    /**
     * 是否是结案的专项
     */
    private Boolean isEndCase;

    /**
     * 1. [可空] 第一次随访id|
     */
    protected String examinid;

    /**
     * 2. [不可空] 档案号|
     */
    protected String healthfileNo;

    /**
     * 3. [可空] 随访时间|
     */
    protected java.util.Date visitdate;

    /**
     * 4. [可空] 治疗月序|
     */
    protected Long zlyx;

    /**
     * 5. [可空] 督导人员|
     */
    protected String supervisor;

    /**
     * 6. [可空] 随访方式|
     */
    protected String visitstyle;

    /**
     * 7. [可空] 症状及体征|
     */
    protected String sysmpsigns;

    /**
     * 8. [可空] 其他|
     */
    protected String qtsysmpsigns;

    /**
     * 9. [可空] 吸烟|
     */
    protected Long smoke;

    /**
     * 10. [可空] 饮酒|
     */
    protected Double drink;

    /**
     * 11. [可空] 化疗方案|
     */
    protected String hlscheme;

    /**
     * 12. [可空] 用法|
     */
    protected String fusage;

    /**
     * 13. [可空] 药品剂型|
     */
    protected String ypjx;

    /**
     * 14. [可空] 漏服药次数|
     */
    protected Long lfycs;

    /**
     * 15. [可空] 药物不良反应|
     */
    protected String ywblfy;

    /**
     * 16. [可空] 具体药物不良反应|
     */
    protected String jtywblfy;

    /**
     * 17. [可空] 并发症或合并症|
     */
    protected String bfzhhbz;

    /**
     * 18. [可空] 具体并发症或合并症|
     */
    protected String jtbfzhhbz;

    /**
     * 19. [可空] 科别|
     */
    protected String kb;

    /**
     * 20. [可空] 原因|
     */
    protected String reason;

    /**
     * 21. [可空] 2周内随访，随访结果|
     */
    protected String sfjg;

    /**
     * 22. [可空] 处理意见|
     */
    protected String clyj;

    /**
     * 23. [可空] 下次随访时间|
     */
    protected java.util.Date nextvisitdate;

    /**
     * 24. [可空] 随访医生签名|
     */
    protected String evaluationdoctor;

    /**
     * 25. [可空] 出现停止治疗时间|
     */
    protected java.util.Date cxtzzlsj;

    /**
     * 26. [可空] 停止治疗原因|
     */
    protected String stopreason;

    /**
     * 27. [可空] 数据源类型|
     */
    protected String datarestype;

    /**
     * 28. [可空] 设备供应商|
     */
    protected String ssuppliercode;

    /**
     * 29. [可空] 是否成功上传|
     */
    protected String issuccess;

    /**
     * 30. [可空] 上传时间|
     */
    protected java.util.Date uploadtime;

    /**
     * 31. [可空] 上传失败的原因|
     */
    protected String errreason;

    /**
     * 33. [可空] 状态|
     */
    protected Long status;

    /**
     * 34. [可空] 创建者|
     */
    protected String createdBy;

    /**
     * 35. [可空] 创建时间|
     */
    protected java.util.Date createdDate;

    /**
     * 36. [可空] 修改者|
     */
    protected String updatedBy;

    /**
     * 37. [可空] 修改时间|
     */
    protected java.util.Date updatedDate;

    /**
     * 38. [可空] 作废该纪录的人|
     */
    protected String disabledBy;

    /**
     * 39. [可空] 记录所属单位单位|
     */
    protected String duns;

    /**
     * 40. [可空] 作废该纪录的时间|
     */
    protected java.util.Date disabledDate;

    /**
     * 41. [可空] 目标吸烟量
     */
    protected Long smokeTarget;

    /**
     * 42. [可空] 目标饮酒量
     */
    protected Double drinkTarget;

    /**
     * 43. [不可空] 肺结核专项档案号
     */
    protected String cardId;

    /**
     * 44. [可空] 应访视次数|
     */
    protected Long yfscs;

    /**
     * 45. [可空] 实际访视次数|
     */
    protected Long sjfscs;

    /**
     * 46. [可空] 应服药次数|
     */
    protected Long yfycs;

    /**
     * 47. [可空] 实际服药次数|
     */
    protected Long sjfycs;

    /**
     * 48. [可空] 服药率|
     */
    protected Long fyl;

    /**
     * 49. [可空] 全程管理评估医生签名|
     */
    protected String evaldoctor;

    private String editor;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 461140766)
    public EhrTuberculosisFluDto(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            Long localspecialID, Boolean isEndCase, String examinid,
            String healthfileNo, java.util.Date visitdate, Long zlyx,
            String supervisor, String visitstyle, String sysmpsigns,
            String qtsysmpsigns, Long smoke, Double drink, String hlscheme,
            String fusage, String ypjx, Long lfycs, String ywblfy, String jtywblfy,
            String bfzhhbz, String jtbfzhhbz, String kb, String reason, String sfjg,
            String clyj, java.util.Date nextvisitdate, String evaluationdoctor,
            java.util.Date cxtzzlsj, String stopreason, String datarestype,
            String ssuppliercode, String issuccess, java.util.Date uploadtime,
            String errreason, Long status, String createdBy,
            java.util.Date createdDate, String updatedBy,
            java.util.Date updatedDate, String disabledBy, String duns,
            java.util.Date disabledDate, Long smokeTarget, Double drinkTarget,
            String cardId, Long yfscs, Long sjfscs, Long yfycs, Long sjfycs,
            Long fyl, String evaldoctor, String editor, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.localspecialID = localspecialID;
        this.isEndCase = isEndCase;
        this.examinid = examinid;
        this.healthfileNo = healthfileNo;
        this.visitdate = visitdate;
        this.zlyx = zlyx;
        this.supervisor = supervisor;
        this.visitstyle = visitstyle;
        this.sysmpsigns = sysmpsigns;
        this.qtsysmpsigns = qtsysmpsigns;
        this.smoke = smoke;
        this.drink = drink;
        this.hlscheme = hlscheme;
        this.fusage = fusage;
        this.ypjx = ypjx;
        this.lfycs = lfycs;
        this.ywblfy = ywblfy;
        this.jtywblfy = jtywblfy;
        this.bfzhhbz = bfzhhbz;
        this.jtbfzhhbz = jtbfzhhbz;
        this.kb = kb;
        this.reason = reason;
        this.sfjg = sfjg;
        this.clyj = clyj;
        this.nextvisitdate = nextvisitdate;
        this.evaluationdoctor = evaluationdoctor;
        this.cxtzzlsj = cxtzzlsj;
        this.stopreason = stopreason;
        this.datarestype = datarestype;
        this.ssuppliercode = ssuppliercode;
        this.issuccess = issuccess;
        this.uploadtime = uploadtime;
        this.errreason = errreason;
        this.status = status;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.disabledBy = disabledBy;
        this.duns = duns;
        this.disabledDate = disabledDate;
        this.smokeTarget = smokeTarget;
        this.drinkTarget = drinkTarget;
        this.cardId = cardId;
        this.yfscs = yfscs;
        this.sjfscs = sjfscs;
        this.yfycs = yfycs;
        this.sjfycs = sjfycs;
        this.fyl = fyl;
        this.evaldoctor = evaldoctor;
        this.editor = editor;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1321732333)
    public EhrTuberculosisFluDto() {
    }

    public Boolean getEndCase() {
        return isEndCase;
    }

    public void setEndCase(Boolean endCase) {
        isEndCase = endCase;
    }

    public Long getLocalspecialID() {
        return localspecialID;
    }

    public void setLocalspecialID(Long localspecialID) {
        this.localspecialID = localspecialID;
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

    @Override
    public Date getFollowupDate() {
        return updatedDate;
    }

    @Override
    public void setFollowupDate(Date followupDate) {

    }

    @Override
    public Date getNextFollowupDate() {
        return nextvisitdate;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExaminid() {
        return examinid;
    }

    public void setExaminid(String examinid) {
        this.examinid = examinid;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public Date getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    public Long getZlyx() {
        return zlyx;
    }

    public void setZlyx(Long zlyx) {
        this.zlyx = zlyx;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getVisitstyle() {
        return visitstyle;
    }

    public void setVisitstyle(String visitstyle) {
        this.visitstyle = visitstyle;
    }

    public String getSysmpsigns() {
        return sysmpsigns;
    }

    public void setSysmpsigns(String sysmpsigns) {
        this.sysmpsigns = sysmpsigns;
    }

    public String getQtsysmpsigns() {
        return qtsysmpsigns;
    }

    public void setQtsysmpsigns(String qtsysmpsigns) {
        this.qtsysmpsigns = qtsysmpsigns;
    }

    public Long getSmoke() {
        return smoke;
    }

    public void setSmoke(Long smoke) {
        this.smoke = smoke;
    }

    public Double getDrink() {
        return drink;
    }

    public void setDrink(Double drink) {
        this.drink = drink;
    }

    public String getHlscheme() {
        return hlscheme;
    }

    public void setHlscheme(String hlscheme) {
        this.hlscheme = hlscheme;
    }

    public String getFusage() {
        return fusage;
    }

    public void setFusage(String fusage) {
        this.fusage = fusage;
    }

    public String getYpjx() {
        return ypjx;
    }

    public void setYpjx(String ypjx) {
        this.ypjx = ypjx;
    }

    public Long getLfycs() {
        return lfycs;
    }

    public void setLfycs(Long lfycs) {
        this.lfycs = lfycs;
    }

    public String getYwblfy() {
        return ywblfy;
    }

    public void setYwblfy(String ywblfy) {
        this.ywblfy = ywblfy;
    }

    public String getJtywblfy() {
        return jtywblfy;
    }

    public void setJtywblfy(String jtywblfy) {
        this.jtywblfy = jtywblfy;
    }

    public String getBfzhhbz() {
        return bfzhhbz;
    }

    public void setBfzhhbz(String bfzhhbz) {
        this.bfzhhbz = bfzhhbz;
    }

    public String getJtbfzhhbz() {
        return jtbfzhhbz;
    }

    public void setJtbfzhhbz(String jtbfzhhbz) {
        this.jtbfzhhbz = jtbfzhhbz;
    }

    public String getKb() {
        return kb;
    }

    public void setKb(String kb) {
        this.kb = kb;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSfjg() {
        return sfjg;
    }

    public void setSfjg(String sfjg) {
        this.sfjg = sfjg;
    }

    public String getClyj() {
        return clyj;
    }

    public void setClyj(String clyj) {
        this.clyj = clyj;
    }

    public Date getNextvisitdate() {
        return nextvisitdate;
    }

    public void setNextvisitdate(Date nextvisitdate) {
        this.nextvisitdate = nextvisitdate;
    }

    public String getEvaluationdoctor() {
        return evaluationdoctor;
    }

    public void setEvaluationdoctor(String evaluationdoctor) {
        this.evaluationdoctor = evaluationdoctor;
    }

    public Date getCxtzzlsj() {
        return cxtzzlsj;
    }

    public void setCxtzzlsj(Date cxtzzlsj) {
        this.cxtzzlsj = cxtzzlsj;
    }

    public String getStopreason() {
        return stopreason;
    }

    public void setStopreason(String stopreason) {
        this.stopreason = stopreason;
    }

    public String getDatarestype() {
        return datarestype;
    }

    public void setDatarestype(String datarestype) {
        this.datarestype = datarestype;
    }

    public String getSsuppliercode() {
        return ssuppliercode;
    }

    public void setSsuppliercode(String ssuppliercode) {
        this.ssuppliercode = ssuppliercode;
    }

    public String getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(String issuccess) {
        this.issuccess = issuccess;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getErrreason() {
        return errreason;
    }

    public void setErrreason(String errreason) {
        this.errreason = errreason;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDisabledBy() {
        return disabledBy;
    }

    public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy;
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public Date getDisabledDate() {
        return disabledDate;
    }

    public void setDisabledDate(Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    public Long getSmokeTarget() {
        return smokeTarget;
    }

    public void setSmokeTarget(Long smokeTarget) {
        this.smokeTarget = smokeTarget;
    }

    public Double getDrinkTarget() {
        return drinkTarget;
    }

    public void setDrinkTarget(Double drinkTarget) {
        this.drinkTarget = drinkTarget;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public boolean getUpload() {
        return this.upload;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public Long getYfscs() {
        return this.yfscs;
    }

    public void setYfscs(Long yfscs) {
        this.yfscs = yfscs;
    }

    public Long getSjfscs() {
        return this.sjfscs;
    }

    public void setSjfscs(Long sjfscs) {
        this.sjfscs = sjfscs;
    }

    public Long getYfycs() {
        return this.yfycs;
    }

    public void setYfycs(Long yfycs) {
        this.yfycs = yfycs;
    }

    public Long getSjfycs() {
        return this.sjfycs;
    }

    public void setSjfycs(Long sjfycs) {
        this.sjfycs = sjfycs;
    }

    public Long getFyl() {
        return this.fyl;
    }

    public void setFyl(Long fyl) {
        this.fyl = fyl;
    }

    public String getEvaldoctor() {
        return this.evaldoctor;
    }

    public void setEvaldoctor(String evaldoctor) {
        this.evaldoctor = evaldoctor;
    }

    public Boolean getIsEndCase() {
        return this.isEndCase;
    }

    public void setIsEndCase(Boolean isEndCase) {
        this.isEndCase = isEndCase;
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

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
