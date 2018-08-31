package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

import org.greenrobot.greendao.annotation.Generated;

/**
 * 1-8个月；12-30个月；3-6岁
 * 儿童健康检查记录类。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String childrenExamId 儿童健康检查ID
 * 2. [不可空] String childrenId 儿童基本信息ID
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [不可空] String ageType 月（年）龄类别
 * 6. [可空] Integer age 月（年）龄
 * 7. [不可空] java.util.Date followupDate 随访日期
 * 8. [可空] Double childrenWeight 体重
 * 9. [可空] String childrenAppraise 体重评价
 * 10. [可空] Double childrenHeight 身长
 * 11. [可空] String childrenHeightAppraise 身长评价
 * 12. [可空] String childrenBodyAppraise 体格发育评价
 * 13. [可空] Double childrenHeadRound 头围
 * 14. [可空] String childrenFaceNo 面色
 * 15. [可空] String childrenSkin 皮肤
 * 16. [可空] String childrenBregmaticClose 前囟闭合
 * 17. [可空] Double childrenBregmatic1 前囟1(cm)
 * 18. [可空] Double childrenBregmatic2 前囟2(cm)
 * 19. [可空] String childrenNeck 颈部包块
 * 20. [可空] String childrenEye 眼外观
 * 21. [可空] String childrenEar 耳外观
 * 22. [可空] String childrenHearing 听力
 * 23. [可空] String childrenChildrenMouth 口腔
 * 24. [可空] Integer childrenTooth 口腔出牙数
 * 25. [可空] Integer childrenToothDecay 龋齿数
 * 26. [可空] String childrenHeart 心肺
 * 27. [可空] String childrenBelly 腹部
 * 28. [可空] String childrenFunicle 脐部
 * 29. [可空] String childrenLimbs 四肢
 * 30. [可空] String childrenStepState 步态
 * 31. [可空] String childrenRicketsSymptom 可疑佝偻病症状
 * 32. [可空] String childrenRicketsSign 可疑佝偻病体征
 * 33. [可空] String childrenAnus 肛门/外生殖器
 * 34. [可空] Double childrenHemoglobin 血红蛋白值
 * 35. [可空] Double childrenOutsideActivity 户外活动
 * 36. [可空] Double childrenVitamin 服用维生素D
 * 37. [可空] String childrenGrowthAppraise 发育评估
 * 38. [可空] String diseasingWhenFollowup 两次随访间患病情况
 * 39. [可空] Integer pneumoniaTimes 患肺炎次数
 * 40. [可空] Integer diarrheaTimes 患腹泻次数
 * 41. [可空] Integer injuryTimes 患外伤次数
 * 42. [可空] String diseaseOther 患病其他
 * 43. [可空] String childrenOther 其他
 * 44. [可空] String referralSign 转诊建议
 * 45. [可空] String referralReason 转诊原因
 * 46. [可空] String referralOrgCode 转诊机构编码
 * 47. [可空] String referralOrgName 转诊机构名称
 * 48. [可空] String referralDepCode 转诊科室编码
 * 49. [可空] String referralDepName 转诊科室名称
 * 50. [可空] String referralOrgDep 转诊机构及科室
 * 51. [可空] String childrenGuideCode 指导代码
 * 52. [可空] String childrenGuideOther 其它指导建议
 * 53. [可空] java.util.Date nextFollowupDate 下次随访日期
 * 54. [可空] String followupDrCode 随访医生编码
 * 55. [可空] String followupDrName 随访医生姓名
 * 56. [可空] String followUpOrgCode 随访机构编码
 * 57. [可空] String followUpOrgName 随访机构名称
 * 58. [可空] java.util.Date entryDate 登记时间（系统）
 * 59. [不可空] String entryEmpCode 登记人员编码
 * 60. [不可空] String entryEmpName 登记人员名称
 * 61. [不可空] String entryOrgCode 登记机构编码
 * 62. [不可空] String entryOrgName 登记机构名称
 * 63. [不可空] String orgCode 医疗机构代码
 * 64. [不可空] java.util.Date uploadDate 填报日期
 * 65. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 66. [主键] String id 主键
 * 67. [可空] String editor 修改人
 * 68. [可空] java.util.Date modifydate 更新日期
 * 69. [不可空] String fdataFrom 数据来源
 * 70. [可空] String leftEyrsight 左眼视力
 * 71. [可空] String rightEyrsight 右眼视力
 */
