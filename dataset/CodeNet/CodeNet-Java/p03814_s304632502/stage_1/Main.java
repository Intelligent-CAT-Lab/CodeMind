import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int A = s.indexOf("A");
		int Z = 0;
var newVariable_0 = s.length();		for(int i = 0; i < newVariable_0; i++){
var newVariable_1 = s.charAt(i);			if(newVariable_1 == 'Z')
				Z = i;
		}
		System.out.println(Z - A + 1);
	}
}