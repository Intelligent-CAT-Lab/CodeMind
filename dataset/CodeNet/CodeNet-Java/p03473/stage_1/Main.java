import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static int[] MASK = { 1, 2, 4 };

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
var newVariable_0 = in.readLine();		int M = Integer.parseInt(newVariable_0);
		int result = (24- M) + 24;
		System.out.println(result);
	}
}
