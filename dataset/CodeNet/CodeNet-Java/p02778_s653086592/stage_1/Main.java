import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		String ans = "";

        for (int i = 0; i < l; i++) {
        	ans += "x";
        }
        System.out.println(ans);
		}
}