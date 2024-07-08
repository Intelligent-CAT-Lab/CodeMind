import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String low_az = "abcdefghijklmnopqrstuvwxyz";
		String up_az =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str="";
		int[] cnt;

var newVariable_0 = low_az.length();		cnt = new int[newVariable_0];

var newVariable_1 = low_az.length();		for ( int i = 0 ; i < newVariable_1 ; i ++ ) {
			cnt[i]=0;
		}

		Scanner sc= new Scanner( System.in );

var newVariable_2 = sc.hasNext();		while( newVariable_2 ) {

			str = sc.nextLine();

var newVariable_3 = str.length();			for ( int j = 0 ; j < newVariable_3 ; j++ ) {
var newVariable_4 = low_az.length();				for ( int i = 0 ; i < newVariable_4 ; i ++ ) {
var newVariable_5 = str.charAt(j);var newVariable_6 = low_az.charAt(i);var newVariable_7 = str.charAt(j);var newVariable_8 = up_az.charAt(i);					if ( str.charAt(j) == low_az.charAt(i) || str.charAt(j) == newVariable_8 ) {
						cnt[i]++;
					}
				}
			}
		}

var newVariable_9 = low_az.length();		for ( int i = 0 ; i < newVariable_9 ; i ++ ) {

			System.out.println( low_az.charAt(i) + " : " + cnt[i] );
		}
		sc.close();
	}
}
