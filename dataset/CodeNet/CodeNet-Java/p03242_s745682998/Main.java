import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String num = sc.nextInt()+"";
		String ans = "";
		for (int i = 0; i < num.length(); i++)
			ans = ans + (num.charAt(i) == '1' ? 9 : 1);
		System.out.println(ans);
	}
}