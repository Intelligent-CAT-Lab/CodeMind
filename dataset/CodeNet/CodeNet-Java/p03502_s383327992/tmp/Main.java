
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
System.out.println("[INST]6;s;sc.nextLine();"+s);
		int c=0, d;
		d = Integer.valueOf(s);
System.out.println("[INST]8;d;Integer.valueOf(s);"+d);
		for(int i = 0;i < s.length();++i){
System.out.println("[INST]9;None;s.length();"+s.length());
			c += s.charAt(i) - 48;
System.out.println("[INST]10;None;s.charAt(i);"+s.charAt(i));
		}
		if(d % c == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
