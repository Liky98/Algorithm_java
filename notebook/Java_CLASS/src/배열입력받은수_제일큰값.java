import java.util.Scanner;

public class �迭�Է¹�����_����ū�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 Scanner scan = new Scanner(System.in);
			 
			 int a[] = new int [5];
			 int max=0;
			 
			 for(int i=0; i<5; i++) {
				 a[i] = scan.nextInt();
				 if(a[i] <1) {
					 System.out.println("������Է��ϼ���.");
					 i--;
					 continue;
				 }
				 if(a[i] >max) 
					 max = a[i]; 
			 }
			 System.out.println("����ū����" + max +"�Դϴ�.");
			 scan.close();
			 
	}

}
