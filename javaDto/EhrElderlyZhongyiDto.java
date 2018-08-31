package com.konsung.bean.tcm;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.konsung.bean.BaseChildBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 老年人中医体质辨识DTO
 * @author kuangguohua
 *
 */
@Entity
public class EhrElderlyZhongyiDto extends BaseChildBean implements Parcelable {
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

    /** 2. [可空] 健康档案编号 */
    protected String healthfileNo;

    /** 3. [可空] 老年人基本信息编号 */
    protected String elderlyNo;

    /** 4. [可空] 姓名 */
    protected String xm;

    /** 5. [可空] 精力充沛 1 */
    protected Integer jlcf;

    /** 6. [可空] 容易疲乏 2*/
    protected Integer rypf;

    /** 7. [可空] 容易气短 3*/
    protected Integer ryqd;

    /** 8. [可空] 说话无力 4*/
    protected Integer shwl;

    /** 9. [可空] 心情不愉快5 */
    protected Integer xqbyk;

    /** 10. [可空] 遇事紧张6 */
    protected Integer ysjz;

    /** 11. [可空] 孤独失落 7*/
    protected Integer gdsl;

    /** 12. [可空] 容易感到害怕8 */
    protected Integer yygdhp;

    /** 13. [可空] 身体超重 9*/
    protected Integer stcz;

    /** 14. [可空] 眼睛干涩 10*/
    protected Integer yjgs;

    /** 15. [可空] 手脚发凉 11*/
    protected Integer sjfl;

    /** 16. [可空] 胃脘怕冷 12 */
    protected Integer wwpl;

    /** 17. [可空] 不耐寒 13*/
    protected Integer bnh;

    /** 18. [可空] 容易患感冒 14*/
    protected Integer ryhgm;

    /** 19. [可空] 鼻塞流涕 15*/
    protected Integer bslt;

    /** 20. [可空] 口粘口腻 16*/
    protected Integer kzkn;

    /** 21. [可空] 容易过敏 17*/
    protected Integer rygm;

    /** 22. [可空] 皮肤容易荨麻疹 18*/
    protected Integer pfryxmz;

    /** 23. [可空] 青紫瘀斑 19*/
    protected Integer qzyb;

    /** 24. [可空] 皮肤一抓就红 20*/
    protected Integer pfyzjh;

    /** 25. [可空] 皮肤口唇干 21*/
    protected Integer pfkcg;

    /** 26. [可空] 肢体麻木 22*/
    protected Integer ztmm;

    /** 27. [可空] 面部鼻部油腻 23*/
    protected Integer mbbbyn;

    /** 28. [可空] 面色晦暗 24*/
    protected Integer msha;

    /** 29. [可空] 皮肤湿疹 25*/
    protected Integer pfsz;

    /** 30. [可空] 口干咽燥 26*/
    protected Integer kkyz;

    /** 31. [可空] 口苦口臭27 */
    protected Integer kkkc;

    /** 32. [可空] 腹部肥大 28*/
    protected Integer fbfd;

    /** 33. [可空] 不喜凉食 29*/
    protected Integer bxls;

    /** 34. [可空] 解不尽 30*/
    protected Integer jbj;

    /** 35. [可空] 大便干燥 31*/
    protected Integer dbgz;

    /** 36. [可空] 舌苔厚腻 32*/
    protected Integer sthn;

    /** 37. [可空] 舌下静脉淤紫 33*/
    protected Integer sxjmyz;

    /** 38. [可空] 气虚质评分 */
    protected Integer qixuzhi;

    /** 39. [可空] 阳虚质评分 */
    protected Integer yangxuzhi;

    /** 40. [可空] 阴虚质评分 */
    protected Integer yinxuzhi;

    /** 41. [可空] 痰湿质评分 */
    protected Integer tanshizhi;

    /** 42. [可空] 湿热质评分 */
    protected Integer shirezhi;

    /** 43. [可空] 血瘀质评分 */
    protected Integer xueyuzhi;

