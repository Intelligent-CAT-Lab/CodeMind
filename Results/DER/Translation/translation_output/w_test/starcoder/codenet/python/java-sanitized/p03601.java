import java.util.Scanner;

public class p03601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] list = new int[str.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(str[i]);
		}
		int e = list[4];
		int f = list[5];

		// 1 2 10 20 15 200
		// 17 19 22 26 55 2802

		// xãåãå¾ãå¤
		int[] listx = new int[10000];
		int a = list[0];
		int b = list[1];

		int i = 0;
		while (true) {
			if (i * a * 100 > f) {
				break;
			}
			int j = 0;
			while (true) {
				int x = i * a * 100 + j * b * 100;
				if (x > f) {
					break;
				}
				if (x == 0) {
					j++;
					continue;
				}
				if (x > 0 && x < 10000 && listx[x] == 0) {
					listx[x] = 1;
				}
				j++;
			}
			i++;
		}

		// yãåãå¾ãå¤
		int[] listy = new int[10000];
		int c = list[2];
		int d = list[3];

		// yãæ°´ã«æº¶ãåããæå¤§å¤
		int f2 = f * e / (100 + e);

		i = 0;
		while (true) {
			if (i * c > f2) {
				break;
			}
			int j = 0;
			while (true) {
				int y = i * c + j * d;
				if (y > f2) {
					break;
				}
				if (y > 0 && y < 10000 && listy[y] == 0) {
					listy[y] = 1;
				}
				j++;
			}
			i++;
		}

		// å
¨ã¦ã®xã¨yã®çµã¿åããã«ã¤ãã¦fãè¶
ããªãããããã³æº¶ãåããããèª¿ã¹ã
		int lengthx = 0;
		int lengthy = 0;
		int xy_max = 0;
		int y_max = 0;
		double noudo_max = 0;

		for (int i = 0; i < 10000; i++) {
			if (listx[i] == 1) {
				lengthx++;
			}
		}
		for (int i = 0; i < 10000; i++) {
			if (listy[i] == 1) {
				lengthy++;
			}
		}

		for (int i = 0; i < lengthx; i++) {
			for (int j = 0; j < lengthy; j++) {
				int x = listx[i];
				int y = listy[j];
				if (x + y > f) {
					continue;
				}
				if (y * 100 / (x + y) <= e) {
					double noudo = (double) y / (x + y);
					if (noudo >= noudo_max) {
						xy_max = x + y;
						y_max = y;
						noudo_max = noudo;
					}
				}
			}
		}

		String message = xy_max + " " + y_max;
		System.out.println(message);

	}