import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p03234 {
	public static void main(String[] args) {
		InputStream input;
		OutputStream output;
		try {
			input = new FileInputStream("input.txt");
			output = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			input = System.in;
			output = System.out;
		}
		Kattio io = new Kattio(input, output);
		(new Solve(io)).main();
		io.close();

		if (input instanceof FileInputStream)
			try {
				input.close();
			} catch (IOException e) {

			}
		if (output instanceof FileOutputStream)
			try {
				output.close();
			} catch (IOException e) {

			}
	}
}

class Solve {
	
	static final long mod = (long) 1e9+7;
	
	Kattio io;
	
	int n,k;
	int[] a,b;
	int[]