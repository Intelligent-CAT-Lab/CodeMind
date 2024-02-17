import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int A = s.indexOf("A");
		int Z = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'Z')
				Z = i;
		}
		System.out.println(Z - A + 1);
	}
}