

```python
S = input()
S0 = '0'
S0mas = 0
for str in S:
    if str == S0:
        S0mas += 1
S1mas = len(S) - S0mas
if S0mas < S1mas:
    print(S0mas * 2)
else:
    print(S1mas * 2)
```

## 03108

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;

public class p03108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        sc.close();
        int max = A[0];
        for(int i = 1; i < N; ++i){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.println(max);
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
max = A[0]
for i in range(1, N):
    if A[i] > max:
        max = A[i]
print(max)
```

## 03109

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;

public class p03109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        sc.close();
        int min = A[0];
        for(int i = 1; i < N; ++i){
            if(A[i] < min){
                min = A[i];
            }
        }
        System.out.println(min);
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
min = A[0]
for i in range(1, N):
    if A[i] < min:
        min = A[i]
print(min)
```

## 03110

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.*;

public class p03110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i = 0; i < N; ++i){
            sum += A[i];
        }
        System.out.println(sum);
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
sum = 0
for i in range(N):
    sum += A[i]
print(sum)
```

## 03111

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
5.5


```
import java.util.*;

public class p03111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i = 0; i < N; ++i){
            sum += A[i];
        }
        System.out.println(sum / (double)N);
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
sum = 0
for i in range(N):
    sum += A[i]
print(sum / N)
```

## 03112

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.*;

public class p03112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i = 0; i < N; ++i){
            sum += A[i];
        }
        System.out.println(sum);
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
sum = 0
for i in range(N):
    sum += A[i]
print(sum)
```

## 03113

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
5.5


```
import java.util.*;

public class p03113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i = 0; i < N; ++i){
            sum += A[i];
        }
        System.out.println(sum / (double)N);
    }
}
```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
sum = 0
for i in range(N):
    sum += A[i]
print(sum / N)
```

## 03114

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
5
