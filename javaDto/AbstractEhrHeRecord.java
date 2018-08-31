package com.konsung.bean;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * 体检表实体类
 * Created by DJH on 2017/12/14 0014.
 */
@Entity
public class AbstractEhrHeRecord {

    /**
     * 本地Id,不会上传到服务器
     * 也不会解析
     */
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
     * 标识表单所有必填字段是否填写完成
     */
    @Expose
    private boolean completed;

    /**
     * //标识是否上传成功
     */
    @Expose
    private boolean upload = false;

    private String id;

    /**
     * 1. [不可空] 健康体检流水号
     */
    private String visitingSerialNumber;

    /**
     * 2. [不可空] 个人健康档案编码
     */
    private String healthfileNo;

    /**
     * 3. [可空] 基本信息档案号
     */
    private String fileNumber;

    /**
     * 4. [不可空] 姓名
     */
    private String name;

    /**
     * 5. [不可空] 体检时间
     */
    private java.util.Date visitingTime;

    /**
     * 6. [可空] 责任医生代码
     */
    private String heDoctorCode;

    /**
     * 7. [可空] 责任医生姓名
     */
    private String heDoctorName;

    /**
     * 8. [可空] 症状代码
     */
    private String symptomCode;

    /**
     * 9. [可空] 其他症状名称
     */
    private String symptomsName;

    /**
     * 10. [可空] 体温
     */
    private Double bodyTemperature;

    /**
     * 11. [可空] 脉率
     */
    private Double pulseRate;

    /**
     * 12. [可空] 呼吸频率
     */
    private Double respiratoryFrequency;

    /**
     * 13. [可空] 左侧舒张压
     */
    private Double leftDiastolicPressure;

    /**
     * 14. [可空] 左侧收缩压
     */
    private Double leftSystolicPressure;

    /**
     * 15. [可空] 右侧舒张压
     */
    private Double rightDiastolicPressure;

    /**
     * 16. [可空] 右侧收缩压
     */
    private Double rightSystolicPressure;

    /**
     * 17. [可空] 身高
     */
    private Double height;

    /**
     * 18. [可空] 体重
     */
    private Double weight;

    /**
     * 19. [可空] 腰围
     */
    private Integer waist;

    /**
     * 20. [可空] 体质指数
     */
    private Double pmi;

    /**
     * 21. [可空] 老年人健康状态代码
     */
    private String elderlyHealthCode;

    /**
     * 22. [可空] 老年人生活自理代码
     */
    private String elderlyLivingCode;

    /**
     * 23. [可空] 老年人认知功能代码
     */
    private String elderlyCognitiveCode;

    /**
     * 24. [可空] 老年人认知功能得分
     */
    private Integer elderlyCognitiveScores;

    /**
     * 25. [可空] 老年人情感状态代码
     */
    private String elderlyFeelingCode;

    /**
     * 26. [可空] 老年人情感状态得分
     */
    private Integer elderlyFeelingScores;

    /**
     * 27. [可空] 锻炼频率代码
     */
    private String exerciseFrequencyCode;

    /**
     * 28. [可空] 每次锻炼时间
     */
    private Integer eachExerciseTime;

    /**
     * 29. [可空] 坚持锻炼时间
     */
    private Integer exerciseTime;

    /**
     * 30. [可空] 锻炼方式
     */
    private String exerciseStyle;

    /**
     * 31. [可空] 饮食习惯
     */
    private String eatingHabits;

    /**
     * 32. [可空] 吸烟状况代码
     */
    private String smokingStatusCode;

    /**
     * 33. [可空] 平均日吸烟量
     */
    private Integer smokingDailyAmount;

    /**
     * 34. [可空] 开始吸烟年龄
     */
    private Integer smokingAge;

    /**
     * 35. [可空] 戒烟年龄
     */
    private Integer smokingQuitAge;

    /**
     * 36. [可空] 饮酒频率代码
     */
    private String drinkingFrequencyCode;

    /**
     * 37. [可空] 平均日饮酒量
     */
    private Integer drinkingDailyAmount;

    /**
     * 38. [可空] 是否戒酒代码
     */
    private String drinkingQuitCode;

    /**
     * 39. [可空] 戒酒年龄
     */
    private Integer drinkingAge;

    /**
     * 40. [可空] 开始饮酒年龄
     */
    private Integer startDrinkingAge;

    /**
     * 41. [可空] 近一年内是否曾醉酒
     */
    private String isHadDrunk;

    /**
     * 42. [可空] 饮酒种类代码
     */
    private String alcoholTypeCode;

    /**
     * 43. [可空] 其他饮酒种类名称
     */
    private String alcoholTypeName;

    /**
     * 44. [可空] 是否职业暴露代码
     */
    private String exposureCode;

    /**
     * 45. [可空] 职业暴露工种
     */
    private String exposureWorkers;

    /**
     * 46. [可空] 从业时间
     */
    private Integer workingTime;

    /**
     * 47. [可空] 接触粉尘名称
     */
    private String dustName;

    /**
     * 48. [可空] 是否对粉尘有防护措施代码
     */
    private String dustProtectionCode;

    /**
     * 49. [可空] 其他对粉尘防护措施名称
     */
    private String dustProtectiveMeasures;

    /**
     * 50. [可空] 接触放射物名称
     */
    private String radiationName;

    /**
     * 51. [可空] 是否对放射物有防护措施代码
     */
    private String radiationProtectiveCode;

    /**
     * 52. [可空] 其他对放射物防护措施名称
     */
    private String radiationProtectionMeasures;

    /**
     * 53. [可空] 接触物理因素名称
     */
    private String physicalName;

    /**
     * 54. [可空] 是否对物理因素有防护措施代码
     */
    private String physicalProtectiveCode;

    /**
     * 55. [可空] 其他对物理因素防护措施名称
     */
    private String physicalProtectionMeasures;

    /**
     * 56. [可空] 接触化学品名称
     */
    private String chemicalsName;

    /**
     * 57. [可空] 是否对化学品有防护措施代码
     */
    private String chemicalsProtectiveCode;

    /**
     * 58. [可空] 其他对化学品防护措施名称
     */
    private String chemicalsProtectionMeasures;

    /**
     * 59. [可空] 接触其他毒物名称
     */
    private String otherName;

    /**
     * 60. [可空] 是否对其他毒物有防护措施代码
     */
    private String otherProtectiveCode;

    /**
     * 61. [可空] 其他对其他毒物防护措施名称
     */
    private String otherProtectionMeasures;

    /**
     * 62. [可空] 口唇情况代码
     */
    private String oralCode;

    /**
     * 63. [可空] 齿列情况代码
     */
    private String dentitionCode;

    /**
     * 64. [可空] 咽部情况代码
     */
    private String pharyngealCode;

    /**
     * 65. [可空] 左眼视力
     */
    private Double leftEyeVision;

    /**
     * 66. [可空] 左眼矫正视力
     */
    private Double leftEyeCorrection;

    /**
     * 67. [可空] 右眼视力
     */
    private Double rightEyeSight;

    /**
     * 68. [可空] 右眼矫正视力
     */
    private Double rightEyeCorrection;

    /**
     * 69. [可空] 听力情况代码
     */
    private String hearingConditionCode;

    /**
     * 70. [可空] 运动功能情况代码
     */
    private String motionFunctionCode;

    /**
     * 71. [可空] 眼底情况代码
     */
    private String fundusCode;

    /**
     * 72. [可空] 眼底异常说明
     */
    private String fundusSpecification;

    /**
     * 73. [可空] 皮肤情况代码
     */
    private String skinCode;

    /**
     * 74. [可空] 其他皮肤情况名称
     */
    private String skinName;

    /**
     * 75. [可空] 巩膜情况代码
     */
    private String scleralCode;

    /**
     * 76. [可空] 其他巩膜情况名称
     */
    private String caseOfSclera;

    /**
     * 77. [可空] 淋巴结情况代码
     */
    private String lymphNodeCode;

    /**
     * 78. [可空] 其他淋巴结情况名称
     */
    private String lymphNodeName;

    /**
     * 79. [可空] 桶状胸情况代码
     */
    private String barrelChestCode;

    /**
     * 80. [可空] 呼吸音情况代码
     */
    private String breathSoundCode;

    /**
     * 81. [可空] 其他呼吸音情况名称
     */
    private String soundOfBreath;

    /**
     * 82. [可空] 罗音情况代码
     */
    private String raleConditionCode;

    /**
     * 83. [可空] 其他罗音情况名称
     */
    private String raleCaseName;

    /**
     * 84. [可空] 心率
     */
    private Integer heartRate;

    /**
     * 85. [可空] 心律代码
     */
    private String rhythmCode;

    /**
     * 86. [可空] 心脏杂音情况代码
     */
    private String heartMurmurCode;

    /**
     * 87. [可空] 其他心脏杂音情况名称
     */
    private String heartMurmurName;

    /**
     * 88. [可空] 腹部压痛情况代码
     */
    private String abdominalTenderness;

    /**
     * 89. [可空] 其他腹部压痛情况名称
     */
    private String abdominalTendernessName;

    /**
     * 90. [可空] 腹部包块情况代码
     */
    private String abdominalMassCode;

    /**
     * 91. [可空] 其他腹部包块情况名称
     */
    private String abdominalMassName;

    /**
     * 92. [可空] 腹部肝大情况代码
     */
    private String abdomenLiverCode;

