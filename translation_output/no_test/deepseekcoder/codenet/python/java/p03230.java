<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    N = int(readline())

    K = 0
    for i in range(1,10**3):
        if i * (i-1) // 2 == N:
            K = i
            break

    if K == 0:
        print("No")
        exit()
    
    S = [[] for _ in range(K)]

    i = 1
    k = 0
    cnt = 0
    while i <= N:
        S[k].append(i)
        i += 1
        cnt += 1
        if cnt == K - (k+1):
            k += 1
            cnt = 0

    j = 1
    k = 1
    cnt = 0
    col = 0
    while j <= N:
        S[k].append(j)
        j += 1
        k += 1
        cnt += 1
        if cnt == K - (col+1):
            col += 1
            k = col + 1
            cnt = 0

    print("Yes")
    print(K)

    for s in S:
        print(K - 1, *s)

    
if __name__ == "__main__":
    main()

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

        int K = 0;
        for (int i = 1; i < 1000; i++) {
            if (i * (i-1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            System.out.println("No");
            System.exit(0);
        }

        List<List<Integer>> S = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            S.add(new ArrayList<>());
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S.get(k).add(i);
            i++;
            cnt++;
            if (cnt == K - (k+1)) {
                k++;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S.get(k).add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col+1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(K);

        for (List<Integer> s : S) {
            System.out.print((K - 1) + " ");
            for (Integer num : s) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it can be represented as the sum of two triangular numbers, and if so, it generates a "Yes" output along with the triangular number and the corresponding partition. If it cannot be represented as the sum of two triangular numbers, it outputs "No".
<|EOT|>
