import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

import static java.util.Comparator.*;


public class p03043 {
	
	public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Solver solver = new Solver();
        solver.solve(1, in, out);
        
        out.close();
    }
    
    // ======================================================================
    static class Solver {

    	public long calc(int n, int st, PrintWriter out) {
//    	    out.println("start : n = " + n);
    	    long ans = 1;
    		long val = st;
    		while(val < n) {
    			val *= 2;
    			ans *= 2;
//    			out.println("val = " + val + "  ans = " + ans);
    		}
			return ans;
    	}

    	public void solve(int testNumber, MyInput in, PrintWriter out) {
    		int N = in.nextInt();
    		int K = in.nextInt();
    		long cnt; 
    		double wk, ans = 0;
    		for(int i=1; i <= N; i++) {
    			cnt = calc(K, i, out);
  				wk = (double)1 / (