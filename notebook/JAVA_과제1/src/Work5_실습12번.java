
public class Work5_실습12번 {

	public static void main(String[] args) {
	      int sum=0;
	      
	      for(int i=0; i<args.length; i++) {//i가 입력받은 배열의 개수만큼 반복
	         try{
	            sum += Integer.parseInt(args[i]); //sum에다가 문자열을 정수로 변환해서 저장
	         	}
	         catch(NumberFormatException e){//정수와 일치하지 않는 오류 발생하면
	            continue;	//그냥넘어감.
	         	}
	      	}
	 
	      System.out.println(sum);	//결과값 출력
	}
}
