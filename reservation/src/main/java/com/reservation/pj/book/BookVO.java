package com.reservation.pj.book;

import org.springframework.stereotype.Component;

@Component
public class BookVO {
	private String bookSeq;
	private String bookType;
	private String bookPerson;
	private String bookDate;
	private String bookPay;
	private String bookDeposit;
	private String bookAccount;
	private String bookCheckin;
	private String bookCheckout;
	private String Stay;
	public String getBookSeq() {
		return bookSeq;
	}
	public void setBookSeq(String bookSeq) {
		this.bookSeq = bookSeq;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookPerson() {
		return bookPerson;
	}
	public void setBookPerson(String bookPerson) {
		this.bookPerson = bookPerson;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public String getBookPay() {
		return bookPay;
	}
	public void setBookPay(String bookPay) {
		this.bookPay = bookPay;
	}
	public String getBookDeposit() {
		return bookDeposit;
	}
	public void setBookDeposit(String bookDeposit) {
		this.bookDeposit = bookDeposit;
	}
	public String getBookAccount() {
		return bookAccount;
	}
	public void setBookAccount(String bookAccount) {
		this.bookAccount = bookAccount;
	}
	public String getBookCheckin() {
		return bookCheckin;
	}
	public void setBookCheckin(String bookCheckin) {
		this.bookCheckin = bookCheckin;
	}
	public String getBookCheckout() {
		return bookCheckout;
	}
	public void setBookCheckout(String bookCheckout) {
		this.bookCheckout = bookCheckout;
	}
	public String getStay() {
		return Stay;
	}
	public void setStay(String stay) {
		Stay = stay;
	}
	@Override
	public String toString() {
		return "BookVO [bookSeq=" + bookSeq + ", bookType=" + bookType + ", bookPerson=" + bookPerson + ", bookDate="
				+ bookDate + ", bookPay=" + bookPay + ", bookDeposit=" + bookDeposit + ", bookAccount=" + bookAccount
				+ ", bookCheckin=" + bookCheckin + ", bookCheckout=" + bookCheckout + ", Stay=" + Stay + "]";
	}
}