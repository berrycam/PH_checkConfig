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
 * 抽象双向转诊(转出)类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
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
 * 10. [不可空] java.util.Date frequestTime 转入时间
 * 11. [不可空] String freferralOrgname 转入单位(机构)
 * 12. [不可空] String freferralDepartment 转入科室
 * 13. [可空] String freceptionDoctorId 接诊医生ID
 * 14. [可空] String freceptionDoctorName 接诊医生姓名
 * 15. [可空] String freferralId 转诊医生ID
 * 16. [可空] String freferralName 转诊医生姓名
 * 17. [可空] String fmedicalRecord 患者病案号
 * 18. [可空] String fdiagnosis 诊断结果
 * 19. [可空] String fmainCheckResult 主要检查结果
 * 20. [可空] String fsuggest 下一步治疗方案及康复建议
 * 21. [可空] String fbackDoctorId 回转医生ID
 * 22. [可空] String fbackDoctorName 回转医生姓名
 * 23. [可空] String fbackDoctorPhone 回转医生电话
 * 24. [可空] java.util.Date fbackDate 回转日期
 * 25. [不可空] java.util.Date fuploadDate 上传时间
 * 26. [不可空] String updateFlag 修改标志0正常1修改2撤销
 * 27. [可空] String editor 修改者
 * 28. [可空] java.util.Date modifydate 修改时间
 * </pre>
 * <p>
 * <p>
 * <p>
 * <p><a href="file:///D:/wtsoft/wtdevapp/deploy/../sw/output/imms-domain/java/domain/com/ks/imms/domain/model/domain/base/EhrDualReferralOut.html">EhrDualReferralOut代码模板</a>
 *
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrDualReferralInDto extends BaseChildBean {
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
     * 10. [不可空] 转入时间
     */
    private java.util.Date frequestTime;

    /**
     * 11. [不可空] 转入单位(机构)
     */
    private String freferralOrgname;

    /**
     * 12. [不可空] 转入科室
     */
    private String freferralDepartment;

    /**
     * 13. [可空] 接诊医生ID
     */
    private String freceptionDoctorId;

    /**
     * 14. [可空] 接诊医生姓名
     */
    private String freceptionDoctorName;

    /**
     * 15. [可空] 转诊医生ID
     */
    private String freferralId;

    /**
     * 16. [可空] 转诊医生姓名
     */
    private String freferralName;

    /**
     * 17. [可空] 患者病案号
     */
    private String fmedicalRecord;

    /**
     * 18. [可空] 诊断结果
     */
    private String fdiagnosis;

    /**
     * 19. [可空] 主要检查结果
     */
    private String fmainCheckResult;

    /**
     * 20. [可空] 下一步治疗方案及康复建议
     */
    private String fsuggest;

    /**
     * 21. [可空] 回转医生ID
     */
    private String fbackDoctorId;

    /**
     * 22. [可空] 回转医生姓名
     */
    private String fbackDoctorName;

    /**
     * 23. [可空] 回转医生电话
     */
    private String fbackDoctorPhone;

    /**
     * 24. [可空] 回转日期
     */
    private java.util.Date fbackDate;

    /**
     * 25. [不可空] 上传时间
     */
    private java.util.Date fuploadDate;

    /**
     * 26. [不可空] 修改标志0正常1修改2撤销
     */
    private String updateFlag;

    /**
     * 27. [可空] 修改者
     */
    private String editor;

    /**
     * 28. [可空] 修改时间
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

    @Generated(hash = 366046088)
    public EhrDualReferralInDto(Long localId, String idCard, String vipCard, boolean upload, boolean completed, String title, String fid, String id, String fidNumber, String fname, String fsex,
            java.util.Date fbirthDate, Integer fage, String fmobilePhone, String fhealthfileNo, String faddress, java.util.Date frequestTime, String freferralOrgname, String freferralDepartment,
            String freceptionDoctorId, String freceptionDoctorName, String freferralId, String freferralName, String fmedicalRecord, String fdiagnosis, String fmainCheckResult, String fsuggest,
            String fbackDoctorId, String fbackDoctorName, String fbackDoctorPhone, java.util.Date fbackDate, java.util.Date fuploadDate, String updateFlag, String editor,
            java.util.Date modifydate, String editorId, String updateOrgId, String updateOrgName) {
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
        this.frequestTime = frequestTime;
        this.freferralOrgname = freferralOrgname;
        this.freferralDepartment = freferralDepartment;
        this.freceptionDoctorId = freceptionDoctorId;
        this.freceptionDoctorName = freceptionDoctorName;
        this.freferralId = freferralId;
        this.freferralName = freferralName;
        this.fmedicalRecord = fmedicalRecord;
        this.fdiagnosis = fdiagnosis;
        this.fmainCheckResult = fmainCheckResult;
        this.fsuggest = fsuggest;
        this.fbackDoctorId = fbackDoctorId;
        this.fbackDoctorName = fbackDoctorName;
        this.fbackDoctorPhone = fbackDoctorPhone;
        this.fbackDate = fbackDate;
        this.fuploadDate = fuploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1178033252)
    public EhrDualReferralInDto() {
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

    public Date getFrequestTime() {
        return frequestTime;
    }

    public void setFrequestTime(Date frequestTime) {
        this.frequestTime = frequestTime;
    }

    public String getFreferralOrgname() {
        return freferralOrgname;
    }

    public void setFreferralOrgname(String freferralOrgname) {
        this.freferralOrgname = freferralOrgname;
    }

    public String getFreferralDepartment() {
        return freferralDepartment;
    }

    public void setFreferralDepartment(String freferralDepartment) {
        this.freferralDepartment = freferralDepartment;
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

    public String getFreferralId() {
        return freferralId;
    }

    public void setFreferralId(String freferralId) {
        this.freferralId = freferralId;
    }

    public String getFreferralName() {
        return freferralName;
    }

    public void setFreferralName(String freferralName) {
        this.freferralName = freferralName;
    }

    public String getFmedicalRecord() {
        return fmedicalRecord;
    }

    public void setFmedicalRecord(String fmedicalRecord) {
        this.fmedicalRecord = fmedicalRecord;
    }

    public String getFdiagnosis() {
        return fdiagnosis;
    }

    public void setFdiagnosis(String fdiagnosis) {
        this.fdiagnosis = fdiagnosis;
    }

    public String getFmainCheckResult() {
        return fmainCheckResult;
    }

    public void setFmainCheckResult(String fmainCheckResult) {
        this.fmainCheckResult = fmainCheckResult;
    }

    public String getFsuggest() {
        return fsuggest;
    }

    public void setFsuggest(String fsuggest) {
        this.fsuggest = fsuggest;
    }

    public String getFbackDoctorId() {
        return fbackDoctorId;
    }

    public void setFbackDoctorId(String fbackDoctorId) {
        this.fbackDoctorId = fbackDoctorId;
    }

    public String getFbackDoctorName() {
        return fbackDoctorName;
    }

    public void setFbackDoctorName(String fbackDoctorName) {
        this.fbackDoctorName = fbackDoctorName;
    }

    public String getFbackDoctorPhone() {
        return fbackDoctorPhone;
    }

    public void setFbackDoctorPhone(String fbackDoctorPhone) {
        this.fbackDoctorPhone = fbackDoctorPhone;
    }

    public Date getFbackDate() {
        return fbackDate;
    }

    public void setFbackDate(Date fbackDate) {
        this.fbackDate = fbackDate;
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
