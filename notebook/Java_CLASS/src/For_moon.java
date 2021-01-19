
public class For_moon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1부터 10까지의 합");
		int i=1;
		int sum=0;
		for(i=1; i<10; i++) {
			System.out.print(i+"+");
			sum += i;
		}
		sum += i;
		System.out.print(i +" = " + sum+ "입니다.");
		
	}

}
