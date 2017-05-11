package test;

import java.util.Date;

public class Test2 {


	public static void main(String[] args) {
		//getDBTime:1493733600010
		//getDBTime:1493737140009
		//getDBTime:1493737140009
		//getDBTime:1493737200011
		long t = 1493737140009L;
		Date d = new Date(t);
		
		long t1 = 1493733600010L;
		Date d1 = new Date(t1);
		
		long ss=(d.getTime()-d1.getTime())/(1000); //共计秒数  
		  int MM = (int)ss/60;   //共计分钟数  
		  int hh=(int)ss/3600;  //共计小时数  
		  int dd=(int)hh/24;   //共计天数  
		  
		  System.out.println("共"+dd+"天 准确时间是："+hh+" 小时 "+MM+" 分钟"+ss+" 秒 共计："+ss*1000+" 毫秒");   

		  
		  
		  long t2 = 1487920465000L;
			Date d2 = new Date(t2);
		System.out.println(d2);
	}

}
