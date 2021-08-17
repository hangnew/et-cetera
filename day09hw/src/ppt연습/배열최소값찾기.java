package ppt연습;

public class 배열최소값찾기 {

	public static void main(String[] args) {

//		최소값 구하기

		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 }; // 아무값 배열
		int minimum = s[0]; // 첫번째s[0]가 제일 작다고 가정

		for (int i = 1; i < s.length; i++) { // 2번째 요소부터 끝까지 반복
			if (s[i] < minimum) { // minimum(s[0])과 모든 요소를 비교해서 더 작다면
				minimum = s[i]; // 그 수를 minimum에 대입
			} // if
		} // for

		System.out.println("최소값은 " + minimum);
	}

}
