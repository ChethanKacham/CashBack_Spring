package com.wipro;

public class Coupon {

		private String couponCode;
		private int offerPercent;
		public Coupon() {
			super();
		}
		public Coupon(String couponCode, int offerPercent) {
			super();
			this.couponCode = couponCode;
			this.offerPercent = offerPercent;
		}
		public String getCouponCode() {
			return couponCode;
		}
		public void setCouponCode(String couponCode) {
			this.couponCode = couponCode;
		}
		public int getOfferPercent() {
			return offerPercent;
		}
		public void setOfferPercent(int offerPercent) {
			this.offerPercent = offerPercent;
		}
		
}