@Entity
public class EhrChildrenExam extends BaseChildBean {
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

    public String title; //标题

    private String id;
    /**
     * 1. [不可空] 儿童健康检查ID
     */
    protected String childrenExamId;

    /**
     * 2. [不可空] 儿童基本信息ID
     */
    protected String childrenId;

    /**
     * 3. [不可空] 个人健康档案编码
     */
    protected String healthfileNo;

    /**
     * 4. [可空] 基本信息档案号
     */
    protected String fileNumber;

    /**
     * 5. [不可空] 月（年）龄类别
     */
    protected String ageType;

    /**
     * 6. [可空] 月（年）龄
     */
    protected Integer age;

    /**
     * 7. [不可空] 随访日期
     */
    protected Date followupDate;

    /**
     * 8. [可空] 体重
     */
    protected Double childrenWeight;

    /**
     * 9. [可空] 体重评价
     */
    protected String childrenAppraise;

    /**
     * 10. [可空] 身长
     */
    protected Double childrenHeight;

    /**
     * 11. [可空] 身长评价
     */
    protected String childrenHeightAppraise;

    /**
     * 12. [可空] 体格发育评价
     */
    protected String childrenBodyAppraise;

    /**
     * 13. [可空] 头围
     */
    protected Double childrenHeadRound;

    /**
     * 14. [可空] 面色
     */
    protected String childrenFaceNo;

    /**
     * 15. [可空] 皮肤
     */
    protected String childrenSkin;

    /**
     * 16. [可空] 前囟闭合
     */
    protected String childrenBregmaticClose;

    /**
     * 17. [可空] 前囟1(cm)
     */
    protected Double childrenBregmatic1;

    /**
     * 18. [可空] 前囟2(cm)
     */
    protected Double childrenBregmatic2;

    /**
     * 19. [可空] 颈部包块
     */
    protected String childrenNeck;

    /**
     * 20. [可空] 眼外观
     */
    protected String childrenEye;

    /**
     * 21. [可空] 耳外观
     */
    protected String childrenEar;

    /**
     * 22. [可空] 听力
     */
    protected String childrenHearing;

    /**
     * 23. [可空] 口腔
     */
    protected String childrenMouth;

    /**
     * 24. [可空] 口腔出牙数
     */
    protected Integer childrenTooth;

    /**
     * 25. [可空] 龋齿数
     */
    protected Integer childrenToothDecay;

    /**
     * 26. [可空] 心肺
     */
    protected String childrenHeart;

    /**
     * 27. [可空] 腹部
     */
    protected String childrenBelly;

    /**
     * 28. [可空] 脐部
     */
    protected String childrenFunicle;


    /**
     * 87. [可空] 脐部异常描述
     */
    protected String childrenFunicleEx;

    /**
     * 29. [可空] 四肢
     */
    protected String childrenLimbs;

    /**
     * 30. [可空] 步态
     */
    protected String childrenStepState;

    /**
     * 88. [可空] 步态异常描述
     */
    protected String childrenStepStateEx;

    /**
     * 31. [可空] 可疑佝偻病症状
     */
    protected String childrenRicketsSymptom;

    /**
     * 32. [可空] 可疑佝偻病体征
     */
    protected String childrenRicketsSign;

    /**
     * 33. [可空] 肛门/外生殖器
     */
    protected String childrenAnus;

    /**
     * 34. [可空] 血红蛋白值
     */
    protected Double childrenHemoglobin;

    /**
     * 35. [可空] 户外活动
     */
    protected Double childrenOutsideActivity;

    /**
     * 36. [可空] 服用维生素D
     */
    protected Double childrenVitamin;

    /**
     * 37. [可空] 发育评估
     */
    protected String childrenGrowthAppraise;

    /**
     * 38. [可空] 两次随访间患病情况
     */
    protected String diseasingWhenFollowup;

    /**
     * 39. [可空] 患肺炎次数
     */
    protected Integer pneumoniaTimes;

    /**
     * 40. [可空] 患腹泻次数
     */
    protected Integer diarrheaTimes;

    /**
     * 41. [可空] 患外伤次数
     */
    protected Integer injuryTimes;

    /**
     * 42. [可空] 患病其他
     */
    protected String diseaseOther;

