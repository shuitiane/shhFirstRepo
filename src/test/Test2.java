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
		
		long ss=(d.getTime()-d1.getTime())/(1000); //��������  
		  int MM = (int)ss/60;   //���Ʒ�����  
		  int hh=(int)ss/3600;  //����Сʱ��  
		  int dd=(int)hh/24;   //��������  
		  
		  System.out.println("��"+dd+"�� ׼ȷʱ���ǣ�"+hh+" Сʱ "+MM+" ����"+ss+" �� ���ƣ�"+ss*1000+" ����");   

		  
		  
		  long t2 = 1487920465000L;
			Date d2 = new Date(t2);
		System.out.println(d2);
	}

}
