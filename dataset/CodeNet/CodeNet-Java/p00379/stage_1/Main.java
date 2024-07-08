import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
var newVariable_0 = Math.pow(m, (double) 1 / n);		int max = (int) newVariable_0;
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
var newVariable_1 = Math.pow(i, n);			int x = (int) newVariable_1;
			String str = String.valueOf(x);
			int y = 0;
var newVariable_2 = str.length();			for(int j = 0; j < newVariable_2; j++) {
var newVariable_3 = str.substring(j, j + 1);				y += Integer.parseInt(newVariable_3);
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
