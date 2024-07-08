import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
var newVariable_0 = sc.nextInt();		String num = newVariable_0+"";
		String ans = "";
var newVariable_1 = num.length();		for (int i = 0; i < newVariable_1; i++)
var newVariable_2 = num.charAt(i);			ans = ans + (newVariable_2 == '1' ? 9 : 1);
		System.out.println(ans);
	}
}