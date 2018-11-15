package com.model2.mvc.service.domain;


//홈페이지 방문자 조회수를 추상화 캡슐화한 bean
public class Parts {

	//Field
	private int partCode; //product 게시글 조회 수
	private String carBrand; //총방문자 수
	private String partName; //일 방문자 수 
	private int prodNo; //일시적 이벤트 조회수 
	private int partPrice;

	//constructor
	public Parts() {
	}	
	
	//method
	public int getPartCode() {
		return partCode;
	}

	public void setPartCode(int partCode) {
		this.partCode = partCode;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public int getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(int partPrice) {
		this.partPrice = partPrice;
	}


	public String toString() {
		return "ProductParts [partCode=" + partCode + ", carBrand=" + carBrand + ", partName=" + partName + ", prodNo="
				+ prodNo + ", partPrice=" + partPrice + "]";
	}

	
	
}
