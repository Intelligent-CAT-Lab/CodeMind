import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
		int A = s.indexOf("A");
System.out.println("[INST]6;A;s.indexOf('A');"+A);
		int Z = 0;
		for(int i = 0; i < s.length(); i++){
System.out.println("[INST]8;None;s.length();"+s.length());
			if(s.charAt(i) == 'Z')
System.out.println("[INST]9;None;s.charAt(i);"+s.charAt(i));
				Z = i;
		}
		System.out.println(Z - A + 1);
	}
}