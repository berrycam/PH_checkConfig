package com.konsung.bean.maternal;

import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 抽象 第1次产前随访记录类。本抽象类只定义基本字段，其它字段（包括实体字段、组件字段、以及组件里的子组件和实体字段）都在子类中定义。
 * <p>本类型用到的数据库表中的字段汇总如下：
 * <pre>
 * 1. [不可空] String followUpId 孕产妇随访编号
 * 2. [不可空] String mangementNo 孕卡编号
 * 3. [不可空] String healthfileNo 个人健康档案编码
 * 4. [可空] String fileNumber 基本信息档案号
 * 5. [可空] String diseaseshistoryCode 既往史代码
 * 6. [可空] String diseaseshistoryOther 其他既往史名称
 * 7. [可空] String familyhistoryCode 家族史代码
 * 8. [可空] String familyhistoryName 其他家族史名称
 * 9. [可空] String personalhistoryCode 个人史代码
 * 10. [可空] String personalhistoryName 其他个人史名称
 * 11. [可空] String gyneHistoryCode 妇科手术史代码
 * 12. [可空] String gyneHistoryName 妇科手术史描述
 * 13. [可空] String motherhoodHistoryCode 孕产史代码
 * 14. [可空] Integer abortionTimes 流产次数
 * 15. [可空] Integer stillbirthTimes 死胎次数
 * 16. [可空] Integer stillbirth 死产数
 * 17. [可空] Integer deathKid 新生儿死亡人数
 * 18. [可空] Integer defectsKid 出生缺陷儿人数
 * 19. [可空] Double height 身高
 * 20. [可空] Double weight 体重(kg)
 * 21. [可空] Double pmi 体质指数
 * 22. [可空] Integer systolicPressure 收缩压
 * 23. [可空] Integer diastolicPressure 舒张压
 * 24. [可空] String heartCode 心脏代码
 * 25. [可空] String heartAnomalyDescription 心脏异常描述
 * 26. [可空] String lungCode 肺部代码
 * 27. [可空] String lungAnomalyDescription 肺部异常描述
 * 28. [可空] String vulvaCode 外阴代码
 * 29. [可空] String vulvaAnomalyDescription 外阴异常描述
 * 30. [可空] String vaginalCode 阴道代码
 * 31. [可空] String vaginalAnomalyDescription 阴道异常描述
 * 32. [可空] String cervicalCode 宫颈代码
 * 33. [可空] String cervicalAnomalyDescription 宫颈异常描述
 * 34. [可空] String uterineCode 子宫代码
 * 35. [可空] String uterineAnomalyDescription 子宫异常描述
 * 36. [可空] String accessoryCode 附件代码
 * 37. [可空] String accessoryAnomalyDescription 附件异常描述
 * 38. [可空] Double hemoglobin 血红蛋白
 * 39. [可空] Double whiteBloodCell 白细胞
 * 40. [可空] Double platelet 血小板
 * 41. [可空] String otherBlood 血常规其他情况
 * 42. [可空] Double urinaryProtein 尿蛋白
 * 43. [可空] Double glucoseInUrine 尿糖
 * 44. [可空] Double urinaryKetoneBodies 尿酮体
 * 45. [可空] Double urineOccultBlood 尿潜血
 * 46. [可空] String urineRoutineOthers 尿常规其他情况
 * 47. [可空] String bloodtypeAboCode ABO血型代码
 * 48. [可空] String bloodtypeRbCode RB血型代码
 * 49. [可空] Double fastingBloodGlucoseL 血糖
 * 50. [可空] Double alanine 血清谷丙转氨酶
 * 51. [可空] Double glutamicOxaloacetic 血清谷草转氨酶
 * 52. [可空] Double albumin 白蛋白
 * 53. [可空] Double totalBilirubin 总胆红素
 * 54. [可空] Double conjugatedBilirubin 结合胆红素
 * 55. [可空] Double serumCreatinine 血清肌酐
 * 56. [可空] Double bloodUreaNitrogen 血尿素氮
 * 57. [可空] String vaginalSecretionsCode 阴道分泌物代码
 * 58. [可空] String vaginalSecretionsName 其他阴道分泌物名称
 * 59. [可空] String vaginalCleanCode 阴道清洁度代码
 * 60. [可空] String hbsagCode 乙型肝炎表面抗原代码
 * 61. [可空] String hbsabCode 乙型肝炎表面抗体代码
 * 62. [可空] String hbeagCode 乙型肝炎e抗原代码
 * 63. [可空] String hbeabCode 乙型肝炎e抗体代码
 * 64. [可空] String hbcabCode 乙型肝炎核心抗体代码
 * 65. [可空] String cantanitestCode 梅毒血清学试验代码
 * 66. [可空] String hivCode HIV抗体检测代码
 * 67. [可空] String bUltrasound B超
 * 68. [可空] String totalEvaluationCode 总体评估代码
 * 69. [可空] String totalEvaluationDescription 总体评估描述
 * 70. [可空] String healthGuidanceCode 保健指导代码
 * 71. [可空] String healthGuidanceName 其他保健指导名称
 * 72. [可空] String referralSign 转诊标志
 * 73. [可空] String referralReason 转诊原因
 * 74. [可空] String referralOrgCode 转诊机构编码
 * 75. [可空] String referralOrgName 转诊机构名称
 * 76. [可空] String referralDepCode 转诊科室编码
 * 77. [可空] String referralDepName 转诊科室名称
 * 78. [可空] String referralOrgDep 转诊机构及科室
 * 79. [可空] java.util.Date nextFollowUpDate 下次随访日期
 * 80. [可空] String followUpDoctorCode 随访医生代码
 * 81. [可空] String followUpDoctorName 随访医生姓名
 * 82. [可空] String followUpOrgCode 随访机构编码
 * 83. [可空] String followUpOrgName 随访机构名称
 * 84. [可空] java.util.Date entryDate 登记时间
 * 85. [可空] String entryEmpCode 登记人员编码
 * 86. [可空] String entryEmpName 登记人员名称
 * 87. [可空] String entryOrgCode 登记机构编码
 * 88. [可空] String entryOrgName 登记机构名称
 * 89. [不可空] String orgCode 医疗机构代码
 * 90. [不可空] java.util.Date uploadDate 填报日期
 * 91. [不可空] String updateFlag 修改标志 1：正常、2：修改、3：撤销
 * 92. [主键] String id 主键
 * 93. [可空] java.util.Date followupDate 随访日期
 * 94. [可空] Integer pregnantWeek 孕周
 * 95. [可空] String editor 修改人
 * 96. [可空] java.util.Date modifydate 更新日期
 * 97. [不可空] String fdataFrom 数据来源
 * @author Benewit Code Generator V1.0
 */
