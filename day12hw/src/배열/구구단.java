package 배열;

public class 구구단 {

	public static void main(String[] args) {

		int[] numbers = new int[9];
		int result = 0;

		for (int i = 0; i < numbers.length; i++) { // numbers의 갯수 = 9
			numbers[i] = i + 1;
		}
//		for (int i = 0; i < times.length; i++) {
//			System.out.print(times[i] + " ");
//			System.out.print(times[i] + " ");
//		} // 확인용

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "단");
			for (int j = 0; j < numbers.length; j++) {
				result = numbers[i] * numbers[j];
				System.out.println(numbers[i] + " x " + numbers[j] + " = " + result);
			}
			System.out.println();
		}
	}

}
