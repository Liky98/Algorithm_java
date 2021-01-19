import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 = " + circleArea);
		//
		Scanner myScan = new Scanner(System.in);
		
		int a = myScan.nextInt();
		System.out.println(a);
		
		String b = myScan.next();
		System.out.println(b);
		
		boolean c = myScan.nextBoolean();
		System.out.println(c);
		
		myScan.close();
	}

}
	