import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String num = sc.nextInt()+"";
System.out.println("[INST]6;None;sc.nextInt();"+sc.nextInt());
		String ans = "";
		for (int i = 0; i < num.length(); i++)
System.out.println("[INST]8;None;num.length();"+num.length());
			ans = ans + (num.charAt(i) == '1' ? 9 : 1);
System.out.println("[INST]9;None;num.charAt(i);"+num.charAt(i));
		System.out.println(ans);
	}
}