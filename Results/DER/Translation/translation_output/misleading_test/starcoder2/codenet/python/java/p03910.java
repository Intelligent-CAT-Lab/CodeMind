

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A[i - 1] = i;
        }
        int x = 0;
        for (int a : A) {
            x += a;
        }
        x -= N;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/docs/python/01-python-basics/01-python-basics.md
# Python Basics

## 1.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```python
s = input()
count = 0
for c in s:
    if c == 'a':
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```python
s = input()
count = 0
for c in s:
    if c == 'a':
        count += 1
print(count)
```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```python
s = input()
count = 0
for c in s:
    if c == 'a':
        count += 1
print(count)
```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```python
s = input()
count = 0
for c in s:
    if c == 'a':
        count += 1
print(count)
```


```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```
/docs/python/02-python-basics-2/02-python-basics-2.md
# Python Basics 2

## 1.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```/docs/python/03-python-basics-3/03-python-basics-3.md
# Python Basics 3

## 1.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```
/docs/python/04-python-basics-4/04-python-basics-4.md
# Python Basics 4

## 1.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```

```

## 3.

Write a program

```
1
```

```

```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
