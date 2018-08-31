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
 * 抽象双向转诊(转入)类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [主键] String fid 主键ID
 * 2. [可空] String fidNumber 患者身份证号
 * 3. [不可空] String fname 患者姓名
 * 4. [不可空] String fsex 患者性别
 * 5. [可空] java.util.Date fbirthDate 患者出生日期
 * 6. [不可空] Integer fage 患者年龄
 * 7. [可空] String fmobilePhone 患者手机号码
 * 8. [可空] String fhealthfileNo 患者档案编号
 * 9. [不可空] String faddress 患者家庭住址
 * 10. [不可空] String freferralOrgname 接收单位(机构)
 * 11. [不可空] String ffirstImpression 初步印象
 * 12. [不可空] String freferralOutReason 转出原因
 * 13. [不可空] String fpastHistory 主要既往史
 * 14. [不可空] String fcurePass 主要治疗经过
 * 15. [可空] String frequestDoctorId 申请(转诊)医生ID
 * 16. [不可空] String frequestDoctorName 申请(转诊)医生姓名
 * 17. [可空] String fmedicalRecord 患者病案号
 * 18. [可空] java.util.Date foutDate 转出日期
 * 19. [可空] String freciveDoctorId 转回接收医生ID
 * 20. [可空] String freciveDoctorName 转回接收医生姓名
 * 21. [可空] String fresponseDoctorId 转回申请医生ID
 * 22. [可空] String fresponseDoctorName 转回申请医生姓名
 * 23. [可空] java.util.Date fresponseDate 转回申请日期
 * 24. [不可空] java.util.Date fuploadDate 上传时间
 * 25. [不可空] String updateFlag 修改标志0正常1修改2撤销
 * 26. [可空] String editor 修改者
 * 27. [可空] java.util.Date modifydate 修改时间
 * </pre>
 * <p>
 * <p>
 * <p>
 * <p><a href="file:///D:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com/ks/imms/domain/model/domain/base/EhrDualReferralIn.html">EhrDualReferralIn代码模板</a>
 *
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrDualReferralOutDto extends BaseChildBean {
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
    private String fid;
    private String id;

    /**
     * 2. [可空] 患者身份证号
     */
    private String fidNumber;

    /**
     * 3. [不可空] 患者姓名
     */
    private String fname;

    /**
     * 4. [不可空] 患者性别
     */
    private String fsex;

    /**
     * 5. [可空] 患者出生日期
     */
    private java.util.Date fbirthDate;

    /**
     * 6. [不可空] 患者年龄
     */
    private Integer fage;

    /**
     * 7. [可空] 患者手机号码
     */
    private String fmobilePhone;

    /**
     * 8. [可空] 患者档案编号
     */
    private String fhealthfileNo;

    /**
     * 9. [不可空] 患者家庭住址
     */
    private String faddress;

    /**
     * 10. [不可空] 接收单位(机构)
     */
    private String freferralOrgname;

    /**
     * 11. [不可空] 初步印象
     */
    private String ffirstImpression;

    /**
     * 12. [不可空] 转出原因
     */
    private String freferralOutReason;

    /**
     * 13. [不可空] 主要既往史
     */
    private String fpastHistory;

    /**
     * 14. [不可空] 主要治疗经过
     */
    private String fcurePass;

    /**
     * 15. [可空] 申请(转诊)医生ID
     */
    private String frequestDoctorId;

    /**
     * 16. [不可空] 申请(转诊)医生姓名
     */
    private String frequestDoctorName;

    /**
     * 17. [可空] 患者病案号
     */
    private String fmedicalRecord;

    /**
     * 18. [可空] 转出日期
     */
    private java.util.Date foutDate;

    /**
     * 19. [可空] 转回接收医生ID
     */
    private String freciveDoctorId;

    /**
     * 20. [可空] 转回接收医生姓名
     */
    private String freciveDoctorName;

    /**
     * 21. [可空] 转回申请医生ID
     */
    private String fresponseDoctorId;

    /**
     * 22. [可空] 转回申请医生姓名
     */
    private String fresponseDoctorName;

    /**
     * 23. [可空] 转回申请日期
     */
    private java.util.Date fresponseDate;

    /**
     * 24. [不可空] 上传时间
     */
    private java.util.Date fuploadDate;

    /**
     * 25. [不可空] 修改标志0正常1修改2撤销
     */
    private String updateFlag;

    /**
     * 26. [可空] 修改者
     */
    private String editor;

    /**
     * 27. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 28. [可空] 转出联系电话
     */
    protected String frequestTelephone;

    /**
     * 29. [不可空] 申请机构ID
     */
    protected String frequestOrgId;

    /**
     * 30. [不可空] 申请机构名字
     */
    protected String frequestOrgName;

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

    @Generated(hash = 675135632)
    public EhrDualReferralOutDto(Long localId, String idCard, String vipCard, boolean upload, boolean completed, String title, String fid, String id, String fidNumber, String fname,
            String fsex, java.util.Date fbirthDate, Integer fage, String fmobilePhone, String fhealthfileNo, String faddress, String freferralOrgname, String ffirstImpression,
            String freferralOutReason, String fpastHistory, String fcurePass, String frequestDoctorId, String frequestDoctorName, String fmedicalRecord, java.util.Date foutDate,
            String freciveDoctorId, String freciveDoctorName, String fresponseDoctorId, String fresponseDoctorName, java.util.Date fresponseDate, java.util.Date fuploadDate,
            String updateFlag, String editor, java.util.Date modifydate, String frequestTelephone, String frequestOrgId, String frequestOrgName, String editorId, String updateOrgId,
            String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.fid = fid;
        this.id = id;
        this.fidNumber = fidNumber;
        this.fname = fname;
        this.fsex = fsex;
        this.fbirthDate = fbirthDate;
        this.fage = fage;
        this.fmobilePhone = fmobilePhone;
        this.fhealthfileNo = fhealthfileNo;
        this.faddress = faddress;
        this.freferralOrgname = freferralOrgname;
        this.ffirstImpression = ffirstImpression;
        this.freferralOutReason = freferralOutReason;
        this.fpastHistory = fpastHistory;
        this.fcurePass = fcurePass;
        this.frequestDoctorId = frequestDoctorId;
        this.frequestDoctorName = frequestDoctorName;
        this.fmedicalRecord = fmedicalRecord;
        this.foutDate = foutDate;
        this.freciveDoctorId = freciveDoctorId;
        this.freciveDoctorName = freciveDoctorName;
        this.fresponseDoctorId = fresponseDoctorId;
        this.fresponseDoctorName = fresponseDoctorName;
        this.fresponseDate = fresponseDate;
        this.fuploadDate = fuploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.frequestTelephone = frequestTelephone;
        this.frequestOrgId = frequestOrgId;
        this.frequestOrgName = frequestOrgName;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 864641043)
    public EhrDualReferralOutDto() {
    }

    public String getFrequestTelephone() {
        return frequestTelephone;
    }

    public void setFrequestTelephone(String frequestTelephone) {
        this.frequestTelephone = frequestTelephone;
    }

    public String getFrequestOrgId() {
        return frequestOrgId;
    }

    public void setFrequestOrgId(String frequestOrgId) {
        this.frequestOrgId = frequestOrgId;
    }

    public String getFrequestOrgName() {
        return frequestOrgName;
    }

    public void setFrequestOrgName(String frequestOrgName) {
        this.frequestOrgName = frequestOrgName;
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
        return fuploadDate;
    }

    /**
     * 设置followupDate的值
     *
     * @param followupDate followupDate值
     */
    @Override
    public void setFollowupDate(Date followupDate) {

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

    public String getFhealthfileNo() {
        return fhealthfileNo;
    }

    public void setFhealthfileNo(String fhealthfileNo) {
        this.fhealthfileNo = fhealthfileNo;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress;
    }

    public String getFreferralOrgname() {
        return freferralOrgname;
    }

    public void setFreferralOrgname(String freferralOrgname) {
        this.freferralOrgname = freferralOrgname;
    }

    public String getFfirstImpression() {
        return ffirstImpression;
    }

    public void setFfirstImpression(String ffirstImpression) {
        this.ffirstImpression = ffirstImpression;
    }

    public String getFreferralOutReason() {
        return freferralOutReason;
    }

    public void setFreferralOutReason(String freferralOutReason) {
        this.freferralOutReason = freferralOutReason;
    }

    public String getFpastHistory() {
        return fpastHistory;
    }

    public void setFpastHistory(String fpastHistory) {
        this.fpastHistory = fpastHistory;
    }

    public String getFcurePass() {
        return fcurePass;
    }

    public void setFcurePass(String fcurePass) {
        this.fcurePass = fcurePass;
    }

    public String getFrequestDoctorId() {
        return frequestDoctorId;
    }

    public void setFrequestDoctorId(String frequestDoctorId) {
        this.frequestDoctorId = frequestDoctorId;
    }

    public String getFrequestDoctorName() {
        return frequestDoctorName;
    }

    public void setFrequestDoctorName(String frequestDoctorName) {
        this.frequestDoctorName = frequestDoctorName;
    }

    public String getFmedicalRecord() {
        return fmedicalRecord;
    }

    public void setFmedicalRecord(String fmedicalRecord) {
        this.fmedicalRecord = fmedicalRecord;
    }

    public Date getFoutDate() {
        return foutDate;
    }

    public void setFoutDate(Date foutDate) {
        this.foutDate = foutDate;
    }

    public String getFreciveDoctorId() {
        return freciveDoctorId;
    }

    public void setFreciveDoctorId(String freciveDoctorId) {
        this.freciveDoctorId = freciveDoctorId;
    }

    public String getFreciveDoctorName() {
        return freciveDoctorName;
    }

    public void setFreciveDoctorName(String freciveDoctorName) {
        this.freciveDoctorName = freciveDoctorName;
    }

    public String getFresponseDoctorId() {
        return fresponseDoctorId;
    }

    public void setFresponseDoctorId(String fresponseDoctorId) {
        this.fresponseDoctorId = fresponseDoctorId;
    }

    public String getFresponseDoctorName() {
        return fresponseDoctorName;
    }

    public void setFresponseDoctorName(String fresponseDoctorName) {
        this.fresponseDoctorName = fresponseDoctorName;
    }

    public Date getFresponseDate() {
        return fresponseDate;
    }

    public void setFresponseDate(Date fresponseDate) {
        this.fresponseDate = fresponseDate;
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
