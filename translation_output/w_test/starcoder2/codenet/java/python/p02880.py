

```python
N = int(input())
f = False
for A in range(1,10):
    if N % A == 0 and N // A < 10:
        f = True
print("Yes" if f else "No")
```

## p02881

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret++;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += 1
print(ret)
```

## p02882

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret += A;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += A
print(ret)
```

## p02883

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret += A * A;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += A * A
print(ret)
```

## p02884

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret += A * A * A;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += A * A * A
print(ret)
```

## p02885

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02885 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret += A * A * A * A;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += A * A * A * A
print(ret)
```

## p02886

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret += A * A * A * A * A;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += A * A * A * A * A
print(ret)
```

## p02887

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02887 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret += A * A * A * A * A * A;
            }
        }
        System.out.println(ret);
    }
}

```

python code:

```python
N = int(input())
ret = 0
for A in range(1,N+1):
    if N % A == 0:
        ret += A * A * A * A * A * A
print(ret)
```

## p02888

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

public class p02888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ret = 0;
        for(int A = 1 ; A <= N ; ++A){
            if(N % A == 0){
                ret +=
