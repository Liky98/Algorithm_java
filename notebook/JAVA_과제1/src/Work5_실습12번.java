
public class Work5_�ǽ�12�� {

	public static void main(String[] args) {
	      int sum=0;
	      
	      for(int i=0; i<args.length; i++) {//i�� �Է¹��� �迭�� ������ŭ �ݺ�
	         try{
	            sum += Integer.parseInt(args[i]); //sum���ٰ� ���ڿ��� ������ ��ȯ�ؼ� ����
	         	}
	         catch(NumberFormatException e){//������ ��ġ���� �ʴ� ���� �߻��ϸ�
	            continue;	//�׳ɳѾ.
	         	}
	      	}
	 
	      System.out.println(sum);	//����� ���
	}
}