@Entity
public class EhrMaternalFollowupFirst extends BaseChildBean {

    /*
     * 本程序不允许修改！！！
     */
    @Property(nameInDb = "localId")
    @Id(autoincrement = true)
    private Long localId;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 会员卡号
     */
    private String vipCard;

    /**
     * 是否已经上传
     */
    private boolean upload;

    /**
     * 标识所有必填字段是否填写
     */
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

    /** 1. [不可空] 孕产妇随访编号 */
    private String followUpId;

    /** 2. [可空] 孕产妇专项编号 */
    private String mangementNo;

    /** 3. [不可空] 个人健康档案编码 */
    private String healthfileNo;

    /** 4. [可空] 基本信息档案号 */
    private String fileNumber;

    /** 5. [可空] 既往史代码 */
    private String diseaseshistoryCode;

    /** 6. [可空] 其他既往史名称 */
    private String diseaseshistoryOther;

    /** 7. [可空] 家族史代码 */
    private String familyhistoryCode;

    /** 8. [可空] 其他家族史名称 */
    private String familyhistoryName;

    /** 9. [可空] 个人史代码 */
    private String personalhistoryCode;

    /** 10. [可空] 其他个人史名称 */
    private String personalhistoryName;

    /** 11. [可空] 妇科手术史代码 */
    private String gyneHistoryCode;

    /** 12. [可空] 妇科手术史描述 */
    private String gyneHistoryName;

    /** 13. [可空] 孕产史代码 */
    private String motherhoodHistoryCode;

    /** 14. [可空] 流产次数  人工流产*/
    private Integer abortionTimes;

    /** 15. [可空] 死胎次数 */
    private Integer stillbirthTimes;

    /** 16. [可空] 死产数 */
    private Integer stillbirth;

    /** 17. [可空] 新生儿死亡人数 */
    private Integer deathKid;

    /** 18. [可空] 出生缺陷儿人数 */
    private Integer defectsKid;

    /** 19. [可空] 身高 */
    private Double height;

    /** 20. [可空] 体重(kg) */
    private Double weight;

    /** 21. [可空] 体质指数 */
    private Double pmi;

    /** 22. [可空] 收缩压 */
    private Integer systolicPressure;

    /** 23. [可空] 舒张压 */
    private Integer diastolicPressure;

    /** 24. [可空] 心脏代码 */
    private String heartCode;

    /** 25. [可空] 心脏异常描述 */
    private String heartAnomalyDescription;

    /** 26. [可空] 肺部代码 */
    private String lungCode;

    /** 27. [可空] 肺部异常描述 */
    private String lungAnomalyDescription;

    /** 28. [可空] 外阴代码 */
    private String vulvaCode;

    /** 29. [可空] 外阴异常描述 */
    private String vulvaAnomalyDescription;

    /** 30. [可空] 阴道代码 */
    private String vaginalCode;

    /** 31. [可空] 阴道异常描述 */
    private String vaginalAnomalyDescription;

    /** 32. [可空] 宫颈代码 */
    private String cervicalCode;

    /** 33. [可空] 宫颈异常描述 */
    private String cervicalAnomalyDescription;

    /** 34. [可空] 子宫代码 */
    private String uterineCode;

