import java.util.Scanner;

public class p02608 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
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
		}

		sc.close();
		System.out.println(sb.toString());

	}
}

