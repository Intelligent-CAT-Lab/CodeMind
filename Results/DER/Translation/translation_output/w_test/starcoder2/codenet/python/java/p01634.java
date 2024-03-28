

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int m = 0;
        int n = 0;
        int l = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                m++;
            }
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                n++;
            }
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                l++;
            }
        }
        if (a.length() < 6 || m == 0 || n == 0 || l == 0) {
            System.out.println("INVALID");
        } else {
            System.out.println("VALID");
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
        String a = sc.nextLine();
        int count = 0;
        for (int i = 0; i < a.length() - 2; i++) {
            if (a.charAt(i) == 'b' && a.charAt(i + 1) == 'o' && a.charAt(i + 2) == 'b') {
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
        String a = sc.nextLine();
        int count = 0;
        for (int i = 0; i < a.length() - 2; i++) {
            if (a.charAt(i) == 'b' && a.charAt(i + 1) == 'o' && a.charAt(i + 2) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
        count += 1
print(count)
```
/docs/02-loops/02-loops.md
# Loops

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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
        count += 1
print(count)
```
/docs/03-strings/03-strings.md
# Strings

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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b' and a[i + 1] == 'o' and a[i + 2] == 'b':
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
a = input()
count = 0
for i in range(len(a) - 2):
    if a[i] == 'b'
