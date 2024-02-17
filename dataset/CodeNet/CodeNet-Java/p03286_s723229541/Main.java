import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if(n == 0){
			System.out.println(0);
			return;
		}
		while(n != 0){

			if(n % -2  == 0){
				sb.append("0");
				n /= -2;
			}
			else{
				sb.append("1");
				if(n < 0){
					n /= -2;
					n++;
				}else{
					n /= -2;
				}
			}
		}
		String xx = sb.reverse().toString();
		System.out.println(xx);



	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

