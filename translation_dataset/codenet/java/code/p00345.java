import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Irreducible Fractionalization
 */
public class p00345 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] units;

		int an, ad, bn, bd;
		an = 0; //非循環節分子
		ad = 1; //非循環節分母
		bn = 0; //循環節分子
		bd = 1; //循環節分母

		line = br.readLine();

		//
		units = line.split("[()]");

		if (units.length == 2) {
			bn = parseInt(units[1]);
			bd = ((int) Math.pow(10, units[1].length())) - 1;
		}

		//
		units = units[0].split("\\.");

		if (units.length == 2) {
			bd *= (int) Math.pow(10, units[1].length());
			an = parseInt(units[0] + units[1]);
			ad = (int) Math.pow(10, units[1].length());
		} else {
			an = parseInt(units[0]);
		}

		//
		int n, d, g;
		d = lcm(ad, bd);
		n = an * (d / ad) + bn * d / bd;
		g = gcd(n, d);
		n /= g;
		d /= g;

		System.out.printf("%d/%d\n", n, d);
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}
}
