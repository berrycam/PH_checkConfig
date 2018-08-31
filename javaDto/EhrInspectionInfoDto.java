package com.konsung.bean.supervision;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;

import org.greenrobot.greendao.annotation.Generated;

/**
 * 卫生计生监督协管巡查登记表
 *
 * @author jiangbiwei
 */
@Entity
public class EhrInspectionInfoDto extends BaseChildBean implements Cloneable {

    @Id(autoincrement = true)
    private Long localId;

    private String id;
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
     * 显示标题（卫生计生监督协管巡查登记表）
     */
    private String title;
    /**
     * 是否已经上传
     */
    private boolean upload;

    /**
     * 是否已经完成编辑
     */
    private boolean completed;

    /**
     * 1. [不可空] 卫生监督协管巡查登记流水号
     */
    private String superviseInspectionNumber;

    /**
     * 2. [可空] 年度
     */
    private java.util.Date superviseInspectionYear;

    /**
     * 3. [可空] 巡查地点
     */
    private String superviseInspectionAdd;

    /**
     * 4. [可空] 巡查内容
     */
    private String superviseInspectionCont;

    /**
     * 5. [可空] 发现的主要问题
     */
    private String discoverProblem;

    /**
     * 6. [可空] 巡查日期
     */
    private Date superviseInspectionDate;

    /**
     * 7. [可空] 巡查人编码
     */
    private String superviseInspectionEmpCode;

    /**
     * 8. [可空] 巡查人姓名
     */
    private String superviseInspectionEmpName;

    /**
     * 9. [可空] 报告机构编码
     */
    private String reportOrgCode;

    /**
     * 10. [可空] 报告机构名称
     */
    private String reportOrgName;

    /**
     * 11. [可空] 备注
     */
    private String remark;

    /**
     * 12. [可空] 登记时间
     */
    private java.util.Date entryDate;

    /**
     * 13. [可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 14. [可空] 登记人员名称
     */
    private String entryEmpName;

    /**
     * 15. [可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 16. [可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 17. [可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 18. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 20. [不可空] 数据来源
     */
    private String fdataFrom;

    /**
     * 21. [可空] 修改人
     */
    private String editor;

    /**
     * 22. [可空] 修改时间
     */
    private java.util.Date modifydate;

    /**
     * 23. [不可空] 修改标志,1新增,2修改,3撤销
     */
    private String updateFlag;

    @Transient
    private boolean select = false;

