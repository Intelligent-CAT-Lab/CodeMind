
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l[i - L] = i * j % 2019;
                }
            }
            int min = l[0];
            for (int i = 1; i < l.length; i++) {
                if (l[i] < min) {
                    min = l[i];
                }
            }
            System.out.println(min);
        }
    }
}
```

## 1002. A+B for Polynomials (25)

This time, you are supposed to find A+B where A and B are two polynomials.

Input

Each input file contains one test case. Each case occupies 2 lines, and each line contains the information of a polynomial: K N1 aN1 N2 aN2 ... NK aNK, where K is the number of nonzero terms in the polynomial, Ni and aNi (i=1, 2, ..., K) are the exponents and coefficients, respectively. It is given that 1 <= K <= 10，0 <= NK < ... < N2 < N1 <=1000.

Output

For each test case you should output the sum of A and B in one line, with the same format as the input. Notice that there must be NO extra space at the end of each line. Please be accurate to 1 decimal place.

Sample Input
2 1 2.4 0 3.2
2 2 1.5 1 0.5
Sample Output
3 2 1.5 1 2.9 0 3.2

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();
        int[] a1 = new int[1001];
        for (int i = 0; i < k1; i++) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            a1[n] = c;
        }
        int k2 = sc.nextInt();
        int[] a2 = new int[1001];
        for (int i = 0; i < k2; i++) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            a2[n] = c;
        }
        int[] a = new int[1001];
        for (int i = 0; i < 1001; i++) {
            a[i] = a1[i] + a2[i];
        }
        int count = 0;
        for (int i = 1000; i >= 0; i--) {
            if (a[i] != 0) {
                count++;
            }
        }
        System.out.print(count);
        for (int i = 1000; i >= 0; i--) {
            if (a[i] != 0) {
                System.out.print(" " + i + " " + a[i]);
            }
        }
    }
}
```

## 1003. Emergency (25)

As an emergency rescue team leader of a city, you are given a special map of your country. The map shows several scattered cities connected by some roads. Amount of rescue teams in each city and the length of each road between any pair of cities are marked on the map. When there is an emergency call to you from some other city, your job is to lead your men to the place as quickly as possible, and at the mean time, call up as many hands on the way as possible.

Input

Each input file contains one test case. For each test case, the first line contains 4 positive integers: N (<= 500) - the number of cities (and the cities are numbered from 0 to N-1), M - the number of roads, C1 and C2 - the cities that you are currently in and that you must save, respectively. The next line contains N integers, where the i-th integer is the number of rescue teams in the i-th city. Then M lines follow, each describes a road with three integers c1, c2 and L, which are the pair of cities connected by a road and the length of that road, respectively. It is guaranteed that there exists at least one path from C1 to C2.

Output

For each test case, print in one line two numbers: the number of different shortest paths between C1 and C2, and the maximum amount of rescue teams you can possibly gather.
All the numbers in a line must be separated by exactly one space, and there is no extra space allowed at the end of a line.

Sample Input
5 6 0 2
1 2 1 5 3
0 1 1
0 2 2
0 3 1
1 2 1
2 4 1
3 4 1
Sample Output
2 4

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int[] rescue = new int[n];
        for (int i = 0; i < n; i++) {
            rescue[i] = sc.nextInt();
        }
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < m; i++) {
            int c11 = sc.nextInt();
            int c22 = sc.nextInt();
            int l = sc.nextInt();
            map[c11][c22] = l;
            map[c22][c11] = l;
        }
        int[] dis = new int[n];
        for (int i = 0; i < n; i++) {
            dis[i] = map[c1][i];
        }
        int[] num = new int[n];
        num[c1] = 1;
        int[] w = new int[n];
        w[c1] = rescue[c1];
        boolean[] visit = new boolean[n];
        visit[c1] = true;
        for (int i = 0; i < n; i++) {
            int u = -1;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (!visit[j] && dis[j] < min) {
                    u = j;
                    min = dis[j];
                }
            }
            if (u == -1) {
                break;
            }
            visit[u] = true;
            for (int v = 0; v < n; v++) {
                if (!visit[v] && map[u][v] != Integer.MAX_VALUE) {
                    if (dis[u] + map[u][v] < dis[v]) {
                        dis[v] = dis[u] + map[u][v];
                        num[v] = num[u];
                        w[v] = w[u] + rescue[v];
                    } else if (dis[u] + map[u][v] == dis[v]) {
                        num[v] += num[u];
                        if (w[u] + rescue[v] > w[v]) {
                            w[v] = w[u] + rescue[v];
                        }
                    }
                }
            }
        }
        System.out.println(num[c2] + "
