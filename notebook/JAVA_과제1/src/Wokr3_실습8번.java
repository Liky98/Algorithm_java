import java.util.Random;
import java.util.Scanner;

public class Wokr3_�ǽ�8�� {

	public static void main(String[] args) {

		System.out.println("���� �? : ");
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) { //1~99 ������ ���ڰ� �ƴϸ� �ٽ� �����ϱ����� continue�� ������ ���α׷� �׻� ����
		int num = scan.nextInt();
		
		if(num<0) {
			System.out.println("0���� ũ�� 100���� ���� ������ �Է����ּ���.");
			continue;
			}
		if(num>99) {
			System.out.println("0���� ũ�� 100���� ���� ������ �Է����ּ���.");
			continue;
			}
		if(num ==0) { //���α׷� �������� ����
			System.out.println("�����մϴ�.");
			break;
		}		
		int a[] = new int[num];
		
		for(int i=0; i<num; i++) {//�������α׷�����
			a[i] = rand.nextInt(99)+1; //1���� 99���� ���� ��������
			
			for(int j=0; j<i; j++){//�ߺ������ڵ�. ��������� �迭���� ���ؼ� ������ �ٽü���
				if(a[i]==a[j]) {
					i--;
					break;//ã���� �״��� �����ʿ������ �޸����̷��� �ۼ�
					}
				}
			}
		
		for(int count=0; count<num; count++) { //����� �迭�� ���
			if(count%10 ==0 )//10�� ������ ��� �� �ٹٲ�
				System.out.println();
			System.out.print(a[count] + " ");
		}
		
		System.out.println();
		System.out.println("�����Ϸ��� 0�� �Է��ϼ���.");

		}
		scan.close();
	}
}