    /** 35. [可空] 子宫异常描述 */
    private String uterineAnomalyDescription;

    /** 36. [可空] 附件代码 */
    private String accessoryCode;

    /** 37. [可空] 附件异常描述 */
    private String accessoryAnomalyDescription;

    /** 38. [可空] 血红蛋白 */
    private Double hemoglobin;

    /** 39. [可空] 白细胞 */
    private Double whiteBloodCell;

    /** 40. [可空] 血小板 */
    private Double platelet;

    /** 41. [可空] 血常规其他情况 */
    private String otherBlood;

    /** 42. [可空] 尿蛋白 */
    private String urinaryProtein;

    /** 43. [可空] 尿糖 */
    private String glucoseInUrine;

    /** 44. [可空] 尿酮体 */
    private String urinaryKetoneBodies;

    /** 45. [可空] 尿潜血 */
    private String urineOccultBlood;

    /** 46. [可空] 尿常规其他情况 */
    private String urineRoutineOthers;

    /** 47. [可空] ABO血型代码 */
    private String bloodtypeAboCode;

    /** 48. [可空] RB血型代码 */
    private String bloodtypeRbCode;

    /** 49. [可空] 血糖 */
    private Double fastingBloodGlucoseL;

    /** 50. [可空] 血清谷丙转氨酶 */
    private Double alanine;

    /** 51. [可空] 血清谷草转氨酶 */
    private Double glutamicOxaloacetic;

    /** 52. [可空] 白蛋白 */
    private Double albumin;

    /** 53. [可空] 总胆红素 */
    private Double totalBilirubin;

    /** 54. [可空] 结合胆红素 */
    private Double conjugatedBilirubin;

    /** 55. [可空] 血清肌酐 */
    private Double serumCreatinine;

    /** 56. [可空] 血尿素氮 */
    private Double bloodUreaNitrogen;

    /** 57. [可空] 阴道分泌物代码 */
    private String vaginalSecretionsCode;

    /** 58. [可空] 其他阴道分泌物名称 */
    private String vaginalSecretionsName;

    /** 59. [可空] 阴道清洁度代码 */
    private String vaginalCleanCode;

    /** 60. [可空] 乙型肝炎表面抗原代码 */
    private String hbsagCode;

    /** 61. [可空] 乙型肝炎表面抗体代码 */
    private String hbsabCode;

    /** 62. [可空] 乙型肝炎e抗原代码 */
    private String hbeagCode;

    /** 63. [可空] 乙型肝炎e抗体代码 */
    private String hbeabCode;

    /** 64. [可空] 乙型肝炎核心抗体代码 */
    private String hbcabCode;

    /** 65. [可空] 梅毒血清学试验代码 */
    private String cantanitestCode;

    /** 66. [可空] HIV抗体检测代码 */
    private String hivCode;

    /** 67. [可空] B超 */
    private String bUltrasound;

    /** 68. [可空] 总体评估代码 */
    private String totalEvaluationCode;

    /** 69. [可空] 总体评估描述 */
    private String totalEvaluationDescription;

    /** 70. [可空] 保健指导代码 */
    private String healthGuidanceCode;

    /** 71. [可空] 其他保健指导名称 */
    private String healthGuidanceName;

    /** 72. [可空] 转诊标志 */
    private String referralSign;

    /** 73. [可空] 转诊原因 */
    private String referralReason;

    /** 74. [可空] 转诊机构编码 */
    private String referralOrgCode;

    /** 75. [可空] 转诊机构名称 */
    private String referralOrgName;

    /** 76. [可空] 转诊科室编码 */
    private String referralDepCode;

    /** 77. [可空] 转诊科室名称 */
    private String referralDepName;

    /** 78. [可空] 转诊机构及科室 */
    private String referralOrgDep;

    /** 79. [可空] 下次随访日期 */
    private java.util.Date nextFollowUpDate;

    /** 80. [可空] 随访医生代码 */
    private String followUpDoctorCode;

    /** 81. [可空] 随访医生姓名 */
    private String followUpDoctorName;

    /** 82. [可空] 随访机构编码 */
    private String followUpOrgCode;

    /** 83. [可空] 随访机构名称 */
    private String followUpOrgName;

    /** 84. [可空] 登记时间 */
    private java.util.Date entryDate;

    /** 85. [可空] 登记人员编码 */
    private String entryEmpCode;

    /** 86. [可空] 登记人员名称 */
    private String entryEmpName;

    /** 87. [可空] 登记机构编码 */
    private String entryOrgCode;

    /** 88. [可空] 登记机构名称 */
    private String entryOrgName;

    /** 89. [可空] 医疗机构代码 */
    private String orgCode;

    /** 90. [不可空] 填报日期 */
    private java.util.Date uploadDate;

    /** 92. [可空] 随访日期 */
    private java.util.Date followupDate;

    /** 93. [可空] 孕周 */
    private Integer pregnantWeek;

    /** 94. [不可空] 数据来源 */
    private String fdataFrom;

