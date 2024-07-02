import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
System.out.println("[INST]5;arr;sc.next().toCharArray();"+arr);
System.out.println("[INST]5;None;sc.next();"+sc.next());
		int num = 0;
		boolean plus = true;
		boolean si = false;
		boolean xs = false;
		long[] keis = new long[6];
		for (char c : arr) {
		    if (c == '+') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = true;
		    } else if (c == '-') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = false;
		    } else if (c == '^') {
		        si = true;
		        xs = false;
		    } else if (c == 'x') {
		        if (num == 0) {
		            num = 1;
		        }
		        xs = true;
		    } else {
		        if (si) {
		            int v = c - '0';
		            if (plus) {
		                keis[v] = num;
		            } else {
		                keis[v] = -num;
		            }
		            si = false;
		        } else {
		            num = num * 10 + c - '0';
		        }
		    }
		}
		if (plus) {
		    keis[0] = num;
		} else {
		    keis[0] = -num;
		}
		int ji = 0;
		for (int i = 5; i >= 0; i--) {
		    if (keis[i] != 0) {
		        ji = i;
		        break;
		    }
		}
		int[] ans = new int[ji];
		for (int i = 1; i <= Math.abs(keis[0]) && ji > 0; i++) {
System.out.println("[INST]67;None;Math.abs(keis[0]);"+Math.abs(keis[0]));
		    long result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(i, j) * keis[j];
System.out.println("[INST]70;None;Math.pow(i, j);"+Math.pow(i, j));
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = -i;
		    }
		    result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(-i, j) * keis[j];
System.out.println("[INST]78;None;Math.pow(-i, j);"+Math.pow(-i, j));
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = i;
		    }
		}
		Arrays.sort(ans);
System.out.println("[INST]85;None;Arrays.sort(ans);"+Arrays.sort(ans));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
		    sb.append("(x");
System.out.println("[INST]88;None;sb.append('(x');"+sb.append("(x"));
		    if (ans[i] >= 0) {
		        sb.append("+");
System.out.println("[INST]90;None;sb.append('+');"+sb.append("+"));
		    }
		    sb.append(ans[i]).append(")");
System.out.println("[INST]92;None;sb.append(ans[i]).append(')');"+sb.append(ans[i]).append(")"));
System.out.println("[INST]92;None;sb.append(ans[i]);"+sb.append(ans[i]));
		}
		System.out.println(sb);
	}
}

