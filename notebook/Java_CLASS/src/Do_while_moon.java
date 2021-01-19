
public class Do_while_moon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1부터 10까지의합");
		
		int i=1;
		int sum =0;
		
		do {
			System.out.print(i +"+");
			sum += i;
			i++;
			}
		while(i<10);
			
		sum+= i;
		System.out.print(i + "=" + sum);
		
	}

}
