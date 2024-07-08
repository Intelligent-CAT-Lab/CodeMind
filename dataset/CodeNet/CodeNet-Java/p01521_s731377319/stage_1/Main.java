import java.util.Scanner;

//Simple Othello
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		char[] s = newVariable_0.toCharArray();
		int n = s.length;
		System.out.println(s[0]==s[n-1]&&s[0]=='x'?'x':'o');
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}