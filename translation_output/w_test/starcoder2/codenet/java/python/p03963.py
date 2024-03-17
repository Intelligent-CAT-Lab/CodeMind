

```python
N, K = map(int, input().split())
ans = K
for i in range(2, N+1):
    ans *= K-1
print(ans)
```

## 03964

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03964{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K++;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K += 1
print(ans)
```

## 03965

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03965{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K--;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K -= 1
print(ans)
```

## 03966

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03966{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K = K*2;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K *= 2
print(ans)
```

## 03967

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03967{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K = K/2;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K //= 2
print(ans)
```

## 03968

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03968{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K = K*K;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K *= K
print(ans)
```

## 03969

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03969{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K = K*K*K;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K **= 3
print(ans)
```

## 03970

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03970{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K = K*K*K*K;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K **= 4
print(ans)
```

## 03971

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03971{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans += K;
            K = K*K*K*K*K;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N, K = map(int, input().split())
ans = 0
for i in range(1, N+1):
    ans += K
    K **= 5
print(ans)
```

## 03972

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

class p03972{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for(int i=1;