    /** 95. [可空] 修改者 */
    private String editor;

    /** 96. [可空] 修改时间 */
    private java.util.Date modifydate;

    /** 97. [不可空] 修改标志,1新增,2修改,3撤销 */
    private String updateFlag;

    /** 98. [可空] 备注| */
    private String remark;

    /** 99. [可空] 流产次数(自然) */
    protected Integer bortionTimes;

    /** 100. [可空] 孕产妇健康卡号 */
    protected String mhealthcardno;

    /** 51. [可空] 修改人ID */
    protected String editorId;

    /** 52. [可空] 修改机构编码 */
    protected String updateOrgId;

    /** 53. [可空] 修改机构名称 */
    protected String updateOrgName;

    @Generated(hash = 850248864)
    public EhrMaternalFollowupFirst(Long localId, String idCard, String vipCard,
            boolean upload, boolean completed, String title, String id,
            Long localspecialID, Boolean isEndCase, String followUpId,
            String mangementNo, String healthfileNo, String fileNumber,
            String diseaseshistoryCode, String diseaseshistoryOther,
            String familyhistoryCode, String familyhistoryName,
            String personalhistoryCode, String personalhistoryName,
            String gyneHistoryCode, String gyneHistoryName,
            String motherhoodHistoryCode, Integer abortionTimes,
            Integer stillbirthTimes, Integer stillbirth, Integer deathKid,
            Integer defectsKid, Double height, Double weight, Double pmi,
            Integer systolicPressure, Integer diastolicPressure, String heartCode,
            String heartAnomalyDescription, String lungCode,
            String lungAnomalyDescription, String vulvaCode,
            String vulvaAnomalyDescription, String vaginalCode,
            String vaginalAnomalyDescription, String cervicalCode,
            String cervicalAnomalyDescription, String uterineCode,
            String uterineAnomalyDescription, String accessoryCode,
            String accessoryAnomalyDescription, Double hemoglobin,
            Double whiteBloodCell, Double platelet, String otherBlood,
            String urinaryProtein, String glucoseInUrine,
            String urinaryKetoneBodies, String urineOccultBlood,
            String urineRoutineOthers, String bloodtypeAboCode,
            String bloodtypeRbCode, Double fastingBloodGlucoseL, Double alanine,
            Double glutamicOxaloacetic, Double albumin, Double totalBilirubin,
            Double conjugatedBilirubin, Double serumCreatinine,
            Double bloodUreaNitrogen, String vaginalSecretionsCode,
            String vaginalSecretionsName, String vaginalCleanCode, String hbsagCode,
            String hbsabCode, String hbeagCode, String hbeabCode, String hbcabCode,
            String cantanitestCode, String hivCode, String bUltrasound,
            String totalEvaluationCode, String totalEvaluationDescription,
            String healthGuidanceCode, String healthGuidanceName,
            String referralSign, String referralReason, String referralOrgCode,
            String referralOrgName, String referralDepCode, String referralDepName,
            String referralOrgDep, java.util.Date nextFollowUpDate,
            String followUpDoctorCode, String followUpDoctorName,
            String followUpOrgCode, String followUpOrgName,
            java.util.Date entryDate, String entryEmpCode, String entryEmpName,
            String entryOrgCode, String entryOrgName, String orgCode,
            java.util.Date uploadDate, java.util.Date followupDate,
            Integer pregnantWeek, String fdataFrom, String editor,
            java.util.Date modifydate, String updateFlag, String remark,
            Integer bortionTimes, String mhealthcardno, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.localspecialID = localspecialID;
        this.isEndCase = isEndCase;
        this.followUpId = followUpId;
        this.mangementNo = mangementNo;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.diseaseshistoryCode = diseaseshistoryCode;
        this.diseaseshistoryOther = diseaseshistoryOther;
        this.familyhistoryCode = familyhistoryCode;
        this.familyhistoryName = familyhistoryName;
        this.personalhistoryCode = personalhistoryCode;
        this.personalhistoryName = personalhistoryName;
        this.gyneHistoryCode = gyneHistoryCode;
        this.gyneHistoryName = gyneHistoryName;
        this.motherhoodHistoryCode = motherhoodHistoryCode;
        this.abortionTimes = abortionTimes;
        this.stillbirthTimes = stillbirthTimes;
        this.stillbirth = stillbirth;
        this.deathKid = deathKid;
        this.defectsKid = defectsKid;
        this.height = height;
        this.weight = weight;
        this.pmi = pmi;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.heartCode = heartCode;
        this.heartAnomalyDescription = heartAnomalyDescription;
        this.lungCode = lungCode;
        this.lungAnomalyDescription = lungAnomalyDescription;
        this.vulvaCode = vulvaCode;
        this.vulvaAnomalyDescription = vulvaAnomalyDescription;
        this.vaginalCode = vaginalCode;
        this.vaginalAnomalyDescription = vaginalAnomalyDescription;
        this.cervicalCode = cervicalCode;
        this.cervicalAnomalyDescription = cervicalAnomalyDescription;
        this.uterineCode = uterineCode;
        this.uterineAnomalyDescription = uterineAnomalyDescription;
        this.accessoryCode = accessoryCode;
        this.accessoryAnomalyDescription = accessoryAnomalyDescription;
        this.hemoglobin = hemoglobin;
        this.whiteBloodCell = whiteBloodCell;
        this.platelet = platelet;
        this.otherBlood = otherBlood;
        this.urinaryProtein = urinaryProtein;
        this.glucoseInUrine = glucoseInUrine;
        this.urinaryKetoneBodies = urinaryKetoneBodies;
        this.urineOccultBlood = urineOccultBlood;
        this.urineRoutineOthers = urineRoutineOthers;
        this.bloodtypeAboCode = bloodtypeAboCode;
        this.bloodtypeRbCode = bloodtypeRbCode;
        this.fastingBloodGlucoseL = fastingBloodGlucoseL;
        this.alanine = alanine;
        this.glutamicOxaloacetic = glutamicOxaloacetic;
        this.albumin = albumin;
        this.totalBilirubin = totalBilirubin;
        this.conjugatedBilirubin = conjugatedBilirubin;
        this.serumCreatinine = serumCreatinine;
        this.bloodUreaNitrogen = bloodUreaNitrogen;
        this.vaginalSecretionsCode = vaginalSecretionsCode;
        this.vaginalSecretionsName = vaginalSecretionsName;
        this.vaginalCleanCode = vaginalCleanCode;
        this.hbsagCode = hbsagCode;
        this.hbsabCode = hbsabCode;
        this.hbeagCode = hbeagCode;
        this.hbeabCode = hbeabCode;
        this.hbcabCode = hbcabCode;
        this.cantanitestCode = cantanitestCode;
        this.hivCode = hivCode;
        this.bUltrasound = bUltrasound;
        this.totalEvaluationCode = totalEvaluationCode;
        this.totalEvaluationDescription = totalEvaluationDescription;
        this.healthGuidanceCode = healthGuidanceCode;
        this.healthGuidanceName = healthGuidanceName;
        this.referralSign = referralSign;
        this.referralReason = referralReason;
        this.referralOrgCode = referralOrgCode;
        this.referralOrgName = referralOrgName;
        this.referralDepCode = referralDepCode;
        this.referralDepName = referralDepName;
        this.referralOrgDep = referralOrgDep;
        this.nextFollowUpDate = nextFollowUpDate;
        this.followUpDoctorCode = followUpDoctorCode;
        this.followUpDoctorName = followUpDoctorName;
        this.followUpOrgCode = followUpOrgCode;
        this.followUpOrgName = followUpOrgName;
        this.entryDate = entryDate;
        this.entryEmpCode = entryEmpCode;
        this.entryEmpName = entryEmpName;
        this.entryOrgCode = entryOrgCode;
        this.entryOrgName = entryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.followupDate = followupDate;
        this.pregnantWeek = pregnantWeek;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.remark = remark;
        this.bortionTimes = bortionTimes;
        this.mhealthcardno = mhealthcardno;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 1486293871)
    public EhrMaternalFollowupFirst() {
    }

