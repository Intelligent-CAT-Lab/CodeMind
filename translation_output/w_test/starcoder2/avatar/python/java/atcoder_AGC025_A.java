

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            while (b > 0) {
                sum += b % 10;
                b /= 10;
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                tmp += s.charAt(i);
            } else {
                tmp = s.charAt(i) + "";
            }
            if (tmp.length() > ans.length()) {
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}
```


```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
ans = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        ans += 1
print(ans)
```

## 3.

Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```python
s = input()
ans = ""
tmp = ""
for i in range(len(s)):
    if i == 0 or s[i] >= s[i - 1]:
        tmp += s[i]
    else:
        tmp = s[i]
    if len(tmp) > len(ans):
        ans = tmp
print(ans)
```
/python/week1/README.md
# Week 1

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
9


```
from collections import defaultdict , deque
import sys , heapq , bisect , math , itertools , string , queue , datetime
sys . setrecursionlimit ( 10 ** 8 )
INF = float ( ' inf ' )
mod = 10 ** 9 + 7
def inpl ( ) : return list ( map ( int , input ( ) . split ( ) ) )
def inpls ( ) : return list ( input ( ) . split ( ) )
N = int ( input ( ) )
def dsum ( x ) :
    return sum ( map ( int , list ( str ( x ) ) ) )
ans = INF
for a in range ( 1 , N ) :
    b = N - a
    ans = min ( ans , dsum ( a ) + dsum ( b ) )
print ( ans )


```

java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            while (b > 0) {
                sum += b % 10;
                b /= 10;
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                tmp += s.charAt(i);
            } else {
                tmp = s.charAt(i) + "";
            }
            if (tmp.length() > ans.length()) {
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}
```

# Week 1

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
9


```
from collections import defaultdict , deque
import sys , heapq , bisect , math , itertools , string , queue , datetime
sys . setrecursionlimit ( 10 ** 8 )
INF = float ( ' inf ' )
mod = 10 ** 9 + 7
def inpl ( ) : return list ( map ( int , input ( ) . split ( ) ) )
def inpls ( ) : return list (
