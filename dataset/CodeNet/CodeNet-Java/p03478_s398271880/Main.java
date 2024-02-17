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
			for(int j = 0; j < String.valueOf(i).length(); j++){
				sum += String.valueOf(i).charAt(j)-'0';
			}
			if(a <= sum && sum <= b)count += i;
		}
		System.out.println(count);
	}
}