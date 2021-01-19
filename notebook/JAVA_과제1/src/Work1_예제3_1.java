import java.util.Scanner;

public class Work1_예제3_1 {

	public static void main(String[] args) {
		//초기설정
		Scanner scan = new Scanner(System.in);
		int a[] = new int [5];
		int max=0;
		int i=0;
		
		//시작
		System.out.println("5개의 양수를 입력하세요.");
		
		while(i<5) {
		a[i] = scan.nextInt();
		if (a[i]<1){
			System.out.println("양수를 입력하세요.");
			continue;
			}
		if (max < a[i])
			max = a[i];
		i++;
		}
		
		//결과값출력
		System.out.println("가장 큰 정수는 " + max + "입니다.");
		scan.close();
	}
}
