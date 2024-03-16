<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

A = []
S = 0
for i in range(1, N + 1):
    if S >= N:
        break
    S += i
    A.append(i)

x = sum(A) - N
for a in A:
    if x == a:
        continue
    print(a)

```

### Response:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> A = new ArrayList<>();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A.add(i);
        }

        int x = sumList(A) - N;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }

    private static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` from the standard input, then creates a list `A` of integers from 1 to `N` (inclusive) that add up to a sum less than or equal to `N`. It then calculates `x` as the sum of `A` minus `N`, and prints all elements of `A` that are not equal to `x`.
<|EOT|>
