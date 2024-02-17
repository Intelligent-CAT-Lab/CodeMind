import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);
		        String S = sc.next();
		        long res = 0;
		        int n = S.length()-1;


		        for(int i = 0;i<Math.pow(2, n);i++) {//2^n通りの全探索

		        	StringBuilder sb = new StringBuilder(S);

		        	for(int j = n-1;j>=0;j--) {
		        		if((1&i>>j)==1) {
		        			sb.insert(j+1, "+");
		        		}
		        	}

		        	String[] s = sb.toString().split("\\+",0);
		        	for(int k = 0;k<s.length;k++) {
		        		res+=Long.parseLong(s[k]);
		        	}

		        }

		        System.out.println(res);
	}

}