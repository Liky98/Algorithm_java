import java.util.Scanner;

public class Work1_����3_1 {

	public static void main(String[] args) {
		//�ʱ⼳��
		Scanner scan = new Scanner(System.in);
		int a[] = new int [5];
		int max=0;
		int i=0;
		
		//����
		System.out.println("5���� ����� �Է��ϼ���.");
		
		while(i<5) {
		a[i] = scan.nextInt();
		if (a[i]<1){
			System.out.println("����� �Է��ϼ���.");
			continue;
			}
		if (max < a[i])
			max = a[i];
		i++;
		}
		
		//��������
		System.out.println("���� ū ������ " + max + "�Դϴ�.");
		scan.close();
	}
}
