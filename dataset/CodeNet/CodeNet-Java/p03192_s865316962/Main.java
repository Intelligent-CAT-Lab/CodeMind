import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int cnt = 0;
		if(N.substring(0, 1).equals("2")) cnt++;
		if(N.substring(1, 2).equals("2")) cnt++;
		if(N.substring(2, 3).equals("2")) cnt++;
		if(N.substring(3, 4).equals("2")) cnt++;
		System.out.println(cnt);
	}
}
