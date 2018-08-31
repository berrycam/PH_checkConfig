package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import java.util.List;

/**
 * 抽象建档信息类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）
 * 都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String healthfileNo 个人健康档案编码
 * 2. [可空] String fileNumber 基本信息档案号
 * 3. [可空] String divisionsCodeOfResidence 现住址-行政区划代码
 * 4. [可空] String provinceOfResidence 现住址-省(自治区、直辖市)
 * 5. [可空] String cityOfResidence 现住址-市(地区)
 * 6. [可空] String countyOfResidence 现住址-县(区)
 * 7. [可空] String townOfResidence 现住址-乡(镇、街道办事处)
 * 8. [可空] String villageOfResidence 现住址-村(街、路、弄等)
 * 9. [可空] String houseNumberOfResidence 现住址-门牌号码
 * 10. [可空] String divisionsCodeRegResidence 户籍地-行政区划代码
 * 11. [可空] String provinceOfRegResidence 户籍地-省(自治区、直辖市)
 * 12. [可空] String cityOfRegResidence 户籍地-市(地区)
 * 13. [可空] String countyOfRegResidence 户籍地-县(区)
 * 14. [可空] String townOfRegResidence 户籍地-乡(镇、街道办事处)
 * 15. [可空] String villageOfRegResidence 户籍地-村(街、路、弄等)
 * 16. [可空] String houseNumberOfRegResidence 户籍地-门牌号码
 * 17. [可空] String contactPhone 联系电话
 * 18. [可空] String townOfMgrHealthfile 档案管理乡镇（街道）名称
 * 19. [可空] String villageOfMgrHealthfile 档案管理村（居）委会名称
 * 20. [不可空] String healthfileCreatorOrgCode 建档机构代码
 * 21. [不可空] String healthfileCreatorOrgName 建档机构名称
 * 22. [可空] String healthfileCreatorEmpCode 建档人代码
 * 23. [可空] String healthfileCreatorEmpName 建档人名称
 * 24. [可空] String healthfileDoctorName 责任医生名称
 * 25. [不可空] java.util.Date healthfileCreateDate 建档日期
 * 26. [不可空] String name 姓名
 * 27. [可空] String gender 性别
 * 28. [不可空] java.util.Date birthDate 出生日期
 * 29. [不可空] String idNumber 身份证号码
 * 30. [可空] String nameOfEmployer 工作单位
 * 31. [可空] String telephoneNumber 本人电话
 * 32. [可空] String contactPersonsName 联系人姓名
 * 33. [可空] String contactPersonsPhone 联系人电话
 * 34. [可空] String residenceType 常住类型
 * 35. [可空] String nationCode 民族代码
 * 36. [可空] String nationName 民族名称
 * 37. [可空] String blod ABO血型
 * 38. [可空] String rh RH阴性
 * 39. [可空] String education 文化程度
 * 40. [可空] String occupation 职业
 * 41. [可空] String maritalStatus 婚姻状况
 * 42. [可空] String paymentMethodCode 医疗费用支付方式代码
 * 43. [可空] String paymentMethodName 医疗费用支付方式名称
 * 44. [可空] String allergicHistoryCode 药物过敏史代码
 * 45. [可空] String allergicHistoryName 药物过敏史名称
 * 46. [可空] String exposureHistoryName 暴露史
 * 55. [可空] String geneticHistoryCode 遗传病史代码
 * 56. [可空] String geneticHistoryName 其他遗传病史名称
 * 57. [可空] String disabilityCode 残疾情况代码
 * 58. [可空] String disabilityName 其它残疾情况名称
 * 59. [可空] String kitchenExhaustFacilityType 生活环境_厨房排风设施
 * 60. [可空] String fuelType 生活环境_燃料类型
 * 61. [可空] String drinkingWaterType 生活环境_饮水
 * 62. [可空] String toiletType 生活环境_厕所
 * 63. [可空] String birdType 生活环境_禽畜栏
 * 64. [可空] java.util.Date healthfileEntryDate 登记时间
 * 65. [可空] String healthfileEntryEmpCode 登记人员代码
 * 66. [可空] String healthfileEntryEmpName 登记人员名称
 * 67. [可空] String healthfileEntryOrgCode 登记机构编码
 * 68. [可空] String healthfileEntryOrgName 登记机构名称
 * 69. [不可空] String orgCode 医疗机构代码
 * 70. [不可空] java.util.Date uploadDate 填报日期
 * 71. [主键] String id 主键
 * 72. [不可空] String status 档案状态：1、活动,2、死亡,3、临时档案
 * 73. [可空] String healthfileDoctorCode 责任医生代码
 * 74. [可空] String exposureHistoryCode 暴露史代码
 * 75. [不可空] String fdataFrom 数据来源
 * 76. [可空] String editor 修改人
 * 77. [可空] java.util.Date modifydate 修改时间
 * 78. [不可空] String updateFlag 修改标志,1新增,2修改,3撤销
 * 79. [可空] String relationship 与户主关系
 * 80. [可空] String medicareid 社保/农合卡号
 * 81. [可空] String idcardia 身份证签发机关
 * 82. [可空] java.util.Date idcarddatestart 身份证有效期起始日期
 * 83. [可空] java.util.Date idcarddateend 身份证有效期截止日期
 * 84. [可空] String remark 备注
 */
@Entity
public class AbstractEhrPersonalFile extends BaseChildBean {

    /*
     * 本程序不允许修改！！！
     *
     * 2017-05-08 Created by Benewit Code Generator V1.0
     * codegen/templates//java/java-entabsdomain.template
     */

    private static final long serialVersionUID = 1L;

    /**
     * 本地Id,不会上传到服务器
     * 也不会解析
     */
    @Id(autoincrement = true)
    @Expose
    private Long localId;
    /**
     * 后台需要用的id
     */
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
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;

    /**
     * 标题
     */
    private String title;

    public String healthfileNo;
    /**
     * 2. [可空] 基本信息档案号
     */
    public String fileNumber;

    /**
     * 3. [可空] 现住址-行政区划代码
     */
    public String divisionsCodeOfResidence;

    /**
     * 4. [可空] 现住址-省(自治区、直辖市)
     */
    public String provinceOfResidence;

    /**
     * 5. [可空] 现住址-市(地区)
     */
    public String cityOfResidence;

    /**
     * 6. [可空] 现住址-县(区)
     */
    public String countyOfResidence;

