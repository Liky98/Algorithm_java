import java.util.Scanner;

public class Work2_실습6번 {

	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};//환산할 돈의 종류
		int a[] = new int [8];
	
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요. >> ");
		int money = scan.nextInt();
		
		for(int i=0; i<8; i++) {
			while (money - unit[i] >= 0) {
				a[i] +=1;
				money -= unit[i];
			}
			System.out.println(unit[i]+"원 짜리 : "+ a[i] +"개");
		} 
			scan.close();
	}

}
