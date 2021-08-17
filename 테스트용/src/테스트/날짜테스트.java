package 테스트;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 날짜테스트 {

	public static void main(String[] args) {

		// Date date = new Date(); // Date 부품 복사
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd"); // yyyy로 표현하게하는 부품
		Calendar cal = Calendar.getInstance(); // 캘린더 부품
		// cal.setTime(date); // 캘린더 부품 + Date 부품
		// System.out.println(cal.getTime());
		String today = sdformat.format(cal.getTime()); // today 변수 : cal.getTime해서 오늘 날짜 가져온 다음 sdformat 부품으로 yyyy로 표현
		System.out.println(today);
		
		/*
		System.out.print("주민번호 입력 (-없이) : ");
		Scanner sc = new Scanner(System.in); // 주민등록번호 입력받기
		String snn = sc.next(); // 입력받은 주민 번호 String snn에 넣기
		sc.close();
		System.out.println("주민번호 : " + snn);
		// 900531 - 1234567
		// 020531 - 4567899

		String[] snnlist = new String[2];
		snnlist[0] = snn.substring(0, 2); // snnlist[0] = snn 첫 두자리 (몇년생)
		snnlist[1] = snn.substring(6, 7); // snnlist[1] = snn 7번째자리 (성별)
		
		int birthyr = Integer.parseInt(snnlist[0]); // 태어난 년도 int에 넣기
		System.out.println("몇년생: " + birthyr); // 몇년생인지 출력
		int gender = Integer.parseInt(snnlist[1]); // 1,2,3,4
		System.out.println("성별: " + gender); // 성별 출력
		
		int age = 0;
		String c = "";
		if (0 <= birthyr && birthyr <= 2) {
			c = "" + 20 + birthyr;
		} else {
			c = "" + 19 + birthyr;
		}
		System.out.println("태어난 년도: " + c);
		*/

	}

}
