import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Irreducible Fractionalization
 */
public class Main {

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
System.out.println("[INST]22;line;br.readLine();"+line);

		//
		units = line.split("[()]");
System.out.println("[INST]25;units;line.split('[()]');"+units);

		if (units.length == 2) {
			bn = parseInt(units[1]);
System.out.println("[INST]28;bn;parseInt(units[1]);"+bn);
			bd = ((int) Math.pow(10, units[1].length())) - 1;
System.out.println("[INST]29;None;Math.pow(10, units[1].length());"+Math.pow(10, units[1].length()));
System.out.println("[INST]29;None;units[1].length();"+units[1].length());
		}

		//
		units = units[0].split("\\.");
System.out.println("[INST]33;units;units[0].split('\\.');"+units);

		if (units.length == 2) {
			bd *= (int) Math.pow(10, units[1].length());
System.out.println("[INST]36;None;Math.pow(10, units[1].length());"+Math.pow(10, units[1].length()));
System.out.println("[INST]36;None;units[1].length();"+units[1].length());
			an = parseInt(units[0] + units[1]);
System.out.println("[INST]37;an;parseInt(units[0] + units[1]);"+an);
			ad = (int) Math.pow(10, units[1].length());
System.out.println("[INST]38;None;Math.pow(10, units[1].length());"+Math.pow(10, units[1].length()));
System.out.println("[INST]38;None;units[1].length();"+units[1].length());
		} else {
			an = parseInt(units[0]);
System.out.println("[INST]40;an;parseInt(units[0]);"+an);
		}

		//
		int n, d, g;
		d = lcm(ad, bd);
		n = an * (d / ad) + bn * d / bd;
		g = gcd(n, d);
		n /= g;
		d /= g;

		System.out.printf("%d/%d\n", n, d);
System.out.println("[INST]51;None;System.out.printf('%d/%d\n', n, d);"+System.out.printf("%d/%d\n", n, d));
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}
}
