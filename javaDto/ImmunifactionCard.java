package com.konsung.bean;

import com.google.gson.annotations.Expose;
import com.greendao.dao.AbstractEhrPersonalFileDao;
import com.greendao.dao.DaoSession;
import com.greendao.dao.ImmunifactionCardDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;

/**
 * 预防接种卡DTO
 * @author kuangguohua
 */
@Entity
public class ImmunifactionCard extends BaseChildBean {
    /**
     * 本地数据库id
     */
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
     * 1. [不可空] 接种卡ID
     */
    protected String immCardId;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 4. [可空] 姓名
     */
//    protected String immPersonName;

    /**
     * 5. [可空] 性别
     */
//    protected String immPersonGender;

    /**
     * 6. [可空] 出生日期
     */
//    protected java.util.Date immPersonBirthDate;

    /**
     * 7. [可空] 监护人姓名
     */
    protected String immDuardianName;

    /**
     * 8. [可空] 与儿童关系
     */
    protected String immRelationship;

    /**
     * 9. [可空] 联系电话
     */
//    protected String immTelephone;

    /**
     * 10. [可空] (现住址)地址-行政区划代码
     */
//    protected String divisionsCodeOfResidence;

    /**
     * 11. [可空] (现住址)地址-省(自治区、直辖市)
     */
//    protected String provinceOfResidence;

    /**
     * 12. [可空] (现住址)地址-市(地区)
     */
//    protected String cityOfResidence;

    /**
     * 13. [可空] (现住址)地址-县(区)
     */
//    protected String countyOfResidence;

    /**
     * 14. [可空] (现住址)地址-乡(镇、街道办事处)
     */
//    protected String townOfResidence;

    /**
     * 15. [可空] (现住址)地址-村(街、路、弄等)
     */
//    protected String villageOfResidence;

    /**
     * 16. [可空] (现住址)地址-门牌号码
     */
//    protected String houseNumberOfResidence;

    /**
     * 17. [可空] 是否户籍代码
     */
//    protected String residenceType;

    /**
     * 18. [可空] (户籍地)地址-行政区划代码
     */
//    protected String divisionsCodeRegResidence;

    /**
     * 19. [可空] (户籍地)地址-省(自治区、直辖市)
     */
//    protected String provinceOfRegResidence;

    /**
     * 20. [可空] (户籍地)地址-市(地区)
     */
//    protected String cityOfRegResidence;

    /**
     * 21. [可空] (户籍地)地址-县(区)
     */
//    protected String countyOfRegResidence;

    /**
     * 22. [可空] (户籍地)地址-乡(镇、街道办事处)
     */
//    protected String townOfRegResidence;

    /**
     * 23. [可空] (户籍地)地址-村(街、路、弄等)
     */
//    protected String villageOfRegResidence;

    /**
     * 24. [可空] (户籍地)地址-门牌号码
     */
//    protected String houseNumberOfRegResidence;

    /**
     * 25. [可空] 迁入时间
     */
    protected java.util.Date immCheckinDate;

    /**
     * 26. [可空] 迁出时间
     */
    protected java.util.Date immCheckoutDate;

    /**
     * 27. [可空] 迁出原因
     */
    protected String immCheckoutReason;

    /**
     * 28. [可空] 疫苗异常反应史
     */
    protected String immExResponse;

    /**
     * 29. [可空] 接种禁忌
     */
    protected String immForbidden;

    /**
     * 30. [可空] 传染病史
     */
    protected String immInfectHistory;

    /**
     * 31. [可空] 建卡日期
     */
    protected java.util.Date createDate;

    /**
     * 32. [可空] 建卡人员编码
     */
    protected String createEmpCode;

    /**
     * 33. [可空] 建卡人员姓名
     */
    protected String createEmpName;

    /**
     * 34. [可空] 登记时间
     */
    protected java.util.Date entryDate;

    /**
     * 35. [可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 36. [可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 37. [可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 38. [可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 39. [可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 40. [不可空] 填报日期
     */
    protected java.util.Date uploadDate;

    /**
     * 42. [不可空] 数据来源
     */
    protected String fdataFrom;

    /**
     * 43. [可空] 修改者
     */
    protected String editor;

    /**
     * 44. [可空] 修改时间
     */
    protected java.util.Date modifydate;

    /**
     * 45. [不可空] 修改标志,1新增,2修改,3撤销
     */
    protected String updateFlag;

    /**
     * 46. [可空] 健康档案信息
     */
    @ToOne
    protected AbstractEhrPersonalFile fileDto;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /**
     * Used for active entity operations.
     */
    @Generated(hash = 711355913)
    private transient ImmunifactionCardDao myDao;

