import java.util.Random;

public class Work4_�ǽ�10�� {

	public static void main(String[] args) {
		int a[][] = new int [4][4];
		Random rand = new Random();
		int count= 0;
		
		while(count<10){ //10���ݺ�
			int r = rand.nextInt(10)+1;//1���� 10���� ��
			int x = rand.nextInt(4);//0���� 3����
			int y = rand.nextInt(4);
			if( a[x][y] != 0)
				continue;
			a[x][y]=r;
			count++;
		}
		

		for(int i=0; i<4; i++) { //����� ���
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();//�ٹٲ�
		}

	}

}
