import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;


class thread02 extends Thread{
	JLabel j;
	int x = 150;
	thread02(JLabel j){
		this.j = j;
	}
	
	public void run() {
		while(true) {
			if(x==150)
				x+=2;
			else
				x-=2;
			j.setLocation(x,x);
		}
	}
}


public class �ǽ�4_2�� extends JFrame {
	public �ǽ�4_2��() {
		setTitle("�����ϴ� ���̺� �����");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("���� ���̺�");
		label.setLocation(150,150);
		label.setSize(100,50);
		c.add(label);
		thread02 t = new thread02(label);
		setVisible(true);
		t.start();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new �ǽ�4_2��();
		
	}

}
