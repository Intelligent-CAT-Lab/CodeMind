import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				int divcount = 0;
				for(int k = 1; k <= n; k++) {
					if(i % k == 0) divcount++;
				}
				if(divcount == 8) {
					ans++;
					//System.out.println(i);//該当値確認用
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
