Here's the Python code translated into Java:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Solution {
    
    private final static BigInteger MOD = BigInteger.valueOf(1000000007);
    private static BigInteger[] fact;
    private static BigInteger[] ifact;

    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : null;
        Reader reader = new Reader(filename);
        try {
            int caseNumber = 1;
            while (reader.hasNext()) {
                System.out.println("Case #" + caseNumber + ": " + solve(reader));
                caseNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BigInteger solve(Reader reader) throws IOException {
        int n = reader.readInt();
        fact = new BigInteger[n + 1];
        ifact = new BigInteger[n + 1];
        
        fact[0] = BigInteger.ONE;
        ifact[0] = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
            ifact[i] = fact[i].modInverse(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        BigInteger c0 = BigInteger.ZERO;
        for (int i = n / 2; i < n; i++) {
            BigInteger c1 = nCk(i - 1, n - 1 - i).multiply(fact[i]).multiply(fact[n - i - 1])
                                    .subtract(c0).add(MOD).mod(MOD);
            ans = ans.add(c1.multiply(BigInteger.valueOf(i))).mod(MOD);
            c0 = c0.add(c1).mod(MOD);
        }

        return ans;
    }

    private static BigInteger nCk(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ZERO;
        return fact[n].multiply(ifact[n - k]).multiply(ifact[k]).mod(MOD);
    }

    static class Reader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public Reader(String filename) {
            try {
                reader = filename != null ? new BufferedReader(new FileReader(filename)) 
                                          : new BufferedReader(new InputStreamReader(System.in));
                tokenizer = new StringTokenizer("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean hasNext() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                String line = reader.readLine();
                if (line == null) {
                    return false;
                }
                tokenizer = new StringTokenizer(line);
            }
            return true;
        }

        public int readInt() throws IOException {
            return Integer.parseInt(next());
        }

        public String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
    }
}
```

Several points to note in this translation:

1. The modulo operation for `BigInteger`s is done using the `.mod()` method.
2. As `pow()` is a method in `BigInteger`, we use the `.modInverse()` method for computing modular inverse, since we can't easily translate Python's `pow(base, exp, mod)` for negative exponents to Java's `BigInteger` methods.
3. Python's `input()` and `raw_input()` are replaced with `BufferedReader` implements in Java.
4. The reading methods are using `StringTokenizer` for tokenizing input from buffered reader.
5. As Java doesn't have a direct equivalent to Python's list comprehension, we manually fill the factorial and inverse factorial arrays.
6. Exception handling and file reading are necessary parts of file I/O in Java.
7. The main method includes a loop to read multiple test cases until EOF is reached.
