
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
//13장 실습 8번

class Point{ // 눈 위치 설정
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


class SnowThread extends Thread{
	Vector<Point> snowVector = new Vector<Point>(); 
	panel pan;
	
	public SnowThread(panel pan, Vector<Point> snowVector) {
		this.pan = pan;
		this.snowVector = snowVector;
		// TODO Auto-generated constructor stub
	}
	
	public void snow() {
		for(int i = 0; i< snowVector.size(); i++) {
			snowVector.get(i).y += 1;
			if(snowVector.get(i).y > 500)
				snowVector.get(i).y = 0;
		}
	}
	
	public void run() {
		while(true) {
			try {
				sleep(300);
			} catch (InterruptedException e) {
				return;
			}
			snow();
			pan.repaint();
		}
	}
}

class panel extends JPanel{ //눈
	ImageIcon II = new ImageIcon("javaImage.jpg");
	Image img = II.getImage();
	Vector<Point> snowVector;

	panel(Vector<Point> snowVector){
		this.snowVector = snowVector;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
		g.setColor(Color.white);
		for(int i=0; i < snowVector.size(); i++) {
			Point p = snowVector.get(i);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
}

public class 실습8번 extends JFrame {
	panel pan;
	Vector<Point> snowVector = new Vector<Point>();
	
	실습8번(){
	setTitle("실습8번");	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	for(int i=0; i<50;i++) {
		int a= (int)(Math.random()*500);
		int b= (int)(Math.random()*500);
		snowVector.add(new Point(a,b));
	}
	
	pan = new panel(snowVector);
	setContentPane(pan);
	
	SnowThread snow = new SnowThread(pan,snowVector);
	snow.start();
	
	setSize(500,500);
	setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 실습8번();
	}

}