    /**
     * 7. [可空] 现住址-乡(镇、街道办事处)
     */
    public String townOfResidence;

    /**
     * 8. [可空] 现住址-村(街、路、弄等)
     */
    public String villageOfResidence;

    /**
     * 9. [可空] 现住址-门牌号码[健康档案现住址可用]
     */
    public String houseNumberOfResidence;

    /**
     * 10. [可空] 户籍地-行政区划代码
     */
    public String divisionsCodeRegResidence;

    /**
     * 11. [可空] 户籍地-省(自治区、直辖市)
     */
    public String provinceOfRegResidence;

    /**
     * 12. [可空] 户籍地-市(地区)
     */
    public String cityOfRegResidence;

    /**
     * 13. [可空] 户籍地-县(区)
     */
    public String countyOfRegResidence;

    /**
     * 14. [可空] 户籍地-乡(镇、街道办事处)
     */
    public String townOfRegResidence;

    /**
     * 15. [可空] 户籍地-村(街、路、弄等)
     */
    public String villageOfRegResidence;

    /**
     * 16. [可空] 户籍地址-门牌号码
     */
    public String houseNumberOfRegResidence;


    /**
     * 17. [可空] 联系电话
     */
    public String contactPhone;

    /**
     * 18. [可空] 档案管理乡镇（街道）名称
     */
    public String townOfMgrHealthfile;

    /**
     * 19. [可空] 档案管理村（居）委会名称
     */
    public String villageOfMgrHealthfile;

    /**
     * 20. [不可空] 建档机构代码
     */
    public String healthfileCreatorOrgCode;

    /**
     * 21. [不可空] 建档机构名称
     */
    public String healthfileCreatorOrgName;

    /**
     * 22. [可空] 建档人代码
     */
    public String healthfileCreatorEmpCode;

    /**
     * 23. [可空] 建档人名称
     */
    public String healthfileCreatorEmpName;

    /**
     * 24. [可空] 责任医生名称
     */
    public String healthfileDoctorName;

    /**
     * 25. [不可空] 建档日期
     */
    public java.util.Date healthfileCreateDate;

    /**
     * 26. [不可空] 姓名
     */
    public String name;

    /**
     * 27. [可空] 性别
     */
    public String gender;

    /**
     * 28. [不可空] 出生日期
     */
    public java.util.Date birthDate;

    /**
     * 29. [不可空] 身份证号码
     */
    public String idNumber;

    /**
     * 30. [可空] 工作单位
     */
    public String nameOfEmployer;

    /**
     * 31. [可空] 本人电话
     */
    public String telephoneNumber;

    /**
     * 32. [可空] 联系人姓名
     */
    public String contactPersonsName;

    /**
     * 33. [可空] 联系人电话
     */
    public String contactPersonsPhone;

    /**
     * 34. [可空] 常住类型
     */
    public String residenceType;

    /**
     * 35. [可空] 民族代码
     */
    public String nationCode;

    /**
     * 36. [可空] 民族名称
     */
    public String nationName;

    /**
     * 37. [可空] ABO血型
     */
    public String blod;

    /**
     * 38. [可空] RH阴性
     */
    public String rh;

    /**
     * 39. [可空] 文化程度
     */
    public String education;

    /**
     * 40. [可空] 职业
     */
    public String occupation;

    /**
     * 41. [可空] 婚姻状况
     */
    public String maritalStatus;

    /**
     * 42. [可空] 医疗费用支付方式代码
     */
    public String paymentMethodCode;

    /**
     * 43. [可空] 医疗费用支付方式名称
     */
    public String paymentMethodName;

    /**
     * 44. [可空] 药物过敏史代码
     */
    public String allergicHistoryCode;

    /**
     * 45. [可空] 药物过敏史名称
     */
    public String allergicHistoryName;

    /**
     * 46. [可空] 暴露史
     */
    public String exposureHistoryName;

    /**
     * 55. [可空] 遗传病史代码
     */
    public String geneticHistoryCode;

    /**
     * 56. [可空] 其他遗传病史名称
     */
    public String geneticHistoryName;

    /**
     * 57. [可空] 残疾情况代码
     */
    public String disabilityCode;

    /**
     * 58. [可空] 其它残疾情况名称
     */
    public String disabilityName;

    /**
     * 59. [可空] 生活环境_厨房排风设施
     */
    public String kitchenExhaustFacilityType;

    /**
     * 60. [可空] 生活环境_燃料类型
     */
    public String fuelType;

    /**
     * 61. [可空] 生活环境_饮水
     */
    public String drinkingWaterType;

    /**
     * 62. [可空] 生活环境_厕所
     */
    public String toiletType;

    /**
     * 63. [可空] 生活环境_禽畜栏
     */
    public String birdType;

    /**
     * 64. [可空] 登记时间
     */
    public java.util.Date healthfileEntryDate;

    /**
     * 65. [可空] 登记人员代码
     */
    public String healthfileEntryEmpCode;

    /**
     * 66. [可空] 登记人员名称
     */
    public String healthfileEntryEmpName;

    /**
     * 67. [可空] 登记机构编码
     */
    public String healthfileEntryOrgCode;

    /**
     * 68. [可空] 登记机构名称
     */
    public String healthfileEntryOrgName;

    /**
     * 69. [不可空] 医疗机构代码
     */
    public String orgCode;

    /**
     * 70. [不可空] 填报日期
     */
    public java.util.Date uploadDate;

    /**
     * 72. [不可空] 档案状态：1、活动,2-死亡,3、迁出,4、作废
     */
    public String status;

    /**
     * 73. [可空] 责任医生代码
     */
    public String healthfileDoctorCode;

    /**
     * 74. [可空] 暴露史代码
     */
    public String exposureHistoryCode;

    /**
     * 75. [不可空] 数据来源
     */
    public String fdataFrom;

    /**
     * 76. [可空] 修改人
     */
    public String editor;

    /**
     * 77. [可空] 修改时间
     */
    public Date modifydate;

    /**
     * 78. [不可空] 修改标志,1新增,2修改,3撤销
     */
    public String updateFlag;

    /**
     * 79. [可空] 与户主关系
     */
    public String relationship;

    /**
     * 80. [可空] 社保/农合卡号
     */
    public String medicareid;

    /**
     * 81. [可空] 身份证签发机关
     */
    public String idcardia;

    /**
     * 82. [可空] 身份证有效期起始日期
     */
    public Date idcarddatestart;

