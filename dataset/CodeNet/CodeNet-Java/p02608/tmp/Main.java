import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
		int[] eratosu = new int[100000];
		for(int i = 1 ; i <= 100 ; i++) {
			for(int j = 1 ; j <= 100 ; j++) {
				for(int k = 1 ; k <= 100 ; k++) {
                  if(i * i + j * j + k * k >= 100000)
                    continue;
					int result = i * i + j * j + k * k + i * j + j * k + k * i;
					eratosu[result]++;
				}
			}

		}
		String s = eratosu[1] + "";
		StringBuilder sb = new StringBuilder(s);

		for(int i = 2 ; i <= n ; i++) {
			sb.append("\n" + eratosu[i]);
System.out.println("[INST]23;None;sb.append('\n' + eratosu[i]);"+sb.append("\n" + eratosu[i]));
		}

		sc.close();
		System.out.println(sb.toString());

	}
}

