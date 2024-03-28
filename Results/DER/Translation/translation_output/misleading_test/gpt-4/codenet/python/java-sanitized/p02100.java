import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p02100 {
    private static String S;
    private static int L;
    private static int cur = 0;
    private static int[] P = new int[6];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
        L = S.length();
        scanner.close();
        
        expr();
        int d = 5;
        while (P[d] == 0) {
            d--;
        }
        
        ArrayList<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }
        
        Collections.sort(R);
        StringBuilder result = new StringBuilder();
        for (int x : R) {
            result.append(String.format("(x%+d)", -x));
        }
        
        System.out.println(result.toString());
    }
    
    private static void expr() {
        char op = '+';
        while (true) {
            term(op);
            if (cur == L) {
                break;
            }
            op = S.charAt(cur);
            cur += 1;
        }
    }
    
    private static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + (S.charAt(cur) - '0');
            cur += 1;
        }
        return v;
    }
    
    private static void term(char op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur += 1;
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur += 1;
                d = num();
            }
        }
        P[d] = op == '+' ? k : -k;
    }
    
    private static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}