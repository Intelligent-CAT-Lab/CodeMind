import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String low_az = "abcdefghijklmnopqrstuvwxyz";
		String up_az =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str="";
		int[] cnt;

		cnt = new int[low_az.length()];
System.out.println("[INST]11;None;low_az.length();"+low_az.length());

		for ( int i = 0 ; i < low_az.length() ; i ++ ) {
System.out.println("[INST]13;None;low_az.length();"+low_az.length());
			cnt[i]=0;
		}

		Scanner sc= new Scanner( System.in );

		while( sc.hasNext() ) {
System.out.println("[INST]19;None;sc.hasNext();"+sc.hasNext());

			str = sc.nextLine();
System.out.println("[INST]21;str;sc.nextLine();"+str);

			for ( int j = 0 ; j < str.length() ; j++ ) {
System.out.println("[INST]23;None;str.length();"+str.length());
				for ( int i = 0 ; i < low_az.length() ; i ++ ) {
System.out.println("[INST]24;None;low_az.length();"+low_az.length());
					if ( str.charAt(j) == low_az.charAt(i) || str.charAt(j) == up_az.charAt(i) ) {
System.out.println("[INST]25;None;str.charAt(j);"+str.charAt(j));
System.out.println("[INST]25;None;low_az.charAt(i);"+low_az.charAt(i));
System.out.println("[INST]25;None;str.charAt(j);"+str.charAt(j));
System.out.println("[INST]25;None;up_az.charAt(i);"+up_az.charAt(i));
						cnt[i]++;
					}
				}
			}
		}

		for ( int i = 0 ; i < low_az.length() ; i ++ ) {
System.out.println("[INST]32;None;low_az.length();"+low_az.length());

			System.out.println( low_az.charAt(i) + " : " + cnt[i] );
		}
		sc.close();
	}
}
