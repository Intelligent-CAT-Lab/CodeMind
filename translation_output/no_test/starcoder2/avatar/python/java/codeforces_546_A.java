
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```

## 1001. A+B

### Description

Calculate a + b.

### Input

The first line contains an integer T, denoting the number of test cases. Then T lines follow, each line consists of two positive integers, a and b.

### Output

For each test case, you should output the sum of a and b, one line per test case.

### Sample Input

```
2
1 1
10 20
```

### Sample Output

```
2
30
```

### Hint

For each test case, you should output the sum of a and b, one line per test case.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## 1002. A+B for C

### Description

Given three integers A, B and C in [0, 1000000], you are to calculate A+B and judge whether the sum exceeds C.

### Input

The first line of the input consists of an integer N (1<=N<=20) which stands for the number of test cases. Then N test cases follow, each consists of a single line containing A, B and C separated by a space.

### Output

For each test case, output in one line "Case #X: true" if A+B>C or "Case #X: false" if A+B<=C where X is the case number (starting from 1).

### Sample Input

```
3
1 2 3
2 3 4
9223372036854775807 -9223372036854775808 0
```

### Sample Output

```
Case #1: false
Case #2: true
Case #3: false
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            System.out.println("Case #" + (i + 1) + ": " + (A + B > C));
        }
    }
}
```

## 1003. I'm stuck!

### Description

A man named "Eureka" was trapped in a maze. The maze can be represented by a matrix with N rows and M columns. The start point is the top-left corner (1,1) and the exit is at the bottom-right corner (N,M). There are empty positions, walls and monsters in the maze. Eureka can only move up, down, left and right, but he can't through walls and monsters. When Eureka walks into a position, the monster in that position will be activated and Eureka will be trapped.

Now give you the map of the maze, please tell Eureka the minimum steps he needs to escape.

### Input

The first line of the input is an integer T (1<=T<=10), which represents the number of test cases.

For each test case:

The first line contains two integers N and M (1<=N,M<=100), which represent the number of rows and columns of the maze.

Then N lines follow, each line contains M characters. "S" represents the start point, "E" represents the exit, "." represents an empty position, "X" represents a wall and "M" represents a monster.

It is guaranteed that the start point and the exit are empty positions, and there is at least one path from the start point to the exit.

### Output

For each test case output one line, if Eureka can escape, output the minimum steps he needs, or else output "-1".

### Sample Input

```
2
3 4
S.X.
..X.
...E
3 4
S.X.
..X.
.M.E
```

### Sample Output

```
4
-1
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            char[][] maze = new char[N][M];
            for (int j = 0; j < N; j++) {
                maze[j] = sc.next().toCharArray();
            }
            int[][] steps = new int[N][M];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    steps[j][k] = -1;
                }
            }
            steps[0][0] = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (maze[j][k] == 'X' || maze[j][k] == 'M') {
                        continue;
                    }
                    if (j > 0 && maze[j - 1][k] != 'X' && maze[j - 1][k] != 'M') {
                        steps[j][k] = Math.max(steps[j][k], steps[j - 1][k] + 1);
                    }
                    if (k > 0 && maze[j][k - 1] != 'X' && maze[j][k - 1] != 'M') {
                        steps[j][k] = Math.max(steps[j][k], steps[j][k - 1] + 1);
                    }
                }
            }
            System.out.println(steps[N - 1][M - 1]);
        }
    }
}
```


### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }
            int[] c = new int[n];
            for (int j = 0; j < n; j++) {
                c[j] = sc.nextInt();
            }
            int[] d = new int[n];
            for (int j = 0; j < n; j++) {
                d[j] = sc.nextInt();
            }
            int[] e = new int[n];
            for (int j = 0; j < n; j++) {
                e[j] = sc.nextInt();
            }
            int[] f = new int[n];
            for (int j = 0; j < n; j++) {
                f[j] = sc.nextInt();
            }
            int[] g = new int[n
