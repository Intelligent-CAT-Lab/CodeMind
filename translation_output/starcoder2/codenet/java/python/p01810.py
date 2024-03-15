
```python
N, K = map(int, input().split())
ans = 0
for i in range(N - 1):
    ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
print(ans)
```

## p01811

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01811{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] > A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1
print(ans)
```

## p01812

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01812{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] == A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## p01813

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01813{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] == A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## p01814

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01814{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] == A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## p01815

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01815{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] == A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## p01816

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01816{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] == A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## p01817

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01817{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        int[] A = new int[N];
                        for(int i = 0; i < N; i++){
                                A[i] = sc.nextInt();
                        }
                        int ans = 0;
                        for(int i = 0; i < N; i++){
                                for(int j = i + 1; j < N; j++){
                                        if(A[i] == A[j]){
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}
```

python code:
```python
N = int(input())
A = list(map
