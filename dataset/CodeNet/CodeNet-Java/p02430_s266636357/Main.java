import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int n, i, j = 0, pow, k, m, counter;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			k = sc.nextInt();
			int[] a = new int[n];
			pow = (int) (Math.pow(2, n));
//			for(Integer output : b) {
//				System.out.print(output + " ");
//			}
			for(i = 0; i < pow; i++) {
				m = i;
				counter = 0;
				for(j = 0; m != 0; j++) {
					if(m % 2 == 1) {
						a[j] = 1;
						counter++;
					}else {
						a[j] = 0;
					}
					m /= 2;
				}
				if(counter != k) continue;
				System.out.print(i + ":");
				for(j = 0; j < a.length; j++) {
					if(a[j] == 1) {
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}
