
public class While_moon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1���� 10������ ��");
		int i=1;
		int sum=0;
		
		while(i<10) {
			System.out.print(i + "+");
			sum+=i;
			i++;
			
		}
		sum+=i;
		System.out.print(i +"=" + sum);
	}

}
