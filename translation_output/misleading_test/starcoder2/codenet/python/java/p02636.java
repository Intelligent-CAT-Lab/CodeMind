

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 998244353;
    static int N = 2*1000;
    static long[] g1 = new long[N+1];
    static long[] g2 = new long[N+1];
    static long[] inverse = new long[N+1];
    static long[][][] dp = new long[N+1][N+2][N+2];
    static long[][][] dpf = new long[N+1][N+2][N+2];
    static long[][][] data = new long[N+1][N+2][N+2];
    static long ans = 0;
    static int Zero = 0;
    static int One = 0;
    static int zero = 0;
    static int one = 0;
    static int n = 0;
    static String S = "";
    static int[][][] check = new int[N+1][N+2][N+2];
    static int[][][] ncheck = new int[N+1][N+2][N+2];
    static int[][][] check2 = new int[N+1][N+2][N+2];
    static int[][][] ncheck2 = new int[N+1][N+2][N+2];
    static int[][][] check3 = new int[N+1][N+2][N+2];
    static int[][][] ncheck3 = new int[N+1][N+2][N+2];
    static int[][][] check4 = new int[N+1][N+2][N+2];
    static int[][][] ncheck4 = new int[N+1][N+2][N+2];
    static int[][][] check5 = new int[N+1][N+2][N+2];
    static int[][][] ncheck5 = new int[N+1][N+2][N+2];
    static int[][][] check6 = new int[N+1][N+2][N+2];
    static int[][][] ncheck6 = new int[N+1][N+2][N+2];
    static int[][][] check7 = new int[N+1][N+2][N+2];
    static int[][][] ncheck7 = new int[N+1][N+2][N+2];
    static int[][][] check8 = new int[N+1][N+2][N+2];
    static int[][][] ncheck8 = new int[N+1][N+2][N+2];
    static int[][][] check9 = new int[N+1][N+2][N+2];
    static int[][][] ncheck9 = new int[N+1][N+2][N+2];
    static int[][][] check
