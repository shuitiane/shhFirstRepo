package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main1(String[] args) {
		long t = 1487210255l*1000;
		Date d = new Date(t);
		
		long t1 = 1487209895l*1000;
		Date d1 = new Date(t1);//Sun Jan 18 13:06:49 CST 1970
		
		  long ss=(d.getTime()-d1.getTime())/(1000); //共计秒数  
		  int MM = (int)ss/60;   //共计分钟数  
		  int hh=(int)ss/3600;  //共计小时数  
		  int dd=(int)hh/24;   //共计天数  
		  
		  System.out.println("共"+dd+"天 准确时间是："+hh+" 小时 "+MM+" 分钟"+ss+" 秒 共计："+ss*1000+" 毫秒");   
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println("------------"+(d.getTime() - d1.getTime()) / (1000 * 60));
		
		SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(datetimeFormat.format(d));
	}
	
	public static void main(String[] args) {
		//{"name":"实际已经使用服务器内存的比例：Avg1h","data":[
		//{"clock":"1490170519","value":"15.9578"},
//		{"clock":"1490174119","value":"16.1346"},
//		{"clock":"1490177719","value":"15.9507"},
//		{"clock":"1490181319","value":"15.9489"},
//		{"clock":"1490184919","value":"15.9504"},
//		{"clock":"1490188519","value":"15.9485"},
//		{"clock":"1490192119","value":"16.1397"},
//		{"clock":"1490195719","value":"15.9503"}],"itemid":"998119","key":"eaglewiz.monitor.overview.memActualUsed.avg1h[]","units":"%"}
		long[] ds = {1490112919,1490116519,1490120119,1490123719,1490127319,1490130919,1490134519,1490138119
				,1490141719,1490145319,1490148919,1490152519,1490156119,1490159719,1490163319,1490166919
				};
		for (long d:ds) {
			a(d);
		}
	}
	
	private static void a(long d) {
		long t = d*1000;
		Date date = new Date(t);
		
		SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(datetimeFormat.format(date));
	}

}
