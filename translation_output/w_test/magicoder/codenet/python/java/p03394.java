<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
2 5 63


```
N = int(input())
P2 = [[0, 0, 0] for _ in range(5000)]
P3 = [[0, 0] for _ in range(2500)]
limit = 30000
for i in range(5000):
  P2[i] = [6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2]
P2[-1][-1] = 2
for i in range(2500):
  P3[i] = [12 * i + 3, 12 * i + 9]
if N == 3:
  print(2,3,25)
elif N == 4:
  print(2,3,4,9)
elif N == 6:
  print(2,3,4,6,9,12)
else:
  def SP(N):
    if N == 19999:
      P = P2 + P3
      P[0] = [4, 8]
      return P
    _k = -(-max(N - 12500, 0) // 3)
    N -= 3 * _k
    k = N // 5
    m = N % 5
    if m == 0:
      P = P2[:k + _k] + P3[:k]
    elif m == 1:
      P = P2[:k + 1 + _k] + P3[:k - 1]
    elif m == 2:
      P = P2[:k + _k] + P3[:k + 1]
    elif m == 3:
      P = P2[:k + 1 + _k] + P3[:k]
    elif k >= 2499:
      P = P2[:k + 2 + _k] + P3[:k - 1]
    else:
      P = P2[:k + _k] + P3[:k + 2]
    return P
  P = SP(N)
  print(' '.join([' '.join([str(_p) for _p in p]) for p in P]))
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
        }
        P2[4999][2] = 2;
        for (int i = 0; i < 2500; i++) {
            P3[i] = new int[]{12 * i + 3, 12 * i + 9};
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<int[]> P = SP(N);
            for (int[] p : P) {
                System.out.print(p[0] + " " + p[1] + " ");
            }
        }
    }

    private static List<int[]> SP(int N) {
        if (N == 19999) {
            int[][] P2 = new int[5000][3];
            int[][] P3 = new int[2500][2];
            for (int i = 0; i < 5000; i++) {
                P2[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
            P2[4999][2] = 2;
            for (int i = 0; i < 2500; i++) {
                P3[i] = new int[]{12 * i + 3, 12 * i + 9};
            }
            List<int[]> P = new ArrayList<>();
            P.add(new int[]{4, 8});
            return P;
        }
        int _k = (int) Math.ceil((double) Math.max(N - 12500, 0) / 3);
        N -= 3 * _k;
        int k = N / 5;
        int m = N % 5;
        List<int[]> P = new ArrayList<>();
        if (m == 0) {
            P.addAll(Arrays.asList(Arrays.copyOfRange(P2, 0, k + _k)));
            P.addAll(Arrays.asList(Arrays.copyOfRange(P3, 0, k)));
        } else if (m == 1) {
            P.addAll(Arrays.asList(Arrays.copyOfRange(P2, 0, k + 1 + _k)));
            P.addAll(Arrays.asList(Arrays.copyOfRange(P3, 0, k - 1)));
        } else if (m == 2) {
            P.addAll(Arrays.asList(Arrays.copyOfRange(P2, 0, k + _k)));
            P.addAll(Arrays.asList(Arrays.copyOfRange(P3, 0, k + 1)));
        } else if (m == 3) {
            P.addAll(Arrays.asList(Arrays.copyOfRange(P2, 0, k + 1 + _k)));
            P.addAll(Arrays.asList(Arrays.copyOfRange(P3, 0, k)));
        } else if (k >= 2499) {
            P.addAll(Arrays.asList(Arrays.copyOfRange(P2, 0, k + 2 + _k)));
            P.addAll(Arrays.asList(Arrays.copyOfRange(P3, 0, k - 1)));
        } else {
            P.addAll(Arrays.asList(Arrays.copyOfRange(P2, 0, k + _k)));
            P.addAll(Arrays.asList(Arrays.copyOfRange(P3, 0, k + 2)));
        }
        return P;
    }
}
```

Please note that Java does not support list comprehension like Python does. So, we have to use traditional for loop and add elements to the list. Also, Java does not have a built-in function for ceiling division, so we have to use Math.ceil() method.<｜end▁of▁sentence｜>