    /**
     * 43. [可空] 其他
     */
    protected String childrenOther;

    /**
     * 44. [可空] 转诊建议
     */
    protected String referralSign;

    /**
     * 45. [可空] 转诊原因
     */
    protected String referralReason;

    /**
     * 46. [可空] 转诊机构编码
     */
    protected String referralOrgCode;

    /**
     * 47. [可空] 转诊机构名称
     */
    protected String referralOrgName;

    /**
     * 48. [可空] 转诊科室编码
     */
    protected String referralDepCode;

    /**
     * 49. [可空] 转诊科室名称
     */
    protected String referralDepName;

    /**
     * 50. [可空] 转诊机构及科室
     */
    protected String referralOrgDep;

    /**
     * 51. [可空] 指导代码
     */
    protected String childrenGuideCode;

    /**
     * 52. [可空] 其它指导建议
     */
    protected String childrenGuideOther;

    /**
     * 53. [可空] 下次随访日期
     */
    protected Date nextFollowupDate;

    /**
     * 54. [可空] 随访医生编码
     */
    protected String followupDrCode;

    /**
     * 55. [可空] 随访医生姓名
     */
    protected String followupDrName;

    /**
     * 56. [可空] 随访机构编码
     */
    protected String followUpOrgCode;

    /**
     * 57. [可空] 随访机构名称
     */
    protected String followUpOrgName;


    /**
     * 58. [可空] 登记时间（系统）
     */
    protected Date entryDate;

    /**
     * 59. [不可空] 登记人员编码
     */
    protected String entryEmpCode;

    /**
     * 60. [不可空] 登记人员名称
     */
    protected String entryEmpName;

    /**
     * 61. [不可空] 登记机构编码
     */
    protected String entryOrgCode;

    /**
     * 62. [不可空] 登记机构名称
     */
    protected String entryOrgName;

    /**
     * 63. [不可空] 医疗机构代码
     */
    protected String orgCode;

    /**
     * 64. [可空] 修改人
     */
    protected String editor;

    /**
     * 65. [可空] 眼外观异常描述
     */
    protected String childrenEyeEx;

    /**
     * 66. [可空] 外生殖器异常描述
     */
    protected String childrenGenitalsEx;

    /**
     * 67. [可空] 四肢活动度异常描述
     */
    protected String childrenLimbsEx;

    /**
     * 68. [可空] 耳外观异常描述
     */
    protected String childrenEarEx;

    /**
     * 69. [可空] 颈部包块异常描述
     */
    protected String childrenNeckEx;

    /**
     * 70. [可空] 皮肤异常描述
     */
    protected String childrenSkinEx;

    /**
     * 71. [可空] 口腔异常描述
     */
    protected String childrenMouthEx;

    /**
     * 72. [可空] 肛门异常描述
     */
    protected String childrenAnusEx;

    /**
     * 73. [可空] 腹部触诊异常描述
     */
    protected String childrenBellyEx;

    /**
     * 74. [可空] 脊柱异常描述
     */
    protected String childrenSpineEx;

    /**
     * 75. [可空] 心肺听诊异常描述
     */
    protected String childrenHeartEx;

    /**
     * 76. [可空] 胸部
     */
    protected String breastexam;

    /**
     * 77. [可空] 胸部异常
     */
    protected String breastexam1;

    /**
     * 78. [可空] 体重/身高
     */
    protected Double weightHeight;

    /**
     * 79. [可空] 体重/身高 评价
     */
    protected String weightHeightAppraise;

    /**
     * 80. [可空] 左眼视力
     */
    protected Double leftEyrsight;

    /**
     * 81. [可空] 右眼视力
     */
    protected Double rightEyrsight;

    /**
     * [不可空] 填报日期
     */
    public java.util.Date uploadDate;

    /**
     * [可空] 更新日期
     */
    public java.util.Date modifydate;

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

    private String updateFlag;
    
    private String fdataFrom;

