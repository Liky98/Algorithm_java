import java.util.Random;

public class Work4_실습10번 {

	public static void main(String[] args) {
		int a[][] = new int [4][4];
		Random rand = new Random();
		int count= 0;
		
		while(count<10){ //10번반복
			int r = rand.nextInt(10)+1;//1부터 10까지 수
			int x = rand.nextInt(4);//0부터 3까지
			int y = rand.nextInt(4);
			if( a[x][y] != 0)
				continue;
			a[x][y]=r;
			count++;
		}
		

		for(int i=0; i<4; i++) { //결과값 출력
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();//줄바꿈
		}

	}

}
