package com.model2.mvc.service.domain;


//Ȩ������ �湮�� ��ȸ���� �߻�ȭ ĸ��ȭ�� bean
public class Parts {

	//Field
	private int partCode; //product �Խñ� ��ȸ ��
	private String carBrand; //�ѹ湮�� ��
	private String partName; //�� �湮�� �� 
	private int prodNo; //�Ͻ��� �̺�Ʈ ��ȸ�� 
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
