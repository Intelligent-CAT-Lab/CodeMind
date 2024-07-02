import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
		int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		int m = sc.nextInt();
System.out.println("[INST]8;m;sc.nextInt();"+m);
		int max = (int) Math.pow(m, (double) 1 / n);
System.out.println("[INST]9;None;Math.pow(m, (double) 1 / n);"+Math.pow(m, (double) 1 / n));
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
			int x = (int) Math.pow(i, n);
System.out.println("[INST]13;None;Math.pow(i, n);"+Math.pow(i, n));
			String str = String.valueOf(x);
System.out.println("[INST]14;str;String.valueOf(x);"+str);
			int y = 0;
			for(int j = 0; j < str.length(); j++) {
System.out.println("[INST]16;None;str.length();"+str.length());
				y += Integer.parseInt(str.substring(j, j + 1));
System.out.println("[INST]17;y;Integer.parseInt(str.substring(j, j + 1));"+y);
System.out.println("[INST]17;None;str.substring(j, j + 1);"+str.substring(j, j + 1));
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
