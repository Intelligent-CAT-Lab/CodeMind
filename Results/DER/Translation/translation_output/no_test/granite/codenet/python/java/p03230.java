System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int k = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i * (i - 1) / 2 == n) {
                k = i;
                break;
            }
        }

        if (k == 0) {
            System.out.println("No");
            return;
        }

        int[][] s = new int[k][k];
        int i = 1, cnt = 0;
        for (int j = 0; j < k; j++) {
            for (; i <= n; i++) {
                s[j][cnt] = i;
                cnt++;
                if (cnt == k - j - 1) {
                    break;
                }
            }
            cnt = 0;
        }

        int j = i, col = 0;
        for (; j <= n; j++) {
            s[col][cnt] = j;
            cnt++;
            col++;
            if (cnt == k - col) {
                cnt = 0;
                col = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(k);
        for (int[] row : s) {
            System.out.print(k - 1);
            for (int num : row) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
