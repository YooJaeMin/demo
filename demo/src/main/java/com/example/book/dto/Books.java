package com.example.book.dto;

import java.math.BigDecimal;

public class Books {
	
	private String bookId;
	
	private String bookName;
	
	private BigDecimal bookOriginPrice;
	
	private String bookType;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BigDecimal getBookOriginPrice() {
		return bookOriginPrice;
	}
	public void setBookOriginPrice(BigDecimal bookOriginPrice) {
		this.bookOriginPrice = bookOriginPrice;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
}
