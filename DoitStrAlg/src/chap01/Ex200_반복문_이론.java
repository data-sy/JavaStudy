package chap01;

public class Ex200_반복문_이론 {

	public static void main(String[] args) {
		
	// 29p
		// 반복구조 repetition (루프 loop)
		
	// 30p
		// 하나의 변수를 사용하는 반복문은 while 보다는 for
		
	// 32p  for문 자세히
		// 쉼표로 구분하여 여러 개의 변수 선언 가능
		
		// 초기화
		// 초기화 부분에서 선언한 변수는 for문 안에서만 사용 가능
			// for문 종료 후에도 변숫값 사용하려면 선언은 위에 따로
		int i;
		for (i=0;i<5;i++) System.out.print(i + " ");
		System.out.println("\n최종 i : " + i);
			// 여러 개의 for 문에서 같은 이름의 변수 사용하려면 각 for문마다 변수 선언
		for (int j=0;j<5;j++) System.out.print(j + " ");
		for (int j=0;j<3;j++) System.out.print("A ");
		System.out.println();

		// 제어식
		// 제어식을 생략하면 조건을 true로 간주
		for (i=0;;i++) {
			if (i==5) break;
			System.out.print(i);
		}
		System.out.println();		
		// 업데이트
		// 루프 본문을 실행한 뒤에 평가, 실행하는 식
		// 쉼표로 구분하여 여러 개의 식 작성 가능
		// 생략 가능
		for (i=1;i<10;) {
			System.out.print(i + " ");
			i+=i;
		}
		

	}

}
