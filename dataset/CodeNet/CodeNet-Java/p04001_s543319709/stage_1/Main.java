import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);
		        String S = sc.next();
		        long res = 0;
var newVariable_0 = S.length();		        int n = newVariable_0-1;


var newVariable_1 = Math.pow(2, n);		        for(int i = 0;i<newVariable_1;i++) {//2^n通りの全探索

		        	StringBuilder sb = new StringBuilder(S);

		        	for(int j = n-1;j>=0;j--) {
		        		if((1&i>>j)==1) {
var newVariable_2 = sb.insert(j+1, "+");		        		}
		        	}

var newVariable_3 = sb.toString();		        	String[] s = newVariable_3.split("\\+",0);
		        	for(int k = 0;k<s.length;k++) {
		        		res+=Long.parseLong(s[k]);
		        	}

		        }

		        System.out.println(res);
	}

}