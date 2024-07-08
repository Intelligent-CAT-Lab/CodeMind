import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		int count =0 ;
var newVariable_0 = string.length();		for(int i = 0;i < newVariable_0;i++){
var newVariable_1 = string.charAt(i);			if(newVariable_1 == '2'){
				count++;
			}
		}
		System.out.println(count);
	}
}