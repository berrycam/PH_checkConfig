// CHECKSTYLE:OFF

package com.konsung.bean.health;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;


/**
 * 抽象接诊记录类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [主键] String fid 主键ID
 * 2. [不可空] String fserialNumber 编码
 * 3. [可空] String fidNumber 身份证号
 * 4. [不可空] String fname 姓名
 * 5. [可空] String fsex 性别
 * 6. [可空] java.util.Date fbirthDate 出生日期
 * 7. [可空] Integer fage 年龄
 * 8. [可空] String fmobilePhone 手机号码
 * 9. [不可空] String fsubjectiveInformation 就诊者主观资料
 * 10. [不可空] String fobjectiveData 就诊者客观资料
 * 11. [不可空] String fevaluate 评估
 * 12. [不可空] String fdisposalPlan 处置计划
 * 13. [不可空] String freceptionDoctorId 接诊医生ID
 * 14. [不可空] String freceptionDoctorName 接诊医生姓名
 * 15. [不可空] String freceptionOrgId 接诊机构ID
 * 16. [不可空] String freceptionOrgName 接诊机构名称
 * 17. [不可空] java.util.Date freceptionDate 接诊日期
 * 18. [不可空] java.util.Date fuploadDate 上传时间
 * 19. [不可空] String updateFlag 修改标志
 * 20. [可空] String editor 修改者
 * 21. [可空] java.util.Date modifydate 修改时间
 * </pre>
 * <p>
 * <p>
 * <p>
 * <p><a href="file:///D:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com/ks/imms/domain/model/domain/base/EhrClinicalReception.html">EhrClinicalReception代码模板</a>
 *
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrClinicalReceptionDto extends BaseChildBean {
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
    /**
     * 主键
     */
    private String fid;
    private String id;
    /**
     * 2. [不可空] 编码
     */
    private String fserialNumber;

    /**
     * 3. [可空] 身份证号
     */
    private String fidNumber;

    /**
     * 4. [不可空] 姓名
     */
    private String fname;

    /**
     * 5. [可空] 性别
     */
    private String fsex;

    /**
     * 6. [可空] 出生日期
     */
    private java.util.Date fbirthDate;

    /**
     * 7. [可空] 年龄
     */
    private Integer fage;

    /**
     * 8. [可空] 手机号码
     */
    private String fmobilePhone;

    /**
     * 9. [不可空] 就诊者主观资料
     */
    private String fsubjectiveInformation;

    /**
     * 10. [不可空] 就诊者客观资料
     */
    private String fobjectiveData;

    /**
     * 11. [不可空] 评估
     */
    private String fevaluate;

    /**
     * 12. [不可空] 处置计划
     */
    private String fdisposalPlan;

    /**
     * 13. [不可空] 接诊医生ID
     */
    private String freceptionDoctorId;

    /**
     * 14. [不可空] 接诊医生姓名
     */
    private String freceptionDoctorName;

    /**
     * 15. [不可空] 接诊机构ID
     */
    private String freceptionOrgId;

    /**
     * 16. [不可空] 接诊机构名称
     */
    private String freceptionOrgName;

    /**
     * 17. [不可空] 接诊日期
     */
    private java.util.Date freceptionDate;

    /**
     * 18. [不可空] 上传时间
     */
    private java.util.Date fuploadDate;

    /**
     * 19. [不可空] 修改标志
     */
    private String updateFlag;

    /**
     * 20. [可空] 修改者
     */
    private String editor;

    /**
     * 21. [可空] 修改时间
     */
    private java.util.Date modifydate;

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

    @Generated(hash = 1458939666)
    public EhrClinicalReceptionDto(Long localId, String idCard, String vipCard, boolean upload, boolean completed, String title, String fid, String id, String fserialNumber, String fidNumber,
            String fname, String fsex, java.util.Date fbirthDate, Integer fage, String fmobilePhone, String fsubjectiveInformation, String fobjectiveData, String fevaluate, String fdisposalPlan,
            String freceptionDoctorId, String freceptionDoctorName, String freceptionOrgId, String freceptionOrgName, java.util.Date freceptionDate, java.util.Date fuploadDate, String updateFlag,
            String editor, java.util.Date modifydate, String editorId, String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.fid = fid;
        this.id = id;
        this.fserialNumber = fserialNumber;
        this.fidNumber = fidNumber;
        this.fname = fname;
        this.fsex = fsex;
        this.fbirthDate = fbirthDate;
        this.fage = fage;
        this.fmobilePhone = fmobilePhone;
        this.fsubjectiveInformation = fsubjectiveInformation;
        this.fobjectiveData = fobjectiveData;
        this.fevaluate = fevaluate;
        this.fdisposalPlan = fdisposalPlan;
        this.freceptionDoctorId = freceptionDoctorId;
        this.freceptionDoctorName = freceptionDoctorName;
        this.freceptionOrgId = freceptionOrgId;
        this.freceptionOrgName = freceptionOrgName;
        this.freceptionDate = freceptionDate;
        this.fuploadDate = fuploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 993138753)
    public EhrClinicalReceptionDto() {
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

    /**
     * 获取followupDate的值
     *
     * @return followupDate followupDate值
     */
    @Override
    public Date getFollowupDate() {
        return freceptionDate;
    }

    /**
     * 设置followupDate的值
     *
     * @param followupDate followupDate值
     */
    @Override
    public void setFollowupDate(Date followupDate) {
        freceptionDate = followupDate;
    }

    /**
     * 获取nextFollowupDate的值
     *
     * @return nextFollowupDate nextFollowupDate值
     */
    @Override
    public Date getNextFollowupDate() {
        return null;
    }

    /**
     * 设置nextFollowupDate的值
     *
     * @param nextFollowupDate nextFollowupDate值
     */
    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFserialNumber() {
        return fserialNumber;
    }

    public void setFserialNumber(String fserialNumber) {
        this.fserialNumber = fserialNumber;
    }

    public String getFidNumber() {
        return fidNumber;
    }

    public void setFidNumber(String fidNumber) {
        this.fidNumber = fidNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFsex() {
        return fsex;
    }

    public void setFsex(String fsex) {
        this.fsex = fsex;
    }

    public Date getFbirthDate() {
        return fbirthDate;
    }

    public void setFbirthDate(Date fbirthDate) {
        this.fbirthDate = fbirthDate;
    }

    public Integer getFage() {
        return fage;
    }

    public void setFage(Integer fage) {
        this.fage = fage;
    }

    public String getFmobilePhone() {
        return fmobilePhone;
    }

    public void setFmobilePhone(String fmobilePhone) {
        this.fmobilePhone = fmobilePhone;
    }

    public String getFsubjectiveInformation() {
        return fsubjectiveInformation;
    }

    public void setFsubjectiveInformation(String fsubjectiveInformation) {
        this.fsubjectiveInformation = fsubjectiveInformation;
    }

    public String getFobjectiveData() {
        return fobjectiveData;
    }

    public void setFobjectiveData(String fobjectiveData) {
        this.fobjectiveData = fobjectiveData;
    }

    public String getFevaluate() {
        return fevaluate;
    }

    public void setFevaluate(String fevaluate) {
        this.fevaluate = fevaluate;
    }

    public String getFdisposalPlan() {
        return fdisposalPlan;
    }

    public void setFdisposalPlan(String fdisposalPlan) {
        this.fdisposalPlan = fdisposalPlan;
    }

    public String getFreceptionDoctorId() {
        return freceptionDoctorId;
    }

    public void setFreceptionDoctorId(String freceptionDoctorId) {
        this.freceptionDoctorId = freceptionDoctorId;
    }

    public String getFreceptionDoctorName() {
        return freceptionDoctorName;
    }

    public void setFreceptionDoctorName(String freceptionDoctorName) {
        this.freceptionDoctorName = freceptionDoctorName;
    }

    public String getFreceptionOrgId() {
        return freceptionOrgId;
    }

    public void setFreceptionOrgId(String freceptionOrgId) {
        this.freceptionOrgId = freceptionOrgId;
    }

    public String getFreceptionOrgName() {
        return freceptionOrgName;
    }

    public void setFreceptionOrgName(String freceptionOrgName) {
        this.freceptionOrgName = freceptionOrgName;
    }

    public Date getFreceptionDate() {
        return freceptionDate;
    }

    public void setFreceptionDate(Date freceptionDate) {
        this.freceptionDate = freceptionDate;
    }

    public Date getFuploadDate() {
        return fuploadDate;
    }

    public void setFuploadDate(Date fuploadDate) {
        this.fuploadDate = fuploadDate;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
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

    public String getFid() {
        return this.fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }
}
