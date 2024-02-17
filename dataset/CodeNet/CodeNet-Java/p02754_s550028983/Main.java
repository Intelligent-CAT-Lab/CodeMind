import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//入力の読み込み
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long blue = sc.nextLong();
		long red = sc.nextLong();

		//青と赤のセットを置いた際の余りの数で判断
		long remainder = num%(blue+red);  //置いた際の余り
		long countBlue = num/(blue+red)*blue;  //上記の際の青の数

		if(remainder >= blue) {  //余りが青の数よりも多い場合
			countBlue += blue;  //全ての青の数を足す
		}
		else {                      //余りが青よりも少ない場合
			countBlue += remainder;  //余りの分だけ青を足す
		}
		System.out.print(countBlue);
		sc.close();
	}
}
