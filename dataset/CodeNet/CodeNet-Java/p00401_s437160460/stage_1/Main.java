import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int x = 1;
		
		while(N >= x){
			x = x * 2;
		}
		System.out.println(x / 2);
	}
}
