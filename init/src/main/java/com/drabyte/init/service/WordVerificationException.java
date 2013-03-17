package com.drabyte.init.service;

public class WordVerificationException extends RuntimeException{

	private static final long serialVersionUID = 8848605198891794073L;

	private String orginal;
	private String was;
	private String shouldBe;


	public WordVerificationException(String orginal, String was, String shouldBe) {
		super();
		StringBuilder sb = new StringBuilder();
		sb.append("Incorrect translation of:").append(orginal).append(" was:").append(was).append(" should be:").append(shouldBe);
		this.orginal = orginal;
		this.was = was;
		this.shouldBe = shouldBe;
	}

	@Override
	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Incorrect translation of:").append(orginal).append(" was:").append(was).append(" should be:").append(shouldBe);
		return sb.toString();
	}

}
