import java.util.Scanner;

public class Main {

	static final int a0 = 1;
	static final int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(count(sc.nextLong(),sc.nextInt(),sc.nextInt(),sc.nextLong(),sc.nextInt(),sc.nextInt()));
	}

	public static long count(long y1,int m1,int d1,long y2,int m2,int d2) {
		long count400 = count(1,1,1,a0,400,12,31);
		d1--;
		if (d1 <= 0) {
			m1--;
			if(m1 <= 0) {
				y1--;
				m1 = 12;
			}
			d1 = days[m1];
		}
		long yy1 = (y1 - 1) / 400;
		long c1 = count400 * yy1 + count(yy1 * 400 + 1, 1, 1, a0, y1, m1, d1);
		long yy2 = (y2 - 1) / 400;
		long c2 = count400 * yy2 + count(yy2 * 400 + 1, 1, 1, a0, y2, m2, d2);
		return c2 - c1;
	}

	public static long count(long y1,int m1,int d1,int a,long y2,int m2,int d2) {
		long count = 0;
		while(true) {
			if (y1 > y2 || y1 == y2 && m1 > m2 || y1 == y2 && m1 == m2 && d1 > d2) {
				break;
			}
			if (d1 == 13 && a == 5) {
				count++;
			}
//			if (y1 == 2015 && m1 == 3 && d1 == 13) {
//				System.out.println(a);
//			}

			d1++;
			if (d1 > days[m1] + (m1 == 2 && isUruu(y1) ? 1 : 0)) {
				d1 = 1;
				m1++;
			}
			if (m1 > 12) {
				m1 = 1;
				y1++;
			}
			a = (a + 1) % 7;
		}
		return count;
	}

	public static boolean isUruu(long y) {
		if (y % 400 == 0) {
			return true;
		}else if(y % 100 == 0) {
			return false;
		}else{
			return y % 4 == 0;
		}
	}

}
