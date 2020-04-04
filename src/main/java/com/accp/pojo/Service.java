package com.accp.pojo;

import java.util.Date;

public class Service {

	private String wid;// 维修id

	private String wname;// 客户姓名

	private String wtype;// 业务类型

	private String wjname;// 接车人

	private String wcarid;// 车牌号

	private String wphone;// 客户号码

	private String wvipid;// 会员卡号

	private Integer wstatic;// 维修状态

	private Integer wsumprice;// 维修总价

	private Integer wleixi;// 维修类型

	private Date wstatdate;// 开始时间

	private Date wenddate;// 结束时间

	private Integer wpayment;// 付款类型

	private Date paymenttirm;// 付款时间

	private Float decide;// 是否抵扣

	private Float deductionmoney;// 抵扣金额

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid == null ? null : wid.trim();
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname == null ? null : wname.trim();
	}

	public String getWtype() {
		return wtype;
	}

	public void setWtype(String wtype) {
		this.wtype = wtype == null ? null : wtype.trim();
	}

	public String getWjname() {
		return wjname;
	}

	public void setWjname(String wjname) {
		this.wjname = wjname == null ? null : wjname.trim();
	}

	public String getWcarid() {
		return wcarid;
	}

	public void setWcarid(String wcarid) {
		this.wcarid = wcarid == null ? null : wcarid.trim();
	}

	public String getWphone() {
		return wphone;
	}

	public void setWphone(String wphone) {
		this.wphone = wphone == null ? null : wphone.trim();
	}

	public String getWvipid() {
		return wvipid;
	}

	public void setWvipid(String wvipid) {
		this.wvipid = wvipid == null ? null : wvipid.trim();
	}

	public Integer getWstatic() {
		return wstatic;
	}

	public void setWstatic(Integer wstatic) {
		this.wstatic = wstatic;
	}

	public Integer getWsumprice() {
		return wsumprice;
	}

	public void setWsumprice(Integer wsumprice) {
		this.wsumprice = wsumprice;
	}

	public Integer getWleixi() {
		return wleixi;
	}

	public void setWleixi(Integer wleixi) {
		this.wleixi = wleixi;
	}

	public Date getWstatdate() {
		return wstatdate;
	}

	public void setWstatdate(Date wstatdate) {
		this.wstatdate = wstatdate;
	}

	public Date getWenddate() {
		return wenddate;
	}

	public void setWenddate(Date wenddate) {
		this.wenddate = wenddate;
	}

	public Integer getWpayment() {
		return wpayment;
	}

	public void setWpayment(Integer wpayment) {
		this.wpayment = wpayment;
	}

	public Date getPaymenttirm() {
		return paymenttirm;
	}

	public void setPaymenttirm(Date paymenttirm) {
		this.paymenttirm = paymenttirm;
	}

	public Float getDecide() {
		return decide;
	}

	public void setDecide(Float decide) {
		this.decide = decide;
	}

	public Float getDeductionmoney() {
		return deductionmoney;
	}

	public void setDeductionmoney(Float deductionmoney) {
		this.deductionmoney = deductionmoney;
	}
}