    public boolean isUpload() {
        return upload;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Generated(hash = 1901111143)
    private transient boolean fileDto__refreshed;

    @Generated(hash = 1005580262)
    public ImmunifactionCard(Long localId, String idCard, String vipCard, boolean upload,
            boolean completed, String title, String id, String immCardId, String healthfileNo,
            String fileNumber, String immDuardianName, String immRelationship,
            java.util.Date immCheckinDate, java.util.Date immCheckoutDate, String immCheckoutReason,
            String immExResponse, String immForbidden, String immInfectHistory,
            java.util.Date createDate, String createEmpCode, String createEmpName,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName, String entryOrgCode,
            String entryOrgName, String orgCode, java.util.Date uploadDate, String fdataFrom,
            String editor, java.util.Date modifydate, String updateFlag, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.immCardId = immCardId;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.immDuardianName = immDuardianName;
        this.immRelationship = immRelationship;
        this.immCheckinDate = immCheckinDate;
        this.immCheckoutDate = immCheckoutDate;
        this.immCheckoutReason = immCheckoutReason;
        this.immExResponse = immExResponse;
        this.immForbidden = immForbidden;
        this.immInfectHistory = immInfectHistory;
        this.createDate = createDate;
        this.createEmpCode = createEmpCode;
        this.createEmpName = createEmpName;
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
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1062892158)
    public ImmunifactionCard() {
    }

    public Long getLocalId() {
        return this.localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVipCard() {
        return this.vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public String getImmCardId() {
        return this.immCardId;
    }

    public void setImmCardId(String immCardId) {
        this.immCardId = immCardId;
    }

    public String getHealthfileNo() {
        return this.healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getFileNumber() {
        return this.fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

   /* public String getImmPersonName() {
        return this.immPersonName;
    }

    public void setImmPersonName(String immPersonName) {
        this.immPersonName = immPersonName;
    }

    public String getImmPersonGender() {
        return this.immPersonGender;
    }

    public void setImmPersonGender(String immPersonGender) {
        this.immPersonGender = immPersonGender;
    }

    public java.util.Date getImmPersonBirthDate() {
        return this.immPersonBirthDate;
    }

    public void setImmPersonBirthDate(java.util.Date immPersonBirthDate) {
        this.immPersonBirthDate = immPersonBirthDate;
    }*/

    public String getImmDuardianName() {
        return this.immDuardianName;
    }

    public void setImmDuardianName(String immDuardianName) {
        this.immDuardianName = immDuardianName;
    }

    public String getImmRelationship() {
        return this.immRelationship;
    }

    public void setImmRelationship(String immRelationship) {
        this.immRelationship = immRelationship;
    }

  /*  public String getImmTelephone() {
        return this.immTelephone;
    }

    public void setImmTelephone(String immTelephone) {
        this.immTelephone = immTelephone;
    }

    public String getDivisionsCodeOfResidence() {
        return this.divisionsCodeOfResidence;
    }

    public void setDivisionsCodeOfResidence(String divisionsCodeOfResidence) {
        this.divisionsCodeOfResidence = divisionsCodeOfResidence;
    }

    public String getProvinceOfResidence() {
        return this.provinceOfResidence;
    }

    public void setProvinceOfResidence(String provinceOfResidence) {
        this.provinceOfResidence = provinceOfResidence;
    }

    public String getCityOfResidence() {
        return this.cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    public String getCountyOfResidence() {
        return this.countyOfResidence;
    }

    public void setCountyOfResidence(String countyOfResidence) {
        this.countyOfResidence = countyOfResidence;
    }

    public String getTownOfResidence() {
        return this.townOfResidence;
    }

    public void setTownOfResidence(String townOfResidence) {
        this.townOfResidence = townOfResidence;
    }

    public String getVillageOfResidence() {
        return this.villageOfResidence;
    }

    public void setVillageOfResidence(String villageOfResidence) {
        this.villageOfResidence = villageOfResidence;
    }

    public String getHouseNumberOfResidence() {
        return this.houseNumberOfResidence;
    }

    public void setHouseNumberOfResidence(String houseNumberOfResidence) {
        this.houseNumberOfResidence = houseNumberOfResidence;
    }

    public String getResidenceType() {
        return this.residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    public String getDivisionsCodeRegResidence() {
        return this.divisionsCodeRegResidence;
    }

    public void setDivisionsCodeRegResidence(String divisionsCodeRegResidence) {
        this.divisionsCodeRegResidence = divisionsCodeRegResidence;
    }

    public String getProvinceOfRegResidence() {
        return this.provinceOfRegResidence;
    }

    public void setProvinceOfRegResidence(String provinceOfRegResidence) {
        this.provinceOfRegResidence = provinceOfRegResidence;
    }

    public String getCityOfRegResidence() {
        return this.cityOfRegResidence;
    }

    public void setCityOfRegResidence(String cityOfRegResidence) {
        this.cityOfRegResidence = cityOfRegResidence;
    }

    public String getCountyOfRegResidence() {
        return this.countyOfRegResidence;
    }

    public void setCountyOfRegResidence(String countyOfRegResidence) {
        this.countyOfRegResidence = countyOfRegResidence;
    }

    public String getTownOfRegResidence() {
        return this.townOfRegResidence;
    }

    public void setTownOfRegResidence(String townOfRegResidence) {
        this.townOfRegResidence = townOfRegResidence;
    }

    public String getVillageOfRegResidence() {
        return this.villageOfRegResidence;
    }

    public void setVillageOfRegResidence(String villageOfRegResidence) {
        this.villageOfRegResidence = villageOfRegResidence;
    }

    public String getHouseNumberOfRegResidence() {
        return this.houseNumberOfRegResidence;
    }

    public void setHouseNumberOfRegResidence(String houseNumberOfRegResidence) {
        this.houseNumberOfRegResidence = houseNumberOfRegResidence;
    }*/

    public java.util.Date getImmCheckinDate() {
        return this.immCheckinDate;
    }

    public void setImmCheckinDate(java.util.Date immCheckinDate) {
        this.immCheckinDate = immCheckinDate;
    }

    public java.util.Date getImmCheckoutDate() {
        return this.immCheckoutDate;
    }

    public void setImmCheckoutDate(java.util.Date immCheckoutDate) {
        this.immCheckoutDate = immCheckoutDate;
    }

    public String getImmCheckoutReason() {
        return this.immCheckoutReason;
    }

    public void setImmCheckoutReason(String immCheckoutReason) {
        this.immCheckoutReason = immCheckoutReason;
    }

    public String getImmExResponse() {
        return this.immExResponse;
    }

    public void setImmExResponse(String immExResponse) {
        this.immExResponse = immExResponse;
    }

    public String getImmForbidden() {
        return this.immForbidden;
    }

    public void setImmForbidden(String immForbidden) {
        this.immForbidden = immForbidden;
    }

    public String getImmInfectHistory() {
        return this.immInfectHistory;
    }

    public void setImmInfectHistory(String immInfectHistory) {
        this.immInfectHistory = immInfectHistory;
    }

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateEmpCode() {
        return this.createEmpCode;
    }

    public void setCreateEmpCode(String createEmpCode) {
        this.createEmpCode = createEmpCode;
    }

    public String getCreateEmpName() {
        return this.createEmpName;
    }

    public void setCreateEmpName(String createEmpName) {
        this.createEmpName = createEmpName;
    }

    public java.util.Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(java.util.Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryEmpCode() {
        return this.entryEmpCode;
    }

    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    public String getEntryEmpName() {
        return this.entryEmpName;
    }

    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    public String getEntryOrgCode() {
        return this.entryOrgCode;
    }

    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    public String getEntryOrgName() {
        return this.entryOrgName;
    }

    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public java.util.Date getUploadDate() {
        return this.uploadDate;
    }

    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public java.util.Date getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(java.util.Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getUpdateFlag() {
        return this.updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public Date getFollowupDate() {
        return null;
    }

    @Override
    public void setFollowupDate(Date followupDate) {

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
        return this.upload;
    }

    @Override
    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    @Override
    public boolean getCompleted() {
        return completed;
    }

    /**
     * 设置completed的值
     * @param completed completed值
     */
    @Override
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * To-one relationship, resolved on first access.
     */
    @Generated(hash = 956720718)
    public AbstractEhrPersonalFile getFileDto() {
        if (fileDto != null || !fileDto__refreshed) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AbstractEhrPersonalFileDao targetDao = daoSession.getAbstractEhrPersonalFileDao();
            targetDao.refresh(fileDto);
            fileDto__refreshed = true;
        }
        return fileDto;
    }

    /**
     * To-one relationship, returned entity is not refreshed and may carry only the PK property.
     */
    @Generated(hash = 707102705)
    public AbstractEhrPersonalFile peakFileDto() {
        return fileDto;
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 227342437)
    public void setFileDto(AbstractEhrPersonalFile fileDto) {
        synchronized (this) {
            this.fileDto = fileDto;
            fileDto__refreshed = true;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 45489660)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getImmunifactionCardDao() : null;
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
