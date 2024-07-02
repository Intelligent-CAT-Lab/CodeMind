import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);
		        String S = sc.next();
System.out.println("[INST]9;S;sc.next();"+S);
		        long res = 0;
		        int n = S.length()-1;
System.out.println("[INST]11;None;S.length();"+S.length());


		        for(int i = 0;i<Math.pow(2, n);i++) {//2^n通りの全探索
System.out.println("[INST]14;None;Math.pow(2, n);"+Math.pow(2, n));

		        	StringBuilder sb = new StringBuilder(S);

		        	for(int j = n-1;j>=0;j--) {
		        		if((1&i>>j)==1) {
		        			sb.insert(j+1, "+");
System.out.println("[INST]20;None;sb.insert(j+1, '+');"+sb.insert(j+1, "+"));
		        		}
		        	}

		        	String[] s = sb.toString().split("\\+",0);
System.out.println("[INST]24;s;sb.toString().split('\\+',0);"+s);
System.out.println("[INST]24;None;sb.toString();"+sb.toString());
		        	for(int k = 0;k<s.length;k++) {
		        		res+=Long.parseLong(s[k]);
System.out.println("[INST]26;res;Long.parseLong(s[k]);"+res);
		        	}

		        }

		        System.out.println(res);
	}

}