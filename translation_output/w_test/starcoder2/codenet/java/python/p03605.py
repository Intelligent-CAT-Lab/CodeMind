

```

N = int(input())

amari = N % 10
sho = N // 10

if amari == 9:
    print("Yes")
elif sho == 9:
    print("Yes")
else:
    print("No")

```

## 03606

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class p03606 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        long N = scan.nextLong();

        System.out.println(N);

    }

    //***********************ä»¥ä¸å±éé¢æ°************************************************
    /**
     * æå­åãåè»¢ãã¦è¿ã
     * @param pStr æå­å
     * @return åè»¢ããæå­å
     */
    public static String myReverse(String pStr) {
        if (pStr.length() < 1) {
            return "";
        }

        StringBuffer sb = new StringBuffer(pStr);
        return sb.reverse().toString();
    }

    /**
     * ä½ããæ±ããã
     * @param a
     * @param b
     * @return ä½ããä½ãããã¤ãã¹ã®æã¯ãã©ã¹ã§è¿ãã
     */
    public static long myMod(long a, long b) {
        long ret = 0;

        ret = a % b;

        if (ret < 0) {
            ret += b;
        }

        return ret;
    }

    /**
     * ä¹æ°ãæ±