    /** 44. [可空] 气郁质评分 */
    protected Integer qiyuzhi;

    /** 45. [可空] 特禀质评分 */
    protected Integer tebingzhi;

    /** 46. [可空] 平和质评分 */
    protected Integer pinghezhi;

    /** 47. [可空] 中医保健指导 */
    protected String zybjzd;

    /** 48. [可空] 其他中医保健指导 */
    protected String qtzybjzd;

    /** 49. [可空] 主要体质 */
    protected String zytz;

    /** 50. [可空] 倾向体质 */
    protected String qxtz;

    /** 51. [可空] 录入日期 */
    protected java.util.Date lrrq;

    /** 52. [可空] 录入人 */
    protected String lrr;

    /** 53. [可空] 机构编号 */
    protected String orgcode;

    /** 54. [可空] 评估医生 */
    protected String pgys;

    /** 55. [可空] 评估医生姓名 */
    protected String pgysxm;

    /** 56. [可空] 评估日期 */
    protected java.util.Date pgrq;

    /** 57. [不可空] 填报日期 */
    protected java.util.Date uploadDate;

    /** 58. [不可空] 数据来源 */
    protected String fdataFrom;

    /** 59. [可空] 修改者 */
    protected String editor;

    /** 60. [可空] 修改日期 */
    protected java.util.Date modifydate;

    /** 61. [不可空] 修改标志,1新增,2修改,3撤销 */
    protected String updateFlag;

    /** 62. [可空] 气虚质保健指导 */
    protected String qixuzhiZd;

    /** 63. [可空] 阳虚质保健指导 */
    protected String yangxuzhiZd;

    /** 64. [可空] 阴虚质保健指导 */
    protected String yinxuzhiZd;

    /** 65. [可空] 痰湿质保健指导 */
    protected String tanshizhiZd;

    /** 66. [可空] 湿热质保健指导 */
    protected String shirezhiZd;

    /** 67. [可空] 血瘀质保健指导 */
    protected String xueyuzhiZd;

    /** 68. [可空] 气郁质保健指导 */
    protected String qiyuzhiZd;

    /** 69. [可空] 特禀质保健指导 */
    protected String tebingzhiZd;

    /** 70. [可空] 平和质保健指导 */
    protected String pinghezhiZd;

    /** 71. [可空] 气虚质保健指导其他 */
    protected String qixuzhiOther;

    /** 72. [可空] 阳虚质保健指导其他 */
    protected String yangxuzhiOther;

    /** 73. [可空] 阴虚质保健指导其他 */
    protected String yinxuzhiOther;

    /** 74. [可空] 痰湿质保健指导其他 */
    protected String tanshizhiOther;

    /** 75. [可空] 湿热质保健指导其他 */
    protected String shirezhiOther;

    /** 76. [可空] 血瘀质保健指导其他 */
    protected String xueyuzhiOther;

    /** 77. [可空] 气郁质保健指导其他 */
    protected String qiyuzhiOther;

    /** 78. [可空] 特禀质保健指导其他 */
    protected String tebingzhiOther;

    /** 79. [可空] 平和质保健指导其他 */
    protected String pinghezhiOther;

    /** [可空] 修改人ID */
    private String editorId;

    /** [可空] 修改机构编码 */
    private String updateOrgId;

    /** [可空] 修改机构名称 */
    private String updateOrgName;

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFdataFrom() {
        return fdataFrom;
    }

