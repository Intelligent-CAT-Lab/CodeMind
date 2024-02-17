import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String low_az = "abcdefghijklmnopqrstuvwxyz";
		String up_az =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str="";
		int[] cnt;

		cnt = new int[low_az.length()];

		for ( int i = 0 ; i < low_az.length() ; i ++ ) {
			cnt[i]=0;
		}

		Scanner sc= new Scanner( System.in );

		while( sc.hasNext() ) {

			str = sc.nextLine();

			for ( int j = 0 ; j < str.length() ; j++ ) {
				for ( int i = 0 ; i < low_az.length() ; i ++ ) {
					if ( str.charAt(j) == low_az.charAt(i) || str.charAt(j) == up_az.charAt(i) ) {
						cnt[i]++;
					}
				}
			}
		}

		for ( int i = 0 ; i < low_az.length() ; i ++ ) {

			System.out.println( low_az.charAt(i) + " : " + cnt[i] );
		}
		sc.close();
	}
}
