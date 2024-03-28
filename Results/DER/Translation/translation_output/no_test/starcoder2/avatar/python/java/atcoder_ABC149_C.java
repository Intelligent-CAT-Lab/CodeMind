
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                break;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= Math.sqrt(n) + 2; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] B = new int[Q];
        for (int i = 0; i < Q; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (B[i] == A[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```
/2019/04/20190426.md
# 20190426

## 問題

### 問題1

```
N 個の整数 A1, A2, ..., AN が与えられます。
Q 個の整数 B1, B2, ..., BQ が与えられます。
各 Bj に対して、Ai (1 ≤ i ≤ N) の中に Bj がいくつ含まれているかを求めてください。

制約
1 ≤ N ≤ 100000
1 ≤ Q ≤ 100000
1 ≤ Ai ≤ 100000
1 ≤ Bj ≤ 100000
入力はすべて整数

入力
入力は以下の形式で標準入力から与えられる。

N
A1 A2 ... AN
Q
B1 B2 ... BQ

出力
出力は Q 行からなる。

出力の i 行目 (1 ≤ i ≤ Q) には、Bj が Ai (1 ≤ i ≤ N) の中にいくつ含まれているかを出力せよ。

入力例 1
5
1 2 3 2 1
3
1 2 3

出力例 1
2
2
1

入力例 2
5
1 2 3 2 1
3
4 5 6

出力例 2
0
0
0

入力例 3
10
1 2 3 4 5 6 7 8 9 10
10
1 2 3 4 5 6 7 8 9 10

出力例 3
1
1
1
1
1
1
1
1
1
1

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] B = new int[Q];
        for (int i = 0; i < Q; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (B[i] == A[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

### 問題2

```
N 個の整数 A1, A2, ..., AN が与えられます。
Q 個の整数 B1, B2, ..., BQ が与えられます。
各 Bj に対して、Ai (1 ≤ i ≤ N) の中に Bj がいくつ含まれているかを求めてください。

制約
1 ≤ N ≤ 100000
1 ≤ Q ≤ 100000
1 ≤ Ai ≤ 100000
1 ≤ Bj ≤ 100000
入力はすべて整数

入力
入力は以下の形式で標準入力から与えられる。

N
A1 A2 ... AN
Q
B1 B2 ... BQ

出力
出力は Q 行からなる。

出力の i 行目 (1 ≤ i ≤ Q) には、Bj が Ai (1 ≤ i ≤ N) の中にいくつ含まれているかを出力せよ。

入力例 1
5
1 2 3 2 1
3
1 2 3

出力例 1
2
2
1

入力例 2
5
1 2 3 2 1
3
4 5 6

出力例 2
0
0
0

入力例 3
10
1 2 3 4 5 6 7 8 9 10
10
1 2 3 4 5 6 7 8 9 10

出力例 3
1
1
1
1
1
1
1
1
1
1

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] B = new int[Q];
        for (int i = 0; i < Q; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (B[i] == A[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

### 問題3

```
N 個の整数 A1, A2, ..., AN が与えられます。
Q 個の整数 B1, B2, ..., BQ が与えられます。
各 Bj に対して、Ai (1 ≤ i ≤ N) の中に Bj がいくつ含まれているかを求めてください。

制約
1 ≤ N ≤ 100000
1 ≤ Q ≤ 100000
1 ≤ Ai ≤ 100000
1 ≤ Bj ≤ 100000
入力はすべて整数

入力
入力は以下の形式で標準入力から与えられる。

N
A1 A2 ... AN
Q
B1 B2 ... BQ

出力
出力は Q 行からなる。

出力の i 行目 (1 ≤ i ≤ Q) には、Bj が Ai (1 ≤ i ≤ N) の中にい