    /**
     * 83. [可空] 身份证有效期截止日期
     */
    public Date idcarddateend;

    /**
     * 84. [可空] 备注
     */
    public String remark;

    /**
     * 87. [可空] 诊疗卡号/建康卡号
     */
    public String clinicCardNumber;

    /**
     * 88. [可空] 年龄
     */
    public String age;

    /**
     * 89. [可空] 身高
     */
    public String bodyheight;

    /**
     * 90. [可空] 体重
     */
    public String bodyweight;

    /**
     * 92. [可空] 小区
     */
    public String xiaoQu;

    /**
     * 93. [可空] 子女数
     */
    public String ziNvShu;

    /**
     * 94. [可空] 父亲姓名
     */
    public String fuQinName;

    /**
     * 95. [可空] 母亲姓名
     */
    public String muQinName;

    /**
     * 96. [可空] 平台档案号
     */
    public String ptNo;

    /**
     * 97. [可空] 纸质档案号
     */
    public String paperNo;

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
    /**
     * 是否贫困户
     */
    private String ispoor;

    /**
     * 既往输血史
     **/
    @Expose
    public String bloodsJson;
    @Transient
    private List<GgwsEhrBloodDto> bloods;
    /**
     * 既往疾病史
     **/
    @Expose
    public String diseasesJson;
    @Transient
    private List<GgwsDiseaseDto> diseases;
    /**
     * 既往家族史
     **/
    @Expose
    public String familysJson;
    @Transient
    private List<GgwsEhrFamilyDto> familys;
    /**
     * 既往手术史
     **/
    @Expose
    public String operationsJson;
    @Transient
    private List<GgwsEhrOperationDto> operations;
    /**
     * 既往外伤史
     **/
    @Expose
    public String traumasJson;
    @Transient
    private List<GgwsEhrTraumaDto> traumas;

    /**
     * 糖尿病专项信息
     */
    @Transient
    private AbstractEhrDiabetesInfomation diabetesInfo;

    /**
     * 高血压专项信息
     */
    @Transient
    private AbstractEhrHypertensionInfomation hyperInfo;

    public AbstractEhrDiabetesInfomation getDiabetesInfo() {
        return diabetesInfo;
    }

    public void setDiabetesInfo(AbstractEhrDiabetesInfomation diabetesInfo) {
        this.diabetesInfo = diabetesInfo;
    }

    public AbstractEhrHypertensionInfomation getHyperInfo() {
        return hyperInfo;
    }

    public void setHyperInfo(AbstractEhrHypertensionInfomation hyperInfo) {
        this.hyperInfo = hyperInfo;
    }

    /**
     * 是否上传
     */
    @Expose
    public boolean upload = false;

    @Generated(hash = 1496402990)
    public AbstractEhrPersonalFile(Long localId, String id, String idCard, String vipCard, boolean completed,
            String title, String healthfileNo, String fileNumber, String divisionsCodeOfResidence,
            String provinceOfResidence, String cityOfResidence, String countyOfResidence, String townOfResidence,
            String villageOfResidence, String houseNumberOfResidence, String divisionsCodeRegResidence,
            String provinceOfRegResidence, String cityOfRegResidence, String countyOfRegResidence,
            String townOfRegResidence, String villageOfRegResidence, String houseNumberOfRegResidence,
            String contactPhone, String townOfMgrHealthfile, String villageOfMgrHealthfile,
            String healthfileCreatorOrgCode, String healthfileCreatorOrgName, String healthfileCreatorEmpCode,
            String healthfileCreatorEmpName, String healthfileDoctorName, java.util.Date healthfileCreateDate,
            String name, String gender, java.util.Date birthDate, String idNumber, String nameOfEmployer,
            String telephoneNumber, String contactPersonsName, String contactPersonsPhone, String residenceType,
            String nationCode, String nationName, String blod, String rh, String education, String occupation,
            String maritalStatus, String paymentMethodCode, String paymentMethodName, String allergicHistoryCode,
            String allergicHistoryName, String exposureHistoryName, String geneticHistoryCode,
            String geneticHistoryName, String disabilityCode, String disabilityName,
            String kitchenExhaustFacilityType, String fuelType, String drinkingWaterType, String toiletType,
            String birdType, java.util.Date healthfileEntryDate, String healthfileEntryEmpCode,
            String healthfileEntryEmpName, String healthfileEntryOrgCode, String healthfileEntryOrgName,
            String orgCode, java.util.Date uploadDate, String status, String healthfileDoctorCode,
            String exposureHistoryCode, String fdataFrom, String editor, Date modifydate, String updateFlag,
            String relationship, String medicareid, String idcardia, Date idcarddatestart, Date idcarddateend,
            String remark, String clinicCardNumber, String age, String bodyheight, String bodyweight,
            String xiaoQu, String ziNvShu, String fuQinName, String muQinName, String ptNo, String paperNo,
            String editorId, String updateOrgId, String updateOrgName, String ispoor, String bloodsJson,
            String diseasesJson, String familysJson, String operationsJson, String traumasJson, boolean upload) {
        this.localId = localId;
        this.id = id;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.completed = completed;
        this.title = title;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.divisionsCodeOfResidence = divisionsCodeOfResidence;
        this.provinceOfResidence = provinceOfResidence;
        this.cityOfResidence = cityOfResidence;
        this.countyOfResidence = countyOfResidence;
        this.townOfResidence = townOfResidence;
        this.villageOfResidence = villageOfResidence;
        this.houseNumberOfResidence = houseNumberOfResidence;
        this.divisionsCodeRegResidence = divisionsCodeRegResidence;
        this.provinceOfRegResidence = provinceOfRegResidence;
        this.cityOfRegResidence = cityOfRegResidence;
        this.countyOfRegResidence = countyOfRegResidence;
        this.townOfRegResidence = townOfRegResidence;
        this.villageOfRegResidence = villageOfRegResidence;
        this.houseNumberOfRegResidence = houseNumberOfRegResidence;
        this.contactPhone = contactPhone;
        this.townOfMgrHealthfile = townOfMgrHealthfile;
        this.villageOfMgrHealthfile = villageOfMgrHealthfile;
        this.healthfileCreatorOrgCode = healthfileCreatorOrgCode;
        this.healthfileCreatorOrgName = healthfileCreatorOrgName;
        this.healthfileCreatorEmpCode = healthfileCreatorEmpCode;
        this.healthfileCreatorEmpName = healthfileCreatorEmpName;
        this.healthfileDoctorName = healthfileDoctorName;
        this.healthfileCreateDate = healthfileCreateDate;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
        this.nameOfEmployer = nameOfEmployer;
        this.telephoneNumber = telephoneNumber;
        this.contactPersonsName = contactPersonsName;
        this.contactPersonsPhone = contactPersonsPhone;
        this.residenceType = residenceType;
        this.nationCode = nationCode;
        this.nationName = nationName;
        this.blod = blod;
        this.rh = rh;
        this.education = education;
        this.occupation = occupation;
        this.maritalStatus = maritalStatus;
        this.paymentMethodCode = paymentMethodCode;
        this.paymentMethodName = paymentMethodName;
        this.allergicHistoryCode = allergicHistoryCode;
        this.allergicHistoryName = allergicHistoryName;
        this.exposureHistoryName = exposureHistoryName;
        this.geneticHistoryCode = geneticHistoryCode;
        this.geneticHistoryName = geneticHistoryName;
        this.disabilityCode = disabilityCode;
        this.disabilityName = disabilityName;
        this.kitchenExhaustFacilityType = kitchenExhaustFacilityType;
        this.fuelType = fuelType;
        this.drinkingWaterType = drinkingWaterType;
        this.toiletType = toiletType;
        this.birdType = birdType;
        this.healthfileEntryDate = healthfileEntryDate;
        this.healthfileEntryEmpCode = healthfileEntryEmpCode;
        this.healthfileEntryEmpName = healthfileEntryEmpName;
        this.healthfileEntryOrgCode = healthfileEntryOrgCode;
        this.healthfileEntryOrgName = healthfileEntryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.status = status;
        this.healthfileDoctorCode = healthfileDoctorCode;
        this.exposureHistoryCode = exposureHistoryCode;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.relationship = relationship;
        this.medicareid = medicareid;
        this.idcardia = idcardia;
        this.idcarddatestart = idcarddatestart;
        this.idcarddateend = idcarddateend;
        this.remark = remark;
        this.clinicCardNumber = clinicCardNumber;
        this.age = age;
        this.bodyheight = bodyheight;
        this.bodyweight = bodyweight;
        this.xiaoQu = xiaoQu;
        this.ziNvShu = ziNvShu;
        this.fuQinName = fuQinName;
        this.muQinName = muQinName;
        this.ptNo = ptNo;
        this.paperNo = paperNo;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.ispoor = ispoor;
        this.bloodsJson = bloodsJson;
        this.diseasesJson = diseasesJson;
        this.familysJson = familysJson;
        this.operationsJson = operationsJson;
        this.traumasJson = traumasJson;
        this.upload = upload;
    }

