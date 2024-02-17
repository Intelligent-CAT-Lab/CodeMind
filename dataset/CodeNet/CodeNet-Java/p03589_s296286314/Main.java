import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long starth;
		if(N%4==0) {
			starth = 3*N/4;
		} else {
			starth = 3*N/4+1;
		}
		for(long h=starth; h<=3500; h++) {
			for(long w=1; w<=3*N/4; w++) {
				if(4*h*w-N*w-N*h==0) break;
				long n = N*h*w/(4*h*w-N*w-N*h);
					if(n>0 && 4*h*n*w==N*(h*n+n*w+h*w)) {
						System.out.println(h + " " + n + " " + w);
						return;
					}
			}
		}
	}
}
