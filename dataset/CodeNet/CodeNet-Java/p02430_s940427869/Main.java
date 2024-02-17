import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int k = sc.nextInt();

		for(int i = 0; i < Math.pow(2, n); i++) {
			int bitArray[] = new int[n];
			int temp = i;
			int count = 0;
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) {
					bitArray[j] = 1;
					count++;
				}
				temp /= 2;
			}

			if(count == k) {
				System.out.print(i + ":");  //順列のインデックス
				for(int j = 0; j < n; j++) {
					if(bitArray[j] == 1) System.out.print(" " + j);
				}
			}
			if(count == k) System.out.println();
		}
	}

}

