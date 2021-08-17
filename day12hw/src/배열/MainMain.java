package 배열;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainMain {

	public static void main(String[] args) {
		String today = null;
		Date date = new Date();
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, +3);
		today = sdformat.format(cal.getTime());
		
		System.out.println(today);
		
		String today2 = null;
		SimpleDateFormat sdformat2 = new SimpleDateFormat("yyyyMMdd");
		today2 = sdformat2.format(cal.getTime());
		System.out.println(today2);
	}

}