    @Generated(hash = 687160062)
    public AbstractEhrPersonalFile() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public boolean isCompleted() {
        return completed;
    }

    public boolean isUpload() {
        return upload;
    }

    /**
     * 获取fileNumber的值
     *
     * @return fileNumber fileNumber值
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置fileNumber的值
     *
     * @param fileNumber fileNumber值
     */
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取divisionsCodeOfResidence的值
     *
     * @return divisionsCodeOfResidence divisionsCodeOfResidence值
     */
    public String getDivisionsCodeOfResidence() {
        return divisionsCodeOfResidence;
    }

    /**
     * 设置divisionsCodeOfResidence的值
     *
     * @param divisionsCodeOfResidence divisionsCodeOfResidence值
     */
    public void setDivisionsCodeOfResidence(String divisionsCodeOfResidence) {
        this.divisionsCodeOfResidence = divisionsCodeOfResidence;
    }

    /**
     * 获取provinceOfResidence的值
     *
     * @return provinceOfResidence provinceOfResidence值
     */
    public String getProvinceOfResidence() {
        return provinceOfResidence;
    }

    /**
     * 设置provinceOfResidence的值
     *
     * @param provinceOfResidence provinceOfResidence值
     */
    public void setProvinceOfResidence(String provinceOfResidence) {
        this.provinceOfResidence = provinceOfResidence;
    }

    /**
     * 获取cityOfResidence的值
     *
     * @return cityOfResidence cityOfResidence值
     */
    public String getCityOfResidence() {
        return cityOfResidence;
    }

    /**
     * 设置cityOfResidence的值
     *
     * @param cityOfResidence cityOfResidence值
     */
    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    /**
     * 获取countyOfResidence的值
     *
     * @return countyOfResidence countyOfResidence值
     */
    public String getCountyOfResidence() {
        return countyOfResidence;
    }

    /**
     * 设置countyOfResidence的值
     *
     * @param countyOfResidence countyOfResidence值
     */
    public void setCountyOfResidence(String countyOfResidence) {
        this.countyOfResidence = countyOfResidence;
    }

    /**
     * 获取townOfResidence的值
     *
     * @return townOfResidence townOfResidence值
     */
    public String getTownOfResidence() {
        return townOfResidence;
    }

    /**
     * 设置townOfResidence的值
     *
     * @param townOfResidence townOfResidence值
     */
    public void setTownOfResidence(String townOfResidence) {
        this.townOfResidence = townOfResidence;
    }

    /**
     * 获取villageOfResidence的值
     *
     * @return villageOfResidence villageOfResidence值
     */
    public String getVillageOfResidence() {
        return villageOfResidence;
    }

    /**
     * 设置villageOfResidence的值
     *
     * @param villageOfResidence villageOfResidence值
     */
    public void setVillageOfResidence(String villageOfResidence) {
        this.villageOfResidence = villageOfResidence;
    }

    /**
     * 获取houseNumberOfResidence的值
     *
     * @return houseNumberOfResidence houseNumberOfResidence值
     */
    public String getHouseNumberOfResidence() {
        return houseNumberOfResidence;
    }

    /**
     * 设置houseNumberOfResidence的值
     *
     * @param houseNumberOfResidence houseNumberOfResidence值
     */
    public void setHouseNumberOfResidence(String houseNumberOfResidence) {
        this.houseNumberOfResidence = houseNumberOfResidence;
    }

    /**
     * 获取divisionsCodeRegResidence的值
     *
     * @return divisionsCodeRegResidence divisionsCodeRegResidence值
     */
    public String getDivisionsCodeRegResidence() {
        return divisionsCodeRegResidence;
    }

    /**
     * 设置divisionsCodeRegResidence的值
     *
     * @param divisionsCodeRegResidence divisionsCodeRegResidence值
     */
    public void setDivisionsCodeRegResidence(String divisionsCodeRegResidence) {
        this.divisionsCodeRegResidence = divisionsCodeRegResidence;
    }

