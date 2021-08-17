package 배열;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {

		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String seatNum = "";
		final int MONEY = 10000;

		while (true) {
			System.out.println("-----------------------------");
			System.out.print("좌석 번호: ");
			for (int i = 1; i < 11; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n예매 현황: ");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println("\n-----------------------------");
			System.out.print("예매하고 싶은 좌석을 입력해주세요(종료:0)>> ");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println();
				System.out.println("예약을 종료합니다.");
				System.out.println("총 " + count + "자리가 예약되었습니다.");
				System.out.println("총 예약된 좌석: " + seatNum + "좌석");
				System.out.println("결제 금액: " + (MONEY * count) + "원");
				break;
			} else if (seat[input - 1] == 0) {
				seat[input - 1] = 1;
				System.out.println(input + "번 좌석이 예약되었습니다.");
				System.out.println();
				count++;
				seatNum = seatNum + input + "번 ";
			} else {
				System.out.println("이미 예약된 자리입니다. 빈 좌석을 선택해주세요.");
				System.out.println();
			}
		} // while
		sc.close();
	} // main

}// class
