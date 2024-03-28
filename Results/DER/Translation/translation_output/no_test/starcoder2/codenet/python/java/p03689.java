
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (H % h == 0 && W % w == 0) {
            System.out.println("No");
        } else if (W % w != 0) {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if ((x % w) != (w - 1)) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (w - 1) - 1);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if ((y % h) != (h - 1)) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (h - 1) - 1);
                    }
                }
                System.out.println();
            }
        }
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
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int len = A[i] + A[j] + A[k];
                    int max = Math.max(A[i], Math.max(A[j], A[k]));
                    int min = Math.min(A[i], Math.min(A[j], A[k]));
                    if (len > max * 2) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC129/README.md
# ABC129

## A - Airplane

### Problem

Takahashi is going to buy a new airplane.

The airplane has three seats, and the prices of the seats are A, B, and C yen, respectively.

Find the minimum amount of money Takahashi needs to pay.

### Constraints

* 1≤A,B,C≤100

### Input

Input is given from Standard Input in the following format:

```
A B C
```

### Output

Print the minimum amount of money Takahashi needs to pay.

### Sample Input 1

```
100 200 300
```

### Sample Output 1

```
300
```

### Sample Input 2

```
100 100 100
```

### Sample Output 2

```
100
```

### Sample Input 3

```
100 200 400
```

### Sample Output 3

```
300
```

### Note

In the first sample, Takahashi can buy the airplane by paying 300 yen.

In the second sample, Takahashi can buy the airplane by paying 100 yen.

In the third sample, Takahashi can buy the airplane by paying 300 yen.

## B - Great Ocean View

### Problem

There are N buildings in a line. The height of the i-th building is H_i.

Takahashi is going to visit these buildings by bus. He will first get on the bus at the first building, and then get off the bus at the last building.

He will only get off the bus at a building with a height strictly greater than the height of the building he is currently at.

Find the maximum number of times Takahashi can get off the bus.

### Constraints

* 2≤N≤10^5
* 1≤H_i≤10^9

### Input

Input is given from Standard Input in the following format:

```
N
H_1 H_2 ... H_N
```

### Output

Print the maximum number of times Takahashi can get off the bus.

### Sample Input 1

```
5
3 1 2 5 4
```

### Sample Output 1

```
3
```

### Sample Input 2

```
6
1 2 3 4 5 6
```

### Sample Output 2

```
0
```

### Sample Input 3

```
6
6 5 4 3 2 1
```

### Sample Output 3

```
5
```

### Note

In the first sample, Takahashi can get off the bus at the 1-st, 3-rd, and 5-th buildings.

In the second sample, Takahashi cannot get off the bus at any building.

In the third sample, Takahashi can get off the bus at all the buildings.

## C - Typical Stairs

### Problem

There is a staircase with N steps. You are now on the first step.

You can move up the stairs one step at a time, or you can move up the stairs two steps at a time.

Additionally, there are some steps that are guarded by guards. You cannot move up the stairs to those steps.

Find the number of ways to move up the stairs from the first step to the N-th step.

### Constraints

* 1≤N≤10^6
* 1≤A_i≤N
* A_i≠A_j (i≠j)

### Input

Input is given from Standard Input in the following format:

```
N
A_1 A_2 ... A_M
```

### Output

Print the number of ways to move up the stairs from the first step to the N-th step.

### Sample Input 1

```
4
2
```

### Sample Output 1

```
4
```

### Sample Input 2

```
5
1 3
```

### Sample Output 2

```
1
```

### Sample Input 3

```
10
1 3 5 7 9
```

### Sample Output 3

```
0
```

### Note

In the first sample, there are four ways to move up the stairs:

* Move up the stairs one step at a time.
* Move up the stairs two steps at a time.
* Move up the stairs one step at a time, then move up the stairs two
