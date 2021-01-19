
public class 짝수단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=2; i<10; i+=2) {
			for(int j=1; j<10; j++) 
				System.out.print(i +"*" + j +  "=" + i*j + " ");
			System.out.println("");
		}

	}
}