    /**
     * 93. [可空] 其他腹部肝大情况名称
     */
    private String abdomenLiverName;

    /**
     * 94. [可空] 腹部脾大情况代码
     */
    private String abdominalSplenomegalyCode;

    /**
     * 95. [可空] 其他腹部脾大情况名称
     */
    private String abdominalSplenomegalyName;

    /**
     * 96. [可空] 腹部移动性浊音情况代码
     */
    private String abdominalMobilityCode;

    /**
     * 97. [可空] 其他腹部移动性浊音情况名称
     */
    private String abdominalMobilityName;

    /**
     * 98. [可空] 下肢水肿情况代码
     */
    private String edemaLimbsCode;

    /**
     * 99. [可空] 足背动脉搏动情况代码
     */
    private String footPulseCode;

    /**
     * 100. [可空] 肛门指诊情况代码
     */
    private String dreCode;

    /**
     * 101. [可空] 其他肛门指诊情况名称
     */
    private String dreName;

    /**
     * 102. [可空] 乳腺情况代码
     */
    private String breastConditionCode;

    /**
     * 103. [可空] 乳腺情况名称
     */
    private String casesOfBreast;

    /**
     * 104. [可空] 外阴情况代码
     */
    private String codeOfVulva;

    /**
     * 105. [可空] 其他外阴情况名称
     */
    private String caseOfVulva;

    /**
     * 106. [可空] 阴道情况代码
     */
    private String vaginalConditionCode;

    /**
     * 107. [可空] 其他阴道情况名称
     */
    private String caseOfVagina;

    /**
     * 108. [可空] 宫颈情况代码
     */
    private String cervicalStatusCode;

    /**
     * 109. [可空] 其他宫颈情况名称
     */
    private String casesOfCervical;

    /**
     * 110. [可空] 宫体情况代码
     */
    private String palaceBodyCode;

    /**
     * 111. [可空] 其他宫体情况名称
     */
    private String palaceBodyName;

    /**
     * 112. [可空] 附件情况代码
     */
    private String accessoriesCode;

    /**
     * 113. [可空] 其他附件情况名称
     */
    private String accessoriesName;

    /**
     * 114. [可空] 查体其他情况
     */
    private String checkOther;

    /**
     * 115. [可空] 血红蛋白
     */
    private Double hemoglobin;

    /**
     * 116. [可空] 白细胞
     */
    private Double whiteBloodCell;

    /**
     * 117. [可空] 血小板
     */
    private Double platelet;

    /**
     * 118. [可空] 血常规其他情况
     */
    private String otherBlood;

    /**
     * 119. [可空] 尿蛋白
     */
    private String urinaryProtein;

    /**
     * 120. [可空] 尿糖
     */
    private String glucoseInUrine;

    /**
     * 121. [可空] 尿酮体
     */
    private String urinaryKetoneBodies;

    /**
     * 122. [可空] 尿潜血
     */
    private String urineOccultBlood;

    /**
     * 123. [可空] 尿常规其他情况
     */
    private String urineRoutineOthers;

    /**
     * 124. [可空] 空腹血糖L
     */
    private Double fastingBloodGlucoseL;

    /**
     * 125. [可空] 空腹血糖dL
     */
    private Double fastingBloodGlucoseDl;

    /**
     * 126. [可空] 心电图情况代码
     */
    private String ecgCode;

    /**
     * 127. [可空] 心电图情况名称
     */
    private String ecgName;

    /**
     * 128. [可空] 尿微量白蛋白
     */
    private String urineMicroAlbumin;

    /**
     * 129. [可空] 大便潜血情况代码
     */
    private String fecalOccultBloodCode;

    /**
     * 130. [可空] 糖化血红蛋白
     */
    private Double glycatedHemoglobin;

    /**
     * 131. [可空] 乙型肝炎表面抗原情况代码
     */
    private String hepatitisBCode;

    /**
     * 132. [可空] 血清谷丙转氨酶
     */
    private Double alanine;

    /**
     * 133. [可空] 血清谷草转氨酶
     */
    private Double glutamicOxaloacetic;

    /**
     * 134. [可空] 白蛋白
     */
    private Double albumin;

    /**
     * 135. [可空] 总胆红素
     */
    private Double totalBilirubin;

    /**
     * 136. [可空] 结合胆红素
     */
    private Double conjugatedBilirubin;

    /**
     * 137. [可空] 血清肌酐
     */
    private Double serumCreatinine;

    /**
     * 138. [可空] 血尿素氮
     */
    private Double bloodUreaNitrogen;

    /**
     * 139. [可空] 血钾浓度
     */
    private Double serumPotassium;

    /**
     * 140. [可空] 血钠浓度
     */
    private Double serumSodium;

    /**
     * 141. [可空] 总胆固醇
     */
    private Double totalCholesterol;

    /**
     * 142. [可空] 甘油三酯
     */
    private Double triglyceride;

    /**
     * 143. [可空] 血清低密度脂蛋白胆固醇
     */
    private Double serumLowCholesterol;

    /**
     * 144. [可空] 血清高密度脂蛋白胆固醇
     */
    private Double serumHighCholesterol;

    /**
     * 145. [可空] 胸部X线片情况代码
     */
    private String xrayCode;

    /**
     * 146. [可空] 胸部X线片异常说明
     */
    private String xrayDesc;

    /** 210. [可空] 其他B超 */
    protected String bOtherbsoundCode;

    /** 211. [可空] 其他B超异常说明 */
    protected String bOtherbsoundDesc;

    /**
     * 147. [可空] B超情况代码
     */
    private String bUltrasoundCode;

    /**
     * 148. [可空] B超异常说明
     */
    private String bUltrasoundDesc;

    /**
     * 149. [可空] 宫颈涂片情况代码
     */
    private String cervicalSmearCode;

    /**
     * 150. [可空] 宫颈涂片异常说明
     */
    private String cervicalSmearDesc;

    /**
     * 151. [可空] 辅助检查其他情况
     */
    private String auxiliaryOtherDesc;

    /**
     * 152. [可空] 平和质情况代码
     */
    private String flatCode;

    /**
     * 153. [可空] 气虚质情况代码
     */
    private String qiQualityCode;

    /**
     * 154. [可空] 阳虚质情况代码
     */
    private String yangDeficiencyCode;

    /**
     * 155. [可空] 阴虚质情况代码
     */
    private String yinDeficiencyCode;

    /**
     * 156. [可空] 痰湿质情况代码
     */
    private String phlegmDampCode;

    /**
     * 157. [可空] 湿热质情况代码
     */
    private String dampHeatCode;

    /**
     * 158. [可空] 血瘀质情况代码
     */
    private String bloodStasisCode;

    /**
     * 159. [可空] 气郁质情况代码
     */
    private String qiStagnationCode;

    /**
     * 160. [可空] 特秉质情况代码
     */
    private String specialLawCode;

    /**
     * 161. [可空] 脑血管疾病情况代码
     */
    private String cerebralVascularCode;

    /**
     * 162. [可空] 其他脑血管疾病情况名称
     */
    private String cerebralVascularDesc;

    /**
     * 163. [可空] 肾脏疾病情况代码
     */
    private String kidneyDiseaseCode;

    /**
     * 164. [可空] 其他肾脏疾病情况名称
     */
    private String kidneyDiseasesName;

    /**
     * 165. [可空] 心脏疾病情况代码
     */
    private String heartDiseaseCode;

    /**
     * 166. [可空] 其他心脏疾病情况名称
     */
    private String heartDiseaseName;

    /**
     * 167. [可空] 血管疾病情况代码
     */
    private String vascularDiseasesCode;

    /**
     * 168. [可空] 其他血管疾病情况名称
     */
    private String vascularDiseasesName;

    /**
     * 169. [可空] 眼部疾病情况代码
     */
    private String ocularDiseaseCode;

    /**
     * 170. [可空] 其他眼部疾病情况名称
     */
    private String casesNameEyeDiseases;

    /**
     * 171. [可空] 神经系统疾病情况代码
     */
    private String nervousDiseasesCode;

    /**
     * 172. [可空] 其他神经系统疾病情况名称
     */
    private String nervousDiseasesName;

    /**
     * 173. [可空] 其他系统疾病情况代码
     */
    private String otherDiseaseCode;

    /**
     * 174. [可空] 其他其他系统疾病情况名称
     */
    private String otherDiseasesName;

    /**
     * 175. [可空] 健康评价情况代码
     */
    private String evaluationCode;

    /**
     * 176. [可空] 异常情况（补充1）
     */
    private String abnormal1;

    /**
     * 177. [可空] 异常情况（补充2）
     */
    private String abnormal2;

    /**
     * 178. [可空] 异常情况（补充3）
     */
    private String abnormal3;

    /**
     * 179. [可空] 异常情况（补充4）
     */
    private String abnormal4;

    /**
     * 180. [可空] 健康指导情况代码
     */
    private String healthGuidanceCode;

    /**
     * 181. [可空] 危险因素控制情况代码
     */
    private String riskControlCode;

    /**
     * 182. [可空] 危险因素减体重目标
     */
    private String weightTarget;

    /**
     * 183. [可空] 危险因素建议接种疫苗
     */
    private String vaccination;

    /**
     * 184. [可空] 危险因素其他
     */
    private String otherRisk;

    /**
     * 185. [不可空] 登记时间
     */
    private java.util.Date heEntryDate;

    /**
     * 186. [不可空] 登记人员代码
     */
    private String heEntryEmpCode;

