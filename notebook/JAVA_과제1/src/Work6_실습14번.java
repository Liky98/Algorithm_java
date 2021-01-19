import java.util.Scanner;

public class Work6_실습14번 {

	public static void main(String[] args) {
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목 이름 >> ");
			String name = scan.next();
			
			if(name.equals("그만")) //프로그램 종료설정
				break;
			
			int i;
			for(i=0; i<course.length; i++) {//5번 반복하여 단어있는지 찾음
				if(course[i].equals(name)) {//있으면 출력하고
				System.out.println(course[i]+"의 값은 "+ score[i] + "입니다. ");
				break;//for문을 나가고 처음부터 다시시작.
				}
				if(i==course.length-1)//5번 반복하여 찾았는데도 없으면 결과출력.
				System.out.println("없는 과목입니다.");
			}
			
		}
		scan.close();
	}

}
