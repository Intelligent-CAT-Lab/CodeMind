

```python
N = int(input())
sum = 0

for i in range(1, N+1):
    if i % 2 != 0:
        sum += 1

print(sum / N)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000


```
import java.util.Scanner;

public class atcoder_ABC142_B {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int K = stdin.nextInt();
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int h = stdin.nextInt();
            if (h >= K) {
                sum += 1;
            }
        }
        
        System.out.println(sum);
    }
}
```

python code:

```python
N, K = map(int, input().split())
sum = 0

for i in range(N):
    h = int(input())
    if h >= K:
        sum += 1

print(sum)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000


```
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = stdin.nextInt();
            B[i] = i + 1;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    
                    tmp = B[i];
                    B[i] = B[j];
                    B[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
B = [i+1 for i in range(N)]

for i in range(N):
    for j in range(i+1, N):
        if A[i] > A[j]:
            A[i], A[j] = A[j], A[i]
            B[i], B[j] = B[j], B[i]

print(*B)
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000


```
import java.util.Scanner;

public class atcoder_ABC142_D {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int A = stdin.nextInt();
        int B = stdin.nextInt();
        int gcd = gcd(A, B);
        int count = 0;
        
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count += 1;
            }
        }
        
        System.out.println(count);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

python code:

```python
A, B = map(int, input().split())
gcd = gcd(A, B)
count = 0

for i in range(1, gcd+1):
    if gcd % i == 0:
        count += 1

print(count)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
```
 1000000007;

int main() {
    int N;
    cin >> N;
    vector<int> A(N);
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }

    int ans = 0;
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            if (A[i] > A[j]) {
                ans++;
            }
        }
    }

    cout << ans << endl;
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))

ans = 0
for i in range(N):
    for j in range(i+1, N):
        if A[i] > A[j]:
            ans += 1

print(ans)
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000


```
import java.util.Scanner;

public class atcoder_ABC142_D {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int A = stdin.nextInt();
        int B = stdin.nextInt();
        int gcd = gcd(A, B);
        int count = 0;
        
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count += 1;
            }
        }
        
        System.out.println(count);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

python code:

```python
A, B = map(int, input().split())
gcd = gcd(A, B)
count = 0

for i in range(1, gcd+1):
    if gcd % i == 0:
        count += 1

print(count)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
```
/atcoder/ABC142/README.md
# AtCoder Beginner Contest 142

## 1.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5


```
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        
        System.out.println(sum / N);
    }
}
```

python code:

```python
N = int(input())
sum = 0

for i in range(1, N+1):
    if i % 2 != 0:
        sum += 1

print(sum / N)
```

## 2