    @Generated(hash = 1078401736)
    public EhrChildrenExam(Long localId, String idCard, String vipCard, boolean upload, boolean completed, String title,
            String id, String childrenExamId, String childrenId, String healthfileNo, String fileNumber, String ageType,
            Integer age, Date followupDate, Double childrenWeight, String childrenAppraise, Double childrenHeight,
            String childrenHeightAppraise, String childrenBodyAppraise, Double childrenHeadRound, String childrenFaceNo,
            String childrenSkin, String childrenBregmaticClose, Double childrenBregmatic1, Double childrenBregmatic2,
            String childrenNeck, String childrenEye, String childrenEar, String childrenHearing, String childrenMouth,
            Integer childrenTooth, Integer childrenToothDecay, String childrenHeart, String childrenBelly,
            String childrenFunicle, String childrenFunicleEx, String childrenLimbs, String childrenStepState,
            String childrenStepStateEx, String childrenRicketsSymptom, String childrenRicketsSign, String childrenAnus,
            Double childrenHemoglobin, Double childrenOutsideActivity, Double childrenVitamin,
            String childrenGrowthAppraise, String diseasingWhenFollowup, Integer pneumoniaTimes, Integer diarrheaTimes,
            Integer injuryTimes, String diseaseOther, String childrenOther, String referralSign, String referralReason,
            String referralOrgCode, String referralOrgName, String referralDepCode, String referralDepName,
            String referralOrgDep, String childrenGuideCode, String childrenGuideOther, Date nextFollowupDate,
            String followupDrCode, String followupDrName, String followUpOrgCode, String followUpOrgName, Date entryDate,
            String entryEmpCode, String entryEmpName, String entryOrgCode, String entryOrgName, String orgCode,
            String editor, String childrenEyeEx, String childrenGenitalsEx, String childrenLimbsEx, String childrenEarEx,
            String childrenNeckEx, String childrenSkinEx, String childrenMouthEx, String childrenAnusEx,
            String childrenBellyEx, String childrenSpineEx, String childrenHeartEx, String breastexam, String breastexam1,
            Double weightHeight, String weightHeightAppraise, Double leftEyrsight, Double rightEyrsight,
            java.util.Date uploadDate, java.util.Date modifydate, String editorId, String updateOrgId, String updateOrgName,
            String updateFlag, String fdataFrom) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.childrenExamId = childrenExamId;
        this.childrenId = childrenId;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.ageType = ageType;
        this.age = age;
        this.followupDate = followupDate;
        this.childrenWeight = childrenWeight;
        this.childrenAppraise = childrenAppraise;
        this.childrenHeight = childrenHeight;
        this.childrenHeightAppraise = childrenHeightAppraise;
        this.childrenBodyAppraise = childrenBodyAppraise;
        this.childrenHeadRound = childrenHeadRound;
        this.childrenFaceNo = childrenFaceNo;
        this.childrenSkin = childrenSkin;
        this.childrenBregmaticClose = childrenBregmaticClose;
        this.childrenBregmatic1 = childrenBregmatic1;
        this.childrenBregmatic2 = childrenBregmatic2;
        this.childrenNeck = childrenNeck;
        this.childrenEye = childrenEye;
        this.childrenEar = childrenEar;
        this.childrenHearing = childrenHearing;
        this.childrenMouth = childrenMouth;
        this.childrenTooth = childrenTooth;
        this.childrenToothDecay = childrenToothDecay;
        this.childrenHeart = childrenHeart;
        this.childrenBelly = childrenBelly;
        this.childrenFunicle = childrenFunicle;
        this.childrenFunicleEx = childrenFunicleEx;
        this.childrenLimbs = childrenLimbs;
        this.childrenStepState = childrenStepState;
        this.childrenStepStateEx = childrenStepStateEx;
        this.childrenRicketsSymptom = childrenRicketsSymptom;
        this.childrenRicketsSign = childrenRicketsSign;
        this.childrenAnus = childrenAnus;
        this.childrenHemoglobin = childrenHemoglobin;
        this.childrenOutsideActivity = childrenOutsideActivity;
        this.childrenVitamin = childrenVitamin;
        this.childrenGrowthAppraise = childrenGrowthAppraise;
        this.diseasingWhenFollowup = diseasingWhenFollowup;
        this.pneumoniaTimes = pneumoniaTimes;
        this.diarrheaTimes = diarrheaTimes;
        this.injuryTimes = injuryTimes;
        this.diseaseOther = diseaseOther;
        this.childrenOther = childrenOther;
        this.referralSign = referralSign;
        this.referralReason = referralReason;
        this.referralOrgCode = referralOrgCode;
        this.referralOrgName = referralOrgName;
        this.referralDepCode = referralDepCode;
        this.referralDepName = referralDepName;
        this.referralOrgDep = referralOrgDep;
        this.childrenGuideCode = childrenGuideCode;
        this.childrenGuideOther = childrenGuideOther;
        this.nextFollowupDate = nextFollowupDate;
        this.followupDrCode = followupDrCode;
        this.followupDrName = followupDrName;
        this.followUpOrgCode = followUpOrgCode;
        this.followUpOrgName = followUpOrgName;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.editor = editor;
        this.childrenEyeEx = childrenEyeEx;
        this.childrenGenitalsEx = childrenGenitalsEx;
        this.childrenLimbsEx = childrenLimbsEx;
        this.childrenEarEx = childrenEarEx;
        this.childrenNeckEx = childrenNeckEx;
        this.childrenSkinEx = childrenSkinEx;
        this.childrenMouthEx = childrenMouthEx;
        this.childrenAnusEx = childrenAnusEx;
        this.childrenBellyEx = childrenBellyEx;
        this.childrenSpineEx = childrenSpineEx;
        this.childrenHeartEx = childrenHeartEx;
        this.breastexam = breastexam;
        this.breastexam1 = breastexam1;
        this.weightHeight = weightHeight;
        this.weightHeightAppraise = weightHeightAppraise;
        this.leftEyrsight = leftEyrsight;
        this.rightEyrsight = rightEyrsight;
        this.uploadDate = uploadDate;
        this.modifydate = modifydate;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.updateFlag = updateFlag;
        this.fdataFrom = fdataFrom;
    }

    @Generated(hash = 202045055)
    public EhrChildrenExam() {
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

    public String getChildrenExamId() {
        return this.childrenExamId;
    }

    public void setChildrenExamId(String childrenExamId) {
        this.childrenExamId = childrenExamId;
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

    public String getAgeType() {
        return this.ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getFollowupDate() {
        return this.followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    public Double getChildrenWeight() {
        return this.childrenWeight;
    }

    public void setChildrenWeight(Double childrenWeight) {
        this.childrenWeight = childrenWeight;
    }

    public String getChildrenAppraise() {
        return this.childrenAppraise;
    }

    public void setChildrenAppraise(String childrenAppraise) {
        this.childrenAppraise = childrenAppraise;
    }

    public Double getChildrenHeight() {
        return this.childrenHeight;
    }

    public void setChildrenHeight(Double childrenHeight) {
        this.childrenHeight = childrenHeight;
    }

    public String getChildrenHeightAppraise() {
        return this.childrenHeightAppraise;
    }

    public void setChildrenHeightAppraise(String childrenHeightAppraise) {
        this.childrenHeightAppraise = childrenHeightAppraise;
    }

    public String getChildrenBodyAppraise() {
        return this.childrenBodyAppraise;
    }

    public void setChildrenBodyAppraise(String childrenBodyAppraise) {
        this.childrenBodyAppraise = childrenBodyAppraise;
    }

    public Double getChildrenHeadRound() {
        return this.childrenHeadRound;
    }

    public void setChildrenHeadRound(Double childrenHeadRound) {
        this.childrenHeadRound = childrenHeadRound;
    }

    public String getChildrenFaceNo() {
        return this.childrenFaceNo;
    }

    public void setChildrenFaceNo(String childrenFaceNo) {
        this.childrenFaceNo = childrenFaceNo;
    }

    public String getChildrenSkin() {
        return this.childrenSkin;
    }

    public void setChildrenSkin(String childrenSkin) {
        this.childrenSkin = childrenSkin;
    }

    public String getChildrenBregmaticClose() {
        return this.childrenBregmaticClose;
    }

    public void setChildrenBregmaticClose(String childrenBregmaticClose) {
        this.childrenBregmaticClose = childrenBregmaticClose;
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

    public String getChildrenNeck() {
        return this.childrenNeck;
    }

    public void setChildrenNeck(String childrenNeck) {
        this.childrenNeck = childrenNeck;
    }

    public String getChildrenEye() {
        return this.childrenEye;
    }

    public void setChildrenEye(String childrenEye) {
        this.childrenEye = childrenEye;
    }

    public String getChildrenEar() {
        return this.childrenEar;
    }

    public void setChildrenEar(String childrenEar) {
        this.childrenEar = childrenEar;
    }

    public String getChildrenHearing() {
        return this.childrenHearing;
    }

    public void setChildrenHearing(String childrenHearing) {
        this.childrenHearing = childrenHearing;
    }

    public String getChildrenMouth() {
        return this.childrenMouth;
    }

    public void setChildrenMouth(String childrenMouth) {
        this.childrenMouth = childrenMouth;
    }

    public Integer getChildrenTooth() {
        return this.childrenTooth;
    }

    public void setChildrenTooth(Integer childrenTooth) {
        this.childrenTooth = childrenTooth;
    }

    public Integer getChildrenToothDecay() {
        return this.childrenToothDecay;
    }

    public void setChildrenToothDecay(Integer childrenToothDecay) {
        this.childrenToothDecay = childrenToothDecay;
    }

    public String getChildrenHeart() {
        return this.childrenHeart;
    }

    public void setChildrenHeart(String childrenHeart) {
        this.childrenHeart = childrenHeart;
    }

    public String getChildrenBelly() {
        return this.childrenBelly;
    }

    public void setChildrenBelly(String childrenBelly) {
        this.childrenBelly = childrenBelly;
    }

    public String getChildrenFunicle() {
        return this.childrenFunicle;
    }

    public void setChildrenFunicle(String childrenFunicle) {
        this.childrenFunicle = childrenFunicle;
    }

    public String getChildrenLimbs() {
        return this.childrenLimbs;
    }

    public void setChildrenLimbs(String childrenLimbs) {
        this.childrenLimbs = childrenLimbs;
    }

    public String getChildrenStepState() {
        return this.childrenStepState;
    }

    public void setChildrenStepState(String childrenStepState) {
        this.childrenStepState = childrenStepState;
    }

    public String getChildrenRicketsSymptom() {
        return this.childrenRicketsSymptom;
    }

    public void setChildrenRicketsSymptom(String childrenRicketsSymptom) {
        this.childrenRicketsSymptom = childrenRicketsSymptom;
    }

    public String getChildrenRicketsSign() {
        return this.childrenRicketsSign;
    }

    public void setChildrenRicketsSign(String childrenRicketsSign) {
        this.childrenRicketsSign = childrenRicketsSign;
    }

    public String getChildrenAnus() {
        return this.childrenAnus;
    }

    public void setChildrenAnus(String childrenAnus) {
        this.childrenAnus = childrenAnus;
    }

    public Double getChildrenHemoglobin() {
        return this.childrenHemoglobin;
    }

    public void setChildrenHemoglobin(Double childrenHemoglobin) {
        this.childrenHemoglobin = childrenHemoglobin;
    }

    public Double getChildrenOutsideActivity() {
        return this.childrenOutsideActivity;
    }

    public void setChildrenOutsideActivity(Double childrenOutsideActivity) {
        this.childrenOutsideActivity = childrenOutsideActivity;
    }

    public Double getChildrenVitamin() {
        return this.childrenVitamin;
    }

    public void setChildrenVitamin(Double childrenVitamin) {
        this.childrenVitamin = childrenVitamin;
    }

    public String getChildrenGrowthAppraise() {
        return this.childrenGrowthAppraise;
    }

    public void setChildrenGrowthAppraise(String childrenGrowthAppraise) {
        this.childrenGrowthAppraise = childrenGrowthAppraise;
    }

    public String getDiseasingWhenFollowup() {
        return this.diseasingWhenFollowup;
    }

    public void setDiseasingWhenFollowup(String diseasingWhenFollowup) {
        this.diseasingWhenFollowup = diseasingWhenFollowup;
    }

    public Integer getPneumoniaTimes() {
        return this.pneumoniaTimes;
    }

    public void setPneumoniaTimes(Integer pneumoniaTimes) {
        this.pneumoniaTimes = pneumoniaTimes;
    }

    public Integer getDiarrheaTimes() {
        return this.diarrheaTimes;
    }

    public void setDiarrheaTimes(Integer diarrheaTimes) {
        this.diarrheaTimes = diarrheaTimes;
    }

    public Integer getInjuryTimes() {
        return this.injuryTimes;
    }

    public void setInjuryTimes(Integer injuryTimes) {
        this.injuryTimes = injuryTimes;
    }

    public String getDiseaseOther() {
        return this.diseaseOther;
    }

    public void setDiseaseOther(String diseaseOther) {
        this.diseaseOther = diseaseOther;
    }

    public String getChildrenOther() {
        return this.childrenOther;
    }

    public void setChildrenOther(String childrenOther) {
        this.childrenOther = childrenOther;
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

    public String getChildrenGuideCode() {
        return this.childrenGuideCode;
    }

    public void setChildrenGuideCode(String childrenGuideCode) {
        this.childrenGuideCode = childrenGuideCode;
    }

    public String getChildrenGuideOther() {
        return this.childrenGuideOther;
    }

    public void setChildrenGuideOther(String childrenGuideOther) {
        this.childrenGuideOther = childrenGuideOther;
    }

    public Date getNextFollowupDate() {
        return this.nextFollowupDate;
    }

    public void setNextFollowupDate(Date nextFollowupDate) {
        this.nextFollowupDate = nextFollowupDate;
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

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getChildrenEyeEx() {
        return this.childrenEyeEx;
    }

    public void setChildrenEyeEx(String childrenEyeEx) {
        this.childrenEyeEx = childrenEyeEx;
    }

    public String getChildrenGenitalsEx() {
        return this.childrenGenitalsEx;
    }

    public void setChildrenGenitalsEx(String childrenGenitalsEx) {
        this.childrenGenitalsEx = childrenGenitalsEx;
    }

    public String getChildrenLimbsEx() {
        return this.childrenLimbsEx;
    }

    public void setChildrenLimbsEx(String childrenLimbsEx) {
        this.childrenLimbsEx = childrenLimbsEx;
    }

    public String getChildrenEarEx() {
        return this.childrenEarEx;
    }

    public void setChildrenEarEx(String childrenEarEx) {
        this.childrenEarEx = childrenEarEx;
    }

    public String getChildrenNeckEx() {
        return this.childrenNeckEx;
    }

    public void setChildrenNeckEx(String childrenNeckEx) {
        this.childrenNeckEx = childrenNeckEx;
    }

    public String getChildrenSkinEx() {
        return this.childrenSkinEx;
    }

    public void setChildrenSkinEx(String childrenSkinEx) {
        this.childrenSkinEx = childrenSkinEx;
    }

    public String getChildrenMouthEx() {
        return this.childrenMouthEx;
    }

    public void setChildrenMouthEx(String childrenMouthEx) {
        this.childrenMouthEx = childrenMouthEx;
    }

    public String getChildrenAnusEx() {
        return this.childrenAnusEx;
    }

    public void setChildrenAnusEx(String childrenAnusEx) {
        this.childrenAnusEx = childrenAnusEx;
    }

    public String getChildrenBellyEx() {
        return this.childrenBellyEx;
    }

    public void setChildrenBellyEx(String childrenBellyEx) {
        this.childrenBellyEx = childrenBellyEx;
    }

    public String getChildrenSpineEx() {
        return this.childrenSpineEx;
    }

    public void setChildrenSpineEx(String childrenSpineEx) {
        this.childrenSpineEx = childrenSpineEx;
    }

    public String getChildrenHeartEx() {
        return this.childrenHeartEx;
    }

    public void setChildrenHeartEx(String childrenHeartEx) {
        this.childrenHeartEx = childrenHeartEx;
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

    public Double getWeightHeight() {
        return this.weightHeight;
    }

    public void setWeightHeight(Double weightHeight) {
        this.weightHeight = weightHeight;
    }

    public String getWeightHeightAppraise() {
        return this.weightHeightAppraise;
    }

    public void setWeightHeightAppraise(String weightHeightAppraise) {
        this.weightHeightAppraise = weightHeightAppraise;
    }

    public Double getLeftEyrsight() {
        return this.leftEyrsight;
    }

    public void setLeftEyrsight(Double leftEyrsight) {
        this.leftEyrsight = leftEyrsight;
    }

    public Double getRightEyrsight() {
        return this.rightEyrsight;
    }

    public void setRightEyrsight(Double rightEyrsight) {
        this.rightEyrsight = rightEyrsight;
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

    public String getChildrenFunicleEx() {
        return this.childrenFunicleEx;
    }

    public void setChildrenFunicleEx(String childrenFunicleEx) {
        this.childrenFunicleEx = childrenFunicleEx;
    }

    public String getChildrenStepStateEx() {
        return this.childrenStepStateEx;
    }

    public void setChildrenStepStateEx(String childrenStepStateEx) {
        this.childrenStepStateEx = childrenStepStateEx;
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
