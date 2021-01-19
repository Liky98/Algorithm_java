import java.util.Scanner;

public class 배열입력받은수_제일큰값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 Scanner scan = new Scanner(System.in);
			 
			 int a[] = new int [5];
			 int max=0;
			 
			 for(int i=0; i<5; i++) {
				 a[i] = scan.nextInt();
				 if(a[i] <1) {
					 System.out.println("양수만입력하세요.");
					 i--;
					 continue;
				 }
				 if(a[i] >max) 
					 max = a[i]; 
			 }
			 System.out.println("제일큰수는" + max +"입니다.");
			 scan.close();
			 
	}

}
