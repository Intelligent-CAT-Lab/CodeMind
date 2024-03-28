

```
import sys

a, b = map(int, sys.stdin.readline().split())

print(a * b)
```

## 02475

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
5


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p02475 {

    public static final int BIG_NUM = 2000000000;
    public static final int MOD = 1000000007;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input[] = br.readLine().split("\\s+");

            BigInteger A = new BigInteger(input[0]);
            BigInteger B = new BigInteger(input[1]);
            BigInteger C = new BigInteger(input[2]);
            BigInteger D = new BigInteger(input[3]);
            BigInteger E = new BigInteger(input[4]);

            BigInteger ans;

            ans = A.multiply(A).add(B.multiply(B)).add(C.multiply(C)).add(D.multiply(D)).add(E.multiply(E));
            System.out.println(ans);

        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }
    }
}



```

python code:

```
import sys

a, b, c, d, e = map(int, sys.stdin.readline().split())

print(a * a + b * b + c * c + d * d + e * e)
```

## 02476

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
5


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p02476 {

    public static final int BIG_NUM = 2000000000;
    public static final int MOD = 1000000007;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input[] = br.readLine().split("\\s+");

            BigInteger A = new BigInteger(input[0]);
            BigInteger B = new BigInteger(input[1]);
            BigInteger C = new BigInteger(input[2]);
            BigInteger D = new BigInteger(input[3]);
            BigInteger E = new BigInteger(input[4]);

            BigInteger ans;

            ans = A.multiply(B).multiply(C).multiply(D).multiply(E);
            System.out.println(ans);

        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }
    }
}



```

python code:

```
import sys

a, b, c, d, e = map(int, sys.stdin.readline().split())

print(a * b * c * d * e)
```

## 02477

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
5


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p02477 {

    public static final int BIG_NUM = 2000000000;
    public static final int MOD = 1000000007;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input[] = br.readLine().split("\\s+");

            BigInteger A = new BigInteger(input[0]);
            BigInteger B = new BigInteger(input[1]);
            BigInteger C = new BigInteger(input[2]);
            BigInteger D = new BigInteger(input[3]);
            BigInteger E = new BigInteger(input[4]);

            BigInteger ans;

            ans = A.multiply(B).add(C.multiply(D)).add(E);
            System.out.println(ans);

        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }
    }
}



```

python code:

```
import sys

a, b, c, d, e = map(int, sys.stdin.readline().split())

print(a * b + c * d + e)
```

## 02478

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
5


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p02478 {

    public static final int BIG_NUM = 2000000000;
    public static final int MOD = 1000000007;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input[] = br.readLine().split("\\s+");

            BigInteger A = new BigInteger(input[0]);
            BigInteger B = new BigInteger(input[1]);
            BigInteger C = new BigInteger(input[2]);
            BigInteger D = new BigInteger(input[3]);
            BigInteger E = new BigInteger(input[4]);

            BigInteger ans;

            ans = A.multiply(B).add(C.multiply(D)).add(E.multiply(E));
            System.out.println(ans);

        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }

