package com.reservation.pj.comment;

import org.springframework.stereotype.Component;

@Component
public class CommentVO {

	private String commentSeq;
	private String parentSeq;
	private String writer;
	private String regDate;
	private String content;
	private String modified;
	private String up;

	public String getCommentSeq() {
		return commentSeq;
	}
	public void setCommentSeq(String commentSeq) {
		this.commentSeq = commentSeq;
	}
	public String getParentSeq() {
		return parentSeq;
	}
	public void setParentSeq(String parentSeq) {
		this.parentSeq = parentSeq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getUp() {
		return up;
	}
	public void setUp(String up) {
		this.up = up;
	}
	@Override
	public String toString() {
		return "CommentVO [commentSeq=" + commentSeq + ", parentSeq=" + parentSeq + ", writer=" + writer + ", regDate="
				+ regDate + ", content=" + content + ", modified=" + modified + ", up=" + up + "]";
	}	
}