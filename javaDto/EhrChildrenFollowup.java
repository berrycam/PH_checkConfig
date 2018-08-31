
package com.konsung.bean;

import com.google.gson.annotations.Expose;
import com.greendao.dao.DaoSession;
import com.greendao.dao.EhrChildrenFollowupDao;
import com.greendao.dao.EhrChildrenInformationDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;

/**
 * 新生儿家庭访视记录类。
 * <p>
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String childrenFollowupId 新生儿访视记录ID
 * 2. [不可空] String childrenId 儿童基本信息ID
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [可空] String pregnantDiseaseCode 母亲妊娠期患病情况代码
 * 6. [可空] String pregnantDiseaseName 母亲妊娠期患病情况名称
 * 7. [可空] String bornOrgNo 助产机构编码
 * 8. [可空] String bornOrgName 助产机构名称
 * 9. [可空] String bornStateNo 出生情况代码
 * 10. [可空] String bornStateName 其他出生情况名称
 * 11. [可空] String childrenApnea 新生儿窒息
 * 12. [可空] String apgarScoreType Apgar评分代码
 * 13. [可空] Boolean isDeformity 是否有畸型
 * 14. [可空] String deformityState 畸型情况
 * 15. [可空] String childrenHearingCheck 新生儿听力筛查
 * 16. [可空] String childrenDiseaseCheck 新生儿疾病筛查
 * 17. [可空] String childrenDiseaseOtherCheck 新生儿疾病筛查说明
 * 18. [可空] Double childrenWeight 新生儿出生体重
 * 19. [可空] Double childrenCurrentWeight 目前体重
 * 20. [可空] Double childrenHeight 出生身长
 * 21. [可空] String feedType 喂养方式
 * 22. [可空] Double childrenSuckleAmount 吃奶量
 * 23. [可空] Integer childrenSuckleTimes 吃奶次数
 * 24. [可空] String childrenVomit 呕吐
 * 25. [可空] String childrenStool 大便
 * 26. [可空] Integer childrenStoolTimes 大便次数
 * 27. [可空] Double childrenTemperaure 体温
 * 28. [可空] Integer childrenPulse 脉率
 * 29. [可空] Integer childrenBreathe 呼吸频率
 * 30. [可空] String childrenFaceNo 面色代码
 * 31. [可空] String childrenFaceName 面色名称
 * 32. [可空] String childrenFaceOther 面色其他
 * 33. [可空] String childrenJaundicePosition 黄疸部位
 * 34. [可空] Double childrenBregmatic1 前囟1
 * 35. [可空] Double childrenBregmatic2 前囟2
 * 36. [可空] String childrenBregmaticNo 前囟代码
 * 37. [可空] String childrenBregmaticName 其他前囟名称
 * 38. [可空] String childrenEye 眼外观
 * 39. [可空] String childrenEyeEx 眼外观异常描述
 * 40. [可空] String childrenLimbs 四肢活动度
 * 41. [可空] String childrenLimbsEx 四肢活动度异常描述
 * 42. [可空] String childrenEar 耳外观
 * 43. [可空] String childrenEarEx 耳外观异常描述
 * 44. [可空] String childrenNeck 颈部包块
 * 45. [可空] String childrenNeckEx 颈部包块异常描述
 * 46. [可空] String childrenNose 鼻
 * 47. [可空] String childrenNoseEx 鼻异常描述
 * 48. [可空] String childrenSkinNo 皮肤代码
 * 49. [可空] String childrenSkinEx 皮肤异常描述
 * 50. [可空] String childrenMouth 口腔
 * 51. [可空] String childrenMouthEx 口腔异常描述
 * 52. [可空] String childrenAnus 肛门
 * 53. [可空] String childrenAnusEx 肛门异常描述
 * 54. [可空] String childrenHeart 心肺听诊
 * 55. [可空] String childrenHeartEx 心肺听诊异常描述
 * 56. [可空] String childrenGenitals 外生殖器
 * 57. [可空] String childrenGenitalsEx 外生殖器异常描述
 * 58. [可空] String childrenBelly 腹部触诊
 * 59. [可空] String childrenBellyEx 腹部触诊异常描述
 * 60. [可空] String childrenSpine 脊柱
 * 61. [可空] String childrenSpineEx 脊柱异常描述
 * 62. [可空] String childrenFunicleNo 脐带代码
 * 63. [可空] String childrenFunicleName 脐带说明
 * 64. [可空] String referralSign 转诊建议
 * 65. [可空] String referralReason 转诊原因
 * 66. [可空] String referralOrgCode 转诊机构编码
 * 67. [可空] String referralOrgName 转诊机构名称
 * 68. [可空] String referralDepCode 转诊科室编码
 * 69. [可空] String referralDepName 转诊科室名称
 * 70. [可空] String referralOrgDep 转诊机构及科室
 * 71. [可空] String childrenGuide 指导
 * 72. [不可空] java.util.Date followupDate 本次访视日期
 * 73. [可空] String followupDrCode 访视医生编码
 * 74. [不可空] String followupDrName 访视医生姓名
 * 75. [可空] String followUpOrgCode 随访机构编码
 * 76. [可空] String followUpOrgName 随访机构名称
 * 77. [可空] String nextFollowupPlace 下次随访地点
 * 78. [可空] java.util.Date nextFollowupDate 下次随访日期
 * 79. [不可空] java.util.Date entryDate 登记时间
 * 80. [可空] String entryEmpCode 登记人员编码
 * 81. [不可空] String entryEmpName 登记人员名称
 * 82. [不可空] String entryOrgCode 登记机构编码
 * 83. [不可空] String entryOrgName 登记机构名称
 * 84. [不可空] String orgCode 医疗机构代码
 * 85. [不可空] java.util.Date uploadDate 填报日期
 * 86. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 87. [主键] String id 主键
 * 88. [可空] String editor 修改人
 * 89. [可空] java.util.Date modifydate 更新日期
 * 90. [不可空] String fdataFrom 数据来源
 */
