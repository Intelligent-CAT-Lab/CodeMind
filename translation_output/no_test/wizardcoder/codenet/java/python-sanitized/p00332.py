import java.util.*;
import java.io.*;

public class p00332 {

	static void solve (FastScanner in, PrintWriter out, Methods ms) {

		int e = in.nextInt(), y = in.nextInt();

		if (e == 0) { //seireki
			if (1868<=y && y<=1911) { //meiji
				out.println("M" + (y-1867));
			}
			else if (1912<=y && y<=1925) { //taishou
				out.println("T" + (y-1911));
			}
			else if (1926<=y && y<=1988) { //shouwa
				out.println("S" + (y-1925));
			}
			else { //heisei
				out.println("H" + (y-1988));
			}
		}
		else if (e == 1) { //meiji
			out.println(1867 + y);
		}
		else if (e == 2) { //taishou
			out.println(1911 + y);
		}
		else if (e == 3) { // shouwa
			out.println(1925 + y);
		}
		else if (e == 4) { // heisei
			out.println(1988 + y);