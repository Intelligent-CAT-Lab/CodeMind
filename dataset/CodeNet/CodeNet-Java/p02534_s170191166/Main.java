import java.util.Scanner;
public class Main{
	 public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder("");
		while(t-->0) {
			sb.append("ACL");
		}
		System.out.println(sb);
		sc.close();
    }
}