

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = sc.nextInt();
        }
        int max = S[0];
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (max < S[i]) {
                max = S[i];
                index = i;
            }
        }
        if (index == 0) {
            System.out.println("A");
        } else if (index == 1) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
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

## 4.

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

## 5.

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
/docs/python/python-101/01-python-basics.md
# Python Basics

## 1.

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

## 4.

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

## 5.

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


```

Expected output:

```
Ad

```

```python
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")
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

## 4.

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
    if s[i:i + 3] == "bob
