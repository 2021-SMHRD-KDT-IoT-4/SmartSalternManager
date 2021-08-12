package com.Model;

public class ControlDTO {
	
	
	private int numbering; // ������ȣ
	private String fan;   // ȯǳ����
	private String pump;  // ��������
	private String wire;  // �ٴڿ�������
	private String pusher;// �д�����
	private String conveyer;// �����̾� ����
	private String light; // ��������
	private String camera; // CCTV����
	
	
	
	


	public ControlDTO(int numbering, String fan, String pump, String wire, String pusher, String conveyer, String light,
			String camera) {
		super();
		this.numbering = numbering;
		this.fan = fan;
		this.pump = pump;
		this.wire = wire;
		this.pusher = pusher;
		this.conveyer = conveyer;
		this.light = light;
		this.camera = camera;
	}

	
	
	
	

	public ControlDTO(int numbering) {
		super();
		this.numbering = numbering;
	}







	public int getNumbering() {
		return numbering;
	}



	public void setNumbering(int numbering) {
		this.numbering = numbering;
	}



	public String getFan() {
		return fan;
	}



	public void setFan(String fan) {
		this.fan = fan;
	}



	public String getPump() {
		return pump;
	}



	public void setPump(String pump) {
		this.pump = pump;
	}



	public String getWire() {
		return wire;
	}



	public void setWire(String wire) {
		this.wire = wire;
	}



	public String getPusher() {
		return pusher;
	}



	public void setPusher(String pusher) {
		this.pusher = pusher;
	}



	public String getConveyer() {
		return conveyer;
	}



	public void setConveyer(String conveyer) {
		this.conveyer = conveyer;
	}



	public String getLight() {
		return light;
	}



	public void setLight(String light) {
		this.light = light;
	}



	public String getCamera() {
		return camera;
	}



	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
