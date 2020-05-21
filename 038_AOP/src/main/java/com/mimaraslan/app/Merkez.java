package com.mimaraslan.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.model.Personel;

public class Merkez {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Personel personel1 = context.getBean("beanPersonelProxy",Personel.class);
		Personel personel2 = context.getBean("beanPersonelProxy",Personel.class);
		
		personel1.adiSoyadiKontrolEt();
		personel1.selamlama("Selamlar Ben Personel1");
		personel1.personelBilgiVer();
		
		personel2.adiSoyadiKontrolEt();
		personel2.selamlama("Selamlar Ben Personel2");
		personel2.personelBilgiVer();
		
		context.close();
		
		

	}

}
