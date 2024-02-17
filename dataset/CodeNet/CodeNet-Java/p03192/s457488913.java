import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		int count =0 ;
		for(int i = 0;i < string.length();i++){
			if(string.charAt(i) == '2'){
				count++;
			}
		}
		System.out.println(count);
	}
}