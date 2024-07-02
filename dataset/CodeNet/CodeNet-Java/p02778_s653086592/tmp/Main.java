import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
System.out.println("[INST]5;s;sc.nextLine();"+s);
		int l = s.length();
System.out.println("[INST]6;l;s.length();"+l);
		String ans = "";

        for (int i = 0; i < l; i++) {
        	ans += "x";
        }
        System.out.println(ans);
		}
}