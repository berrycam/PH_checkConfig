package com.konsung.bean.tuber;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * 肺结核第一次入户随访DTO
 * @author kuangguohua
 *
 */
@Entity
public class EhrTuberculosisFirstDto extends BaseChildBean {
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

    /** 1. [不可空] 档案号| */
    protected String healthfileNo;

    /** 2. [可空] 随访日期| */
    protected java.util.Date visitdate;

    /** 3. [可空] 随访方式| */
    protected String visitstyle;

    /** 4. [可空] 患者类型| */
    protected String patienttype;

    /** 5. [可空] 痰菌情况| */
    protected String tjqk;

    /** 6. [可空] 耐药情况| */
    protected String nyqk;

    /** 7. [可空] 症状及体征| */
    protected String sysmpsigns;

    /** 8. [可空] 其他| */
    protected String qtsysmpsigns;

    /** 9. [可空] 化疗方案| */
    protected String hlscheme;

    /** 10. [可空] 用法| */
    protected String fusage;

    /** 11. [可空] 药品剂型| */
    protected String ypjx;

    /** 12. [可空] 监督人员选择| */
    protected String supervisor;

    /** 13. [可空] 单独的居室| */
    protected String singlehome;

    /** 14. [可空] 通风情况| */
    protected String ventilate;

    /** 15. [可空] 吸烟| */
    protected Long smoke;

    /** 16. [可空] 喝酒| */
    protected Long drink;

    /** 17. [可空] 取药地点| */
    protected String getmedicineaddr;

    /** 18. [可空] 取药时间| */
    protected java.util.Date getmedicinedate;

    /** 19. [可空] 服务记录卡的填写| */
    protected String fwjlk;

    /** 20. [可空] 药物方法及药品存放| */
    protected String ywffjypcf;

    /** 21. [可空] 肺结核治疗疗程| */
    protected String fjhzllc;

    /** 22. [可空] 不规律服药危害| */
    protected String bglfwwh;

    /** 23. [可空] 服药后不良反应及处理| */
    protected String fyhblfyjcl;

    /** 24. [可空] 治疗期间复诊查痰| */
    protected String zlqjfzct;

    /** 25. [可空] 外出期间如何坚持服药| */
    protected String wcqjrhjcfy;

    /** 26. [可空] 生活习惯及注意事项| */
    protected String shxgjzysx;

    /** 27. [可空] 密切接触者检查| */
    protected String mqjczjc;

    /** 28. [可空] 下次随访时间| */
    protected java.util.Date nextvisitdate;

    /** 29. [可空] 评估医生签名| */
    protected String evaluationdoctor;

    /** 30. [可空] 应访视次数| */
    protected Long yfscs;

    /** 31. [可空] 实际访视次数| */
    protected Long sjfscs;

    /** 32. [可空] 应服药次数| */
    protected Long yfycs;

    /** 33. [可空] 实际服药次数| */
    protected Long sjfycs;

    /** 34. [可空] 服药率| */
    protected Long fyl;

    /** 35. [可空] 全程管理评估医生签名| */
    protected String evaldoctor;

    /** 36. [可空] 结案状态| */
    protected String closestatus;

    /** 37. [可空] 结案时间| */
    protected java.util.Date closedate;

    /** 38. [可空] 数据源类型| */
    protected String datarestype;

    /** 39. [可空] 设备供应商| */
    protected String ssuppliercode;

    /** 40. [可空] 是否成功上传| */
    protected String issuccess;

    /** 41. [可空] 上传时间| */
    protected java.util.Date uploadtime;

    /** 42. [可空] 上传失败的原因| */
    protected String errreason;

    /** 44. [可空] 状态| */
    protected Long status;

    /** 45. [可空] 创建者| */
    protected String createdBy;

    /** 46. [可空] 创建时间| */
    protected java.util.Date createdDate;

    /** 47. [可空] 修改者| */
    protected String updatedBy;

    /** 48. [可空] 修改时间| */
    protected java.util.Date updatedDate;

