<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
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
            int _k = -(-(N - 12500) / 3);
            N -= 3 * _k;
            int k = N / 5;
            int m = N % 5;
            if (m == 0) {
                int[][] P = new int[k + _k][3];
                for (int i = 0; i < k + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (m == 1) {
                int[][] P = new int[k + 1 + _k][3];
                for (int i = 0; i < k + 1 + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k - 1; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (m == 2) {
                int[][] P = new int[k + _k][3];
                for (int i = 0; i < k + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k + 1; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (m == 3) {
                int[][] P = new int[k + 1 + _k][3];
                for (int i = 0; i < k + 1 + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (k >= 2499) {
                int[][] P = new int[k + 2 + _k][3];
                for (int i = 0; i < k + 2 + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k - 1; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else {
                int[][] P = new int[k + _k][3];
                for (int i = 0; i < k + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k + 2; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            }
        }
    }
}