@Entity
public class EhrChildrenFollowup extends BaseChildBean {

    /**
     * 本地数据库id
     */
    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    @Expose
    private Long localId;

    /**
     * 身份证
     */
    @Expose
    private String idCard;

    /**
     * 会员卡
     */
    @Expose
    private String vipCard;
    /**
     * 是否已经上传
     */
    @Expose
    private boolean upload = false;

    /**
     * 标识所有必填字段是否填写
     */
    @Expose
    private boolean completed;

    public boolean isUpload() {
        return upload;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String title; //标题
    private String id;
    /**
     * 1. [不可空] 新生儿访视记录ID
     */
    private String childrenFollowupId;

    /**
     * 2. [不可空] 儿童基本信息ID
     */
    private String childrenId;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 5. [可空] 母亲妊娠期患病情况代码
     */
    private String pregnantDiseaseCode;

    /**
     * 6. [可空] 母亲妊娠期患病情况名称
     */
    private String pregnantDiseaseName;

    /**
     * 7. [可空] 助产机构编码
     */
    private String bornOrgNo;

    /**
     * 8. [可空] 助产机构名称
     */
    private String bornOrgName;

    /**
     * 9. [可空] 出生情况代码
     */
    private String bornStateNo;

    /**
     * 10. [可空] 其他出生情况名称
     */
    private String bornStateName;

    /**
     * 11. [可空] 新生儿窒息
     */
    private String childrenApnea;

    /**
     * 12. [可空] Apgar评分代码
     */
    private String apgarScoreType;

    /**
     * 13. [可空] 是否有畸型
     */
    private String isDeformity;

    /**
     * 14. [可空] 畸型情况
     */
    private String deformityState;

    /**
     * 15. [可空] 新生儿听力筛查
     */
    private String childrenHearingCheck;

    /**
     * 16. [可空] 新生儿疾病筛查
     */
    private String childrenDiseaseCheck;

    /**
     * 17. [可空] 新生儿疾病筛查说明
     */
    private String childrenDiseaseOtherCheck;

    /**
     * 18. [可空] 新生儿出生体重
     */
    private Double childrenWeight;

    /**
     * 19. [可空] 目前体重
     */
    private Double childrenCurrentWeight;

    /**
     * 20. [可空] 出生身长
     */
    private Double childrenHeight;

    /**
     * 21. [可空] 喂养方式
     */
    private String feedType;

    /**
     * 22. [可空] 吃奶量
     */
    private Double childrenSuckleAmount;

    /**
     * 23. [可空] 吃奶次数
     */
    private Integer childrenSuckleTimes;

    /**
     * 24. [可空] 呕吐
     */
    private String childrenVomit;

    /**
     * 25. [可空] 大便
     */
    private String childrenStool;

    /**
     * 26. [可空] 大便次数
     */
    private Integer childrenStoolTimes;

    /**
     * 27. [可空] 体温
     */
    private Double childrenTemperaure;

    /**
     * 28. [可空] 脉率
     */
    private Integer childrenPulse;

    /**
     * 29. [可空] 呼吸频率
     */
    private Integer childrenBreathe;

    /**
     * 30. [可空] 面色代码
     */
    private String childrenFaceNo;

    /**
     * 31. [可空] 面色名称
     */
    private String childrenFaceName;

    /**
     * 32. [可空] 面色其他
     */
    private String childrenFaceOther;

    /**
     * 33. [可空] 黄疸部位
     */
    private String childrenJaundicePosition;

    /**
     * 34. [可空] 前囟1
     */
    private Double childrenBregmatic1;

    /**
     * 35. [可空] 前囟2
     */
    private Double childrenBregmatic2;

    /**
     * 36. [可空] 前囟代码
     */
    private String childrenBregmaticNo;

    /**
     * 37. [可空] 其他前囟名称
     */
    private String childrenBregmaticName;

    /**
     * 38. [可空] 眼外观
     */
    private String childrenEye;

    /**
     * 39. [可空] 眼外观异常描述
     */
    private String childrenEyeEx;

    /**
     * 40. [可空] 四肢活动度
     */
    private String childrenLimbs;

    /**
     * 41. [可空] 四肢活动度异常描述
     */
    private String childrenLimbsEx;

    /**
     * 42. [可空] 耳外观
     */
    private String childrenEar;

    /**
     * 43. [可空] 耳外观异常描述
     */
    private String childrenEarEx;

    /**
     * 44. [可空] 颈部包块
     */
    private String childrenNeck;

    /**
     * 45. [可空] 颈部包块异常描述
     */
    private String childrenNeckEx;

    /**
     * 46. [可空] 鼻
     */
    private String childrenNose;

    /**
     * 47. [可空] 鼻异常描述
     */
    private String childrenNoseEx;

    /**
     * 48. [可空] 皮肤代码
     */
    private String childrenSkinNo;

    /**
     * 49. [可空] 皮肤异常描述
     */
    private String childrenSkinEx;

    /**
     * 50. [可空] 口腔
     */
    private String childrenMouth;

    /**
     * 51. [可空] 口腔异常描述
     */
    private String childrenMouthEx;

    /**
     * 52. [可空] 肛门
     */
    private String childrenAnus;

    /**
     * 53. [可空] 肛门异常描述
     */
    private String childrenAnusEx;

    /**
     * 54. [可空] 心肺听诊
     */
    private String childrenHeart;

    /**
     * 55. [可空] 心肺听诊异常描述
     */
    private String childrenHeartEx;

    /**
     * 56. [可空] 外生殖器
     */
    private String childrenGenitals;

    /**
     * 57. [可空] 外生殖器异常描述
     */
    private String childrenGenitalsEx;

    /**
     * 58. [可空] 腹部触诊
     */
    private String childrenBelly;

    /**
     * 59. [可空] 腹部触诊异常描述
     */
    private String childrenBellyEx;

    /**
     * 60. [可空] 脊柱
     */
    private String childrenSpine;

    /**
     * 61. [可空] 脊柱异常描述
     */
    private String childrenSpineEx;

    /**
     * 62. [可空] 脐带代码
     */
    private String childrenFunicleNo;

    /**
     * 63. [可空] 脐带说明
     */
    private String childrenFunicleName;

    /**
     * 64. [可空] 转诊建议
     */
    private String referralSign;

    /**
     * 65. [可空] 转诊原因
     */
    private String referralReason;

    /**
     * 66. [可空] 转诊机构编码
     */
    private String referralOrgCode;

    /**
     * 67. [可空] 转诊机构名称
     */
    private String referralOrgName;

    /**
     * 68. [可空] 转诊科室编码
     */
    private String referralDepCode;

    /**
     * 69. [可空] 转诊科室名称
     */
    private String referralDepName;

    /**
     * 70. [可空] 转诊机构及科室
     */
    private String referralOrgDep;

    /**
     * 71. [可空] 指导
     */
    private String childrenGuide;

    /**
     * 72. [不可空] 本次访视日期
     */
    private Date followupDate;

    /**
     * 73. [可空] 访视医生编码
     */
    private String followupDrCode;

    /**
     * 74. [不可空] 访视医生姓名
     */
    private String followupDrName;

    /**
     * 75. [可空] 随访机构编码
     */
    private String followUpOrgCode;

    /**
     * 76. [可空] 随访机构名称
     */
    private String followUpOrgName;

    /**
     * 77. [可空] 下次随访地点
     */
    private String nextFollowupPlace;

    /**
     * 78. [可空] 下次随访日期
     */
    private Date nextFollowupDate;

    /**
     * 79. [不可空] 登记时间
     */
    private Date entryDate;

    /**
     * 80. [可空] 登记人员编码
     */
    private String entryEmpCode;

    /**
     * 81. [不可空] 登记人员名称
     */
    private String entryEmpName;

    /**
     * 82. [不可空] 登记机构编码
     */
    private String entryOrgCode;

    /**
     * 83. [不可空] 登记机构名称
     */
    private String entryOrgName;

    /**
     * 84. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 85. [可空] 胸部
     */
    private String breastexam;

    /**
     * 86. [可空] 胸部异常描述
     */
    private String breastexam1;

    /**
     * [不可空] 填报日期
     */
    public java.util.Date uploadDate;

    /**
     * [可空] 更新日期
     */
    public java.util.Date modifydate;

    /**
     * 87.[不可空] 儿童健康专项信息
     */
    @ToOne
    private EhrChildrenInformation dto;

    /**
     * 88. [可空] 修改者
     */
    private String editor;

    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /**
     * Used for active entity operations.
     */
    @Generated(hash = 1533268698)
    private transient EhrChildrenFollowupDao myDao;

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
     * 93. [可空] 大便其他项
     */
    protected String defecateother;

    /**
     * 94. [可空] 其他指导
     */
    protected String guideother;

    protected String updateFlag;
    protected String fdataFrom;

    @Generated(hash = 2061574458)
    private transient boolean dto__refreshed;

    @Generated(hash = 484017047)
    public EhrChildrenFollowup(Long localId, String idCard, String vipCard, boolean upload, boolean completed, String title,
            String id, String childrenFollowupId, String childrenId, String healthfileNo, String fileNumber,
            String pregnantDiseaseCode, String pregnantDiseaseName, String bornOrgNo, String bornOrgName,
            String bornStateNo, String bornStateName, String childrenApnea, String apgarScoreType, String isDeformity,
            String deformityState, String childrenHearingCheck, String childrenDiseaseCheck,
            String childrenDiseaseOtherCheck, Double childrenWeight, Double childrenCurrentWeight, Double childrenHeight,
            String feedType, Double childrenSuckleAmount, Integer childrenSuckleTimes, String childrenVomit,
            String childrenStool, Integer childrenStoolTimes, Double childrenTemperaure, Integer childrenPulse,
            Integer childrenBreathe, String childrenFaceNo, String childrenFaceName, String childrenFaceOther,
            String childrenJaundicePosition, Double childrenBregmatic1, Double childrenBregmatic2,
            String childrenBregmaticNo, String childrenBregmaticName, String childrenEye, String childrenEyeEx,
            String childrenLimbs, String childrenLimbsEx, String childrenEar, String childrenEarEx, String childrenNeck,
            String childrenNeckEx, String childrenNose, String childrenNoseEx, String childrenSkinNo, String childrenSkinEx,
            String childrenMouth, String childrenMouthEx, String childrenAnus, String childrenAnusEx, String childrenHeart,
            String childrenHeartEx, String childrenGenitals, String childrenGenitalsEx, String childrenBelly,
            String childrenBellyEx, String childrenSpine, String childrenSpineEx, String childrenFunicleNo,
            String childrenFunicleName, String referralSign, String referralReason, String referralOrgCode,
            String referralOrgName, String referralDepCode, String referralDepName, String referralOrgDep,
            String childrenGuide, Date followupDate, String followupDrCode, String followupDrName, String followUpOrgCode,
            String followUpOrgName, String nextFollowupPlace, Date nextFollowupDate, Date entryDate, String entryEmpCode,
            String entryEmpName, String entryOrgCode, String entryOrgName, String orgCode, String breastexam,
            String breastexam1, java.util.Date uploadDate, java.util.Date modifydate, String editor, String editorId,
            String updateOrgId, String updateOrgName, String defecateother, String guideother, String updateFlag,
            String fdataFrom) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.childrenFollowupId = childrenFollowupId;
        this.childrenId = childrenId;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.pregnantDiseaseCode = pregnantDiseaseCode;
        this.pregnantDiseaseName = pregnantDiseaseName;
        this.bornOrgNo = bornOrgNo;
        this.bornOrgName = bornOrgName;
        this.bornStateNo = bornStateNo;
        this.bornStateName = bornStateName;
        this.childrenApnea = childrenApnea;
        this.apgarScoreType = apgarScoreType;
        this.isDeformity = isDeformity;
        this.deformityState = deformityState;
        this.childrenHearingCheck = childrenHearingCheck;
        this.childrenDiseaseCheck = childrenDiseaseCheck;
        this.childrenDiseaseOtherCheck = childrenDiseaseOtherCheck;
        this.childrenWeight = childrenWeight;
        this.childrenCurrentWeight = childrenCurrentWeight;
        this.childrenHeight = childrenHeight;
        this.feedType = feedType;
        this.childrenSuckleAmount = childrenSuckleAmount;
        this.childrenSuckleTimes = childrenSuckleTimes;
        this.childrenVomit = childrenVomit;
        this.childrenStool = childrenStool;
        this.childrenStoolTimes = childrenStoolTimes;
        this.childrenTemperaure = childrenTemperaure;
        this.childrenPulse = childrenPulse;
        this.childrenBreathe = childrenBreathe;
        this.childrenFaceNo = childrenFaceNo;
        this.childrenFaceName = childrenFaceName;
        this.childrenFaceOther = childrenFaceOther;
        this.childrenJaundicePosition = childrenJaundicePosition;
        this.childrenBregmatic1 = childrenBregmatic1;
        this.childrenBregmatic2 = childrenBregmatic2;
        this.childrenBregmaticNo = childrenBregmaticNo;
        this.childrenBregmaticName = childrenBregmaticName;
        this.childrenEye = childrenEye;
        this.childrenEyeEx = childrenEyeEx;
        this.childrenLimbs = childrenLimbs;
        this.childrenLimbsEx = childrenLimbsEx;
        this.childrenEar = childrenEar;
        this.childrenEarEx = childrenEarEx;
        this.childrenNeck = childrenNeck;
        this.childrenNeckEx = childrenNeckEx;
        this.childrenNose = childrenNose;
        this.childrenNoseEx = childrenNoseEx;
        this.childrenSkinNo = childrenSkinNo;
        this.childrenSkinEx = childrenSkinEx;
        this.childrenMouth = childrenMouth;
        this.childrenMouthEx = childrenMouthEx;
        this.childrenAnus = childrenAnus;
        this.childrenAnusEx = childrenAnusEx;
        this.childrenHeart = childrenHeart;
        this.childrenHeartEx = childrenHeartEx;
        this.childrenGenitals = childrenGenitals;
        this.childrenGenitalsEx = childrenGenitalsEx;
        this.childrenBelly = childrenBelly;
        this.childrenBellyEx = childrenBellyEx;
        this.childrenSpine = childrenSpine;
        this.childrenSpineEx = childrenSpineEx;
        this.childrenFunicleNo = childrenFunicleNo;
        this.childrenFunicleName = childrenFunicleName;
        this.referralSign = referralSign;
        this.referralReason = referralReason;
        this.referralOrgCode = referralOrgCode;
        this.referralOrgName = referralOrgName;
        this.referralDepCode = referralDepCode;
        this.referralDepName = referralDepName;
        this.referralOrgDep = referralOrgDep;
        this.childrenGuide = childrenGuide;
        this.followupDate = followupDate;
        this.followupDrCode = followupDrCode;
        this.followupDrName = followupDrName;
        this.followUpOrgCode = followUpOrgCode;
        this.followUpOrgName = followUpOrgName;
        this.nextFollowupPlace = nextFollowupPlace;
        this.nextFollowupDate = nextFollowupDate;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.breastexam = breastexam;
        this.breastexam1 = breastexam1;
        this.uploadDate = uploadDate;
        this.modifydate = modifydate;
        this.editor = editor;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.defecateother = defecateother;
        this.guideother = guideother;
        this.updateFlag = updateFlag;
        this.fdataFrom = fdataFrom;
    }

