package ppt연습;

import java.util.Random;

public class 랜덤으로최소최대찾기 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] num = new int[100]; // 100개의 int배열 생성
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); // 각각의 index 해당하는 숫자에 랜덤숫자 대입
		}
		for (int i : num) {
			System.out.println(i); // 배열 출력
		}
		System.out.println();

		int minimum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < minimum) {
				minimum = num[i];
			} // if
		} // for
		System.out.println("최소값은 " + minimum);

		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == minimum) {
				count++;
				System.out.println("최소값의 index: " + i);
			} // if
		} // for
		System.out.println("최소값의 갯수: " + count);
		System.out.println();

		int maximum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > maximum) {
				maximum = num[i];
			} // if
		} // for
		System.out.println("최대값은: " + maximum);

		count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == maximum) {
				count++;
				System.out.println("최대값의 index: " + i);
			} // if
		} // for
		System.out.println("최대값의 갯수: " + count);

	} // main

} // class
