package ����;

import java.util.Scanner;
//"OOXXOXXOOO"�� ���� OX������ ����� �ִ�.
//O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
//������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
//���� ���, 10�� ������ ������ 3�� �ȴ�.
//"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class no8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String std = "O";

		int score = 0;
		int sum = 0;
		
		for(int i=0; i<T; i++) {
			String a[] = null;
			String x = scan.nextLine();
			a = new String[x.length()];
			while(scan.hasNext()) {
				a = x.split("");
			}
			for(int j=0; j<x.length(); j++) {
				
				if(a[j].equals(std)) {
				score++;
				sum += score;
				}
				else score = 0;
		
			}
			System.out.println(sum);
			sum =0;
			score = 0;
		}
		
		scan.close();
	}
}

		
		
		
		
		
		
		
		
		//		Scanner scan = new Scanner(System.in);
//		
//		int testCase = scan.nextInt();
//		String a[][] = new String[testCase][];
//		String std = "O";
//		int score = 0;
//		int sum = 0;
//		
//		for(int i=0; i<testCase; i++) { 
//			a[i] = new String[0];
//			for(int j=0; scan.hasNext(); j++) {
//				a[i][j] = scan.nextLine();
//					
//			}
//			if(a[i].equals(std)) {
//				score++;
//				sum += score;
//			}
//			else
//				score = 0;
//			}
//		
//		
//		for(int i=0; i<testCase; i++) {
//
//		System.out.println(sum);	
//		scan.close();
//	}
//
//	}}
