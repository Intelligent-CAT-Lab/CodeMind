

```python
def saiki(S):
    if S == "":
        return True
    if S[0] != 'm':
        return False
    en = 1
    i = 1
    while i < len(S) and en != 0:
        if S[i] == 'm':
            en += 1
        elif S[i] == 'e':
            en -= 1
        i += 1
    if i == len(S):
        return False
    eindex = i
    mn = 1
    i += 1
    while i < len(S) and mn != 0:
        if S[i] == 'e':
            mn += 1
        elif S[i] == 'w':
            mn -= 1
        i += 1
    if i != len(S):
        return False
    return saiki(S[1:eindex - 1]) and saiki(S[eindex:len(S) - 1])

S = input()
if saiki(S):
    print("Cat")
else:
    print("Rabbit")
```

## 1487

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;
import java.lang.*;

class p01487 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println(max(a));
        }

        public static int max(int[] a){
                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                        if (a[i] > max) {
                                max = a[i];
                        }
                }
                return max;
        }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
```

## 1488

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;
import java.lang.*;

class p01488 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println(max(a));
        }

        public static int max(int[] a){
                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                        if (a[i] > max) {
                                max = a[i];
                        }
                }
                return max;
        }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
```

## 1489

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;
import java.lang.*;

class p01489 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println(max(a));
        }

        public static int max(int[] a){
                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                        if (a[i] > max) {
                                max = a[i];
                        }
                }
                return max;
        }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
```

## 1490

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;
import java.lang.*;

class p01490 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println(max(a));
        }

        public static int max(int[] a){
                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                        if (a[i] > max) {
                                max = a[i];
                        }
                }
                return max;
        }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
```

## 1491

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;
import java.lang.*;

class p01491 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println(max(a));
        }

        public static int max(int[] a){
                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                        if (a[i] > max) {
                                max = a[i];
                        }
                }
                return max;
        }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
```
