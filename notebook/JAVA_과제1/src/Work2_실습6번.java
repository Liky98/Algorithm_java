import java.util.Scanner;

public class Work2_�ǽ�6�� {

	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};//ȯ���� ���� ����
		int a[] = new int [8];
	
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���. >> ");
		int money = scan.nextInt();
		
		for(int i=0; i<8; i++) {
			while (money - unit[i] >= 0) {
				a[i] +=1;
				money -= unit[i];
			}
			System.out.println(unit[i]+"�� ¥�� : "+ a[i] +"��");
		} 
			scan.close();
	}

}
