<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 0;
        for (int i = 1; i < 1000000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }
        if (K == 0) {
            System.out.println("No");
            return;
        }
        int[][] S = new int[K][];
        int cnt = 0;
        int k = 0;
        for (int i = 1; i <= N; i++) {
            S[k].add(i);
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }
        int col = 0;
        int j = 1;
        int k = 1;
        cnt = 0;
        while (j <= N) {
            S[k].add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }
        System.out.println("Yes");
        System.out.println(K);
        for (int[] s : S) {
            System.out.println(K - 1 + " " + s);
        }
    }
}
```

### 解析

```python
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

### 解析

```python
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

### 解析

```python
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

### 解析

```python
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
