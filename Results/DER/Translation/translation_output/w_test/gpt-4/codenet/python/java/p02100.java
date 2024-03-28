Below is the Java translation of the provided Python script, which parses a simplified polynomial string and factors it:

```java
import java.io.*;
import java.util.Scanner;

public class PolynomialParser {
    static String S;
    static int L;
    static int cur = 0;
    static int[] P = new int[6];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
        L = S.length();
        expr();
        
        int d = 5;
        while (P[d] == 0) {
            d -= 1;
        }
        
        StringBuilder R = new StringBuilder();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.append(String.format("(x%+d)", -x));
            }
        }
        
        System.out.println(R.toString());
        scanner.close();
    }
    
    static void expr() {
        char op = '+';
        while (true) {
            term(op);
            if (cur == L) {
                break;
            }
            op = S.charAt(cur);
            cur += 1; // "+"/"-"
        }
    }
    
    static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + (S.charAt(cur) - '0');
            cur += 1;
        }
        return v;
    }
    
    static void term(char op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur += 1; // "x"
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur += 1; // "^"
                d = num();
            }
        }
        P[d] = (op == '+') ? k : -k;
    }
    
    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}
```

In this Java translation, we have a PolynomialParser class with the equivalent functionality as the Python script. The input polynomial is read using a `Scanner`, and the parsed coefficients and powers are stored in a static integer array. The code includes methods corresponding to the Python functions to handle expression parsing and term processing. The result of the factoring process is printed out as a string representing the factored polynomial.
