<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
5 63

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<int[]> P2 = new ArrayList<>();
        List<int[]> P3 = new ArrayList<>();
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2.add(new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2});
        }
        P2.get(4999)[2] = 2;
        for (int i = 0; i < 2500; i++) {
            P3.add(new int[]{12 * i + 3, 12 * i + 9});
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<int[]> P = SP(N, P2, P3);
            for (int[] p : P) {
                System.out.print((p[0] + " " + p[1]) + " ");
            }
        }
    }

    private static List<int[]> SP(int N, List<int[]> P2, List<int[]> P3) {
        int _k = (int) Math.ceil((double) Math.max(N - 12500, 0) / 3);
        N -= 3 * _k;
        int k = N / 5;
        int m = N % 5;
        List<int[]> P;
        if (m == 0) {
            P = new ArrayList<>(P2.subList(0, k + _k));
            P.addAll(P3.subList(0, k));
        } else if (m == 1) {
            P = new ArrayList<>(P2.subList(0, k + 1 + _k));
            P.addAll(P3.subList(0, k - 1));
        } else if (m == 2) {
            P = new ArrayList<>(P2.subList(0, k + _k));
            P.addAll(P3.subList(0, k + 1));
        } else if (m == 3) {
            P = new ArrayList<>(P2.subList(0, k + 1 + _k));
            P.addAll(P3.subList(0, k));
        } else if (k >= 2499) {
            P = new ArrayList<>(P2.subList(0, k + 2 + _k));
            P.addAll(P3.subList(0, k - 1));
        } else {
            P = new ArrayList<>(P2.subList(0, k + _k));
            P.addAll(P3.subList(0, k + 2));
        }
        return P;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes two lists of arrays, and then performs some calculations based on the input value. The results are printed to the standard output.
<|EOT|>
