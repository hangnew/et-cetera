package 배열;

import java.util.Scanner;

public class 영화예매이차원배열 {

	public static void main(String[] args) {

		int[][] seat = new int[5][10]; // 5줄(행), (열)10좌석
		char[] row = { 'a', 'b', 'c', 'd', 'e' };
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String seatNum = "";
		final int MONEY = 10000;

		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("\t       좌석 현황");
			System.out.println("-----------------------------------");
			System.out.print("    ");
			for (int i = 1; i < 11; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			for (int i = 0; i < seat.length; i++) {
				System.out.print(row[i] + "   ");
				for (int j = 0; j < 10; j++) {
					System.out.print(row[i] + "" + (j + 1) + " ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------");
//			System.out.println("--------------------------");
//			System.out.println("\t 예매 현황");
//			System.out.println("--------------------------");
//			System.out.print("    ");
//			for (int i = 1; i < 11; i++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			for (int i = 0; i < seat.length; i++) {
//				System.out.print(row[i] + "   ");
//				for (int j = 0; j < 10; j++) {
//					System.out.print(seat[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("--------------------------");
			System.out.print("예매하고 싶은 좌석 번호를 입력하세요(종료: 0)>> ");
			String input = sc.nextLine();
			System.out.println();
			if (input.equals("0")) {
				System.out.println("예약 시스템을 종료합니다.");
				System.out.println("예약한 좌석: " + seatNum + "좌석 (" + count + "자리)");
				System.out.println("총 결제 금액: " + (count * MONEY) + "원");
				break;
			} // 종료 조건 if
			char rowInput = input.charAt(0); // 예약하고싶은 자리 row값 (char)
			int rowIndex = 0; // 예약하고 싶은 자리 row의 index
			for (int i = 0; i < row.length; i++) {
				if (row[i] == rowInput) {
					rowIndex = i;
				}
			}
			int seatIndex = Integer.parseInt(input.substring(1)) - 1; // 예약하고싶은 자리 column값
//			System.out.println(rowInput + "열 " + seatIndex + "번째 자리"); // index 확인용
			if (seat[rowIndex][seatIndex] == 1) {
				System.out.println("이미 예약된 자리입니다. 빈 자리를 선택해주세요.");
				System.out.println();
			} else {
				seat[rowIndex][seatIndex] = 1;
				count++;
				seatNum = seatNum + (row[rowIndex] + "" + (seatIndex + 1)) + "번 ";
			}
		} // while
		sc.close();
	} // main

} // class