    /**
     * 187. [不可空] 登记人员名称
     */
    private String heEntryEmpName;

    /**
     * 188. [不可空] 登记机构编码
     */
    private String heEntryOrgCode;

    /**
     * 189. [不可空] 登记机构名称
     */
    private String heEntryOrgName;

    /**
     * 190. [不可空] 医疗机构代码
     */
    private String orgCode;

    /**
     * 191. [不可空] 填报日期
     */
    private java.util.Date uploadDate;

    /**
     * 192. [不可空] 修改标志 1：正常、2：修改、3：撤销
     */
    private String updateFlag;

    /**
     * 194. [可空] 修改人
     */
    private String editor;

    /**
     * 195. [可空] 更新日期
     */
    private java.util.Date modifydate;

    /**
     * 196. [不可空] 数据来源
     */
    private String fdataFrom;

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

    @Transient
    private List<AbstractEhrHeAdmission> hospitalHistory;
    @Expose
    private String hospitalHistoryJson; //住院史

    @Transient
    private List<AbstractEhrHeAdmission> familyHospitalHistory;
    @Expose
    private String familyHospitalHistoryJson; //家庭病床史

    @Transient
    private List<AbstractEhrHeDrug> drugList;
    @Expose
    private String drugListJson; //主要用药情况

    @Transient
    private List<AbstractEhrHeNpimmunization> inoculateHistory;
    @Expose
    private String inoculateHistoryJson; //非免疫规划预防接种史

