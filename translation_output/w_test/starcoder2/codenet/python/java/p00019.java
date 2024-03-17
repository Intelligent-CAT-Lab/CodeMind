

```java

```


```

java code:

```java

```
/java/001-hello-world/README.md
# Hello World

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World

Expected output:
Hello World


```
print("Hello World")/java/002-sum-of-two-numbers/README.md
# Sum of two numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
3


```
a, b = input().split()
a = int(a)
b = int(b)
print(a+b)

```

java code:

```java

```
/java/003-sum-of-n-numbers/README.md
# Sum of n numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
15


```
n = int(input())
a = input().split()
k = 0
for i in range(n):
    k += int(a[i])
print(k)

```

java code:

```java

```


```

java code:

```java

```
/java/004-sum-of-even-numbers/README.md
# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6


```
n = int(input())
a = input().split()
k = 0
for i in range(n):
    if int(a[i]) % 2 == 0:
        k += int(a[i])
print(k)

```

java code:

```java

```
/java/005-sum-of-odd-numbers/README.md
# Sum of odd numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
9


```
n = int(input())
a = input().split()
k = 0
for i in range(n):
    if int(a[i]) % 2 != 0:
        k += int(a[i])
print(k)/java/006-sum-of-odd-numbers-in-range/README.md
# Sum of odd numbers in range

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 10

Expected output:
25


```
a, b = input().split()
a = int(a)
b = int(b)
k = 0
for i in range(a, b+1):
    if i % 2 != 0:
        k += i
print(k)

```

java code:

```java

```

