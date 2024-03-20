
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

## p03108

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
        int max = 0;
        for(int i = 0; i < N; ++i){
            int sum = 0;
            for(int j = i; j < N; ++j){
                sum += A[j];
                if(sum > max){
                    max = sum;
                }
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
max = 0
for i in range(N):
    sum = 0
    for j in range(i, N):
        sum += A[j]
        if sum > max:
            max = sum
print(max)
```

## p03109

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
        int max = 0;
        for(int i = 0; i < N; ++i){
            int sum = 0;
            for(int j = i; j < N; ++j){
                sum += A[j];
                if(sum > max){
                    max = sum;
                }
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
max = 0
for i in range(N):
    sum = 0
    for j in range(i, N):
        sum += A[j]
        if sum > max:
            max = sum
print(max)
```

## p03110

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

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
        int max = 0;
        for(int i = 0; i < N; ++i){
            int sum = 0;
            for(int j = i; j < N; ++j){
                sum += A[j];
                if(sum > max){
                    max = sum;
                }
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
max = 0
for i in range(N):
    sum = 0
    for j in range(i, N):
        sum += A[j]
        if sum > max:
            max = sum
print(max)
```

## p03111

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

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
        int max = 0;
        for(int i = 0; i < N; ++i){
            int sum = 0;
            for(int j = i; j < N; ++j){
                sum += A[j];
                if(sum > max){
                    max = sum;
                }
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
max = 0
for i in range(N):
    sum = 0
    for j in range(i, N):
        sum += A[j]
        if sum > max:
            max = sum
print(max)
```

## p03112

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

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
        int max = 0;
        for(int i = 0; i < N; ++i){
            int sum = 0;
            for(int j = i; j < N; ++j){
                sum += A[j];
                if(sum > max){
                    max = sum;
                }
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
max = 0
for i in range(N):
    sum = 0
    for j in range(i, N):
        sum += A[j]
        if sum > max:
            max = sum
print(max)
```

## p03113

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.*;

public class p03113 {
    public static
