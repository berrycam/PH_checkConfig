package com.konsung.bean.supervision;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;

import org.greenrobot.greendao.annotation.Generated;

/**
 * 卫生计生监督协管信息报告登记表
 *
 * @author jiangbiwei
 */
@Entity
public class EhrSuperviseInfoDto extends BaseChildBean implements Cloneable {

    @Id(autoincrement = true)
    private Long localId;

    private String id;
    /**
     * 显示标题（卫生计生监督协管信息报告登记表）
     */
    private String title;

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
    private boolean upload;

    /**
     * 是否已经完成编辑
     */
    private boolean completed;
    /**
     * 1. [不可空] 卫生监督协管信息报告登记流水号
     */
    private String superviseInfoNumber;

    /**
     * 2. [可空] 发现时间
     */
    private Date discoverDate;

    /**
     * 3. [可空] 信息类别代码
     */
    private String infoClassesCode;

    /**
     * 4. [可空] 其它信息类别名称
     */
    private String infoClassesName;

    /**
     * 5. [可空] 信息内容
     */
    private String infoContent;

    /**
     * 6. [可空] 报告时间
     */
    private Date reportDate;

    /**
     * 7. [可空] 报告人编码
     */
    private String reportEmpCode;

    /**
     * 8. [可空] 报告人姓名
     */
    private String reportEmpName;

    /**
     * 9. [可空] 报告机构编码
     */
    private String reportOrgCode;

    /**
     * 10. [可空] 报告机构名称
     */
    private String reportOrgName;

    /**
     * 11. [不可空] 登记时间
     */
    private java.util.Date entryDate;

    /**
     * 12. [可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 13. [可空] 登记人员名称
     */
    private String entryEmpNam;

    /**
     * 14. [可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 15. [可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 16. [可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 17. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 19. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 20. [可空] 修改人
     */
    private String editor;

    /**
     * 21. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 22. [不可空] 修改标志,1新增,2修改,3撤销
     */
    private String updateFlag;

    @Transient
    private boolean select = false;

    private Date followupDate;

