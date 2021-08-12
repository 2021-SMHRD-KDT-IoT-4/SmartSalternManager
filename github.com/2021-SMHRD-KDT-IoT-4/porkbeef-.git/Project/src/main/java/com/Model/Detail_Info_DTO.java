package com.Model;

public class Detail_Info_DTO {
	
	private int numbering = 0;  // ������ȣ
	private int salinity = 0;   // ����
	private int indoor_temp = 0;  // �ǳ���/����
	private int water_temp = 0;   // �ұݹ� �µ�
	private int wire_temp = 0;    // �ٴڿ����µ�
	private int water_high = 0;   //��������
	private int daily_prod = 0;   //���ϻ��귮
	private String harvest  = null;  // �����Ȯ���ɽñ�
	private int place_size = 0;     // ����ũ��
	private String automode = null;       // �ڵ�/����
	
	
	
	public int getNumbering() {
		return numbering;
	}
	public void setNumbering(int numbering) {
		this.numbering = numbering;
	}
	public int getSalinity() {
		return salinity;
	}
	public void setSalinity(int salinity) {
		this.salinity = salinity;
	}
	public int getIndoor_temp() {
		return indoor_temp;
	}
	public void setIndoor_temp(int indoor_temp) {
		this.indoor_temp = indoor_temp;
	}
	public int getWater_temp() {
		return water_temp;
	}
	public void setWater_temp(int water_temp) {
		this.water_temp = water_temp;
	}
	public int getWire_temp() {
		return wire_temp;
	}
	public void setWire_temp(int wire_temp) {
		this.wire_temp = wire_temp;
	}
	public int getWater_high() {
		return water_high;
	}
	public void setWater_high(int water_high) {
		this.water_high = water_high;
	}
	public int getDaily_prod() {
		return daily_prod;
	}
	public void setDaily_prod(int daily_prod) {
		this.daily_prod = daily_prod;
	}
	public String getHarvest() {
		return harvest;
	}
	public void setHarvest(String harvest) {
		this.harvest = harvest;
	}
	public int getPlace_size() {
		return place_size;
	}
	public void setPlace_size(int place_size) {
		this.place_size = place_size;
	}
	public String getAutomode() {
		return automode;
	}
	public void setAutomode(String automode) {
		this.automode = automode;
	}
	
	public Detail_Info_DTO(int numbering) {
		this.numbering = numbering;
	}
	
	public Detail_Info_DTO(int numbering, int salinity, int indoor_temp, int water_temp, int wire_temp, int water_high,
			int daily_prod, String harvest, int place_size, String automode) {
		this.numbering = numbering;
		this.salinity = salinity;
		this.indoor_temp = indoor_temp;
		this.water_temp = water_temp;
		this.wire_temp = wire_temp;
		this.water_high = water_high;
		this.daily_prod = daily_prod;
		this.harvest = harvest;
		this.place_size = place_size;
		this.automode = automode;
	}
	
	
	
	
	
	
	
	
	

}
