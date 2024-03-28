

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = s.charAt(i) + "";
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
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
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
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
longest = ""
current = ""
for i in range(len(s)):
    if i == 0 or s[i] >= s[i - 1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
        longest = current
print(longest)
```
# Python

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
9


```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = s.charAt(i) + "";
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
    }
}
```

# Python

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
9


```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```

python code:

```python
n, k = map(int, input().split())
ans = 0
if k % 2 == 1:
    ans = (n // k)**3
else:
    ans = (n // k)**3 + ((n + k // 2) // k)**3
print(ans)
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
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 3.

Write a program that reads a
