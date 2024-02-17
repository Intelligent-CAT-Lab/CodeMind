import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		boolean flag = false;
		for(int i = 1; i < n.length; i++) {
			if(n[i] != '9') {
				flag = true;
				break;
			}
		}
		int ans = (n[0]-'0')+9*(n.length-1);
		if(flag) {
			 ans = (n[0]-'1')+9*(n.length-1);
		}
		System.out.println(ans);
	}
}