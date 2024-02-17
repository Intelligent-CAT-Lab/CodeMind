import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}