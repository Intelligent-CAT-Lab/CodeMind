Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        List<List<Integer>> P2 = new ArrayList<>();
        List<List<Integer>> P3 = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            List<Integer> p2 = new ArrayList<>();
            p2.add(6 * (i + 1) - 2);
            p2.add(6 * (i + 1));
            p2.add(6 * (i + 1) + 2);
            P2.add(p2);
        }
        P2.get(4999).set(2, 2);
        for (int i = 0; i < 2500; i++) {
            List<Integer> p3 = new ArrayList<>();
            p3.add(12 * i + 3);
            p3.add(12 * i + 9);
            P3.add(p3);
        }

        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<List<Integer>> P = new ArrayList<>();
            int k = N / 5;
            int m = N % 5;
            if (m == 0) {
                P.addAll(P2.subList(0, k));
                P.addAll(P3.subList(0, k));
            } else if (m == 1) {
                P.addAll(P2.subList(0, k + 1));
                P.addAll(P3.subList(0, k - 1));
            } else if (m == 2) {
                P.addAll(P2.subList(0, k));
                P.addAll(P3.subList(0, k + 1));
            } else if (m == 3) {
                P.addAll(P2.subList(0, k + 1));
                P.addAll(P3.subList(0, k));
            } else if (k >= 2499) {
                P.addAll(P2.subList(0, k + 2));
                P.addAll(P3.subList(0, k - 1));
            } else {
                P.addAll(P2.subList(0, k));
                P.addAll(P3.subList(0, k + 2));
            }
            for (List<Integer> p : P) {
                System.out.print(p.get(0) + " " + p.get(1) + " ");
            }
        }
    }
}
```<|endoftext|>
