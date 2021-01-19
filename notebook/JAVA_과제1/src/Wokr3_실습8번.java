import java.util.Random;
import java.util.Scanner;

public class Wokr3_실습8번 {

	public static void main(String[] args) {

		System.out.println("정수 몇개? : ");
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) { //1~99 사이의 숫자가 아니면 다시 실행하기위해 continue를 쓰려고 프로그램 항상 가동
		int num = scan.nextInt();
		
		if(num<0) {
			System.out.println("0보다 크고 100보다 작은 정수를 입력해주세요.");
			continue;
			}
		if(num>99) {
			System.out.println("0보다 크고 100보다 작은 정수를 입력해주세요.");
			continue;
			}
		if(num ==0) { //프로그램 강제종료 숫자
			System.out.println("종료합니다.");
			break;
		}		
		int a[] = new int[num];
		
		for(int i=0; i<num; i++) {//랜덤프로그램실행
			a[i] = rand.nextInt(99)+1; //1부터 99까지 정수 랜덤설정
			
			for(int j=0; j<i; j++){//중복제거코드. 전에저장된 배열값과 비교해서 같으면 다시설정
				if(a[i]==a[j]) {
					i--;
					break;//찾으면 그다음 수행필요없으니 메모리줄이려고 작성
					}
				}
			}
		
		for(int count=0; count<num; count++) { //저장된 배열값 출력
			if(count%10 ==0 )//10개 단위로 출력 후 줄바꿈
				System.out.println();
			System.out.print(a[count] + " ");
		}
		
		System.out.println();
		System.out.println("종료하려면 0을 입력하세요.");

		}
		scan.close();
	}
}