    /**
     * 获取provinceOfRegResidence的值
     *
     * @return provinceOfRegResidence provinceOfRegResidence值
     */
    public String getProvinceOfRegResidence() {
        return provinceOfRegResidence;
    }

    /**
     * 设置provinceOfRegResidence的值
     *
     * @param provinceOfRegResidence provinceOfRegResidence值
     */
    public void setProvinceOfRegResidence(String provinceOfRegResidence) {
        this.provinceOfRegResidence = provinceOfRegResidence;
    }

    /**
     * 获取cityOfRegResidence的值
     *
     * @return cityOfRegResidence cityOfRegResidence值
     */
    public String getCityOfRegResidence() {
        return cityOfRegResidence;
    }

    /**
     * 设置cityOfRegResidence的值
     *
     * @param cityOfRegResidence cityOfRegResidence值
     */
    public void setCityOfRegResidence(String cityOfRegResidence) {
        this.cityOfRegResidence = cityOfRegResidence;
    }

    /**
     * 获取countyOfRegResidence的值
     *
     * @return countyOfRegResidence countyOfRegResidence值
     */
    public String getCountyOfRegResidence() {
        return countyOfRegResidence;
    }

    /**
     * 设置countyOfRegResidence的值
     *
     * @param countyOfRegResidence countyOfRegResidence值
     */
    public void setCountyOfRegResidence(String countyOfRegResidence) {
        this.countyOfRegResidence = countyOfRegResidence;
    }

    /**
     * 获取townOfRegResidence的值
     *
     * @return townOfRegResidence townOfRegResidence值
     */
    public String getTownOfRegResidence() {
        return townOfRegResidence;
    }

    /**
     * 设置townOfRegResidence的值
     *
     * @param townOfRegResidence townOfRegResidence值
     */
    public void setTownOfRegResidence(String townOfRegResidence) {
        this.townOfRegResidence = townOfRegResidence;
    }

    /**
     * 获取villageOfRegResidence的值
     *
     * @return villageOfRegResidence villageOfRegResidence值
     */
    public String getVillageOfRegResidence() {
        return villageOfRegResidence;
    }

    /**
     * 设置villageOfRegResidence的值
     *
     * @param villageOfRegResidence villageOfRegResidence值
     */
    public void setVillageOfRegResidence(String villageOfRegResidence) {
        this.villageOfRegResidence = villageOfRegResidence;
    }

    /**
     * 获取houseNumberOfRegResidence的值
     *
     * @return houseNumberOfRegResidence houseNumberOfRegResidence值
     */
    public String getHouseNumberOfRegResidence() {
        return houseNumberOfRegResidence;
    }

    /**
     * 设置houseNumberOfRegResidence的值
     *
     * @param houseNumberOfRegResidence houseNumberOfRegResidence值
     */
    public void setHouseNumberOfRegResidence(String houseNumberOfRegResidence) {
        this.houseNumberOfRegResidence = houseNumberOfRegResidence;
    }

    /**
     * 获取contactPhone的值
     *
     * @return contactPhone contactPhone值
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置contactPhone的值
     *
     * @param contactPhone contactPhone值
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取townOfMgrHealthfile的值
     *
     * @return townOfMgrHealthfile townOfMgrHealthfile值
     */
    public String getTownOfMgrHealthfile() {
        return townOfMgrHealthfile;
    }

    /**
     * 设置townOfMgrHealthfile的值
     *
     * @param townOfMgrHealthfile townOfMgrHealthfile值
     */
    public void setTownOfMgrHealthfile(String townOfMgrHealthfile) {
        this.townOfMgrHealthfile = townOfMgrHealthfile;
    }

    /**
     * 获取villageOfMgrHealthfile的值
     *
     * @return villageOfMgrHealthfile villageOfMgrHealthfile值
     */
    public String getVillageOfMgrHealthfile() {
        return villageOfMgrHealthfile;
    }

    /**
     * 设置villageOfMgrHealthfile的值
     *
     * @param villageOfMgrHealthfile villageOfMgrHealthfile值
     */
    public void setVillageOfMgrHealthfile(String villageOfMgrHealthfile) {
        this.villageOfMgrHealthfile = villageOfMgrHealthfile;
    }

    /**
     * 获取healthfileCreatorOrgCode的值
     *
     * @return healthfileCreatorOrgCode healthfileCreatorOrgCode值
     */
    public String getHealthfileCreatorOrgCode() {
        return healthfileCreatorOrgCode;
    }

    /**
     * 设置healthfileCreatorOrgCode的值
     *
     * @param healthfileCreatorOrgCode healthfileCreatorOrgCode值
     */
    public void setHealthfileCreatorOrgCode(String healthfileCreatorOrgCode) {
        this.healthfileCreatorOrgCode = healthfileCreatorOrgCode;
    }

    /**
     * 获取healthfileCreatorOrgName的值
     *
     * @return healthfileCreatorOrgName healthfileCreatorOrgName值
     */
    public String getHealthfileCreatorOrgName() {
        return healthfileCreatorOrgName;
    }

