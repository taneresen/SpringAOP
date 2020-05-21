package com.mimaraslan.services.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MetotOncesiYapilacaklar implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		if (method.getName().equals("personelBilgiVer")) {
			System.out.println("********* Once ********BILGI**");			
		}
		
		if (method.getName().equals("selamlama")) {
			System.out.println("********* Once ********SelamAlindi**");			
		}
		
		if (method.getName().equals("adiSoyadiKontrolEt")) {
			System.out.println("********* Once ********Isim Bilgileri Kontrol Edildi**");			
		}
		
		
		
		
	}

}
