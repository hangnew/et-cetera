package ppt연습;

public class 배열최대값찾기 {

	public static void main(String[] args) {

//		최대값 구하기

		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 }; // 아무값 배열
		int maximum = s[0]; // 첫번째s[0]가 제일 크다고 가정

		for (int i = 1; i < s.length; i++) { // 2번째 요소부터 끝까지 반복
			if (s[i] > maximum) { // maximum(s[0])과 모든 요소를 비교해서 더 크다면
				maximum = s[i]; // 그 수를 maximum에 대입
			} // if
		} // for
		System.out.println("최대값은 " + maximum);

//		최대값 찾기
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == maximum) {
				count++;
				System.out.println("최대값의 위치: " + (i + 1) + "번째");
			} // if
		} // for
		System.out.println("최대값 갯수는 " + count);

	}

}
