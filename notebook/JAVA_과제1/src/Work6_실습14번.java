import java.util.Scanner;

public class Work6_�ǽ�14�� {

	public static void main(String[] args) {
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �̸� >> ");
			String name = scan.next();
			
			if(name.equals("�׸�")) //���α׷� ���ἳ��
				break;
			
			int i;
			for(i=0; i<course.length; i++) {//5�� �ݺ��Ͽ� �ܾ��ִ��� ã��
				if(course[i].equals(name)) {//������ ����ϰ�
				System.out.println(course[i]+"�� ���� "+ score[i] + "�Դϴ�. ");
				break;//for���� ������ ó������ �ٽý���.
				}
				if(i==course.length-1)//5�� �ݺ��Ͽ� ã�Ҵµ��� ������ ������.
				System.out.println("���� �����Դϴ�.");
			}
			
		}
		scan.close();
	}

}
