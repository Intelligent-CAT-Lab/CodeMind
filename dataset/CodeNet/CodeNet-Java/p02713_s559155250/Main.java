import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		int sum = 0;
		//ユークリッドの互除法
		for(int a =1; a<=first ; a++) { //(a,b,c)のAが増える
			for(int b = 1; b<=first; b++) { //(a,b,c)のBが増える
				for(int c = 1; c<=first; c++) { //(a,b,c)のCが増える
					sum += gcd(gcd(a,b),c);
				}
			}
		}
		System.out.println(sum);
	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		a = a%b;
		//割られた数に余りを入れる。a=390 ,b=273の場合
		//a=117(あまりの数),b=273   割られた側が上書きされるイメージ
		return gcd(b,a); //ここで反転して余りがなくなるまで繰り返す。

	}

}
