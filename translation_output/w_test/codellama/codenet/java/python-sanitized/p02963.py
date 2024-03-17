import java.util.*;

public class p02963 {
	public static void main(String[] args) {
		long s = Long.parseLong(new Scanner(System.in).next());
		int a = 1000000000;
		System.out.println("0 0 " + a + " 1 " + (a - s % a) % a + " " + ((s - 1) / a + 1));
	}
}




s = int(input())
a = 1000000000
print("0 0", a, "1", (a - s % a) % a, " ", ((s - 1) // a + 1))