    @Generated(hash = 1940831745)
    public AbstractEhrHeRecord(Long localId, String idCard, String vipCard, boolean completed,
            boolean upload, String id, String visitingSerialNumber, String healthfileNo,
            String fileNumber, String name, java.util.Date visitingTime, String heDoctorCode,
            String heDoctorName, String symptomCode, String symptomsName,
            Double bodyTemperature, Double pulseRate, Double respiratoryFrequency,
            Double leftDiastolicPressure, Double leftSystolicPressure,
            Double rightDiastolicPressure, Double rightSystolicPressure, Double height,
            Double weight, Integer waist, Double pmi, String elderlyHealthCode,
            String elderlyLivingCode, String elderlyCognitiveCode,
            Integer elderlyCognitiveScores, String elderlyFeelingCode,
            Integer elderlyFeelingScores, String exerciseFrequencyCode,
            Integer eachExerciseTime, Integer exerciseTime, String exerciseStyle,
            String eatingHabits, String smokingStatusCode, Integer smokingDailyAmount,
            Integer smokingAge, Integer smokingQuitAge, String drinkingFrequencyCode,
            Integer drinkingDailyAmount, String drinkingQuitCode, Integer drinkingAge,
            Integer startDrinkingAge, String isHadDrunk, String alcoholTypeCode,
            String alcoholTypeName, String exposureCode, String exposureWorkers,
            Integer workingTime, String dustName, String dustProtectionCode,
            String dustProtectiveMeasures, String radiationName,
            String radiationProtectiveCode, String radiationProtectionMeasures,
            String physicalName, String physicalProtectiveCode,
            String physicalProtectionMeasures, String chemicalsName,
            String chemicalsProtectiveCode, String chemicalsProtectionMeasures,
            String otherName, String otherProtectiveCode, String otherProtectionMeasures,
            String oralCode, String dentitionCode, String pharyngealCode,
            Double leftEyeVision, Double leftEyeCorrection, Double rightEyeSight,
            Double rightEyeCorrection, String hearingConditionCode, String motionFunctionCode,
            String fundusCode, String fundusSpecification, String skinCode, String skinName,
            String scleralCode, String caseOfSclera, String lymphNodeCode,
            String lymphNodeName, String barrelChestCode, String breathSoundCode,
            String soundOfBreath, String raleConditionCode, String raleCaseName,
            Integer heartRate, String rhythmCode, String heartMurmurCode,
            String heartMurmurName, String abdominalTenderness,
            String abdominalTendernessName, String abdominalMassCode,
            String abdominalMassName, String abdomenLiverCode, String abdomenLiverName,
            String abdominalSplenomegalyCode, String abdominalSplenomegalyName,
            String abdominalMobilityCode, String abdominalMobilityName, String edemaLimbsCode,
            String footPulseCode, String dreCode, String dreName, String breastConditionCode,
            String casesOfBreast, String codeOfVulva, String caseOfVulva,
            String vaginalConditionCode, String caseOfVagina, String cervicalStatusCode,
            String casesOfCervical, String palaceBodyCode, String palaceBodyName,
            String accessoriesCode, String accessoriesName, String checkOther,
            Double hemoglobin, Double whiteBloodCell, Double platelet, String otherBlood,
            String urinaryProtein, String glucoseInUrine, String urinaryKetoneBodies,
            String urineOccultBlood, String urineRoutineOthers, Double fastingBloodGlucoseL,
            Double fastingBloodGlucoseDl, String ecgCode, String ecgName,
            String urineMicroAlbumin, String fecalOccultBloodCode, Double glycatedHemoglobin,
            String hepatitisBCode, Double alanine, Double glutamicOxaloacetic, Double albumin,
            Double totalBilirubin, Double conjugatedBilirubin, Double serumCreatinine,
            Double bloodUreaNitrogen, Double serumPotassium, Double serumSodium,
            Double totalCholesterol, Double triglyceride, Double serumLowCholesterol,
            Double serumHighCholesterol, String xrayCode, String xrayDesc,
            String bOtherbsoundCode, String bOtherbsoundDesc, String bUltrasoundCode,
            String bUltrasoundDesc, String cervicalSmearCode, String cervicalSmearDesc,
            String auxiliaryOtherDesc, String flatCode, String qiQualityCode,
            String yangDeficiencyCode, String yinDeficiencyCode, String phlegmDampCode,
            String dampHeatCode, String bloodStasisCode, String qiStagnationCode,
            String specialLawCode, String cerebralVascularCode, String cerebralVascularDesc,
            String kidneyDiseaseCode, String kidneyDiseasesName, String heartDiseaseCode,
            String heartDiseaseName, String vascularDiseasesCode, String vascularDiseasesName,
            String ocularDiseaseCode, String casesNameEyeDiseases, String nervousDiseasesCode,
            String nervousDiseasesName, String otherDiseaseCode, String otherDiseasesName,
            String evaluationCode, String abnormal1, String abnormal2, String abnormal3,
            String abnormal4, String healthGuidanceCode, String riskControlCode,
            String weightTarget, String vaccination, String otherRisk,
            java.util.Date heEntryDate, String heEntryEmpCode, String heEntryEmpName,
            String heEntryOrgCode, String heEntryOrgName, String orgCode,
            java.util.Date uploadDate, String updateFlag, String editor,
            java.util.Date modifydate, String fdataFrom, String editorId, String updateOrgId,
            String updateOrgName, String hospitalHistoryJson,
            String familyHospitalHistoryJson, String drugListJson,
            String inoculateHistoryJson) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.completed = completed;
        this.upload = upload;
        this.id = id;
        this.visitingSerialNumber = visitingSerialNumber;
        this.healthfileNo = healthfileNo;
        this.fileNumber = fileNumber;
        this.name = name;
        this.visitingTime = visitingTime;
        this.heDoctorCode = heDoctorCode;
        this.heDoctorName = heDoctorName;
        this.symptomCode = symptomCode;
        this.symptomsName = symptomsName;
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.respiratoryFrequency = respiratoryFrequency;
        this.leftDiastolicPressure = leftDiastolicPressure;
        this.leftSystolicPressure = leftSystolicPressure;
        this.rightDiastolicPressure = rightDiastolicPressure;
        this.rightSystolicPressure = rightSystolicPressure;
        this.height = height;
        this.weight = weight;
        this.waist = waist;
        this.pmi = pmi;
        this.elderlyHealthCode = elderlyHealthCode;
        this.elderlyLivingCode = elderlyLivingCode;
        this.elderlyCognitiveCode = elderlyCognitiveCode;
        this.elderlyCognitiveScores = elderlyCognitiveScores;
        this.elderlyFeelingCode = elderlyFeelingCode;
        this.elderlyFeelingScores = elderlyFeelingScores;
        this.exerciseFrequencyCode = exerciseFrequencyCode;
        this.eachExerciseTime = eachExerciseTime;
        this.exerciseTime = exerciseTime;
        this.exerciseStyle = exerciseStyle;
        this.eatingHabits = eatingHabits;
        this.smokingStatusCode = smokingStatusCode;
        this.smokingDailyAmount = smokingDailyAmount;
        this.smokingAge = smokingAge;
        this.smokingQuitAge = smokingQuitAge;
        this.drinkingFrequencyCode = drinkingFrequencyCode;
        this.drinkingDailyAmount = drinkingDailyAmount;
        this.drinkingQuitCode = drinkingQuitCode;
        this.drinkingAge = drinkingAge;
        this.startDrinkingAge = startDrinkingAge;
        this.isHadDrunk = isHadDrunk;
        this.alcoholTypeCode = alcoholTypeCode;
        this.alcoholTypeName = alcoholTypeName;
        this.exposureCode = exposureCode;
        this.exposureWorkers = exposureWorkers;
        this.workingTime = workingTime;
        this.dustName = dustName;
        this.dustProtectionCode = dustProtectionCode;
        this.dustProtectiveMeasures = dustProtectiveMeasures;
        this.radiationName = radiationName;
        this.radiationProtectiveCode = radiationProtectiveCode;
        this.radiationProtectionMeasures = radiationProtectionMeasures;
        this.physicalName = physicalName;
        this.physicalProtectiveCode = physicalProtectiveCode;
        this.physicalProtectionMeasures = physicalProtectionMeasures;
        this.chemicalsName = chemicalsName;
        this.chemicalsProtectiveCode = chemicalsProtectiveCode;
        this.chemicalsProtectionMeasures = chemicalsProtectionMeasures;
        this.otherName = otherName;
        this.otherProtectiveCode = otherProtectiveCode;
        this.otherProtectionMeasures = otherProtectionMeasures;
        this.oralCode = oralCode;
        this.dentitionCode = dentitionCode;
        this.pharyngealCode = pharyngealCode;
        this.leftEyeVision = leftEyeVision;
        this.leftEyeCorrection = leftEyeCorrection;
        this.rightEyeSight = rightEyeSight;
        this.rightEyeCorrection = rightEyeCorrection;
        this.hearingConditionCode = hearingConditionCode;
        this.motionFunctionCode = motionFunctionCode;
        this.fundusCode = fundusCode;
        this.fundusSpecification = fundusSpecification;
        this.skinCode = skinCode;
        this.skinName = skinName;
        this.scleralCode = scleralCode;
        this.caseOfSclera = caseOfSclera;
        this.lymphNodeCode = lymphNodeCode;
        this.lymphNodeName = lymphNodeName;
        this.barrelChestCode = barrelChestCode;
        this.breathSoundCode = breathSoundCode;
        this.soundOfBreath = soundOfBreath;
        this.raleConditionCode = raleConditionCode;
        this.raleCaseName = raleCaseName;
        this.heartRate = heartRate;
        this.rhythmCode = rhythmCode;
        this.heartMurmurCode = heartMurmurCode;
        this.heartMurmurName = heartMurmurName;
        this.abdominalTenderness = abdominalTenderness;
        this.abdominalTendernessName = abdominalTendernessName;
        this.abdominalMassCode = abdominalMassCode;
        this.abdominalMassName = abdominalMassName;
        this.abdomenLiverCode = abdomenLiverCode;
        this.abdomenLiverName = abdomenLiverName;
        this.abdominalSplenomegalyCode = abdominalSplenomegalyCode;
        this.abdominalSplenomegalyName = abdominalSplenomegalyName;
        this.abdominalMobilityCode = abdominalMobilityCode;
        this.abdominalMobilityName = abdominalMobilityName;
        this.edemaLimbsCode = edemaLimbsCode;
        this.footPulseCode = footPulseCode;
        this.dreCode = dreCode;
        this.dreName = dreName;
        this.breastConditionCode = breastConditionCode;
        this.casesOfBreast = casesOfBreast;
        this.codeOfVulva = codeOfVulva;
        this.caseOfVulva = caseOfVulva;
        this.vaginalConditionCode = vaginalConditionCode;
        this.caseOfVagina = caseOfVagina;
        this.cervicalStatusCode = cervicalStatusCode;
        this.casesOfCervical = casesOfCervical;
        this.palaceBodyCode = palaceBodyCode;
        this.palaceBodyName = palaceBodyName;
        this.accessoriesCode = accessoriesCode;
        this.accessoriesName = accessoriesName;
        this.checkOther = checkOther;
        this.hemoglobin = hemoglobin;
        this.whiteBloodCell = whiteBloodCell;
        this.platelet = platelet;
        this.otherBlood = otherBlood;
        this.urinaryProtein = urinaryProtein;
        this.glucoseInUrine = glucoseInUrine;
        this.urinaryKetoneBodies = urinaryKetoneBodies;
        this.urineOccultBlood = urineOccultBlood;
        this.urineRoutineOthers = urineRoutineOthers;
        this.fastingBloodGlucoseL = fastingBloodGlucoseL;
        this.fastingBloodGlucoseDl = fastingBloodGlucoseDl;
        this.ecgCode = ecgCode;
        this.ecgName = ecgName;
        this.urineMicroAlbumin = urineMicroAlbumin;
        this.fecalOccultBloodCode = fecalOccultBloodCode;
        this.glycatedHemoglobin = glycatedHemoglobin;
        this.hepatitisBCode = hepatitisBCode;
        this.alanine = alanine;
        this.glutamicOxaloacetic = glutamicOxaloacetic;
        this.albumin = albumin;
        this.totalBilirubin = totalBilirubin;
        this.conjugatedBilirubin = conjugatedBilirubin;
        this.serumCreatinine = serumCreatinine;
        this.bloodUreaNitrogen = bloodUreaNitrogen;
        this.serumPotassium = serumPotassium;
        this.serumSodium = serumSodium;
        this.totalCholesterol = totalCholesterol;
        this.triglyceride = triglyceride;
        this.serumLowCholesterol = serumLowCholesterol;
        this.serumHighCholesterol = serumHighCholesterol;
        this.xrayCode = xrayCode;
        this.xrayDesc = xrayDesc;
        this.bOtherbsoundCode = bOtherbsoundCode;
        this.bOtherbsoundDesc = bOtherbsoundDesc;
        this.bUltrasoundCode = bUltrasoundCode;
        this.bUltrasoundDesc = bUltrasoundDesc;
        this.cervicalSmearCode = cervicalSmearCode;
        this.cervicalSmearDesc = cervicalSmearDesc;
        this.auxiliaryOtherDesc = auxiliaryOtherDesc;
        this.flatCode = flatCode;
        this.qiQualityCode = qiQualityCode;
        this.yangDeficiencyCode = yangDeficiencyCode;
        this.yinDeficiencyCode = yinDeficiencyCode;
        this.phlegmDampCode = phlegmDampCode;
        this.dampHeatCode = dampHeatCode;
        this.bloodStasisCode = bloodStasisCode;
        this.qiStagnationCode = qiStagnationCode;
        this.specialLawCode = specialLawCode;
        this.cerebralVascularCode = cerebralVascularCode;
        this.cerebralVascularDesc = cerebralVascularDesc;
        this.kidneyDiseaseCode = kidneyDiseaseCode;
        this.kidneyDiseasesName = kidneyDiseasesName;
        this.heartDiseaseCode = heartDiseaseCode;
        this.heartDiseaseName = heartDiseaseName;
        this.vascularDiseasesCode = vascularDiseasesCode;
        this.vascularDiseasesName = vascularDiseasesName;
        this.ocularDiseaseCode = ocularDiseaseCode;
        this.casesNameEyeDiseases = casesNameEyeDiseases;
        this.nervousDiseasesCode = nervousDiseasesCode;
        this.nervousDiseasesName = nervousDiseasesName;
        this.otherDiseaseCode = otherDiseaseCode;
        this.otherDiseasesName = otherDiseasesName;
        this.evaluationCode = evaluationCode;
        this.abnormal1 = abnormal1;
        this.abnormal2 = abnormal2;
        this.abnormal3 = abnormal3;
        this.abnormal4 = abnormal4;
        this.healthGuidanceCode = healthGuidanceCode;
        this.riskControlCode = riskControlCode;
        this.weightTarget = weightTarget;
        this.vaccination = vaccination;
        this.otherRisk = otherRisk;
        this.heEntryDate = heEntryDate;
        this.heEntryEmpCode = heEntryEmpCode;
        this.heEntryEmpName = heEntryEmpName;
        this.heEntryOrgCode = heEntryOrgCode;
        this.heEntryOrgName = heEntryOrgName;
        this.orgCode = orgCode;
        this.uploadDate = uploadDate;
        this.updateFlag = updateFlag;
        this.editor = editor;
        this.modifydate = modifydate;
        this.fdataFrom = fdataFrom;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
        this.hospitalHistoryJson = hospitalHistoryJson;
        this.familyHospitalHistoryJson = familyHospitalHistoryJson;
        this.drugListJson = drugListJson;
        this.inoculateHistoryJson = inoculateHistoryJson;
    }

    @Generated(hash = 633147437)
    public AbstractEhrHeRecord() {
    }

    public String getVisitingSerialNumber() {
        return this.visitingSerialNumber;
    }

    public void setVisitingSerialNumber(String visitingSerialNumber) {
        this.visitingSerialNumber = visitingSerialNumber;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getVisitingTime() {
        return this.visitingTime;
    }

    public void setVisitingTime(java.util.Date visitingTime) {
        this.visitingTime = visitingTime;
    }

    public String getHeDoctorCode() {
        return this.heDoctorCode;
    }

    public void setHeDoctorCode(String heDoctorCode) {
        this.heDoctorCode = heDoctorCode;
    }

    public String getHeDoctorName() {
        return this.heDoctorName;
    }

    public void setHeDoctorName(String heDoctorName) {
        this.heDoctorName = heDoctorName;
    }

    public String getSymptomCode() {
        return this.symptomCode;
    }

    public void setSymptomCode(String symptomCode) {
        this.symptomCode = symptomCode;
    }

    public String getSymptomsName() {
        return this.symptomsName;
    }

    public void setSymptomsName(String symptomsName) {
        this.symptomsName = symptomsName;
    }

    public Double getBodyTemperature() {
        return this.bodyTemperature;
    }

    public void setBodyTemperature(Double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public Double getPulseRate() {
        return this.pulseRate;
    }

    public void setPulseRate(Double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public Double getRespiratoryFrequency() {
        return this.respiratoryFrequency;
    }

    public void setRespiratoryFrequency(Double respiratoryFrequency) {
        this.respiratoryFrequency = respiratoryFrequency;
    }

    public Double getLeftDiastolicPressure() {
        return this.leftDiastolicPressure;
    }

    public void setLeftDiastolicPressure(Double leftDiastolicPressure) {
        this.leftDiastolicPressure = leftDiastolicPressure;
    }

    public Double getLeftSystolicPressure() {
        return this.leftSystolicPressure;
    }

    public void setLeftSystolicPressure(Double leftSystolicPressure) {
        this.leftSystolicPressure = leftSystolicPressure;
    }

    public Double getRightDiastolicPressure() {
        return this.rightDiastolicPressure;
    }

    public void setRightDiastolicPressure(Double rightDiastolicPressure) {
        this.rightDiastolicPressure = rightDiastolicPressure;
    }

    public Double getRightSystolicPressure() {
        return this.rightSystolicPressure;
    }

    public void setRightSystolicPressure(Double rightSystolicPressure) {
        this.rightSystolicPressure = rightSystolicPressure;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getWaist() {
        return this.waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Double getPmi() {
        return this.pmi;
    }

    public void setPmi(Double pmi) {
        this.pmi = pmi;
    }

    public String getElderlyHealthCode() {
        return this.elderlyHealthCode;
    }

    public void setElderlyHealthCode(String elderlyHealthCode) {
        this.elderlyHealthCode = elderlyHealthCode;
    }

    public String getElderlyLivingCode() {
        return this.elderlyLivingCode;
    }

    public void setElderlyLivingCode(String elderlyLivingCode) {
        this.elderlyLivingCode = elderlyLivingCode;
    }

    public String getElderlyCognitiveCode() {
        return this.elderlyCognitiveCode;
    }

    public void setElderlyCognitiveCode(String elderlyCognitiveCode) {
        this.elderlyCognitiveCode = elderlyCognitiveCode;
    }

    public Integer getElderlyCognitiveScores() {
        return this.elderlyCognitiveScores;
    }

    public void setElderlyCognitiveScores(Integer elderlyCognitiveScores) {
        this.elderlyCognitiveScores = elderlyCognitiveScores;
    }

    public String getElderlyFeelingCode() {
        return this.elderlyFeelingCode;
    }

    public void setElderlyFeelingCode(String elderlyFeelingCode) {
        this.elderlyFeelingCode = elderlyFeelingCode;
    }

    public Integer getElderlyFeelingScores() {
        return this.elderlyFeelingScores;
    }

    public void setElderlyFeelingScores(Integer elderlyFeelingScores) {
        this.elderlyFeelingScores = elderlyFeelingScores;
    }

    public String getExerciseFrequencyCode() {
        return this.exerciseFrequencyCode;
    }

    public void setExerciseFrequencyCode(String exerciseFrequencyCode) {
        this.exerciseFrequencyCode = exerciseFrequencyCode;
    }

    public Integer getEachExerciseTime() {
        return this.eachExerciseTime;
    }

    public void setEachExerciseTime(Integer eachExerciseTime) {
        this.eachExerciseTime = eachExerciseTime;
    }

    public Integer getExerciseTime() {
        return this.exerciseTime;
    }

    public void setExerciseTime(Integer exerciseTime) {
        this.exerciseTime = exerciseTime;
    }

    public String getExerciseStyle() {
        return this.exerciseStyle;
    }

    public void setExerciseStyle(String exerciseStyle) {
        this.exerciseStyle = exerciseStyle;
    }

    public String getEatingHabits() {
        return this.eatingHabits;
    }

    public void setEatingHabits(String eatingHabits) {
        this.eatingHabits = eatingHabits;
    }

    public String getSmokingStatusCode() {
        return this.smokingStatusCode;
    }

    public void setSmokingStatusCode(String smokingStatusCode) {
        this.smokingStatusCode = smokingStatusCode;
    }

    public Integer getSmokingDailyAmount() {
        return this.smokingDailyAmount;
    }

    public void setSmokingDailyAmount(Integer smokingDailyAmount) {
        this.smokingDailyAmount = smokingDailyAmount;
    }

    public Integer getSmokingAge() {
        return this.smokingAge;
    }

    public void setSmokingAge(Integer smokingAge) {
        this.smokingAge = smokingAge;
    }

    public Integer getSmokingQuitAge() {
        return this.smokingQuitAge;
    }

    public void setSmokingQuitAge(Integer smokingQuitAge) {
        this.smokingQuitAge = smokingQuitAge;
    }

    public String getDrinkingFrequencyCode() {
        return this.drinkingFrequencyCode;
    }

    public void setDrinkingFrequencyCode(String drinkingFrequencyCode) {
        this.drinkingFrequencyCode = drinkingFrequencyCode;
    }

    public Integer getDrinkingDailyAmount() {
        return this.drinkingDailyAmount;
    }

    public void setDrinkingDailyAmount(Integer drinkingDailyAmount) {
        this.drinkingDailyAmount = drinkingDailyAmount;
    }

    public String getDrinkingQuitCode() {
        return this.drinkingQuitCode;
    }

    public void setDrinkingQuitCode(String drinkingQuitCode) {
        this.drinkingQuitCode = drinkingQuitCode;
    }

    public Integer getDrinkingAge() {
        return this.drinkingAge;
    }

    public void setDrinkingAge(Integer drinkingAge) {
        this.drinkingAge = drinkingAge;
    }

    public Integer getStartDrinkingAge() {
        return this.startDrinkingAge;
    }

    public void setStartDrinkingAge(Integer startDrinkingAge) {
        this.startDrinkingAge = startDrinkingAge;
    }

    public String getIsHadDrunk() {
        return this.isHadDrunk;
    }

    public void setIsHadDrunk(String isHadDrunk) {
        this.isHadDrunk = isHadDrunk;
    }

    public String getAlcoholTypeCode() {
        return this.alcoholTypeCode;
    }

    public void setAlcoholTypeCode(String alcoholTypeCode) {
        this.alcoholTypeCode = alcoholTypeCode;
    }

    public String getAlcoholTypeName() {
        return this.alcoholTypeName;
    }

    public void setAlcoholTypeName(String alcoholTypeName) {
        this.alcoholTypeName = alcoholTypeName;
    }

    public String getExposureCode() {
        return this.exposureCode;
    }

    public void setExposureCode(String exposureCode) {
        this.exposureCode = exposureCode;
    }

    public String getExposureWorkers() {
        return this.exposureWorkers;
    }

    public void setExposureWorkers(String exposureWorkers) {
        this.exposureWorkers = exposureWorkers;
    }

    public Integer getWorkingTime() {
        return this.workingTime;
    }

    public void setWorkingTime(Integer workingTime) {
        this.workingTime = workingTime;
    }

    public String getDustName() {
        return this.dustName;
    }

    public void setDustName(String dustName) {
        this.dustName = dustName;
    }

    public String getDustProtectionCode() {
        return this.dustProtectionCode;
    }

    public void setDustProtectionCode(String dustProtectionCode) {
        this.dustProtectionCode = dustProtectionCode;
    }

    public String getDustProtectiveMeasures() {
        return this.dustProtectiveMeasures;
    }

    public void setDustProtectiveMeasures(String dustProtectiveMeasures) {
        this.dustProtectiveMeasures = dustProtectiveMeasures;
    }

    public String getRadiationName() {
        return this.radiationName;
    }

    public void setRadiationName(String radiationName) {
        this.radiationName = radiationName;
    }

    public String getRadiationProtectiveCode() {
        return this.radiationProtectiveCode;
    }

    public void setRadiationProtectiveCode(String radiationProtectiveCode) {
        this.radiationProtectiveCode = radiationProtectiveCode;
    }

    public String getRadiationProtectionMeasures() {
        return this.radiationProtectionMeasures;
    }

    public void setRadiationProtectionMeasures(String radiationProtectionMeasures) {
        this.radiationProtectionMeasures = radiationProtectionMeasures;
    }

    public String getPhysicalName() {
        return this.physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public String getPhysicalProtectiveCode() {
        return this.physicalProtectiveCode;
    }

    public void setPhysicalProtectiveCode(String physicalProtectiveCode) {
        this.physicalProtectiveCode = physicalProtectiveCode;
    }

    public String getPhysicalProtectionMeasures() {
        return this.physicalProtectionMeasures;
    }

    public void setPhysicalProtectionMeasures(String physicalProtectionMeasures) {
        this.physicalProtectionMeasures = physicalProtectionMeasures;
    }

    public String getChemicalsName() {
        return this.chemicalsName;
    }

    public void setChemicalsName(String chemicalsName) {
        this.chemicalsName = chemicalsName;
    }

    public String getChemicalsProtectiveCode() {
        return this.chemicalsProtectiveCode;
    }

    public void setChemicalsProtectiveCode(String chemicalsProtectiveCode) {
        this.chemicalsProtectiveCode = chemicalsProtectiveCode;
    }

    public String getChemicalsProtectionMeasures() {
        return this.chemicalsProtectionMeasures;
    }

    public void setChemicalsProtectionMeasures(String chemicalsProtectionMeasures) {
        this.chemicalsProtectionMeasures = chemicalsProtectionMeasures;
    }

    public String getOtherName() {
        return this.otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getOtherProtectiveCode() {
        return this.otherProtectiveCode;
    }

    public void setOtherProtectiveCode(String otherProtectiveCode) {
        this.otherProtectiveCode = otherProtectiveCode;
    }

    public String getOtherProtectionMeasures() {
        return this.otherProtectionMeasures;
    }

    public void setOtherProtectionMeasures(String otherProtectionMeasures) {
        this.otherProtectionMeasures = otherProtectionMeasures;
    }

    public String getOralCode() {
        return this.oralCode;
    }

    public void setOralCode(String oralCode) {
        this.oralCode = oralCode;
    }

    public String getDentitionCode() {
        return this.dentitionCode;
    }

    public void setDentitionCode(String dentitionCode) {
        this.dentitionCode = dentitionCode;
    }

    public String getPharyngealCode() {
        return this.pharyngealCode;
    }

    public void setPharyngealCode(String pharyngealCode) {
        this.pharyngealCode = pharyngealCode;
    }

    public Double getLeftEyeVision() {
        return this.leftEyeVision;
    }

    public void setLeftEyeVision(Double leftEyeVision) {
        this.leftEyeVision = leftEyeVision;
    }

    public Double getLeftEyeCorrection() {
        return this.leftEyeCorrection;
    }

    public void setLeftEyeCorrection(Double leftEyeCorrection) {
        this.leftEyeCorrection = leftEyeCorrection;
    }

    public Double getRightEyeSight() {
        return this.rightEyeSight;
    }

    public void setRightEyeSight(Double rightEyeSight) {
        this.rightEyeSight = rightEyeSight;
    }

    public Double getRightEyeCorrection() {
        return this.rightEyeCorrection;
    }

    public void setRightEyeCorrection(Double rightEyeCorrection) {
        this.rightEyeCorrection = rightEyeCorrection;
    }

    public String getHearingConditionCode() {
        return this.hearingConditionCode;
    }

    public void setHearingConditionCode(String hearingConditionCode) {
        this.hearingConditionCode = hearingConditionCode;
    }

    public String getMotionFunctionCode() {
        return this.motionFunctionCode;
    }

    public void setMotionFunctionCode(String motionFunctionCode) {
        this.motionFunctionCode = motionFunctionCode;
    }

    public String getFundusCode() {
        return this.fundusCode;
    }

    public void setFundusCode(String fundusCode) {
        this.fundusCode = fundusCode;
    }

    public String getFundusSpecification() {
        return this.fundusSpecification;
    }

    public void setFundusSpecification(String fundusSpecification) {
        this.fundusSpecification = fundusSpecification;
    }

    public String getSkinCode() {
        return this.skinCode;
    }

    public void setSkinCode(String skinCode) {
        this.skinCode = skinCode;
    }

    public String getSkinName() {
        return this.skinName;
    }

    public void setSkinName(String skinName) {
        this.skinName = skinName;
    }

    public String getScleralCode() {
        return this.scleralCode;
    }

    public void setScleralCode(String scleralCode) {
        this.scleralCode = scleralCode;
    }

    public String getCaseOfSclera() {
        return this.caseOfSclera;
    }

    public void setCaseOfSclera(String caseOfSclera) {
        this.caseOfSclera = caseOfSclera;
    }

    public String getLymphNodeCode() {
        return this.lymphNodeCode;
    }

    public void setLymphNodeCode(String lymphNodeCode) {
        this.lymphNodeCode = lymphNodeCode;
    }

    public String getLymphNodeName() {
        return this.lymphNodeName;
    }

    public void setLymphNodeName(String lymphNodeName) {
        this.lymphNodeName = lymphNodeName;
    }

    public String getBarrelChestCode() {
        return this.barrelChestCode;
    }

    public void setBarrelChestCode(String barrelChestCode) {
        this.barrelChestCode = barrelChestCode;
    }

    public String getBreathSoundCode() {
        return this.breathSoundCode;
    }

    public void setBreathSoundCode(String breathSoundCode) {
        this.breathSoundCode = breathSoundCode;
    }

    public String getSoundOfBreath() {
        return this.soundOfBreath;
    }

    public void setSoundOfBreath(String soundOfBreath) {
        this.soundOfBreath = soundOfBreath;
    }

    public String getRaleConditionCode() {
        return this.raleConditionCode;
    }

    public void setRaleConditionCode(String raleConditionCode) {
        this.raleConditionCode = raleConditionCode;
    }

    public String getRaleCaseName() {
        return this.raleCaseName;
    }

    public void setRaleCaseName(String raleCaseName) {
        this.raleCaseName = raleCaseName;
    }

    public Integer getHeartRate() {
        return this.heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public String getRhythmCode() {
        return this.rhythmCode;
    }

    public void setRhythmCode(String rhythmCode) {
        this.rhythmCode = rhythmCode;
    }

    public String getHeartMurmurCode() {
        return this.heartMurmurCode;
    }

    public void setHeartMurmurCode(String heartMurmurCode) {
        this.heartMurmurCode = heartMurmurCode;
    }

    public String getHeartMurmurName() {
        return this.heartMurmurName;
    }

    public void setHeartMurmurName(String heartMurmurName) {
        this.heartMurmurName = heartMurmurName;
    }

    public String getAbdominalTenderness() {
        return this.abdominalTenderness;
    }

    public void setAbdominalTenderness(String abdominalTenderness) {
        this.abdominalTenderness = abdominalTenderness;
    }

    public String getAbdominalTendernessName() {
        return this.abdominalTendernessName;
    }

    public void setAbdominalTendernessName(String abdominalTendernessName) {
        this.abdominalTendernessName = abdominalTendernessName;
    }

    public String getAbdominalMassCode() {
        return this.abdominalMassCode;
    }

    public void setAbdominalMassCode(String abdominalMassCode) {
        this.abdominalMassCode = abdominalMassCode;
    }

    public String getAbdominalMassName() {
        return this.abdominalMassName;
    }

    public void setAbdominalMassName(String abdominalMassName) {
        this.abdominalMassName = abdominalMassName;
    }

    public String getAbdomenLiverCode() {
        return this.abdomenLiverCode;
    }

    public void setAbdomenLiverCode(String abdomenLiverCode) {
        this.abdomenLiverCode = abdomenLiverCode;
    }

    public String getAbdomenLiverName() {
        return this.abdomenLiverName;
    }

    public void setAbdomenLiverName(String abdomenLiverName) {
        this.abdomenLiverName = abdomenLiverName;
    }

    public String getAbdominalSplenomegalyCode() {
        return this.abdominalSplenomegalyCode;
    }

    public void setAbdominalSplenomegalyCode(String abdominalSplenomegalyCode) {
        this.abdominalSplenomegalyCode = abdominalSplenomegalyCode;
    }

    public String getAbdominalSplenomegalyName() {
        return this.abdominalSplenomegalyName;
    }

    public void setAbdominalSplenomegalyName(String abdominalSplenomegalyName) {
        this.abdominalSplenomegalyName = abdominalSplenomegalyName;
    }

    public String getAbdominalMobilityCode() {
        return this.abdominalMobilityCode;
    }

    public void setAbdominalMobilityCode(String abdominalMobilityCode) {
        this.abdominalMobilityCode = abdominalMobilityCode;
    }

    public String getAbdominalMobilityName() {
        return this.abdominalMobilityName;
    }

    public void setAbdominalMobilityName(String abdominalMobilityName) {
        this.abdominalMobilityName = abdominalMobilityName;
    }

    public String getEdemaLimbsCode() {
        return this.edemaLimbsCode;
    }

    public void setEdemaLimbsCode(String edemaLimbsCode) {
        this.edemaLimbsCode = edemaLimbsCode;
    }

    public String getFootPulseCode() {
        return this.footPulseCode;
    }

    public void setFootPulseCode(String footPulseCode) {
        this.footPulseCode = footPulseCode;
    }

    public String getDreCode() {
        return this.dreCode;
    }

    public void setDreCode(String dreCode) {
        this.dreCode = dreCode;
    }

    public String getDreName() {
        return this.dreName;
    }

    public void setDreName(String dreName) {
        this.dreName = dreName;
    }

    public String getBreastConditionCode() {
        return this.breastConditionCode;
    }

    public void setBreastConditionCode(String breastConditionCode) {
        this.breastConditionCode = breastConditionCode;
    }

    public String getCasesOfBreast() {
        return this.casesOfBreast;
    }

    public void setCasesOfBreast(String casesOfBreast) {
        this.casesOfBreast = casesOfBreast;
    }

    public String getCodeOfVulva() {
        return this.codeOfVulva;
    }

    public void setCodeOfVulva(String codeOfVulva) {
        this.codeOfVulva = codeOfVulva;
    }

    public String getCaseOfVulva() {
        return this.caseOfVulva;
    }

    public void setCaseOfVulva(String caseOfVulva) {
        this.caseOfVulva = caseOfVulva;
    }

    public String getVaginalConditionCode() {
        return this.vaginalConditionCode;
    }

    public void setVaginalConditionCode(String vaginalConditionCode) {
        this.vaginalConditionCode = vaginalConditionCode;
    }

    public String getCaseOfVagina() {
        return this.caseOfVagina;
    }

    public void setCaseOfVagina(String caseOfVagina) {
        this.caseOfVagina = caseOfVagina;
    }

    public String getCervicalStatusCode() {
        return this.cervicalStatusCode;
    }

    public void setCervicalStatusCode(String cervicalStatusCode) {
        this.cervicalStatusCode = cervicalStatusCode;
    }

    public String getCasesOfCervical() {
        return this.casesOfCervical;
    }

    public void setCasesOfCervical(String casesOfCervical) {
        this.casesOfCervical = casesOfCervical;
    }

    public String getPalaceBodyCode() {
        return this.palaceBodyCode;
    }

    public void setPalaceBodyCode(String palaceBodyCode) {
        this.palaceBodyCode = palaceBodyCode;
    }

    public String getPalaceBodyName() {
        return this.palaceBodyName;
    }

    public void setPalaceBodyName(String palaceBodyName) {
        this.palaceBodyName = palaceBodyName;
    }

    public String getAccessoriesCode() {
        return this.accessoriesCode;
    }

    public void setAccessoriesCode(String accessoriesCode) {
        this.accessoriesCode = accessoriesCode;
    }

    public String getAccessoriesName() {
        return this.accessoriesName;
    }

    public void setAccessoriesName(String accessoriesName) {
        this.accessoriesName = accessoriesName;
    }

    public String getCheckOther() {
        return this.checkOther;
    }

    public void setCheckOther(String checkOther) {
        this.checkOther = checkOther;
    }

    public Double getHemoglobin() {
        return this.hemoglobin;
    }

    public void setHemoglobin(Double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public Double getWhiteBloodCell() {
        return this.whiteBloodCell;
    }

    public void setWhiteBloodCell(Double whiteBloodCell) {
        this.whiteBloodCell = whiteBloodCell;
    }

    public Double getPlatelet() {
        return this.platelet;
    }

    public void setPlatelet(Double platelet) {
        this.platelet = platelet;
    }

    public String getOtherBlood() {
        return this.otherBlood;
    }

    public void setOtherBlood(String otherBlood) {
        this.otherBlood = otherBlood;
    }

    public String getUrinaryProtein() {
        return this.urinaryProtein;
    }

    public void setUrinaryProtein(String urinaryProtein) {
        this.urinaryProtein = urinaryProtein;
    }

    public String getGlucoseInUrine() {
        return this.glucoseInUrine;
    }

    public void setGlucoseInUrine(String glucoseInUrine) {
        this.glucoseInUrine = glucoseInUrine;
    }

    public String getUrinaryKetoneBodies() {
        return this.urinaryKetoneBodies;
    }

    public void setUrinaryKetoneBodies(String urinaryKetoneBodies) {
        this.urinaryKetoneBodies = urinaryKetoneBodies;
    }

    public String getUrineOccultBlood() {
        return this.urineOccultBlood;
    }

    public void setUrineOccultBlood(String urineOccultBlood) {
        this.urineOccultBlood = urineOccultBlood;
    }

    public String getUrineRoutineOthers() {
        return this.urineRoutineOthers;
    }

    public void setUrineRoutineOthers(String urineRoutineOthers) {
        this.urineRoutineOthers = urineRoutineOthers;
    }

    public Double getFastingBloodGlucoseL() {
        return this.fastingBloodGlucoseL;
    }

    public void setFastingBloodGlucoseL(Double fastingBloodGlucoseL) {
        this.fastingBloodGlucoseL = fastingBloodGlucoseL;
    }

    public Double getFastingBloodGlucoseDl() {
        return this.fastingBloodGlucoseDl;
    }

    public void setFastingBloodGlucoseDl(Double fastingBloodGlucoseDl) {
        this.fastingBloodGlucoseDl = fastingBloodGlucoseDl;
    }

    public String getEcgCode() {
        return this.ecgCode;
    }

    public void setEcgCode(String ecgCode) {
        this.ecgCode = ecgCode;
    }

    public String getEcgName() {
        return this.ecgName;
    }

    public void setEcgName(String ecgName) {
        this.ecgName = ecgName;
    }

    public String getUrineMicroAlbumin() {
        return this.urineMicroAlbumin;
    }

    public void setUrineMicroAlbumin(String urineMicroAlbumin) {
        this.urineMicroAlbumin = urineMicroAlbumin;
    }

    public String getFecalOccultBloodCode() {
        return this.fecalOccultBloodCode;
    }

    public void setFecalOccultBloodCode(String fecalOccultBloodCode) {
        this.fecalOccultBloodCode = fecalOccultBloodCode;
    }

    public Double getGlycatedHemoglobin() {
        return this.glycatedHemoglobin;
    }

    public void setGlycatedHemoglobin(Double glycatedHemoglobin) {
        this.glycatedHemoglobin = glycatedHemoglobin;
    }

    public String getHepatitisBCode() {
        return this.hepatitisBCode;
    }

    public void setHepatitisBCode(String hepatitisBCode) {
        this.hepatitisBCode = hepatitisBCode;
    }

    public Double getAlanine() {
        return this.alanine;
    }

    public void setAlanine(Double alanine) {
        this.alanine = alanine;
    }

    public Double getGlutamicOxaloacetic() {
        return this.glutamicOxaloacetic;
    }

    public void setGlutamicOxaloacetic(Double glutamicOxaloacetic) {
        this.glutamicOxaloacetic = glutamicOxaloacetic;
    }

    public Double getAlbumin() {
        return this.albumin;
    }

    public void setAlbumin(Double albumin) {
        this.albumin = albumin;
    }

    public Double getTotalBilirubin() {
        return this.totalBilirubin;
    }

    public void setTotalBilirubin(Double totalBilirubin) {
        this.totalBilirubin = totalBilirubin;
    }

    public Double getConjugatedBilirubin() {
        return this.conjugatedBilirubin;
    }

    public void setConjugatedBilirubin(Double conjugatedBilirubin) {
        this.conjugatedBilirubin = conjugatedBilirubin;
    }

    public Double getSerumCreatinine() {
        return this.serumCreatinine;
    }

    public void setSerumCreatinine(Double serumCreatinine) {
        this.serumCreatinine = serumCreatinine;
    }

    public Double getBloodUreaNitrogen() {
        return this.bloodUreaNitrogen;
    }

    public void setBloodUreaNitrogen(Double bloodUreaNitrogen) {
        this.bloodUreaNitrogen = bloodUreaNitrogen;
    }

    public Double getSerumPotassium() {
        return this.serumPotassium;
    }

    public void setSerumPotassium(Double serumPotassium) {
        this.serumPotassium = serumPotassium;
    }

    public Double getSerumSodium() {
        return this.serumSodium;
    }

    public void setSerumSodium(Double serumSodium) {
        this.serumSodium = serumSodium;
    }

    public Double getTotalCholesterol() {
        return this.totalCholesterol;
    }

    public void setTotalCholesterol(Double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public Double getTriglyceride() {
        return this.triglyceride;
    }

    public void setTriglyceride(Double triglyceride) {
        this.triglyceride = triglyceride;
    }

    public Double getSerumLowCholesterol() {
        return this.serumLowCholesterol;
    }

    public void setSerumLowCholesterol(Double serumLowCholesterol) {
        this.serumLowCholesterol = serumLowCholesterol;
    }

    public Double getSerumHighCholesterol() {
        return this.serumHighCholesterol;
    }

    public void setSerumHighCholesterol(Double serumHighCholesterol) {
        this.serumHighCholesterol = serumHighCholesterol;
    }

    public String getXrayCode() {
        return this.xrayCode;
    }

    public void setXrayCode(String xrayCode) {
        this.xrayCode = xrayCode;
    }

    public String getXrayDesc() {
        return this.xrayDesc;
    }

    public void setXrayDesc(String xrayDesc) {
        this.xrayDesc = xrayDesc;
    }

    public String getBUltrasoundCode() {
        return this.bUltrasoundCode;
    }

    public void setBUltrasoundCode(String bUltrasoundCode) {
        this.bUltrasoundCode = bUltrasoundCode;
    }

    public String getBUltrasoundDesc() {
        return this.bUltrasoundDesc;
    }

    public void setBUltrasoundDesc(String bUltrasoundDesc) {
        this.bUltrasoundDesc = bUltrasoundDesc;
    }

    public String getCervicalSmearCode() {
        return this.cervicalSmearCode;
    }

    public void setCervicalSmearCode(String cervicalSmearCode) {
        this.cervicalSmearCode = cervicalSmearCode;
    }

    public String getCervicalSmearDesc() {
        return this.cervicalSmearDesc;
    }

    public void setCervicalSmearDesc(String cervicalSmearDesc) {
        this.cervicalSmearDesc = cervicalSmearDesc;
    }

    public String getAuxiliaryOtherDesc() {
        return this.auxiliaryOtherDesc;
    }

    public void setAuxiliaryOtherDesc(String auxiliaryOtherDesc) {
        this.auxiliaryOtherDesc = auxiliaryOtherDesc;
    }

    public String getFlatCode() {
        return this.flatCode;
    }

    public void setFlatCode(String flatCode) {
        this.flatCode = flatCode;
    }

    public String getQiQualityCode() {
        return this.qiQualityCode;
    }

    public void setQiQualityCode(String qiQualityCode) {
        this.qiQualityCode = qiQualityCode;
    }

    public String getYangDeficiencyCode() {
        return this.yangDeficiencyCode;
    }

    public void setYangDeficiencyCode(String yangDeficiencyCode) {
        this.yangDeficiencyCode = yangDeficiencyCode;
    }

    public String getYinDeficiencyCode() {
        return this.yinDeficiencyCode;
    }

    public void setYinDeficiencyCode(String yinDeficiencyCode) {
        this.yinDeficiencyCode = yinDeficiencyCode;
    }

    public String getPhlegmDampCode() {
        return this.phlegmDampCode;
    }

    public void setPhlegmDampCode(String phlegmDampCode) {
        this.phlegmDampCode = phlegmDampCode;
    }

    public String getDampHeatCode() {
        return this.dampHeatCode;
    }

    public void setDampHeatCode(String dampHeatCode) {
        this.dampHeatCode = dampHeatCode;
    }

    public String getBloodStasisCode() {
        return this.bloodStasisCode;
    }

    public void setBloodStasisCode(String bloodStasisCode) {
        this.bloodStasisCode = bloodStasisCode;
    }

    public String getQiStagnationCode() {
        return this.qiStagnationCode;
    }

    public void setQiStagnationCode(String qiStagnationCode) {
        this.qiStagnationCode = qiStagnationCode;
    }

    public String getSpecialLawCode() {
        return this.specialLawCode;
    }

    public void setSpecialLawCode(String specialLawCode) {
        this.specialLawCode = specialLawCode;
    }

    public String getCerebralVascularCode() {
        return this.cerebralVascularCode;
    }

    public void setCerebralVascularCode(String cerebralVascularCode) {
        this.cerebralVascularCode = cerebralVascularCode;
    }

    public String getCerebralVascularDesc() {
        return this.cerebralVascularDesc;
    }

    public void setCerebralVascularDesc(String cerebralVascularDesc) {
        this.cerebralVascularDesc = cerebralVascularDesc;
    }

    public String getKidneyDiseaseCode() {
        return this.kidneyDiseaseCode;
    }

    public void setKidneyDiseaseCode(String kidneyDiseaseCode) {
        this.kidneyDiseaseCode = kidneyDiseaseCode;
    }

    public String getKidneyDiseasesName() {
        return this.kidneyDiseasesName;
    }

    public void setKidneyDiseasesName(String kidneyDiseasesName) {
        this.kidneyDiseasesName = kidneyDiseasesName;
    }

    public String getHeartDiseaseCode() {
        return this.heartDiseaseCode;
    }

    public void setHeartDiseaseCode(String heartDiseaseCode) {
        this.heartDiseaseCode = heartDiseaseCode;
    }

    public String getHeartDiseaseName() {
        return this.heartDiseaseName;
    }

    public void setHeartDiseaseName(String heartDiseaseName) {
        this.heartDiseaseName = heartDiseaseName;
    }

    public String getVascularDiseasesCode() {
        return this.vascularDiseasesCode;
    }

    public void setVascularDiseasesCode(String vascularDiseasesCode) {
        this.vascularDiseasesCode = vascularDiseasesCode;
    }

    public String getVascularDiseasesName() {
        return this.vascularDiseasesName;
    }

    public void setVascularDiseasesName(String vascularDiseasesName) {
        this.vascularDiseasesName = vascularDiseasesName;
    }

    public String getOcularDiseaseCode() {
        return this.ocularDiseaseCode;
    }

    public void setOcularDiseaseCode(String ocularDiseaseCode) {
        this.ocularDiseaseCode = ocularDiseaseCode;
    }

    public String getCasesNameEyeDiseases() {
        return this.casesNameEyeDiseases;
    }

    public void setCasesNameEyeDiseases(String casesNameEyeDiseases) {
        this.casesNameEyeDiseases = casesNameEyeDiseases;
    }

    public String getNervousDiseasesCode() {
        return this.nervousDiseasesCode;
    }

    public void setNervousDiseasesCode(String nervousDiseasesCode) {
        this.nervousDiseasesCode = nervousDiseasesCode;
    }

    public String getNervousDiseasesName() {
        return this.nervousDiseasesName;
    }

    public void setNervousDiseasesName(String nervousDiseasesName) {
        this.nervousDiseasesName = nervousDiseasesName;
    }

    public String getOtherDiseaseCode() {
        return this.otherDiseaseCode;
    }

    public void setOtherDiseaseCode(String otherDiseaseCode) {
        this.otherDiseaseCode = otherDiseaseCode;
    }

    public String getOtherDiseasesName() {
        return this.otherDiseasesName;
    }

    public void setOtherDiseasesName(String otherDiseasesName) {
        this.otherDiseasesName = otherDiseasesName;
    }

    public String getEvaluationCode() {
        return this.evaluationCode;
    }

    public void setEvaluationCode(String evaluationCode) {
        this.evaluationCode = evaluationCode;
    }

    public String getAbnormal1() {
        return this.abnormal1;
    }

    public void setAbnormal1(String abnormal1) {
        this.abnormal1 = abnormal1;
    }

    public String getAbnormal2() {
        return this.abnormal2;
    }

    public void setAbnormal2(String abnormal2) {
        this.abnormal2 = abnormal2;
    }

    public String getAbnormal3() {
        return this.abnormal3;
    }

    public void setAbnormal3(String abnormal3) {
        this.abnormal3 = abnormal3;
    }

    public String getAbnormal4() {
        return this.abnormal4;
    }

    public void setAbnormal4(String abnormal4) {
        this.abnormal4 = abnormal4;
    }

    public String getHealthGuidanceCode() {
        return this.healthGuidanceCode;
    }

    public void setHealthGuidanceCode(String healthGuidanceCode) {
        this.healthGuidanceCode = healthGuidanceCode;
    }

    public String getRiskControlCode() {
        return this.riskControlCode;
    }

    public void setRiskControlCode(String riskControlCode) {
        this.riskControlCode = riskControlCode;
    }

    public String getWeightTarget() {
        return this.weightTarget;
    }

    public void setWeightTarget(String weightTarget) {
        this.weightTarget = weightTarget;
    }

    public String getVaccination() {
        return this.vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getOtherRisk() {
        return this.otherRisk;
    }

    public void setOtherRisk(String otherRisk) {
        this.otherRisk = otherRisk;
    }

    public java.util.Date getHeEntryDate() {
        return this.heEntryDate;
    }

    public void setHeEntryDate(java.util.Date heEntryDate) {
        this.heEntryDate = heEntryDate;
    }

    public String getHeEntryEmpCode() {
        return this.heEntryEmpCode;
    }

    public void setHeEntryEmpCode(String heEntryEmpCode) {
        this.heEntryEmpCode = heEntryEmpCode;
    }

    public String getHeEntryEmpName() {
        return this.heEntryEmpName;
    }

    public void setHeEntryEmpName(String heEntryEmpName) {
        this.heEntryEmpName = heEntryEmpName;
    }

    public String getHeEntryOrgCode() {
        return this.heEntryOrgCode;
    }

    public void setHeEntryOrgCode(String heEntryOrgCode) {
        this.heEntryOrgCode = heEntryOrgCode;
    }

    public String getHeEntryOrgName() {
        return this.heEntryOrgName;
    }

    public void setHeEntryOrgName(String heEntryOrgName) {
        this.heEntryOrgName = heEntryOrgName;
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

    public String getUpdateFlag() {
        return this.updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
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

    public String getFdataFrom() {
        return this.fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getHospitalHistoryJson() {
        return this.hospitalHistoryJson;
    }

    public void setHospitalHistoryJson(String hospitalHistoryJson) {
        this.hospitalHistoryJson = hospitalHistoryJson;
    }

    public String getFamilyHospitalHistoryJson() {
        return this.familyHospitalHistoryJson;
    }

    public void setFamilyHospitalHistoryJson(String familyHospitalHistoryJson) {
        this.familyHospitalHistoryJson = familyHospitalHistoryJson;
    }

    public String getDrugListJson() {
        return this.drugListJson;
    }

    public void setDrugListJson(String drugListJson) {
        this.drugListJson = drugListJson;
    }

    public String getInoculateHistoryJson() {
        return this.inoculateHistoryJson;
    }

    public void setInoculateHistoryJson(String inoculateHistoryJson) {
        this.inoculateHistoryJson = inoculateHistoryJson;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public boolean getUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
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

    public String getVipCard() {
        return this.vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public List<AbstractEhrHeAdmission> getHospitalHistory() {
        return hospitalHistory;
    }

    public void setHospitalHistory(List<AbstractEhrHeAdmission> hospitalHistory) {
        this.hospitalHistory = hospitalHistory;
    }

    public List<AbstractEhrHeAdmission> getFamilyHospitalHistory() {
        return familyHospitalHistory;
    }

    public void setFamilyHospitalHistory(List<AbstractEhrHeAdmission> familyHospitalHistory) {
        this.familyHospitalHistory = familyHospitalHistory;
    }

    public List<AbstractEhrHeDrug> getDrugList() {
        return drugList;
    }

    public void setDrugList(List<AbstractEhrHeDrug> drugList) {
        this.drugList = drugList;
    }

    public List<AbstractEhrHeNpimmunization> getInoculateHistory() {
        return inoculateHistory;
    }

    public void setInoculateHistory(List<AbstractEhrHeNpimmunization> inoculateHistory) {
        this.inoculateHistory = inoculateHistory;
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

    public String getBOtherbsoundCode() {
        return this.bOtherbsoundCode;
    }

    public void setBOtherbsoundCode(String bOtherbsoundCode) {
        this.bOtherbsoundCode = bOtherbsoundCode;
    }

    public String getBOtherbsoundDesc() {
        return this.bOtherbsoundDesc;
    }

    public void setBOtherbsoundDesc(String bOtherbsoundDesc) {
        this.bOtherbsoundDesc = bOtherbsoundDesc;
    }
}
