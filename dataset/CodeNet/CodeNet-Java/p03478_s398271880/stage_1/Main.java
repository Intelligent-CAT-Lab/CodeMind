import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i <= n; i++){
			int sum = 0;
var newVariable_0 = String.valueOf(i).length();var newVariable_1 = String.valueOf(i);			for(int j = 0; j < newVariable_1.length(); j++){
var newVariable_2 = String.valueOf(i).charAt(j);var newVariable_3 = String.valueOf(i);				sum += newVariable_3.charAt(j)-'0';
			}
			if(a <= sum && sum <= b)count += i;
		}
		System.out.println(count);
	}
}