    /**
     * 信息类别字符串
     */
    private String infoClassesString;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 533722943)
    public EhrSuperviseInfoDto(Long localId, String id, String title, String idCard,
            String vipCard, boolean upload, boolean completed,
            String superviseInfoNumber, Date discoverDate, String infoClassesCode,
            String infoClassesName, String infoContent, Date reportDate,
            String reportEmpCode, String reportEmpName, String reportOrgCode,
            String reportOrgName, java.util.Date entryDate, String entryEmpCode,
            String entryEmpNam, String entryOrgCode, String entryOrgName,
            String orgCode, java.util.Date uploadDate, String fdataFrom,
            String editor, java.util.Date modifydate, String updateFlag,
            Date followupDate, String infoClassesString, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.id = id;
        this.title = title;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.superviseInfoNumber = superviseInfoNumber;
        this.discoverDate = discoverDate;
        this.infoClassesCode = infoClassesCode;
        this.infoClassesName = infoClassesName;
        this.infoContent = infoContent;
        this.reportDate = reportDate;
        this.reportEmpCode = reportEmpCode;
        this.reportEmpName = reportEmpName;
        this.reportOrgCode = reportOrgCode;
        this.reportOrgName = reportOrgName;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpNam = entryEmpNam;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.followupDate = followupDate;
        this.infoClassesString = infoClassesString;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1589150531)
    public EhrSuperviseInfoDto() {
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

    public boolean isCompleted() {
        return completed;
    }

    /**
     * 信息类别代码
     *
     * @return 信息类别代码
     */
    public String getInfoClassesCode() {
        return this.infoClassesCode;
    }

    /**
     * 信息类别代码
     *
     * @param infoClassesCode 信息类别代码
     */
    public void setInfoClassesCode(String infoClassesCode) {
        this.infoClassesCode = infoClassesCode;
    }

    /**
     * 其它信息类别名称
     *
     * @return 其它信息类别名称
     */
    public String getInfoClassesName() {
        return this.infoClassesName;
    }

    /**
     * 其它信息类别名称
     *
     * @param infoClassesName 其它信息类别名称
     */
    public void setInfoClassesName(String infoClassesName) {
        this.infoClassesName = infoClassesName;
    }

    /**
     * 信息内容
     *
     * @return 信息内容
     */
    public String getInfoContent() {
        return this.infoContent;
    }

    /**
     * 信息内容
     *
     * @param infoContent 信息内容
     */
    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    /**
     * 报告人编码
     *
     * @return 报告人编码
     */
    public String getReportEmpCode() {
        return this.reportEmpCode;
    }

    /**
     * 报告人编码
     *
     * @param reportEmpCode 报告人编码
     */
    public void setReportEmpCode(String reportEmpCode) {
        this.reportEmpCode = reportEmpCode;
    }

    /**
     * 报告人姓名
     *
     * @return 报告人姓名
     */
    public String getReportEmpName() {
        return this.reportEmpName;
    }

    /**
     * 报告人姓名
     *
     * @param reportEmpName 报告人姓名
     */
    public void setReportEmpName(String reportEmpName) {
        this.reportEmpName = reportEmpName;
    }

    /**
     * 报告机构编码
     *
     * @return 报告机构编码
     */
    public String getReportOrgCode() {
        return this.reportOrgCode;
    }

    /**
     * 报告机构编码
     *
     * @param reportOrgCode 报告机构编码
     */
    public void setReportOrgCode(String reportOrgCode) {
        this.reportOrgCode = reportOrgCode;
    }

    /**
     * 报告机构名称
     *
     * @return 报告机构名称
     */
    public String getReportOrgName() {
        return this.reportOrgName;
    }

    /**
     * 报告机构名称
     *
     * @param reportOrgName 报告机构名称
     */
    public void setReportOrgName(String reportOrgName) {
        this.reportOrgName = reportOrgName;
    }

    /**
     * 登记时间
     *
     * @return 登记时间
     */
    public java.util.Date getEntryDate() {
        return this.entryDate;
    }

    /**
     * 登记时间
     *
     * @param entryDate 登记时间
     */
    public void setEntryDate(java.util.Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * 登记人员编码
     *
     * @return 登记人员编码
     */
    public String getEntryEmpCode() {
        return this.entryEmpCode;
    }

    /**
     * 登记人员编码
     *
     * @param entryEmpCode 登记人员编码
     */
    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    /**
     * 登记人员名称
     *
     * @return 登记人员名称
     */
    public String getEntryEmpNam() {
        return this.entryEmpNam;
    }

    /**
     * 登记人员名称
     *
     * @param entryEmpNam 登记人员名称
     */
    public void setEntryEmpNam(String entryEmpNam) {
        this.entryEmpNam = entryEmpNam;
    }

    /**
     * 登记机构编码
     *
     * @return 登记机构编码
     */
    public String getEntryOrgCode() {
        return this.entryOrgCode;
    }

    /**
     * 登记机构编码
     *
     * @param entryOrgCode 登记机构编码
     */
    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    /**
     * 登记机构名称
     *
     * @return 登记机构名称
     */
    public String getEntryOrgName() {
        return this.entryOrgName;
    }

    /**
     * 登记机构名称
     *
     * @param entryOrgName 登记机构名称
     */
    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    /**
     * 医疗机构代码
     *
     * @return 医疗机构代码
     */
    public String getOrgCode() {
        return this.orgCode;
    }

    /**
     * 医疗机构代码
     *
     * @param orgCode 医疗机构代码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 填报日期
     *
     * @return 填报日期
     */
    public java.util.Date getUploadDate() {
        return this.uploadDate;
    }

    /**
     * 填报日期
     *
     * @param uploadDate 填报日期
     */
    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 数据来源
     *
     * @return 数据来源
     */
    public String getFdataFrom() {
        return this.fdataFrom;
    }

    /**
     * 数据来源
     *
     * @param fdataFrom 数据来源
     */
    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    /**
     * 修改人
     *
     * @return 修改人
     */
    public String getEditor() {
        return this.editor;
    }

    /**
     * 修改人
     *
     * @param editor 修改人
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 修改时间
     *
     * @return 修改时间
     */
    public java.util.Date getModifydate() {
        return this.modifydate;
    }

    /**
     * 修改时间
     *
     * @param modifydate 修改时间
     */
    public void setModifydate(java.util.Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 修改标志
     *
     * @return 修改标志
     */
    public String getUpdateFlag() {
        return this.updateFlag;
    }

    /**
     * 修改标志
     *
     * @param updateFlag 修改标志
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * 是否选中
     *
     * @return true or false
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * 是否选中
     *
     * @param select true or false
     */
    public void setSelect(boolean select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "EhrSuperviseInfoDto{" +
                "localId=" + localId +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", upload=" + upload +
                ", completed=" + completed +
                ", superviseInfoNumber='" + superviseInfoNumber + '\'' +
                ", discoverDate=" + discoverDate +
                ", infoClassesCode='" + infoClassesCode + '\'' +
                ", infoClassesName='" + infoClassesName + '\'' +
                ", infoContent='" + infoContent + '\'' +
                ", reportDate=" + reportDate +
                ", reportEmpCode='" + reportEmpCode + '\'' +
                ", reportEmpName='" + reportEmpName + '\'' +
                ", reportOrgCode='" + reportOrgCode + '\'' +
                ", reportOrgName='" + reportOrgName + '\'' +
                ", entryDate=" + entryDate +
                ", entryEmpCode='" + entryEmpCode + '\'' +
                ", entryEmpNam='" + entryEmpNam + '\'' +
                ", entryOrgCode='" + entryOrgCode + '\'' +
                ", entryOrgName='" + entryOrgName + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", uploadDate=" + uploadDate +
                ", fdataFrom='" + fdataFrom + '\'' +
                ", editor='" + editor + '\'' +
                ", modifydate=" + modifydate +
                ", updateFlag='" + updateFlag + '\'' +
                ", select=" + select +
                '}';
    }

    /**
     * 本地保存的id
     *
     * @return 本地保存的id
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * 本地保存的id
     *
     * @param localId 本地保存的id
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Date getFollowupDate() {
        return followupDate;
    }

    @Override
    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    @Override
    public Date getNextFollowupDate() {
        return null;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }

    @Override
    public boolean getUpload() {
        return upload;
    }

    @Override
    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    @Override
    public boolean getCompleted() {
        return completed;
    }

    @Override
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * 发现时间
     *
     * @return 发现时间
     */
    public Date getDiscoverDate() {
        return this.discoverDate;
    }

    /**
     * 发现时间
     *
     * @param discoverDate 发现时间
     */
    public void setDiscoverDate(Date discoverDate) {
        this.discoverDate = discoverDate;
    }

    /**
     * 报告时间
     *
     * @return 报告时间
     */
    public Date getReportDate() {
        return this.reportDate;
    }

    /**
     * 报告时间
     *
     * @param reportDate 报告时间
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * id
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 卫生监督协管信息报告登记流水号
     *
     * @return 卫生监督协管信息报告登记流水号
     */
    public String getSuperviseInfoNumber() {
        return this.superviseInfoNumber;
    }

    /**
     * 卫生监督协管信息报告登记流水号
     *
     * @param superviseInfoNumber 卫生监督协管信息报告登记流水号
     */
    public void setSuperviseInfoNumber(String superviseInfoNumber) {
        this.superviseInfoNumber = superviseInfoNumber;
    }

    /**
     * 信息类别字符串
     *
     * @return 信息类别字符串
     */
    public String getInfoClassesString() {
        return this.infoClassesString;
    }

    /**
     * 信息类别字符串
     *
     * @param infoClassesString 信息类别字符串
     */
    public void setInfoClassesString(String infoClassesString) {
        this.infoClassesString = infoClassesString;
    }

    @Override
    public EhrSuperviseInfoDto clone() {
        try {
            Object obj = super.clone();
            return (EhrSuperviseInfoDto) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new EhrSuperviseInfoDto();
        }
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
