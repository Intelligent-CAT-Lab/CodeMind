import java.util.Scanner;

class p00379{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = (int) Math.pow(m, (double) 1 / n);
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
			int x = (int) Math.pow(i, n);
			String str = String.valueOf(x);
			int y = 0;
			for(int j = 0; j < str.length(); j++) {
				y += Integer.parseInt(str.substring(j, j + 1));
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
