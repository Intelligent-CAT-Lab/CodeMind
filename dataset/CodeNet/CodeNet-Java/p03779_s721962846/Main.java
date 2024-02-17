import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long count = 1;
		while (true) {
		    long d = count * (count + 1) / 2;
		    if (d >= x) {
		        System.out.println(count);
		        return;
		    }
		    count++;
		}
	}
}
