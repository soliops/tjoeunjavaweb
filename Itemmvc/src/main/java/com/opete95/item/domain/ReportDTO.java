package com.opete95.item.domain;

import org.springframework.web.multipart.MultipartFile;

public class ReportDTO {
	private String name;
	//file은 MultipartFile로 생성
	private MultipartFile imgurl;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getImgurl() {
		return imgurl;
	}
	public void setImgurl(MultipartFile imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "ReportDTO [name=" + name + ", imgurl=" + imgurl + "]";
	}
}
