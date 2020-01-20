package org.Hotel;

public class Hotel extends Base{
	
	public static void main(String[] args) {
		lan("https://adactin.com/HotelApp/");
		
		Log l=new Log();
		
		fil(l.getUsr(), "hotelreservation");
		
		fil(l.getPass(), "greens6");
		
		kick(l.getBtn());
		
		//winChang();
		
		Page1 p1=new Page1();
		
		selct(p1.getE1(), 2);
		
		selct(p1.getE2(), 2);
		
		selct(p1.getE3(), 2);
		
		selct(p1.getE4(), 1);
		
		fil(p1.getE5(), "09/01/2020");
		
		fil(p1.getE6(), "10/01/2020");
		
		selct(p1.getE7(), 2);
		
		selct(p1.getE8(), 2);
		
		kick(p1.getBtn());
		
		Page2 p2=new Page2();
		
		kick(p2.getE1());
		
		kick(p2.getE2());
		
		Page3 p3=new Page3();
		
		fil(p3.getE1(), "Ghopi");
		
		fil(p3.getE2(), "RJ");
		
		fil(p3.getE3(), "vyvbuugj");
		
		fil(p3.getE4(), "5516728989167851");
		
		selct(p3.getE5(), 2);
		
		selct(p3.getE6(), 2);
		
		selct(p3.getE7(), 12);
		
		fil(p3.getE8(), "321");
		
		kick(p3.getE9());
		
		
		
		
		
	}
	
	

}
