package com.groupom.grouponwhishlist.entity;

public class Coupons {

	private String couponId;
	private String couponName;
	private String couponDescription;
	private String couponRate;

	public Coupons() {
		super();
	}

	public Coupons(String couponId, String couponName, String couponDescription, String couponRate) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponDescription = couponDescription;
		this.couponRate = couponRate;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponDescription() {
		return couponDescription;
	}

	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}

	public String getCouponRate() {
		return couponRate;
	}

	public void setCouponRate(String couponRate) {
		this.couponRate = couponRate;
	}

	

}
