import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        double X = scan.nextDouble();
        if(X<=6){
        	System.out.println(1);
        }else if(X<=11){
        	System.out.println(2);
        }else{
        	if(X%11==0){
        		System.out.println((long)(X/11*2));
        	}else if(X%11>6){
        	System.out.println((long)(Math.floor(X/11)*2+2));
        	}else{
        		System.out.println((long)(Math.floor(X/11)*2+1));
        	}
        }
	}
}