    public String getUrinaryProtein() {
        return urinaryProtein;
    }

    public void setUrinaryProtein(String urinaryProtein) {
        this.urinaryProtein = urinaryProtein;
    }

    public String getGlucoseInUrine() {
        return glucoseInUrine;
    }

    public void setGlucoseInUrine(String glucoseInUrine) {
        this.glucoseInUrine = glucoseInUrine;
    }

    public String getUrinaryKetoneBodies() {
        return urinaryKetoneBodies;
    }

    public void setUrinaryKetoneBodies(String urinaryKetoneBodies) {
        this.urinaryKetoneBodies = urinaryKetoneBodies;
    }

    public String getUrineOccultBlood() {
        return urineOccultBlood;
    }

    public void setUrineOccultBlood(String urineOccultBlood) {
        this.urineOccultBlood = urineOccultBlood;
    }

    public Integer getBortionTimes() {
        return bortionTimes;
    }

    public void setBortionTimes(Integer bortionTimes) {
        this.bortionTimes = bortionTimes;
    }

    public String getMhealthcardno() {
        return mhealthcardno;
    }

    public void setMhealthcardno(String mhealthcardno) {
        this.mhealthcardno = mhealthcardno;
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

    @Override
    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    @Override
    public boolean getCompleted() {
        return completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId;
    }

    public String getMangementNo() {
        return mangementNo;
    }

    public void setMangementNo(String mangementNo) {
        this.mangementNo = mangementNo;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getDiseaseshistoryCode() {
        return diseaseshistoryCode;
    }

    public void setDiseaseshistoryCode(String diseaseshistoryCode) {
        this.diseaseshistoryCode = diseaseshistoryCode;
    }

    public String getDiseaseshistoryOther() {
        return diseaseshistoryOther;
    }

    public void setDiseaseshistoryOther(String diseaseshistoryOther) {
        this.diseaseshistoryOther = diseaseshistoryOther;
    }

    public String getFamilyhistoryCode() {
        return familyhistoryCode;
    }

    public void setFamilyhistoryCode(String familyhistoryCode) {
        this.familyhistoryCode = familyhistoryCode;
    }

    public String getFamilyhistoryName() {
        return familyhistoryName;
    }

    public void setFamilyhistoryName(String familyhistoryName) {
        this.familyhistoryName = familyhistoryName;
    }

    public String getPersonalhistoryCode() {
        return personalhistoryCode;
    }

    public void setPersonalhistoryCode(String personalhistoryCode) {
        this.personalhistoryCode = personalhistoryCode;
    }

    public String getPersonalhistoryName() {
        return personalhistoryName;
    }

    public void setPersonalhistoryName(String personalhistoryName) {
        this.personalhistoryName = personalhistoryName;
    }

    public String getGyneHistoryCode() {
        return gyneHistoryCode;
    }

    public void setGyneHistoryCode(String gyneHistoryCode) {
        this.gyneHistoryCode = gyneHistoryCode;
    }

    public String getGyneHistoryName() {
        return gyneHistoryName;
    }

    public void setGyneHistoryName(String gyneHistoryName) {
        this.gyneHistoryName = gyneHistoryName;
    }

    public String getMotherhoodHistoryCode() {
        return motherhoodHistoryCode;
    }

    public void setMotherhoodHistoryCode(String motherhoodHistoryCode) {
        this.motherhoodHistoryCode = motherhoodHistoryCode;
    }

    public Integer getAbortionTimes() {
        return abortionTimes;
    }

    public void setAbortionTimes(Integer abortionTimes) {
        this.abortionTimes = abortionTimes;
    }

    public Integer getStillbirthTimes() {
        return stillbirthTimes;
    }

    public void setStillbirthTimes(Integer stillbirthTimes) {
        this.stillbirthTimes = stillbirthTimes;
    }

    public Integer getStillbirth() {
        return stillbirth;
    }

    public void setStillbirth(Integer stillbirth) {
        this.stillbirth = stillbirth;
    }

    public Integer getDeathKid() {
        return deathKid;
    }

    public void setDeathKid(Integer deathKid) {
        this.deathKid = deathKid;
    }

    public Integer getDefectsKid() {
        return defectsKid;
    }

    public void setDefectsKid(Integer defectsKid) {
        this.defectsKid = defectsKid;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPmi() {
        return pmi;
    }

    public void setPmi(Double pmi) {
        this.pmi = pmi;
    }

    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public String getHeartCode() {
        return heartCode;
    }

    public void setHeartCode(String heartCode) {
        this.heartCode = heartCode;
    }

    public String getHeartAnomalyDescription() {
        return heartAnomalyDescription;
    }

    public void setHeartAnomalyDescription(String heartAnomalyDescription) {
        this.heartAnomalyDescription = heartAnomalyDescription;
    }

    public String getLungCode() {
        return lungCode;
    }

    public void setLungCode(String lungCode) {
        this.lungCode = lungCode;
    }

    public String getLungAnomalyDescription() {
        return lungAnomalyDescription;
    }

    public void setLungAnomalyDescription(String lungAnomalyDescription) {
        this.lungAnomalyDescription = lungAnomalyDescription;
    }

    public String getVulvaCode() {
        return vulvaCode;
    }

    public void setVulvaCode(String vulvaCode) {
        this.vulvaCode = vulvaCode;
    }

    public String getVulvaAnomalyDescription() {
        return vulvaAnomalyDescription;
    }

    public void setVulvaAnomalyDescription(String vulvaAnomalyDescription) {
        this.vulvaAnomalyDescription = vulvaAnomalyDescription;
    }

    public String getVaginalCode() {
        return vaginalCode;
    }

    public void setVaginalCode(String vaginalCode) {
        this.vaginalCode = vaginalCode;
    }

    public String getVaginalAnomalyDescription() {
        return vaginalAnomalyDescription;
    }

    public void setVaginalAnomalyDescription(String vaginalAnomalyDescription) {
        this.vaginalAnomalyDescription = vaginalAnomalyDescription;
    }

    public String getCervicalCode() {
        return cervicalCode;
    }

    public void setCervicalCode(String cervicalCode) {
        this.cervicalCode = cervicalCode;
    }

    public String getCervicalAnomalyDescription() {
        return cervicalAnomalyDescription;
    }

    public void setCervicalAnomalyDescription(String cervicalAnomalyDescription) {
        this.cervicalAnomalyDescription = cervicalAnomalyDescription;
    }

    public String getUterineCode() {
        return uterineCode;
    }

    public void setUterineCode(String uterineCode) {
        this.uterineCode = uterineCode;
    }

    public String getUterineAnomalyDescription() {
        return uterineAnomalyDescription;
    }

    public void setUterineAnomalyDescription(String uterineAnomalyDescription) {
        this.uterineAnomalyDescription = uterineAnomalyDescription;
    }

    public String getAccessoryCode() {
        return accessoryCode;
    }

    public void setAccessoryCode(String accessoryCode) {
        this.accessoryCode = accessoryCode;
    }

    public String getAccessoryAnomalyDescription() {
        return accessoryAnomalyDescription;
    }

    public void setAccessoryAnomalyDescription(String accessoryAnomalyDescription) {
        this.accessoryAnomalyDescription = accessoryAnomalyDescription;
    }

    public Double getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(Double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public Double getWhiteBloodCell() {
        return whiteBloodCell;
    }

    public void setWhiteBloodCell(Double whiteBloodCell) {
        this.whiteBloodCell = whiteBloodCell;
    }

    public Double getPlatelet() {
        return platelet;
    }

    public void setPlatelet(Double platelet) {
        this.platelet = platelet;
    }

    public String getOtherBlood() {
        return otherBlood;
    }

    public void setOtherBlood(String otherBlood) {
        this.otherBlood = otherBlood;
    }



    public String getUrineRoutineOthers() {
        return urineRoutineOthers;
    }

    public void setUrineRoutineOthers(String urineRoutineOthers) {
        this.urineRoutineOthers = urineRoutineOthers;
    }

    public String getBloodtypeAboCode() {
        return bloodtypeAboCode;
    }

    public void setBloodtypeAboCode(String bloodtypeAboCode) {
        this.bloodtypeAboCode = bloodtypeAboCode;
    }

    public String getBloodtypeRbCode() {
        return bloodtypeRbCode;
    }

    public void setBloodtypeRbCode(String bloodtypeRbCode) {
        this.bloodtypeRbCode = bloodtypeRbCode;
    }

    public Double getFastingBloodGlucoseL() {
        return fastingBloodGlucoseL;
    }

    public void setFastingBloodGlucoseL(Double fastingBloodGlucoseL) {
        this.fastingBloodGlucoseL = fastingBloodGlucoseL;
    }

    public Double getAlanine() {
        return alanine;
    }

    public void setAlanine(Double alanine) {
        this.alanine = alanine;
    }

    public Double getGlutamicOxaloacetic() {
        return glutamicOxaloacetic;
    }

    public void setGlutamicOxaloacetic(Double glutamicOxaloacetic) {
        this.glutamicOxaloacetic = glutamicOxaloacetic;
    }

    public Double getAlbumin() {
        return albumin;
    }

    public void setAlbumin(Double albumin) {
        this.albumin = albumin;
    }

    public Double getTotalBilirubin() {
        return totalBilirubin;
    }

    public void setTotalBilirubin(Double totalBilirubin) {
        this.totalBilirubin = totalBilirubin;
    }

    public Double getConjugatedBilirubin() {
        return conjugatedBilirubin;
    }

    public void setConjugatedBilirubin(Double conjugatedBilirubin) {
        this.conjugatedBilirubin = conjugatedBilirubin;
    }

    public Double getSerumCreatinine() {
        return serumCreatinine;
    }

    public void setSerumCreatinine(Double serumCreatinine) {
        this.serumCreatinine = serumCreatinine;
    }

    public Double getBloodUreaNitrogen() {
        return bloodUreaNitrogen;
    }

    public void setBloodUreaNitrogen(Double bloodUreaNitrogen) {
        this.bloodUreaNitrogen = bloodUreaNitrogen;
    }

    public String getVaginalSecretionsCode() {
        return vaginalSecretionsCode;
    }

    public void setVaginalSecretionsCode(String vaginalSecretionsCode) {
        this.vaginalSecretionsCode = vaginalSecretionsCode;
    }

    public String getVaginalSecretionsName() {
        return vaginalSecretionsName;
    }

    public void setVaginalSecretionsName(String vaginalSecretionsName) {
        this.vaginalSecretionsName = vaginalSecretionsName;
    }

    public String getVaginalCleanCode() {
        return vaginalCleanCode;
    }

    public void setVaginalCleanCode(String vaginalCleanCode) {
        this.vaginalCleanCode = vaginalCleanCode;
    }

    public String getHbsagCode() {
        return hbsagCode;
    }

    public void setHbsagCode(String hbsagCode) {
        this.hbsagCode = hbsagCode;
    }

    public String getHbsabCode() {
        return hbsabCode;
    }

    public void setHbsabCode(String hbsabCode) {
        this.hbsabCode = hbsabCode;
    }

    public String getHbeagCode() {
        return hbeagCode;
    }

    public void setHbeagCode(String hbeagCode) {
        this.hbeagCode = hbeagCode;
    }

    public String getHbeabCode() {
        return hbeabCode;
    }

    public void setHbeabCode(String hbeabCode) {
        this.hbeabCode = hbeabCode;
    }

    public String getHbcabCode() {
        return hbcabCode;
    }

    public void setHbcabCode(String hbcabCode) {
        this.hbcabCode = hbcabCode;
    }

    public String getCantanitestCode() {
        return cantanitestCode;
    }

    public void setCantanitestCode(String cantanitestCode) {
        this.cantanitestCode = cantanitestCode;
    }

    public String getHivCode() {
        return hivCode;
    }

    public void setHivCode(String hivCode) {
        this.hivCode = hivCode;
    }

    public String getbUltrasound() {
        return bUltrasound;
    }

    public void setbUltrasound(String bUltrasound) {
        this.bUltrasound = bUltrasound;
    }

    public String getTotalEvaluationCode() {
        return totalEvaluationCode;
    }

    public void setTotalEvaluationCode(String totalEvaluationCode) {
        this.totalEvaluationCode = totalEvaluationCode;
    }

    public String getTotalEvaluationDescription() {
        return totalEvaluationDescription;
    }

    public void setTotalEvaluationDescription(String totalEvaluationDescription) {
        this.totalEvaluationDescription = totalEvaluationDescription;
    }

    public String getHealthGuidanceCode() {
        return healthGuidanceCode;
    }

    public void setHealthGuidanceCode(String healthGuidanceCode) {
        this.healthGuidanceCode = healthGuidanceCode;
    }

    public String getHealthGuidanceName() {
        return healthGuidanceName;
    }

    public void setHealthGuidanceName(String healthGuidanceName) {
        this.healthGuidanceName = healthGuidanceName;
    }

    public String getReferralSign() {
        return referralSign;
    }

    public void setReferralSign(String referralSign) {
        this.referralSign = referralSign;
    }

    public String getReferralReason() {
        return referralReason;
    }

    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    public String getReferralOrgCode() {
        return referralOrgCode;
    }

    public void setReferralOrgCode(String referralOrgCode) {
        this.referralOrgCode = referralOrgCode;
    }

    public String getReferralOrgName() {
        return referralOrgName;
    }

    public void setReferralOrgName(String referralOrgName) {
        this.referralOrgName = referralOrgName;
    }

    public String getReferralDepCode() {
        return referralDepCode;
    }

    public void setReferralDepCode(String referralDepCode) {
        this.referralDepCode = referralDepCode;
    }

    public String getReferralDepName() {
        return referralDepName;
    }

    public void setReferralDepName(String referralDepName) {
        this.referralDepName = referralDepName;
    }

    public String getReferralOrgDep() {
        return referralOrgDep;
    }

    public void setReferralOrgDep(String referralOrgDep) {
        this.referralOrgDep = referralOrgDep;
    }

    public Date getNextFollowUpDate() {
        return nextFollowUpDate;
    }

    public void setNextFollowUpDate(Date nextFollowUpDate) {
        this.nextFollowUpDate = nextFollowUpDate;
    }

    public String getFollowUpDoctorCode() {
        return followUpDoctorCode;
    }

    public void setFollowUpDoctorCode(String followUpDoctorCode) {
        this.followUpDoctorCode = followUpDoctorCode;
    }

    public String getFollowUpDoctorName() {
        return followUpDoctorName;
    }

    public void setFollowUpDoctorName(String followUpDoctorName) {
        this.followUpDoctorName = followUpDoctorName;
    }

    public String getFollowUpOrgCode() {
        return followUpOrgCode;
    }

    public void setFollowUpOrgCode(String followUpOrgCode) {
        this.followUpOrgCode = followUpOrgCode;
    }

    public String getFollowUpOrgName() {
        return followUpOrgName;
    }

    public void setFollowUpOrgName(String followUpOrgName) {
        this.followUpOrgName = followUpOrgName;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryEmpCode() {
        return entryEmpCode;
    }

    public void setEntryEmpCode(String entryEmpCode) {
        this.entryEmpCode = entryEmpCode;
    }

    public String getEntryEmpName() {
        return entryEmpName;
    }

    public void setEntryEmpName(String entryEmpName) {
        this.entryEmpName = entryEmpName;
    }

    public String getEntryOrgCode() {
        return entryOrgCode;
    }

    public void setEntryOrgCode(String entryOrgCode) {
        this.entryOrgCode = entryOrgCode;
    }

    public String getEntryOrgName() {
        return entryOrgName;
    }

    public void setEntryOrgName(String entryOrgName) {
        this.entryOrgName = entryOrgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    @Override
    public Date getFollowupDate() {
        return modifydate;
    }

    @Override
    public Date getRevisionDate() {
        return modifydate;
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

    public Integer getPregnantWeek() {
        return pregnantWeek;
    }

    public void setPregnantWeek(Integer pregnantWeek) {
        this.pregnantWeek = pregnantWeek;
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

    public String getFdataFrom() {
        return fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public String getBUltrasound() {
        return this.bUltrasound;
    }

    public void setBUltrasound(String bUltrasound) {
        this.bUltrasound = bUltrasound;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsEndCase() {
        return this.isEndCase;
    }

    public void setIsEndCase(Boolean isEndCase) {
        this.isEndCase = isEndCase;
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
