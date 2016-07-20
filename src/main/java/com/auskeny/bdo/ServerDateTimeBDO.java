package com.auskeny.bdo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerDateTimeBDO {

	public String getCurrentServerDateTime(){
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		String formattedDate=simpleDateFormat.format(date);
		return formattedDate;
	}
}
