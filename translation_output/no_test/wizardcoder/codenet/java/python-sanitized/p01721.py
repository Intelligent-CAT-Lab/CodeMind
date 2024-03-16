import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class p01721 {
	static boolean debug = true;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int w = scan.nextInt();
		int h = scan.nextInt();
		int v = scan.nextInt();
		int t = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int p = scan.nextInt();
		int q = scan.nextInt();
		Wave wave = new Wave(w, h, v, t, x, y, p, q);
		pwriter.println(wave.attack());

		pwriter