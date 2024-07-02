import java.util.Scanner;
public class Main{
	 public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
System.out.println("[INST]4;t;sc.nextInt();"+t);
		StringBuilder sb = new StringBuilder("");
		while(t-->0) {
			sb.append("ACL");
System.out.println("[INST]7;None;sb.append('ACL');"+sb.append("ACL"));
		}
		System.out.println(sb);
		sc.close();
    }
}