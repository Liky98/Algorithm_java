public class sum {
    int num1;
    static int num2;

    public void printName(String name) {
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);
    }

    public static void main(String[] args) {
    	sum mc = new sum();
        mc.num1 = 100;
        sum.num2 = 50; 
        mc.printName("kihoon");
        System.out.printf("%d,%d",mc.num1, sum.num2);
    }
}