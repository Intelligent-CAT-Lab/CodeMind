import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int a =sumDigits(n);
		if(n%a==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static int sumDigits(int n) {
		int sum = 0;
		//自然数の各桁の和を計算
		while (n != 0) {
			//sumDigitsは単独ではloopしないので、while loopを使う。
			sum += n % 10;
			//再右端の桁を得るために%10を利用する。
			n /= 10;
			//再右端の桁を取り除くためにn/=10を利用する。
		}
		return sum;//合計を返す
	}
}