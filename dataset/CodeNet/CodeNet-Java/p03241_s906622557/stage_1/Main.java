import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int max = m/n;
		for (int i = max; i > 0; i--) {
			if (m%i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}