    private Date followupDate;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    @Generated(hash = 713121317)
    public EhrInspectionInfoDto(Long localId, String id, String idCard, String vipCard,
            String title, boolean upload, boolean completed, String superviseInspectionNumber,
            java.util.Date superviseInspectionYear, String superviseInspectionAdd,
            String superviseInspectionCont, String discoverProblem,
            Date superviseInspectionDate, String superviseInspectionEmpCode,
            String superviseInspectionEmpName, String reportOrgCode, String reportOrgName,
            String remark, java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, String fdataFrom, String editor,
            java.util.Date modifydate, String updateFlag, Date followupDate, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.id = id;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.title = title;
        this.upload = upload;
        this.completed = completed;
        this.superviseInspectionNumber = superviseInspectionNumber;
        this.superviseInspectionYear = superviseInspectionYear;
        this.superviseInspectionAdd = superviseInspectionAdd;
        this.superviseInspectionCont = superviseInspectionCont;
        this.discoverProblem = discoverProblem;
        this.superviseInspectionDate = superviseInspectionDate;
        this.superviseInspectionEmpCode = superviseInspectionEmpCode;
        this.superviseInspectionEmpName = superviseInspectionEmpName;
        this.reportOrgCode = reportOrgCode;
        this.reportOrgName = reportOrgName;
        this.remark = remark;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.followupDate = followupDate;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1797574827)
    public EhrInspectionInfoDto() {
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
     * 卫生监督协管巡查登记流水号
     *
     * @return 卫生监督协管巡查登记流水号
     */
    public String getSuperviseInspectionNumber() {
        return this.superviseInspectionNumber;
    }

    /**
     * 卫生监督协管巡查登记流水号
     *
     * @param superviseInspectionNumber 卫生监督协管巡查登记流水号
     */
    public void setSuperviseInspectionNumber(String superviseInspectionNumber) {
        this.superviseInspectionNumber = superviseInspectionNumber;
    }

    /**
     * 年度
     *
     * @return 年度
     */
    public java.util.Date getSuperviseInspectionYear() {
        return this.superviseInspectionYear;
    }

    /**
     * 年度
     *
     * @param superviseInspectionYear 年度
     */
    public void setSuperviseInspectionYear(java.util.Date superviseInspectionYear) {
        this.superviseInspectionYear = superviseInspectionYear;
    }

    /**
     * 巡查地点
     *
     * @return 巡查地点
     */
    public String getSuperviseInspectionAdd() {
        return this.superviseInspectionAdd;
    }

    /**
     * 巡查地点
     *
     * @param superviseInspectionAdd 巡查地点
     */
    public void setSuperviseInspectionAdd(String superviseInspectionAdd) {
        this.superviseInspectionAdd = superviseInspectionAdd;
    }

    /**
     * 巡查内容
     *
     * @return 巡查内容
     */
    public String getSuperviseInspectionCont() {
        return this.superviseInspectionCont;
    }

    /**
     * 巡查内容
     *
     * @param superviseInspectionCont 巡查内容
     */
    public void setSuperviseInspectionCont(String superviseInspectionCont) {
        this.superviseInspectionCont = superviseInspectionCont;
    }

    /**
     * 发现的主要问题
     *
     * @return 发现的主要问题
     */
    public String getDiscoverProblem() {
        return this.discoverProblem;
    }

    /**
     * 发现的主要问题
     *
     * @param discoverProblem 发现的主要问题
     */
    public void setDiscoverProblem(String discoverProblem) {
        this.discoverProblem = discoverProblem;
    }

    /**
     * 巡查人编码
     *
     * @return 巡查人编码
     */
    public String getSuperviseInspectionEmpCode() {
        return this.superviseInspectionEmpCode;
    }

    /**
     * 巡查人编码
     *
     * @param superviseInspectionEmpCode 巡查人编码
     */
    public void setSuperviseInspectionEmpCode(String superviseInspectionEmpCode) {
        this.superviseInspectionEmpCode = superviseInspectionEmpCode;
    }

    /**
     * 巡查人姓名
     *
     * @return 巡查人姓名
     */
    public String getSuperviseInspectionEmpName() {
        return this.superviseInspectionEmpName;
    }

    /**
     * 巡查人姓名
     *
     * @param superviseInspectionEmpName 巡查人姓名
     */
    public void setSuperviseInspectionEmpName(String superviseInspectionEmpName) {
        this.superviseInspectionEmpName = superviseInspectionEmpName;
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
     * 备注
     *
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
    public String getEntryEmpName() {
        return this.entryEmpName;
    }

    /**
     * 登记人员名称
     *
     * @param entryEmpName 登记人员名称
     */
    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
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
     * @return true 是 ，false 否
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * 是否选中
     *
     * @param select true 是 ，false 否
     */
    public void setSelect(boolean select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "EhrInspectionInfoDto{" +
                "localId=" + localId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", upload=" + upload +
                ", completed=" + completed +
                ", superviseInspectionNumber='" + superviseInspectionNumber + '\'' +
                ", superviseInspectionYear=" + superviseInspectionYear +
                ", superviseInspectionAdd='" + superviseInspectionAdd + '\'' +
                ", superviseInspectionCont='" + superviseInspectionCont + '\'' +
                ", discoverProblem='" + discoverProblem + '\'' +
                ", superviseInspectionDate=" + superviseInspectionDate +
                ", superviseInspectionEmpCode='" + superviseInspectionEmpCode + '\'' +
                ", superviseInspectionEmpName='" + superviseInspectionEmpName + '\'' +
                ", reportOrgCode='" + reportOrgCode + '\'' +
                ", reportOrgName='" + reportOrgName + '\'' +
                ", remark='" + remark + '\'' +
                ", entryDate=" + entryDate +
                ", entryEmpCode='" + entryEmpCode + '\'' +
                ", entryEmpName='" + entryEmpName + '\'' +
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
     * 本地存储id
     *
     * @return 本地存储id
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * 本地存储id
     *
     * @param localId 本地存储id
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    /**
     * 巡查日期
     *
     * @return 巡查日期
     */
    public Date getSuperviseInspectionDate() {
        return this.superviseInspectionDate;
    }

    /**
     * 巡查日期
     *
     * @param superviseInspectionDate 巡查日期
     */
    public void setSuperviseInspectionDate(Date superviseInspectionDate) {
        this.superviseInspectionDate = superviseInspectionDate;
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

    @Override
    public EhrInspectionInfoDto clone() {
        try {
            Object obj = super.clone();
            return (EhrInspectionInfoDto) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new EhrInspectionInfoDto();
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
