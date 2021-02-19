package com.common.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class DateTimefunction {
	
	public static String GenerateDateDDMMYYYY() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		return df.format(dateobj);
	}
	
	public static String GenerateDateyyyyddmm() {
		DateFormat df = new SimpleDateFormat("yyyydd/MM");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		return df.format(dateobj);
		
	}
	
	public static int Generaterandom() {
		int value =  ThreadLocalRandom.current().nextInt(0, 1000);
		return value;
	}

}
