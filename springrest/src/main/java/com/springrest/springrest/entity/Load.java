package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Load {

	private String loadingPoint;
	@Id
	private String LoadId;
	private String unloaddingPoint;
	private String productType;
	private String truckType;
	private int noOfTruck;
	private int wright;
	private String shipperId;
	private String date;
	
	public Load(String loadingPoint, String unloaddingPoint, String productType, String truckType, int noOfTruck,
			int wright, String shipperId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloaddingPoint = unloaddingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.wright = wright;
		this.shipperId = shipperId;
		this.date = date;
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloaddingPoint() {
		return unloaddingPoint;
	}

	public void setUnloaddingPoint(String unloaddingPoint) {
		this.unloaddingPoint = unloaddingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTruck() {
		return noOfTruck;
	}

	public void setNoOfTruck(int noOfTruck) {
		this.noOfTruck = noOfTruck;
	}

	public int getWright() {
		return wright;
	}

	public void setWright(int wright) {
		this.wright = wright;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloaddingPoint=" + unloaddingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTruck=" + noOfTruck + ", wright=" + wright
				+ ", shipperId=" + shipperId + ", date=" + date + ", getLoadingPoint()=" + getLoadingPoint()
				+ ", getUnloaddingPoint()=" + getUnloaddingPoint() + ", getProductType()=" + getProductType()
				+ ", getTruckType()=" + getTruckType() + ", getNoOfTruck()=" + getNoOfTruck() + ", getWright()="
				+ getWright() + ", getShipperId()=" + getShipperId() + ", getDate()=" + getDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

	public String getLoadId() {
		return LoadId;
	}

	public void setLoadId(String loadId) {
		LoadId = loadId;
	}
	
	
	
}
