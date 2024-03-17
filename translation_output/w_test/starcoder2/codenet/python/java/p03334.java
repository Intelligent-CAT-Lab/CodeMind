

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        int n2 = 1;
        while (D2 % 4 == 0) {
            n2 *= 2;
            D2 /= 4;
        }
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if ((x / n + y / n) % 2 == 0 && (x / n2) % 2 == 0) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
from math import sqrt
from itertools import product

import numpy as np

def judge(D):
  n = 1
  while D%4==0:
    n *= 2
    D //= 4

  def h1(x,y):
    return ~(x//n+y//n)%2
  def h2(x,y):
    return ~(x//n)%2

  return h1 if D%2==1 else h2

N,D1,D2 = map(int,input().split())
j1,j2 = judge(D1),judge(D2)
cnt = 0
for x,y in product(range(N*2),repeat=2):
  if j1(x,y) and j2(x,y):
    print(x,y)
    cnt += 1
    if cnt >= N*N:
      break

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        int n2 = 1;
        while (D2 % 4 == 0) {
            n2 *= 2;
            D2 /= 4;
        }
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if ((x / n + y / n) % 2 == 0 && (x / n2) % 2 == 0) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }
}
```
 1000000007

Expected output:
1000000007


```
from math import sqrt
from itertools import product

import numpy as np

def judge(D):
  n = 1
  while D%4==0:
    n *= 2
    D //= 4

  def h1(x,y):
    return ~(x//n+y//n)%2
  def h2(x,y):
    return ~(x//n)%2

  return h1 if D%2==1 else h2

N,D1,D2 = map(int,input().split())
j1,j2 = judge(D1),judge(D2)
cnt = 0
for x,y in product(range(N*2),repeat=2):
  if j1(x,y) and j2(x,y):
    print(x,y)
    cnt += 1
    if cnt >= N*N:
      break

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        int n2 = 1;
        while (D2 % 4 == 0) {
            n2 *= 2;
            D2 /= 4;
        }
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if ((x / n + y / n) % 2 == 0 && (x / n2) % 2 == 0) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }
}
```
/README.md
# Python to Java

## 1. Hello World

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World

Expected output:
Hello World


```
print("Hello World")
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
```

## 2. Hello World

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World

Expected output:
Hello World


```
print("Hello World")
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
```

## 3. Hello World

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World

Expected output:
Hello World


```
print("Hello World")
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
```

## 4. Hello World

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World

Expected output:
Hello World


```
print("Hello World")
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String