    @Generated(hash = 285434275)
    public EhrChildrenFollowup() {
    }

    public Long getLocalId() {
        return this.localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
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

    public boolean getUpload() {
        return this.upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChildrenFollowupId() {
        return this.childrenFollowupId;
    }

    public void setChildrenFollowupId(String childrenFollowupId) {
        this.childrenFollowupId = childrenFollowupId;
    }

    public String getChildrenId() {
        return this.childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId;
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

    public String getPregnantDiseaseCode() {
        return this.pregnantDiseaseCode;
    }

    public void setPregnantDiseaseCode(String pregnantDiseaseCode) {
        this.pregnantDiseaseCode = pregnantDiseaseCode;
    }

    public String getPregnantDiseaseName() {
        return this.pregnantDiseaseName;
    }

    public void setPregnantDiseaseName(String pregnantDiseaseName) {
        this.pregnantDiseaseName = pregnantDiseaseName;
    }

    public String getBornOrgNo() {
        return this.bornOrgNo;
    }

    public void setBornOrgNo(String bornOrgNo) {
        this.bornOrgNo = bornOrgNo;
    }

    public String getBornOrgName() {
        return this.bornOrgName;
    }

    public void setBornOrgName(String bornOrgName) {
        this.bornOrgName = bornOrgName;
    }

    public String getBornStateNo() {
        return this.bornStateNo;
    }

    public void setBornStateNo(String bornStateNo) {
        this.bornStateNo = bornStateNo;
    }

    public String getBornStateName() {
        return this.bornStateName;
    }

    public void setBornStateName(String bornStateName) {
        this.bornStateName = bornStateName;
    }

    public String getChildrenApnea() {
        return this.childrenApnea;
    }

    public void setChildrenApnea(String childrenApnea) {
        this.childrenApnea = childrenApnea;
    }

    public String getApgarScoreType() {
        return this.apgarScoreType;
    }

    public void setApgarScoreType(String apgarScoreType) {
        this.apgarScoreType = apgarScoreType;
    }

    public String getDeformityState() {
        return this.deformityState;
    }

    public void setDeformityState(String deformityState) {
        this.deformityState = deformityState;
    }

    public String getChildrenHearingCheck() {
        return this.childrenHearingCheck;
    }

    public void setChildrenHearingCheck(String childrenHearingCheck) {
        this.childrenHearingCheck = childrenHearingCheck;
    }

    public String getChildrenDiseaseCheck() {
        return this.childrenDiseaseCheck;
    }

    public void setChildrenDiseaseCheck(String childrenDiseaseCheck) {
        this.childrenDiseaseCheck = childrenDiseaseCheck;
    }

    public String getChildrenDiseaseOtherCheck() {
        return this.childrenDiseaseOtherCheck;
    }

    public void setChildrenDiseaseOtherCheck(String childrenDiseaseOtherCheck) {
        this.childrenDiseaseOtherCheck = childrenDiseaseOtherCheck;
    }

    public Double getChildrenWeight() {
        return this.childrenWeight;
    }

    public void setChildrenWeight(Double childrenWeight) {
        this.childrenWeight = childrenWeight;
    }

    public Double getChildrenCurrentWeight() {
        return this.childrenCurrentWeight;
    }

    public void setChildrenCurrentWeight(Double childrenCurrentWeight) {
        this.childrenCurrentWeight = childrenCurrentWeight;
    }

    public Double getChildrenHeight() {
        return this.childrenHeight;
    }

    public void setChildrenHeight(Double childrenHeight) {
        this.childrenHeight = childrenHeight;
    }

    public String getFeedType() {
        return this.feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public Double getChildrenSuckleAmount() {
        return this.childrenSuckleAmount;
    }

    public void setChildrenSuckleAmount(Double childrenSuckleAmount) {
        this.childrenSuckleAmount = childrenSuckleAmount;
    }

    public Integer getChildrenSuckleTimes() {
        return this.childrenSuckleTimes;
    }

    public void setChildrenSuckleTimes(Integer childrenSuckleTimes) {
        this.childrenSuckleTimes = childrenSuckleTimes;
    }

    public String getChildrenVomit() {
        return this.childrenVomit;
    }

    public void setChildrenVomit(String childrenVomit) {
        this.childrenVomit = childrenVomit;
    }

    public String getChildrenStool() {
        return this.childrenStool;
    }

    public void setChildrenStool(String childrenStool) {
        this.childrenStool = childrenStool;
    }

    public Integer getChildrenStoolTimes() {
        return this.childrenStoolTimes;
    }

    public void setChildrenStoolTimes(Integer childrenStoolTimes) {
        this.childrenStoolTimes = childrenStoolTimes;
    }

    public Double getChildrenTemperaure() {
        return this.childrenTemperaure;
    }

    public void setChildrenTemperaure(Double childrenTemperaure) {
        this.childrenTemperaure = childrenTemperaure;
    }

    public Integer getChildrenPulse() {
        return this.childrenPulse;
    }

    public void setChildrenPulse(Integer childrenPulse) {
        this.childrenPulse = childrenPulse;
    }

    public Integer getChildrenBreathe() {
        return this.childrenBreathe;
    }

    public void setChildrenBreathe(Integer childrenBreathe) {
        this.childrenBreathe = childrenBreathe;
    }

    public String getChildrenFaceNo() {
        return this.childrenFaceNo;
    }

    public void setChildrenFaceNo(String childrenFaceNo) {
        this.childrenFaceNo = childrenFaceNo;
    }

    public String getChildrenFaceName() {
        return this.childrenFaceName;
    }

    public void setChildrenFaceName(String childrenFaceName) {
        this.childrenFaceName = childrenFaceName;
    }

    public String getChildrenFaceOther() {
        return this.childrenFaceOther;
    }

    public void setChildrenFaceOther(String childrenFaceOther) {
        this.childrenFaceOther = childrenFaceOther;
    }

    public String getChildrenJaundicePosition() {
        return this.childrenJaundicePosition;
    }

    public void setChildrenJaundicePosition(String childrenJaundicePosition) {
        this.childrenJaundicePosition = childrenJaundicePosition;
    }

    public Double getChildrenBregmatic1() {
        return this.childrenBregmatic1;
    }

    public void setChildrenBregmatic1(Double childrenBregmatic1) {
        this.childrenBregmatic1 = childrenBregmatic1;
    }

    public Double getChildrenBregmatic2() {
        return this.childrenBregmatic2;
    }

    public void setChildrenBregmatic2(Double childrenBregmatic2) {
        this.childrenBregmatic2 = childrenBregmatic2;
    }

    public String getChildrenBregmaticNo() {
        return this.childrenBregmaticNo;
    }

    public void setChildrenBregmaticNo(String childrenBregmaticNo) {
        this.childrenBregmaticNo = childrenBregmaticNo;
    }

    public String getChildrenBregmaticName() {
        return this.childrenBregmaticName;
    }

    public void setChildrenBregmaticName(String childrenBregmaticName) {
        this.childrenBregmaticName = childrenBregmaticName;
    }

    public String getChildrenEye() {
        return this.childrenEye;
    }

    public void setChildrenEye(String childrenEye) {
        this.childrenEye = childrenEye;
    }

    public String getChildrenEyeEx() {
        return this.childrenEyeEx;
    }

    public void setChildrenEyeEx(String childrenEyeEx) {
        this.childrenEyeEx = childrenEyeEx;
    }

    public String getChildrenLimbs() {
        return this.childrenLimbs;
    }

    public void setChildrenLimbs(String childrenLimbs) {
        this.childrenLimbs = childrenLimbs;
    }

    public String getChildrenLimbsEx() {
        return this.childrenLimbsEx;
    }

    public void setChildrenLimbsEx(String childrenLimbsEx) {
        this.childrenLimbsEx = childrenLimbsEx;
    }

    public String getChildrenEar() {
        return this.childrenEar;
    }

    public void setChildrenEar(String childrenEar) {
        this.childrenEar = childrenEar;
    }

    public String getChildrenEarEx() {
        return this.childrenEarEx;
    }

    public void setChildrenEarEx(String childrenEarEx) {
        this.childrenEarEx = childrenEarEx;
    }

    public String getChildrenNeck() {
        return this.childrenNeck;
    }

    public void setChildrenNeck(String childrenNeck) {
        this.childrenNeck = childrenNeck;
    }

    public String getChildrenNeckEx() {
        return this.childrenNeckEx;
    }

    public void setChildrenNeckEx(String childrenNeckEx) {
        this.childrenNeckEx = childrenNeckEx;
    }

    public String getChildrenNose() {
        return this.childrenNose;
    }

    public void setChildrenNose(String childrenNose) {
        this.childrenNose = childrenNose;
    }

    public String getChildrenNoseEx() {
        return this.childrenNoseEx;
    }

    public void setChildrenNoseEx(String childrenNoseEx) {
        this.childrenNoseEx = childrenNoseEx;
    }

    public String getChildrenSkinNo() {
        return this.childrenSkinNo;
    }

    public void setChildrenSkinNo(String childrenSkinNo) {
        this.childrenSkinNo = childrenSkinNo;
    }

    public String getChildrenSkinEx() {
        return this.childrenSkinEx;
    }

    public void setChildrenSkinEx(String childrenSkinEx) {
        this.childrenSkinEx = childrenSkinEx;
    }

    public String getChildrenMouth() {
        return this.childrenMouth;
    }

    public void setChildrenMouth(String childrenMouth) {
        this.childrenMouth = childrenMouth;
    }

    public String getChildrenMouthEx() {
        return this.childrenMouthEx;
    }

    public void setChildrenMouthEx(String childrenMouthEx) {
        this.childrenMouthEx = childrenMouthEx;
    }

    public String getChildrenAnus() {
        return this.childrenAnus;
    }

    public void setChildrenAnus(String childrenAnus) {
        this.childrenAnus = childrenAnus;
    }

    public String getChildrenAnusEx() {
        return this.childrenAnusEx;
    }

    public void setChildrenAnusEx(String childrenAnusEx) {
        this.childrenAnusEx = childrenAnusEx;
    }

    public String getChildrenHeart() {
        return this.childrenHeart;
    }

    public void setChildrenHeart(String childrenHeart) {
        this.childrenHeart = childrenHeart;
    }

    public String getChildrenHeartEx() {
        return this.childrenHeartEx;
    }

    public void setChildrenHeartEx(String childrenHeartEx) {
        this.childrenHeartEx = childrenHeartEx;
    }

    public String getChildrenGenitals() {
        return this.childrenGenitals;
    }

    public void setChildrenGenitals(String childrenGenitals) {
        this.childrenGenitals = childrenGenitals;
    }

    public String getChildrenGenitalsEx() {
        return this.childrenGenitalsEx;
    }

    public void setChildrenGenitalsEx(String childrenGenitalsEx) {
        this.childrenGenitalsEx = childrenGenitalsEx;
    }

    public String getChildrenBelly() {
        return this.childrenBelly;
    }

    public void setChildrenBelly(String childrenBelly) {
        this.childrenBelly = childrenBelly;
    }

    public String getChildrenBellyEx() {
        return this.childrenBellyEx;
    }

    public void setChildrenBellyEx(String childrenBellyEx) {
        this.childrenBellyEx = childrenBellyEx;
    }

    public String getChildrenSpine() {
        return this.childrenSpine;
    }

    public void setChildrenSpine(String childrenSpine) {
        this.childrenSpine = childrenSpine;
    }

    public String getChildrenSpineEx() {
        return this.childrenSpineEx;
    }

    public void setChildrenSpineEx(String childrenSpineEx) {
        this.childrenSpineEx = childrenSpineEx;
    }

    public String getChildrenFunicleNo() {
        return this.childrenFunicleNo;
    }

    public void setChildrenFunicleNo(String childrenFunicleNo) {
        this.childrenFunicleNo = childrenFunicleNo;
    }

    public String getChildrenFunicleName() {
        return this.childrenFunicleName;
    }

    public void setChildrenFunicleName(String childrenFunicleName) {
        this.childrenFunicleName = childrenFunicleName;
    }

    public String getReferralSign() {
        return this.referralSign;
    }

    public void setReferralSign(String referralSign) {
        this.referralSign = referralSign;
    }

    public String getReferralReason() {
        return this.referralReason;
    }

    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    public String getReferralOrgCode() {
        return this.referralOrgCode;
    }

    public void setReferralOrgCode(String referralOrgCode) {
        this.referralOrgCode = referralOrgCode;
    }

    public String getReferralOrgName() {
        return this.referralOrgName;
    }

    public void setReferralOrgName(String referralOrgName) {
        this.referralOrgName = referralOrgName;
    }

    public String getReferralDepCode() {
        return this.referralDepCode;
    }

    public void setReferralDepCode(String referralDepCode) {
        this.referralDepCode = referralDepCode;
    }

    public String getReferralDepName() {
        return this.referralDepName;
    }

    public void setReferralDepName(String referralDepName) {
        this.referralDepName = referralDepName;
    }

    public String getReferralOrgDep() {
        return this.referralOrgDep;
    }

    public void setReferralOrgDep(String referralOrgDep) {
        this.referralOrgDep = referralOrgDep;
    }

    public String getChildrenGuide() {
        return this.childrenGuide;
    }

    public void setChildrenGuide(String childrenGuide) {
        this.childrenGuide = childrenGuide;
    }

    public Date getFollowupDate() {
        return this.followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    public String getFollowupDrCode() {
        return this.followupDrCode;
    }

    public void setFollowupDrCode(String followupDrCode) {
        this.followupDrCode = followupDrCode;
    }

    public String getFollowupDrName() {
        return this.followupDrName;
    }

    public void setFollowupDrName(String followupDrName) {
        this.followupDrName = followupDrName;
    }

    public String getFollowUpOrgCode() {
        return this.followUpOrgCode;
    }

    public void setFollowUpOrgCode(String followUpOrgCode) {
        this.followUpOrgCode = followUpOrgCode;
    }

    public String getFollowUpOrgName() {
        return this.followUpOrgName;
    }

    public void setFollowUpOrgName(String followUpOrgName) {
        this.followUpOrgName = followUpOrgName;
    }

    public String getNextFollowupPlace() {
        return this.nextFollowupPlace;
    }

    public void setNextFollowupPlace(String nextFollowupPlace) {
        this.nextFollowupPlace = nextFollowupPlace;
    }

    public Date getNextFollowupDate() {
        return this.nextFollowupDate;
    }

    public void setNextFollowupDate(Date nextFollowupDate) {
        this.nextFollowupDate = nextFollowupDate;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
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

    public String getBreastexam() {
        return this.breastexam;
    }

    public void setBreastexam(String breastexam) {
        this.breastexam = breastexam;
    }

    public String getBreastexam1() {
        return this.breastexam1;
    }

    public void setBreastexam1(String breastexam1) {
        this.breastexam1 = breastexam1;
    }


    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * To-one relationship, resolved on first access.
     */
    @Generated(hash = 1035284918)
    public EhrChildrenInformation getDto() {
        if (dto != null || !dto__refreshed) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            EhrChildrenInformationDao targetDao = daoSession
                    .getEhrChildrenInformationDao();
            targetDao.refresh(dto);
            dto__refreshed = true;
        }
        return dto;
    }

    /**
     * To-one relationship, returned entity is not refreshed and may carry only the PK property.
     */
    @Generated(hash = 293926685)
    public EhrChildrenInformation peakDto() {
        return dto;
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 2145812661)
    public void setDto(EhrChildrenInformation dto) {
        synchronized (this) {
            this.dto = dto;
            dto__refreshed = true;
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
    @Generated(hash = 620572408)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getEhrChildrenFollowupDao() : null;
    }

    public String getIsDeformity() {
        return this.isDeformity;
    }

    public void setIsDeformity(String isDeformity) {
        this.isDeformity = isDeformity;
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

    public String getDefecateother() {
        return this.defecateother;
    }

    public void setDefecateother(String defecateother) {
        this.defecateother = defecateother;
    }

    public String getGuideother() {
        return this.guideother;
    }

    public void setGuideother(String guideother) {
        this.guideother = guideother;
    }

    public String getUpdateFlag() {
        return this.updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }


}