    public List<GgwsDiseaseDto> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<GgwsDiseaseDto> diseases) {
        this.diseases = diseases;
    }

    public List<GgwsEhrBloodDto> getBloods() {
        return bloods;
    }

    public void setBloods(List<GgwsEhrBloodDto> bloods) {
        this.bloods = bloods;
    }

    public List<GgwsEhrFamilyDto> getFamilys() {
        return familys;
    }

    public void setFamilys(List<GgwsEhrFamilyDto> familys) {
        this.familys = familys;
    }

    public List<GgwsEhrOperationDto> getOperations() {
        return operations;
    }

    public void setOperations(List<GgwsEhrOperationDto> operations) {
        this.operations = operations;
    }

    public List<GgwsEhrTraumaDto> getTraumas() {
        return traumas;
    }

    public void setTraumas(List<GgwsEhrTraumaDto> traumas) {
        this.traumas = traumas;
    }

    /**
     * 设置healthfileCreatorOrgName的值
     *
     * @param healthfileCreatorOrgName healthfileCreatorOrgName值
     */
    public void setHealthfileCreatorOrgName(String healthfileCreatorOrgName) {
        this.healthfileCreatorOrgName = healthfileCreatorOrgName;
    }

    /**
     * 获取healthfileCreatorEmpCode的值
     *
     * @return healthfileCreatorEmpCode healthfileCreatorEmpCode值
     */
    public String getHealthfileCreatorEmpCode() {
        return healthfileCreatorEmpCode;
    }

    /**
     * 设置healthfileCreatorEmpCode的值
     *
     * @param healthfileCreatorEmpCode healthfileCreatorEmpCode值
     */
    public void setHealthfileCreatorEmpCode(String healthfileCreatorEmpCode) {
        this.healthfileCreatorEmpCode = healthfileCreatorEmpCode;
    }

    /**
     * 获取healthfileCreatorEmpName的值
     *
     * @return healthfileCreatorEmpName healthfileCreatorEmpName值
     */
    public String getHealthfileCreatorEmpName() {
        return healthfileCreatorEmpName;
    }

    /**
     * 设置healthfileCreatorEmpName的值
     *
     * @param healthfileCreatorEmpName healthfileCreatorEmpName值
     */
    public void setHealthfileCreatorEmpName(String healthfileCreatorEmpName) {
        this.healthfileCreatorEmpName = healthfileCreatorEmpName;
    }

    /**
     * 获取healthfileDoctorName的值
     *
     * @return healthfileDoctorName healthfileDoctorName值
     */
    public String getHealthfileDoctorName() {
        return healthfileDoctorName;
    }

    /**
     * 设置healthfileDoctorName的值
     *
     * @param healthfileDoctorName healthfileDoctorName值
     */
    public void setHealthfileDoctorName(String healthfileDoctorName) {
        this.healthfileDoctorName = healthfileDoctorName;
    }

    /**
     * 获取healthfileCreateDate的值
     *
     * @return healthfileCreateDate healthfileCreateDate值
     */
    public Date getHealthfileCreateDate() {
        return healthfileCreateDate;
    }

    /**
     * 设置healthfileCreateDate的值
     *
     * @param healthfileCreateDate healthfileCreateDate值
     */
    public void setHealthfileCreateDate(Date healthfileCreateDate) {
        this.healthfileCreateDate = healthfileCreateDate;
    }

    /**
     * 获取name的值
     *
     * @return name name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name的值
     *
     * @param name name值
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取gender的值
     *
     * @return gender gender值
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender的值
     *
     * @param gender gender值
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取birthDate的值
     *
     * @return birthDate birthDate值
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 设置birthDate的值
     *
     * @param birthDate birthDate值
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 获取idNumber的值
     *
     * @return idNumber idNumber值
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置idNumber的值
     *
     * @param idNumber idNumber值
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取nameOfEmployer的值
     *
     * @return nameOfEmployer nameOfEmployer值
     */
    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    /**
     * 设置nameOfEmployer的值
     *
     * @param nameOfEmployer nameOfEmployer值
     */
    public void setNameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
    }

    /**
     * 获取telephoneNumber的值
     *
     * @return telephoneNumber telephoneNumber值
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * 设置telephoneNumber的值
     *
     * @param telephoneNumber telephoneNumber值
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * 获取contactPersonsName的值
     *
     * @return contactPersonsName contactPersonsName值
     */
    public String getContactPersonsName() {
        return contactPersonsName;
    }

    /**
     * 设置contactPersonsName的值
     *
     * @param contactPersonsName contactPersonsName值
     */
    public void setContactPersonsName(String contactPersonsName) {
        this.contactPersonsName = contactPersonsName;
    }

    /**
     * 获取contactPersonsPhone的值
     *
     * @return contactPersonsPhone contactPersonsPhone值
     */
    public String getContactPersonsPhone() {
        return contactPersonsPhone;
    }

    /**
     * 设置contactPersonsPhone的值
     *
     * @param contactPersonsPhone contactPersonsPhone值
     */
    public void setContactPersonsPhone(String contactPersonsPhone) {
        this.contactPersonsPhone = contactPersonsPhone;
    }

    /**
     * 获取residenceType的值
     *
     * @return residenceType residenceType值
     */
    public String getResidenceType() {
        return residenceType;
    }

    /**
     * 设置residenceType的值
     *
     * @param residenceType residenceType值
     */
    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    /**
     * 获取nationCode的值
     *
     * @return nationCode nationCode值
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * 设置nationCode的值
     *
     * @param nationCode nationCode值
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    /**
     * 获取nationName的值
     *
     * @return nationName nationName值
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * 设置nationName的值
     *
     * @param nationName nationName值
     */
    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    /**
     * 获取blod的值
     *
     * @return blod blod值
     */
    public String getBlod() {
        return blod;
    }

    /**
     * 设置blod的值
     *
     * @param blod blod值
     */
    public void setBlod(String blod) {
        this.blod = blod;
    }

    /**
     * 获取rh的值
     *
     * @return rh rh值
     */
    public String getRh() {
        return rh;
    }

    /**
     * 设置rh的值
     *
     * @param rh rh值
     */
    public void setRh(String rh) {
        this.rh = rh;
    }

    /**
     * 获取education的值
     *
     * @return education education值
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置education的值
     *
     * @param education education值
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取occupation的值
     *
     * @return occupation occupation值
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * 设置occupation的值
     *
     * @param occupation occupation值
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * 获取maritalStatus的值
     *
     * @return maritalStatus maritalStatus值
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置maritalStatus的值
     *
     * @param maritalStatus maritalStatus值
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 获取paymentMethodCode的值
     *
     * @return paymentMethodCode paymentMethodCode值
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * 设置paymentMethodCode的值
     *
     * @param paymentMethodCode paymentMethodCode值
     */
    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    /**
     * 获取paymentMethodName的值
     *
     * @return paymentMethodName paymentMethodName值
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * 设置paymentMethodName的值
     *
     * @param paymentMethodName paymentMethodName值
     */
    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    /**
     * 获取allergicHistoryCode的值
     *
     * @return allergicHistoryCode allergicHistoryCode值
     */
    public String getAllergicHistoryCode() {
        return allergicHistoryCode;
    }

    /**
     * 设置allergicHistoryCode的值
     *
     * @param allergicHistoryCode allergicHistoryCode值
     */
    public void setAllergicHistoryCode(String allergicHistoryCode) {
        this.allergicHistoryCode = allergicHistoryCode;
    }

    /**
     * 获取allergicHistoryName的值
     *
     * @return allergicHistoryName allergicHistoryName值
     */
    public String getAllergicHistoryName() {
        return allergicHistoryName;
    }

    /**
     * 设置allergicHistoryName的值
     *
     * @param allergicHistoryName allergicHistoryName值
     */
    public void setAllergicHistoryName(String allergicHistoryName) {
        this.allergicHistoryName = allergicHistoryName;
    }

    /**
     * 获取exposureHistoryName的值
     *
     * @return exposureHistoryName exposureHistoryName值
     */
    public String getExposureHistoryName() {
        return exposureHistoryName;
    }

    /**
     * 设置exposureHistoryName的值
     *
     * @param exposureHistoryName exposureHistoryName值
     */
    public void setExposureHistoryName(String exposureHistoryName) {
        this.exposureHistoryName = exposureHistoryName;
    }

    /**
     * 获取geneticHistoryCode的值
     *
     * @return geneticHistoryCode geneticHistoryCode值
     */
    public String getGeneticHistoryCode() {
        return geneticHistoryCode;
    }

    /**
     * 设置geneticHistoryCode的值
     *
     * @param geneticHistoryCode geneticHistoryCode值
     */
    public void setGeneticHistoryCode(String geneticHistoryCode) {
        this.geneticHistoryCode = geneticHistoryCode;
    }

    /**
     * 获取geneticHistoryName的值
     *
     * @return geneticHistoryName geneticHistoryName值
     */
    public String getGeneticHistoryName() {
        return geneticHistoryName;
    }

    /**
     * 设置geneticHistoryName的值
     *
     * @param geneticHistoryName geneticHistoryName值
     */
    public void setGeneticHistoryName(String geneticHistoryName) {
        this.geneticHistoryName = geneticHistoryName;
    }

    /**
     * 获取disabilityCode的值
     *
     * @return disabilityCode disabilityCode值
     */
    public String getDisabilityCode() {
        return disabilityCode;
    }

    /**
     * 设置disabilityCode的值
     *
     * @param disabilityCode disabilityCode值
     */
    public void setDisabilityCode(String disabilityCode) {
        this.disabilityCode = disabilityCode;
    }

    /**
     * 获取disabilityName的值
     *
     * @return disabilityName disabilityName值
     */
    public String getDisabilityName() {
        return disabilityName;
    }

    /**
     * 设置disabilityName的值
     *
     * @param disabilityName disabilityName值
     */
    public void setDisabilityName(String disabilityName) {
        this.disabilityName = disabilityName;
    }

    /**
     * 获取kitchenExhaustFacilityType的值
     *
     * @return kitchenExhaustFacilityType kitchenExhaustFacilityType值
     */
    public String getKitchenExhaustFacilityType() {
        return kitchenExhaustFacilityType;
    }

    /**
     * 设置kitchenExhaustFacilityType的值
     *
     * @param kitchenExhaustFacilityType kitchenExhaustFacilityType值
     */
    public void setKitchenExhaustFacilityType(String kitchenExhaustFacilityType) {
        this.kitchenExhaustFacilityType = kitchenExhaustFacilityType;
    }

    /**
     * 获取fuelType的值
     *
     * @return fuelType fuelType值
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * 设置fuelType的值
     *
     * @param fuelType fuelType值
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * 获取drinkingWaterType的值
     *
     * @return drinkingWaterType drinkingWaterType值
     */
    public String getDrinkingWaterType() {
        return drinkingWaterType;
    }

    /**
     * 设置drinkingWaterType的值
     *
     * @param drinkingWaterType drinkingWaterType值
     */
    public void setDrinkingWaterType(String drinkingWaterType) {
        this.drinkingWaterType = drinkingWaterType;
    }

    /**
     * 获取toiletType的值
     *
     * @return toiletType toiletType值
     */
    public String getToiletType() {
        return toiletType;
    }

    /**
     * 设置toiletType的值
     *
     * @param toiletType toiletType值
     */
    public void setToiletType(String toiletType) {
        this.toiletType = toiletType;
    }

    /**
     * 获取birdType的值
     *
     * @return birdType birdType值
     */
    public String getBirdType() {
        return birdType;
    }

    /**
     * 设置birdType的值
     *
     * @param birdType birdType值
     */
    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    /**
     * 获取healthfileEntryDate的值
     *
     * @return healthfileEntryDate healthfileEntryDate值
     */
    public Date getHealthfileEntryDate() {
        return healthfileEntryDate;
    }

    /**
     * 设置healthfileEntryDate的值
     *
     * @param healthfileEntryDate healthfileEntryDate值
     */
    public void setHealthfileEntryDate(Date healthfileEntryDate) {
        this.healthfileEntryDate = healthfileEntryDate;
    }

    /**
     * 获取healthfileEntryEmpCode的值
     *
     * @return healthfileEntryEmpCode healthfileEntryEmpCode值
     */
    public String getHealthfileEntryEmpCode() {
        return healthfileEntryEmpCode;
    }

    /**
     * 设置healthfileEntryEmpCode的值
     *
     * @param healthfileEntryEmpCode healthfileEntryEmpCode值
     */
    public void setHealthfileEntryEmpCode(String healthfileEntryEmpCode) {
        this.healthfileEntryEmpCode = healthfileEntryEmpCode;
    }

    /**
     * 获取healthfileEntryEmpName的值
     *
     * @return healthfileEntryEmpName healthfileEntryEmpName值
     */
    public String getHealthfileEntryEmpName() {
        return healthfileEntryEmpName;
    }

    /**
     * 设置healthfileEntryEmpName的值
     *
     * @param healthfileEntryEmpName healthfileEntryEmpName值
     */
    public void setHealthfileEntryEmpName(String healthfileEntryEmpName) {
        this.healthfileEntryEmpName = healthfileEntryEmpName;
    }

    /**
     * 获取healthfileEntryOrgCode的值
     *
     * @return healthfileEntryOrgCode healthfileEntryOrgCode值
     */
    public String getHealthfileEntryOrgCode() {
        return healthfileEntryOrgCode;
    }

    /**
     * 设置healthfileEntryOrgCode的值
     *
     * @param healthfileEntryOrgCode healthfileEntryOrgCode值
     */
    public void setHealthfileEntryOrgCode(String healthfileEntryOrgCode) {
        this.healthfileEntryOrgCode = healthfileEntryOrgCode;
    }

    /**
     * 获取healthfileEntryOrgName的值
     *
     * @return healthfileEntryOrgName healthfileEntryOrgName值
     */
    public String getHealthfileEntryOrgName() {
        return healthfileEntryOrgName;
    }

    /**
     * 设置healthfileEntryOrgName的值
     *
     * @param healthfileEntryOrgName healthfileEntryOrgName值
     */
    public void setHealthfileEntryOrgName(String healthfileEntryOrgName) {
        this.healthfileEntryOrgName = healthfileEntryOrgName;
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
     * 获取status的值
     *
     * @return status status值
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status的值
     *
     * @param status status值
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取healthfileDoctorCode的值
     *
     * @return healthfileDoctorCode healthfileDoctorCode值
     */
    public String getHealthfileDoctorCode() {
        return healthfileDoctorCode;
    }

    /**
     * 设置healthfileDoctorCode的值
     *
     * @param healthfileDoctorCode healthfileDoctorCode值
     */
    public void setHealthfileDoctorCode(String healthfileDoctorCode) {
        this.healthfileDoctorCode = healthfileDoctorCode;
    }

    /**
     * 获取exposureHistoryCode的值
     *
     * @return exposureHistoryCode exposureHistoryCode值
     */
    public String getExposureHistoryCode() {
        return exposureHistoryCode;
    }

    /**
     * 设置exposureHistoryCode的值
     *
     * @param exposureHistoryCode exposureHistoryCode值
     */
    public void setExposureHistoryCode(String exposureHistoryCode) {
        this.exposureHistoryCode = exposureHistoryCode;
    }

    /**
     * 获取fdataFrom的值
     *
     * @return fdataFrom fdataFrom值
     */
    public String getFdataFrom() {
        return fdataFrom;
    }

    /**
     * 设置fdataFrom的值
     *
     * @param fdataFrom fdataFrom值
     */
    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
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
     * 获取updateFlag的值
     *
     * @return updateFlag updateFlag值
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置updateFlag的值
     *
     * @param updateFlag updateFlag值
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * 获取relationship的值
     *
     * @return relationship relationship值
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * 设置relationship的值
     *
     * @param relationship relationship值
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * 获取medicareid的值
     *
     * @return medicareid medicareid值
     */
    public String getMedicareid() {
        return medicareid;
    }

    /**
     * 设置medicareid的值
     *
     * @param medicareid medicareid值
     */
    public void setMedicareid(String medicareid) {
        this.medicareid = medicareid;
    }

    /**
     * 获取idcardia的值
     *
     * @return idcardia idcardia值
     */
    public String getIdcardia() {
        return idcardia;
    }

    /**
     * 设置idcardia的值
     *
     * @param idcardia idcardia值
     */
    public void setIdcardia(String idcardia) {
        this.idcardia = idcardia;
    }

    /**
     * 获取idcarddatestart的值
     *
     * @return idcarddatestart idcarddatestart值
     */
    public Date getIdcarddatestart() {
        return idcarddatestart;
    }

    /**
     * 设置idcarddatestart的值
     *
     * @param idcarddatestart idcarddatestart值
     */
    public void setIdcarddatestart(Date idcarddatestart) {
        this.idcarddatestart = idcarddatestart;
    }

    /**
     * 获取idcarddateend的值
     *
     * @return idcarddateend idcarddateend值
     */
    public Date getIdcarddateend() {
        return idcarddateend;
    }

    /**
     * 设置idcarddateend的值
     *
     * @param idcarddateend idcarddateend值
     */
    public void setIdcarddateend(Date idcarddateend) {
        this.idcarddateend = idcarddateend;
    }

    /**
     * 获取remark的值
     *
     * @return remark remark值
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark的值
     *
     * @param remark remark值
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getClinicCardNumber() {
        return this.clinicCardNumber;
    }

    public void setClinicCardNumber(String clinicCardNumber) {
        this.clinicCardNumber = clinicCardNumber;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBodyheight() {
        return this.bodyheight;
    }

    public void setBodyheight(String bodyheight) {
        this.bodyheight = bodyheight;
    }

    public String getBodyweight() {
        return this.bodyweight;
    }

    public void setBodyweight(String bodyweight) {
        this.bodyweight = bodyweight;
    }

    public String getBloodsJson() {
        return this.bloodsJson;
    }

    public void setBloodsJson(String bloodsJson) {
        this.bloodsJson = bloodsJson;
    }

    public String getDiseasesJson() {
        return this.diseasesJson;
    }

    public void setDiseasesJson(String diseasesJson) {
        this.diseasesJson = diseasesJson;
    }

    public String getFamilysJson() {
        return this.familysJson;
    }

    public void setFamilysJson(String familysJson) {
        this.familysJson = familysJson;
    }

    public String getOperationsJson() {
        return this.operationsJson;
    }

    public void setOperationsJson(String operationsJson) {
        this.operationsJson = operationsJson;
    }

    public String getTraumasJson() {
        return this.traumasJson;
    }

    public void setTraumasJson(String traumasJson) {
        this.traumasJson = traumasJson;
    }

    public String getHealthfileNo() {
        return this.healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getLocalId() {
        return this.localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    /**
     * 获取title的值
     *
     * @return title title值
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * 设置title的值
     *
     * @param title title值
     */
    @Override
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
        return null;
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

    public boolean getUpload() {
        return this.upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    /**
     * 获取completed的值
     *
     * @return completed completed值
     */
    @Override
    public boolean getCompleted() {
        return completed;
    }

    /**
     * 设置completed的值
     *
     * @param completed completed值
     */
    @Override
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getXiaoQu() {
        return this.xiaoQu;
    }

    public void setXiaoQu(String xiaoQu) {
        this.xiaoQu = xiaoQu;
    }

    public String getZiNvShu() {
        return this.ziNvShu;
    }

    public void setZiNvShu(String ziNvShu) {
        this.ziNvShu = ziNvShu;
    }

    public String getFuQinName() {
        return this.fuQinName;
    }

    public void setFuQinName(String fuQinName) {
        this.fuQinName = fuQinName;
    }

    public String getMuQinName() {
        return this.muQinName;
    }

    public void setMuQinName(String muQinName) {
        this.muQinName = muQinName;
    }

    public String getPtNo() {
        return this.ptNo;
    }

    public void setPtNo(String ptNo) {
        this.ptNo = ptNo;
    }

    public String getPaperNo() {
        return this.paperNo;
    }

    public void setPaperNo(String paperNo) {
        this.paperNo = paperNo;
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

    public String getIspoor() {
        return this.ispoor;
    }

    public void setIspoor(String ispoor) {
        this.ispoor = ispoor;
    }
}