    public void setFdataFrom(String fdataFrom) {
        this.fdataFrom = fdataFrom;
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

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getQixuzhiZd() {
        return qixuzhiZd;
    }

    public void setQixuzhiZd(String qixuzhiZd) {
        this.qixuzhiZd = qixuzhiZd;
    }

    public String getYangxuzhiZd() {
        return yangxuzhiZd;
    }

    public void setYangxuzhiZd(String yangxuzhiZd) {
        this.yangxuzhiZd = yangxuzhiZd;
    }

    public String getYinxuzhiZd() {
        return yinxuzhiZd;
    }

    public void setYinxuzhiZd(String yinxuzhiZd) {
        this.yinxuzhiZd = yinxuzhiZd;
    }

    public String getTanshizhiZd() {
        return tanshizhiZd;
    }

    public void setTanshizhiZd(String tanshizhiZd) {
        this.tanshizhiZd = tanshizhiZd;
    }

    public String getShirezhiZd() {
        return shirezhiZd;
    }

    public void setShirezhiZd(String shirezhiZd) {
        this.shirezhiZd = shirezhiZd;
    }

    public String getXueyuzhiZd() {
        return xueyuzhiZd;
    }

    public void setXueyuzhiZd(String xueyuzhiZd) {
        this.xueyuzhiZd = xueyuzhiZd;
    }

    public String getQiyuzhiZd() {
        return qiyuzhiZd;
    }

    public void setQiyuzhiZd(String qiyuzhiZd) {
        this.qiyuzhiZd = qiyuzhiZd;
    }

    public String getTebingzhiZd() {
        return tebingzhiZd;
    }

    public void setTebingzhiZd(String tebingzhiZd) {
        this.tebingzhiZd = tebingzhiZd;
    }

    public String getPinghezhiZd() {
        return pinghezhiZd;
    }

    public void setPinghezhiZd(String pinghezhiZd) {
        this.pinghezhiZd = pinghezhiZd;
    }

    public static Creator<EhrElderlyZhongyiDto> getCREATOR() {
        return CREATOR;
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

    @Override
    public Date getFollowupDate() {
        return lrrq;
    }

    @Override
    public void setFollowupDate(Date followupDate) {
        this.lrrq = followupDate;
    }

    @Override
    public Date getNextFollowupDate() {
        return null;
    }

    @Override
    public void setNextFollowupDate(Date nextFollowupDate) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHealthfileNo() {
        return healthfileNo;
    }

    public void setHealthfileNo(String healthfileNo) {
        this.healthfileNo = healthfileNo;
    }

    public String getElderlyNo() {
        return elderlyNo;
    }

    public void setElderlyNo(String elderlyNo) {
        this.elderlyNo = elderlyNo;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Integer getJlcf() {
        return jlcf;
    }

    public void setJlcf(Integer jlcf) {
        this.jlcf = jlcf;
    }

    public Integer getRypf() {
        return rypf;
    }

    public void setRypf(Integer rypf) {
        this.rypf = rypf;
    }

    public Integer getRyqd() {
        return ryqd;
    }

    public void setRyqd(Integer ryqd) {
        this.ryqd = ryqd;
    }

    public Integer getShwl() {
        return shwl;
    }

    public void setShwl(Integer shwl) {
        this.shwl = shwl;
    }

    public Integer getXqbyk() {
        return xqbyk;
    }

    public void setXqbyk(Integer xqbyk) {
        this.xqbyk = xqbyk;
    }

    public Integer getYsjz() {
        return ysjz;
    }

    public void setYsjz(Integer ysjz) {
        this.ysjz = ysjz;
    }

    public Integer getGdsl() {
        return gdsl;
    }

    public void setGdsl(Integer gdsl) {
        this.gdsl = gdsl;
    }

    public Integer getYygdhp() {
        return yygdhp;
    }

    public void setYygdhp(Integer yygdhp) {
        this.yygdhp = yygdhp;
    }

    public Integer getStcz() {
        return stcz;
    }

    public void setStcz(Integer stcz) {
        this.stcz = stcz;
    }

    public Integer getYjgs() {
        return yjgs;
    }

    public void setYjgs(Integer yjgs) {
        this.yjgs = yjgs;
    }

    public Integer getSjfl() {
        return sjfl;
    }

    public void setSjfl(Integer sjfl) {
        this.sjfl = sjfl;
    }

    public Integer getWwpl() {
        return wwpl;
    }

    public void setWwpl(Integer wwpl) {
        this.wwpl = wwpl;
    }

    public Integer getBnh() {
        return bnh;
    }

    public void setBnh(Integer bnh) {
        this.bnh = bnh;
    }

    public Integer getRyhgm() {
        return ryhgm;
    }

    public void setRyhgm(Integer ryhgm) {
        this.ryhgm = ryhgm;
    }

    public Integer getBslt() {
        return bslt;
    }

    public void setBslt(Integer bslt) {
        this.bslt = bslt;
    }

    public Integer getKzkn() {
        return kzkn;
    }

    public void setKzkn(Integer kzkn) {
        this.kzkn = kzkn;
    }

    public Integer getRygm() {
        return rygm;
    }

    public void setRygm(Integer rygm) {
        this.rygm = rygm;
    }

    public Integer getPfryxmz() {
        return pfryxmz;
    }

    public void setPfryxmz(Integer pfryxmz) {
        this.pfryxmz = pfryxmz;
    }

    public Integer getQzyb() {
        return qzyb;
    }

    public void setQzyb(Integer qzyb) {
        this.qzyb = qzyb;
    }

    public Integer getPfyzjh() {
        return pfyzjh;
    }

    public void setPfyzjh(Integer pfyzjh) {
        this.pfyzjh = pfyzjh;
    }

    public Integer getPfkcg() {
        return pfkcg;
    }

    public void setPfkcg(Integer pfkcg) {
        this.pfkcg = pfkcg;
    }

    public Integer getZtmm() {
        return ztmm;
    }

    public void setZtmm(Integer ztmm) {
        this.ztmm = ztmm;
    }

    public Integer getMbbbyn() {
        return mbbbyn;
    }

    public void setMbbbyn(Integer mbbbyn) {
        this.mbbbyn = mbbbyn;
    }

    public Integer getMsha() {
        return msha;
    }

    public void setMsha(Integer msha) {
        this.msha = msha;
    }

    public Integer getPfsz() {
        return pfsz;
    }

    public void setPfsz(Integer pfsz) {
        this.pfsz = pfsz;
    }

    public Integer getKkyz() {
        return kkyz;
    }

    public void setKkyz(Integer kkyz) {
        this.kkyz = kkyz;
    }

    public Integer getKkkc() {
        return kkkc;
    }

    public void setKkkc(Integer kkkc) {
        this.kkkc = kkkc;
    }

    public Integer getFbfd() {
        return fbfd;
    }

    public void setFbfd(Integer fbfd) {
        this.fbfd = fbfd;
    }

    public Integer getBxls() {
        return bxls;
    }

    public void setBxls(Integer bxls) {
        this.bxls = bxls;
    }

    public Integer getJbj() {
        return jbj;
    }

    public void setJbj(Integer jbj) {
        this.jbj = jbj;
    }

    public Integer getDbgz() {
        return dbgz;
    }

    public void setDbgz(Integer dbgz) {
        this.dbgz = dbgz;
    }

    public Integer getSthn() {
        return sthn;
    }

    public void setSthn(Integer sthn) {
        this.sthn = sthn;
    }

    public Integer getSxjmyz() {
        return sxjmyz;
    }

    public void setSxjmyz(Integer sxjmyz) {
        this.sxjmyz = sxjmyz;
    }

    public Integer getQixuzhi() {
        return qixuzhi;
    }

    public void setQixuzhi(Integer qixuzhi) {
        this.qixuzhi = qixuzhi;
    }

    public Integer getYangxuzhi() {
        return yangxuzhi;
    }

    public void setYangxuzhi(Integer yangxuzhi) {
        this.yangxuzhi = yangxuzhi;
    }

    public Integer getYinxuzhi() {
        return yinxuzhi;
    }

    public void setYinxuzhi(Integer yinxuzhi) {
        this.yinxuzhi = yinxuzhi;
    }

    public Integer getTanshizhi() {
        return tanshizhi;
    }

    public void setTanshizhi(Integer tanshizhi) {
        this.tanshizhi = tanshizhi;
    }

    public Integer getShirezhi() {
        return shirezhi;
    }

    public void setShirezhi(Integer shirezhi) {
        this.shirezhi = shirezhi;
    }

    public Integer getXueyuzhi() {
        return xueyuzhi;
    }

    public void setXueyuzhi(Integer xueyuzhi) {
        this.xueyuzhi = xueyuzhi;
    }

    public Integer getQiyuzhi() {
        return qiyuzhi;
    }

    public void setQiyuzhi(Integer qiyuzhi) {
        this.qiyuzhi = qiyuzhi;
    }

    public Integer getTebingzhi() {
        return tebingzhi;
    }

    public void setTebingzhi(Integer tebingzhi) {
        this.tebingzhi = tebingzhi;
    }

    public Integer getPinghezhi() {
        return pinghezhi;
    }

    public void setPinghezhi(Integer pinghezhi) {
        this.pinghezhi = pinghezhi;
    }

    public String getZybjzd() {
        return zybjzd;
    }

    public void setZybjzd(String zybjzd) {
        this.zybjzd = zybjzd;
    }

    public String getQtzybjzd() {
        return qtzybjzd;
    }

    public void setQtzybjzd(String qtzybjzd) {
        this.qtzybjzd = qtzybjzd;
    }

    public String getZytz() {
        return zytz;
    }

    public void setZytz(String zytz) {
        this.zytz = zytz;
    }

    public String getQxtz() {
        return qxtz;
    }

    public void setQxtz(String qxtz) {
        this.qxtz = qxtz;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getPgys() {
        return pgys;
    }

    public void setPgys(String pgys) {
        this.pgys = pgys;
    }

    public String getPgysxm() {
        return pgysxm;
    }

    public void setPgysxm(String pgysxm) {
        this.pgysxm = pgysxm;
    }

    public Date getPgrq() {
        return pgrq;
    }

    public void setPgrq(Date pgrq) {
        this.pgrq = pgrq;
    }

    public boolean getUpload() {
        return this.upload;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.localId);
        dest.writeString(this.idCard);
        dest.writeString(this.vipCard);
        dest.writeByte(this.upload ? (byte) 1 : (byte) 0);
        dest.writeByte(this.completed ? (byte) 1 : (byte) 0);
        dest.writeString(this.title);
        dest.writeString(this.id);
        dest.writeString(this.healthfileNo);
        dest.writeString(this.elderlyNo);
        dest.writeString(this.xm);
        dest.writeValue(this.jlcf);
        dest.writeValue(this.rypf);
        dest.writeValue(this.ryqd);
        dest.writeValue(this.shwl);
        dest.writeValue(this.xqbyk);
        dest.writeValue(this.ysjz);
        dest.writeValue(this.gdsl);
        dest.writeValue(this.yygdhp);
        dest.writeValue(this.stcz);
        dest.writeValue(this.yjgs);
        dest.writeValue(this.sjfl);
        dest.writeValue(this.wwpl);
        dest.writeValue(this.bnh);
        dest.writeValue(this.ryhgm);
        dest.writeValue(this.bslt);
        dest.writeValue(this.kzkn);
        dest.writeValue(this.rygm);
        dest.writeValue(this.pfryxmz);
        dest.writeValue(this.qzyb);
        dest.writeValue(this.pfyzjh);
        dest.writeValue(this.pfkcg);
        dest.writeValue(this.ztmm);
        dest.writeValue(this.mbbbyn);
        dest.writeValue(this.msha);
        dest.writeValue(this.pfsz);
        dest.writeValue(this.kkyz);
        dest.writeValue(this.kkkc);
        dest.writeValue(this.fbfd);
        dest.writeValue(this.bxls);
        dest.writeValue(this.jbj);
        dest.writeValue(this.dbgz);
        dest.writeValue(this.sthn);
        dest.writeValue(this.sxjmyz);
        dest.writeValue(this.qixuzhi);
        dest.writeValue(this.yangxuzhi);
        dest.writeValue(this.yinxuzhi);
        dest.writeValue(this.tanshizhi);
        dest.writeValue(this.shirezhi);
        dest.writeValue(this.xueyuzhi);
        dest.writeValue(this.qiyuzhi);
        dest.writeValue(this.tebingzhi);
        dest.writeValue(this.pinghezhi);
        dest.writeString(this.zybjzd);
        dest.writeString(this.qtzybjzd);
        dest.writeString(this.zytz);
        dest.writeString(this.qxtz);
        dest.writeLong(this.lrrq != null ? this.lrrq.getTime() : -1);
        dest.writeString(this.lrr);
        dest.writeString(this.orgcode);
        dest.writeString(this.pgys);
        dest.writeString(this.pgysxm);
        dest.writeLong(this.pgrq != null ? this.pgrq.getTime() : -1);
    }

    public String getLrr() {
        return this.lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public String getQixuzhiOther() {
        return this.qixuzhiOther;
    }

    public void setQixuzhiOther(String qixuzhiOther) {
        this.qixuzhiOther = qixuzhiOther;
    }

    public String getYangxuzhiOther() {
        return this.yangxuzhiOther;
    }

    public void setYangxuzhiOther(String yangxuzhiOther) {
        this.yangxuzhiOther = yangxuzhiOther;
    }

    public String getYinxuzhiOther() {
        return this.yinxuzhiOther;
    }

    public void setYinxuzhiOther(String yinxuzhiOther) {
        this.yinxuzhiOther = yinxuzhiOther;
    }

    public String getTanshizhiOther() {
        return this.tanshizhiOther;
    }

    public void setTanshizhiOther(String tanshizhiOther) {
        this.tanshizhiOther = tanshizhiOther;
    }

    public String getShirezhiOther() {
        return this.shirezhiOther;
    }

    public void setShirezhiOther(String shirezhiOther) {
        this.shirezhiOther = shirezhiOther;
    }

    public String getXueyuzhiOther() {
        return this.xueyuzhiOther;
    }

    public void setXueyuzhiOther(String xueyuzhiOther) {
        this.xueyuzhiOther = xueyuzhiOther;
    }

    public String getQiyuzhiOther() {
        return this.qiyuzhiOther;
    }

    public void setQiyuzhiOther(String qiyuzhiOther) {
        this.qiyuzhiOther = qiyuzhiOther;
    }

    public String getTebingzhiOther() {
        return this.tebingzhiOther;
    }

    public void setTebingzhiOther(String tebingzhiOther) {
        this.tebingzhiOther = tebingzhiOther;
    }

    public String getPinghezhiOther() {
        return this.pinghezhiOther;
    }

    public void setPinghezhiOther(String pinghezhiOther) {
        this.pinghezhiOther = pinghezhiOther;
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

    protected EhrElderlyZhongyiDto(Parcel in) {
        this.localId = (Long) in.readValue(Long.class.getClassLoader());
        this.idCard = in.readString();
        this.vipCard = in.readString();
        this.upload = in.readByte() != 0;
        this.completed = in.readByte() != 0;
        this.title = in.readString();
        this.id = in.readString();
        this.healthfileNo = in.readString();
        this.elderlyNo = in.readString();
        this.xm = in.readString();
        this.jlcf = (Integer) in.readValue(Integer.class.getClassLoader());
        this.rypf = (Integer) in.readValue(Integer.class.getClassLoader());
        this.ryqd = (Integer) in.readValue(Integer.class.getClassLoader());
        this.shwl = (Integer) in.readValue(Integer.class.getClassLoader());
        this.xqbyk = (Integer) in.readValue(Integer.class.getClassLoader());
        this.ysjz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.gdsl = (Integer) in.readValue(Integer.class.getClassLoader());
        this.yygdhp = (Integer) in.readValue(Integer.class.getClassLoader());
        this.stcz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.yjgs = (Integer) in.readValue(Integer.class.getClassLoader());
        this.sjfl = (Integer) in.readValue(Integer.class.getClassLoader());
        this.wwpl = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bnh = (Integer) in.readValue(Integer.class.getClassLoader());
        this.ryhgm = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bslt = (Integer) in.readValue(Integer.class.getClassLoader());
        this.kzkn = (Integer) in.readValue(Integer.class.getClassLoader());
        this.rygm = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pfryxmz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.qzyb = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pfyzjh = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pfkcg = (Integer) in.readValue(Integer.class.getClassLoader());
        this.ztmm = (Integer) in.readValue(Integer.class.getClassLoader());
        this.mbbbyn = (Integer) in.readValue(Integer.class.getClassLoader());
        this.msha = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pfsz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.kkyz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.kkkc = (Integer) in.readValue(Integer.class.getClassLoader());
        this.fbfd = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bxls = (Integer) in.readValue(Integer.class.getClassLoader());
        this.jbj = (Integer) in.readValue(Integer.class.getClassLoader());
        this.dbgz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.sthn = (Integer) in.readValue(Integer.class.getClassLoader());
        this.sxjmyz = (Integer) in.readValue(Integer.class.getClassLoader());
        this.qixuzhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.yangxuzhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.yinxuzhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.tanshizhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.shirezhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.xueyuzhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.qiyuzhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.tebingzhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pinghezhi = (Integer) in.readValue(Integer.class.getClassLoader());
        this.zybjzd = in.readString();
        this.qtzybjzd = in.readString();
        this.zytz = in.readString();
        this.qxtz = in.readString();
        long tmpLrrq = in.readLong();
        this.lrrq = tmpLrrq == -1 ? null : new Date(tmpLrrq);
        this.lrr = in.readString();
        this.orgcode = in.readString();
        this.pgys = in.readString();
        this.pgysxm = in.readString();
        long tmpPgrq = in.readLong();
        this.pgrq = tmpPgrq == -1 ? null : new Date(tmpPgrq);
    }

    @Generated(hash = 1941606265)
    public EhrElderlyZhongyiDto(Long localId, String idCard, String vipCard, boolean upload, boolean completed,
            String title, String id, String healthfileNo, String elderlyNo, String xm, Integer jlcf, Integer rypf,
            Integer ryqd, Integer shwl, Integer xqbyk, Integer ysjz, Integer gdsl, Integer yygdhp, Integer stcz,
            Integer yjgs, Integer sjfl, Integer wwpl, Integer bnh, Integer ryhgm, Integer bslt, Integer kzkn, Integer rygm,
            Integer pfryxmz, Integer qzyb, Integer pfyzjh, Integer pfkcg, Integer ztmm, Integer mbbbyn, Integer msha,
            Integer pfsz, Integer kkyz, Integer kkkc, Integer fbfd, Integer bxls, Integer jbj, Integer dbgz, Integer sthn,
            Integer sxjmyz, Integer qixuzhi, Integer yangxuzhi, Integer yinxuzhi, Integer tanshizhi, Integer shirezhi,
            Integer xueyuzhi, Integer qiyuzhi, Integer tebingzhi, Integer pinghezhi, String zybjzd, String qtzybjzd,
            String zytz, String qxtz, java.util.Date lrrq, String lrr, String orgcode, String pgys, String pgysxm,
            java.util.Date pgrq, java.util.Date uploadDate, String fdataFrom, String editor, java.util.Date modifydate,
            String updateFlag, String qixuzhiZd, String yangxuzhiZd, String yinxuzhiZd, String tanshizhiZd,
            String shirezhiZd, String xueyuzhiZd, String qiyuzhiZd, String tebingzhiZd, String pinghezhiZd,
            String qixuzhiOther, String yangxuzhiOther, String yinxuzhiOther, String tanshizhiOther, String shirezhiOther,
            String xueyuzhiOther, String qiyuzhiOther, String tebingzhiOther, String pinghezhiOther, String editorId,
            String updateOrgId, String updateOrgName) {
        this.localId = localId;
        this.idCard = idCard;
        this.vipCard = vipCard;
        this.upload = upload;
        this.completed = completed;
        this.title = title;
        this.id = id;
        this.healthfileNo = healthfileNo;
        this.elderlyNo = elderlyNo;
        this.xm = xm;
        this.jlcf = jlcf;
        this.rypf = rypf;
        this.ryqd = ryqd;
        this.shwl = shwl;
        this.xqbyk = xqbyk;
        this.ysjz = ysjz;
        this.gdsl = gdsl;
        this.yygdhp = yygdhp;
        this.stcz = stcz;
        this.yjgs = yjgs;
        this.sjfl = sjfl;
        this.wwpl = wwpl;
        this.bnh = bnh;
        this.ryhgm = ryhgm;
        this.bslt = bslt;
        this.kzkn = kzkn;
        this.rygm = rygm;
        this.pfryxmz = pfryxmz;
        this.qzyb = qzyb;
        this.pfyzjh = pfyzjh;
        this.pfkcg = pfkcg;
        this.ztmm = ztmm;
        this.mbbbyn = mbbbyn;
        this.msha = msha;
        this.pfsz = pfsz;
        this.kkyz = kkyz;
        this.kkkc = kkkc;
        this.fbfd = fbfd;
        this.bxls = bxls;
        this.jbj = jbj;
        this.dbgz = dbgz;
        this.sthn = sthn;
        this.sxjmyz = sxjmyz;
        this.qixuzhi = qixuzhi;
        this.yangxuzhi = yangxuzhi;
        this.yinxuzhi = yinxuzhi;
        this.tanshizhi = tanshizhi;
        this.shirezhi = shirezhi;
        this.xueyuzhi = xueyuzhi;
        this.qiyuzhi = qiyuzhi;
        this.tebingzhi = tebingzhi;
        this.pinghezhi = pinghezhi;
        this.zybjzd = zybjzd;
        this.qtzybjzd = qtzybjzd;
        this.zytz = zytz;
        this.qxtz = qxtz;
        this.lrrq = lrrq;
        this.lrr = lrr;
        this.orgcode = orgcode;
        this.pgys = pgys;
        this.pgysxm = pgysxm;
        this.pgrq = pgrq;
        this.uploadDate = uploadDate;
        this.fdataFrom = fdataFrom;
        this.editor = editor;
        this.modifydate = modifydate;
        this.updateFlag = updateFlag;
        this.qixuzhiZd = qixuzhiZd;
        this.yangxuzhiZd = yangxuzhiZd;
        this.yinxuzhiZd = yinxuzhiZd;
        this.tanshizhiZd = tanshizhiZd;
        this.shirezhiZd = shirezhiZd;
        this.xueyuzhiZd = xueyuzhiZd;
        this.qiyuzhiZd = qiyuzhiZd;
        this.tebingzhiZd = tebingzhiZd;
        this.pinghezhiZd = pinghezhiZd;
        this.qixuzhiOther = qixuzhiOther;
        this.yangxuzhiOther = yangxuzhiOther;
        this.yinxuzhiOther = yinxuzhiOther;
        this.tanshizhiOther = tanshizhiOther;
        this.shirezhiOther = shirezhiOther;
        this.xueyuzhiOther = xueyuzhiOther;
        this.qiyuzhiOther = qiyuzhiOther;
        this.tebingzhiOther = tebingzhiOther;
        this.pinghezhiOther = pinghezhiOther;
        this.editorId = editorId;
        this.updateOrgId = updateOrgId;
        this.updateOrgName = updateOrgName;
    }

    @Generated(hash = 791389563)
    public EhrElderlyZhongyiDto() {
    }

    public static final Parcelable.Creator<EhrElderlyZhongyiDto> CREATOR = new Parcelable.Creator<EhrElderlyZhongyiDto>() {
        @Override
        public EhrElderlyZhongyiDto createFromParcel(Parcel source) {
            return new EhrElderlyZhongyiDto(source);
        }

        @Override
        public EhrElderlyZhongyiDto[] newArray(int size) {
            return new EhrElderlyZhongyiDto[size];
        }
    };
}