    /** 49. [可空] 作废该纪录的人| */
    protected String disabledBy;

    /** 50. [可空] 记录所属单位单位| */
    protected String duns;

    /** 51. [可空] 作废该纪录的时间| */
    protected java.util.Date disabledDate;

    /** 52. [可空] 目标吸烟量 */
    protected Long smokeTarget;

    /** 53. [可空] 目标饮酒量 */
    protected Long drinkTarget;

    /** 54. [不可空] 肺结核专项档案号 */
    protected String cardId;

    private String editor;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 88104249)
    public EhrTuberculosisFirstDto(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            Long localspecialID, Boolean isEndCase, String healthfileNo,
            java.util.Date visitdate, String visitstyle, String patienttype,
            String tjqk, String nyqk, String sysmpsigns, String qtsysmpsigns,
            String hlscheme, String fusage, String ypjx, String supervisor,
            String singlehome, String ventilate, Long smoke, Long drink,
            String getmedicineaddr, java.util.Date getmedicinedate, String fwjlk,
            String ywffjypcf, String fjhzllc, String bglfwwh, String fyhblfyjcl,
            String zlqjfzct, String wcqjrhjcfy, String shxgjzysx, String mqjczjc,
            java.util.Date nextvisitdate, String evaluationdoctor, Long yfscs,
            Long sjfscs, Long yfycs, Long sjfycs, Long fyl, String evaldoctor,
            String closestatus, java.util.Date closedate, String datarestype,
            String ssuppliercode, String issuccess, java.util.Date uploadtime,
            String errreason, Long status, String createdBy,
            java.util.Date createdDate, String updatedBy,
            java.util.Date updatedDate, String disabledBy, String duns,
            java.util.Date disabledDate, Long smokeTarget, Long drinkTarget,
            String cardId, String editor, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.localspecialID = localspecialID;
        this.isEndCase = isEndCase;
        this.healthfileNo = healthfileNo;
        this.visitdate = visitdate;
        this.visitstyle = visitstyle;
        this.patienttype = patienttype;
        this.tjqk = tjqk;
        this.nyqk = nyqk;
        this.sysmpsigns = sysmpsigns;
        this.qtsysmpsigns = qtsysmpsigns;
        this.hlscheme = hlscheme;
        this.fusage = fusage;
        this.ypjx = ypjx;
        this.supervisor = supervisor;
        this.singlehome = singlehome;
        this.ventilate = ventilate;
        this.smoke = smoke;
        this.drink = drink;
        this.getmedicineaddr = getmedicineaddr;
        this.getmedicinedate = getmedicinedate;
        this.fwjlk = fwjlk;
        this.ywffjypcf = ywffjypcf;
        this.fjhzllc = fjhzllc;
        this.bglfwwh = bglfwwh;
        this.fyhblfyjcl = fyhblfyjcl;
        this.zlqjfzct = zlqjfzct;
        this.wcqjrhjcfy = wcqjrhjcfy;
        this.shxgjzysx = shxgjzysx;
        this.mqjczjc = mqjczjc;
        this.nextvisitdate = nextvisitdate;
        this.evaluationdoctor = evaluationdoctor;
        this.yfscs = yfscs;
        this.sjfscs = sjfscs;
        this.yfycs = yfycs;
        this.sjfycs = sjfycs;
        this.fyl = fyl;
        this.evaldoctor = evaldoctor;
        this.closestatus = closestatus;
        this.closedate = closedate;
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
        this.editor = editor;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 2015829736)
    public EhrTuberculosisFirstDto() {
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

    public String getVisitstyle() {
        return visitstyle;
    }

    public void setVisitstyle(String visitstyle) {
        this.visitstyle = visitstyle;
    }

    public String getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype;
    }

    public String getTjqk() {
        return tjqk;
    }

    public void setTjqk(String tjqk) {
        this.tjqk = tjqk;
    }

    public String getNyqk() {
        return nyqk;
    }

    public void setNyqk(String nyqk) {
        this.nyqk = nyqk;
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

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSinglehome() {
        return singlehome;
    }

    public void setSinglehome(String singlehome) {
        this.singlehome = singlehome;
    }

    public String getVentilate() {
        return ventilate;
    }

    public void setVentilate(String ventilate) {
        this.ventilate = ventilate;
    }

    public Long getSmoke() {
        return smoke;
    }

    public void setSmoke(Long smoke) {
        this.smoke = smoke;
    }

    public Long getDrink() {
        return drink;
    }

    public void setDrink(Long drink) {
        this.drink = drink;
    }

    public String getGetmedicineaddr() {
        return getmedicineaddr;
    }

    public void setGetmedicineaddr(String getmedicineaddr) {
        this.getmedicineaddr = getmedicineaddr;
    }

    public Date getGetmedicinedate() {
        return getmedicinedate;
    }

    public void setGetmedicinedate(Date getmedicinedate) {
        this.getmedicinedate = getmedicinedate;
    }

    public String getFwjlk() {
        return fwjlk;
    }

    public void setFwjlk(String fwjlk) {
        this.fwjlk = fwjlk;
    }

    public String getYwffjypcf() {
        return ywffjypcf;
    }

    public void setYwffjypcf(String ywffjypcf) {
        this.ywffjypcf = ywffjypcf;
    }

    public String getFjhzllc() {
        return fjhzllc;
    }

    public void setFjhzllc(String fjhzllc) {
        this.fjhzllc = fjhzllc;
    }

    public String getBglfwwh() {
        return bglfwwh;
    }

    public void setBglfwwh(String bglfwwh) {
        this.bglfwwh = bglfwwh;
    }

    public String getFyhblfyjcl() {
        return fyhblfyjcl;
    }

    public void setFyhblfyjcl(String fyhblfyjcl) {
        this.fyhblfyjcl = fyhblfyjcl;
    }

    public String getZlqjfzct() {
        return zlqjfzct;
    }

    public void setZlqjfzct(String zlqjfzct) {
        this.zlqjfzct = zlqjfzct;
    }

    public String getWcqjrhjcfy() {
        return wcqjrhjcfy;
    }

    public void setWcqjrhjcfy(String wcqjrhjcfy) {
        this.wcqjrhjcfy = wcqjrhjcfy;
    }

    public String getShxgjzysx() {
        return shxgjzysx;
    }

    public void setShxgjzysx(String shxgjzysx) {
        this.shxgjzysx = shxgjzysx;
    }

    public String getMqjczjc() {
        return mqjczjc;
    }

    public void setMqjczjc(String mqjczjc) {
        this.mqjczjc = mqjczjc;
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

    public Long getYfscs() {
        return yfscs;
    }

    public void setYfscs(Long yfscs) {
        this.yfscs = yfscs;
    }

    public Long getSjfscs() {
        return sjfscs;
    }

    public void setSjfscs(Long sjfscs) {
        this.sjfscs = sjfscs;
    }

    public Long getYfycs() {
        return yfycs;
    }

    public void setYfycs(Long yfycs) {
        this.yfycs = yfycs;
    }

    public Long getSjfycs() {
        return sjfycs;
    }

    public void setSjfycs(Long sjfycs) {
        this.sjfycs = sjfycs;
    }

    public Long getFyl() {
        return fyl;
    }

    public void setFyl(Long fyl) {
        this.fyl = fyl;
    }

    public String getEvaldoctor() {
        return evaldoctor;
    }

    public void setEvaldoctor(String evaldoctor) {
        this.evaldoctor = evaldoctor;
    }

    public String getClosestatus() {
        return closestatus;
    }

    public void setClosestatus(String closestatus) {
        this.closestatus = closestatus;
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
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

    public Long getDrinkTarget() {
        return drinkTarget;
    }

    public void setDrinkTarget(Long drinkTarget) {
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

    public Boolean getIsEndCase() {
        return this.isEndCase;
    }
    public String getEditorId() {
        return this.editorId;
    }

    public void setIsEndCase(Boolean isEndCase) {
        this.isEndCase = isEndCase;
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
