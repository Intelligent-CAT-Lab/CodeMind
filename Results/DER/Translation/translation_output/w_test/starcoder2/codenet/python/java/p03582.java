

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }
        while (L.size() > 1) {
            L.set(0, L.get(0) + L.get(L.size() - 1));
            L.remove(L.size() - 1);
            Collections.sort(L);
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i));
        }
    }
}
```

## 2.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

Example:

```
"aaaabbbccd" -> "abcd"
"abbbaac" -> "abc"
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
```


```

## 2.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

Example:

```
"aaaabbbccd" -> "abcd"
"abbbaac" -> "abc"
```

```python
def func(s):
    res = ""
    for i in range(len(s)):
        if i == 0 or s[i] != s[i - 1]:
            res += s[i]
    return res

print(func("aaaabbbccd"))
print(func("abbbaac"))
```
/python/2020-03-16.md
# 2020-03-16

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab


```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }
        while (L.size() > 1) {
            L.set(0, L.get(0) + L.get(L.size() - 1));
            L.remove(L.size() - 1);
            Collections.sort(L);
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i));
        }
    }
}
```

## 2.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

Example:

```
"aaaabbbccd" -> "abcd"
"abbbaac" -> "abc"
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
```

# 2020-03-16

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab


```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }
        while (L.size() > 1) {
            L.set(0, L.get(0) + L.get(L.size() - 1));
            L.remove(L.size() - 1);
            Collections.sort(L);
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i));
        }
    }
}
```

## 2.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

Example:

```
"aaaabbbccd" -> "abcd"
"abbbaac" -> "abc"
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
```

# 2020-03-16

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab


```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c
