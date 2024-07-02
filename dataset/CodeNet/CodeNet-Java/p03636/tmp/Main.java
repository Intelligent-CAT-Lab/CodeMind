import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
		int leng = s.length();
System.out.println("[INST]7;leng;s.length();"+leng);
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}