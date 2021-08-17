package pptAssign;

import java.util.Scanner;

public class 숫자크기판별1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; // {0앞숫자, 1뒷숫자, 2앞숫자큰횟수, 3뒷숫자큰횟수, 시도횟수}

		while (true) {
			num[num.length - 1]++; // 시도횟수 + 1
//			System.out.println("시도 횟수: " + num[num.length - 1]); // 확인

			System.out.print("숫자 입력 >> ");
			num[0] = sc.nextInt();
			System.out.print("숫자 입력 >> ");
			num[1] = sc.nextInt();

			if (num[0] > num[1]) {
				num[2]++;
				System.out.println("앞숫자가 크다");
//				System.out.println("앞숫자가 큰 횟수: " + num[2]); // 확인
			} else {
				num[3]++;
				System.out.println("뒷숫자가 크다");
//				System.out.println("뒷숫자가 큰 횟수: " + num[3]); // 확인
			}
			while (true) {
				System.out.print("계속 하시겠습니까? (계속:o, 중단:x)");
				String answer = sc.next();
				if (answer.equals("x")) { // 종료조건을 우선적으로
					System.out.println("게임을 종료합니다");
					System.out.println(
							"시도 횟수: " + num[num.length - 1] + ", 앞숫자가 큰 횟수: " + num[2] + ", 뒷숫자가 큰 횟수: " + num[3]);
					System.exit(0);
				} else if (answer.equals("o")) {
					break; // 해당 while문 탈출 (바깥 큰 while 재반복)
				}
				System.out.println("계속하려면 o, 중단하려면 x를 눌러주세요");
				continue; // 해당 while 반복 재시작
			} // 계속,중단 while
		} // 게임 while
	}// main
}// class
