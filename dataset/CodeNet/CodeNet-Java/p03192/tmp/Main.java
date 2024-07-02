import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
System.out.println("[INST]8;string;sc.next();"+string);
		int count =0 ;
		for(int i = 0;i < string.length();i++){
System.out.println("[INST]10;None;string.length();"+string.length());
			if(string.charAt(i) == '2'){
System.out.println("[INST]11;None;string.charAt(i);"+string.charAt(i));
				count++;
			}
		}
		System.out.println(count);
	}
}