
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c=0, d;
		d = Integer.valueOf(s);
var newVariable_0 = s.length();		for(int i = 0;i < newVariable_0;++i){
var newVariable_1 = s.charAt(i);			c += newVariable_1 - 48;
		}
		if(d % c == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
