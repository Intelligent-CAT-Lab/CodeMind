
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2[i][0] = 6 * (i + 1) - 2;
            P2[i][1] = 6 * (i + 1);
            P2[i][2] = 6 * (i + 1) + 2;
        }
        P2[4999][2] = 2;
        for (int i = 0; i < 2500; i++) {
            P3[i][0] = 12 * i + 3;
            P3[i][1] = 12 * i + 9;
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            int[][] SP(int N) {
                if (N == 19999) {
                    int[][] P = new int[P2.length + P3.length][];
                    for (int i = 0; i < P2.length; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < P3.length; i++) {
                        P[i + P2.length] = P3[i];
                    }
                    P[0] = new int[]{4, 8};
                    return P;
                }
                int _k = -(-Math.max(N - 12500, 0) / 3);
                N -= 3 * _k;
                int k = N / 5;
                int m = N % 5;
                int[][] P;
                if (m == 0) {
                    P = new int[k + _k + P3.length][];
                    for (int i = 0; i < k + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k; i++) {
                        P[i + k + _k] = P3[i];
                    }
                } else if (m == 1) {
                    P = new int[k + 1 + _k + P3.length][];
                    for (int i = 0; i < k + 1 + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k - 1; i++) {
                        P[i + k + 1 + _k] = P3[i];
                    }
                } else if (m == 2) {
                    P = new int[k + _k + P3.length][];
                    for (int i = 0; i < k + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k + 1; i++) {
                        P[i + k + _k] = P3[i];
                    }
                } else if (m == 3) {
                    P = new int[k + 1 + _k + P3.length][];
                    for (int i = 0; i < k + 1 + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k; i++) {
                        P[i + k + 1 + _k] = P3[i];
                    }
                } else if (k >= 2499) {
                    P = new int[k + 2 + _k + P3.length][];
                    for (int i = 0; i < k + 2 + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k - 1; i++) {
                        P[i + k + 2 + _k] = P3[i];
                    }
                } else {
                    P = new int[k + _k + P3.length][];
                    for (int i = 0; i < k + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k + 2; i++) {
                        P[i + k + _k] = P3[i];
                    }
                }
                return P;
            }
            int[][] P = SP(N);
            for (int i = 0; i < P.length; i++) {
                for (int j = 0; j < P[i].length; j++) {
                    System.out.print(P[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
N = int(input())
print(N)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
N = int(input())
print(N)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static
