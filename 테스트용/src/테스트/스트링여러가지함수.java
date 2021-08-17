package 테스트;

public class 스트링여러가지함수 {

	public static void main(String[] args) {

		String s = "I'm a programmer";
		String s2 = ", FOR REAL!";

//		스트링 결합
		System.out.println(s + s2);
//		스트링 결합 
		System.out.println(s.concat(s2));
//		문자 1글자 추출
		System.out.println(s.charAt(0));
//		특정한 문자로 끝나는지 확인
		System.out.println(s.endsWith("r"));
//		인덱스 4 이후 글자들 모두 추출
		System.out.println(s.substring(4));
//		인덱스 4~9까지 
		System.out.println(s.substring(4, 9));
//		s에 s2가 포함되어 있는지
		System.out.println(s.contains(s2));
//		s중 특정 글자 위치
		System.out.println(s.lastIndexOf("m"));
//		대문자로
		System.out.println(s.toUpperCase());
//		소문자로
		System.out.println(s2.toLowerCase());
//		글자수
		System.out.println(s.length());
//		특정 글자 대체하기
		System.out.println(s.replace("I'm", "You're"));
		
	}

}
