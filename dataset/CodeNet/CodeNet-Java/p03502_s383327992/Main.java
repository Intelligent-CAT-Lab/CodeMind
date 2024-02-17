
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c=0, d;
		d = Integer.valueOf(s);
		for(int i = 0;i < s.length();++i){
			c += s.charAt(i) - 48;
		}
		if(d % c == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
