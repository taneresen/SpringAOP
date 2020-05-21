package com.mimaraslan.model;

public class Personel {
	
	private String adi;
	private String soyAdi;
	private int tecrube;
	
	
	public void adiSoyadiKontrolEt() {
		System.out.println("-------adiSoyadiKontrolEt()---------");	
		if (getAdi().length() < 2 || getSoyAdi().length() < 2) {
			throw new IllegalArgumentException();
			
		} 
	}
	
	public void selamlama(String mesaj) {
		System.out.println("---------selamlama(String mesaj)--------");
		System.out.println("GELEN MESAJ : "+mesaj);
	}
	
	public void personelBilgiVer() {
		System.out.println("---------personelBilgiVer()---------");
		System.out.println("ADI SOYADI: "+getAdi()+" "+ getSoyAdi() + 
						" \nTECRÜBE   : " + getTecrube()+ "YIL");
	}
	
	
	
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyAdi() {
		return soyAdi;
	}
	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}
	public int getTecrube() {
		return tecrube;
	}
	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}
	
	
	
	

}
