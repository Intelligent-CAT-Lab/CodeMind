import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
System.out.println("[INST]7;k;sc.nextInt();"+k);
		int s = sc.nextInt();
System.out.println("[INST]8;s;sc.nextInt();"+s);
		int count=0;
		for(int x=0; x<=k; x++) {
			for(int y=0; y<=k; y++) {
				if(0<=s-x-y&&s-x-y<=k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
