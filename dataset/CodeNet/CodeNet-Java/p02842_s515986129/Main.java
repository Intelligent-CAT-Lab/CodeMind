import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==================================================================
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int wk;
    	for (int i = 1; i <= N; i++) {
			wk = (int)((double)(i * 1.08));
			if(wk == N) {
				out.println(i);
				return;
			}
		}
    	out.println(":(");
    }
    // ==================================================================
}
class PP{
	public int key, val;
	public PP(int key, int val) {
		this.key = key;
		this.val = val;
	}
	public int getKey() {
		return key;
	}
	public int getVal() {
		return val;
	}
}
