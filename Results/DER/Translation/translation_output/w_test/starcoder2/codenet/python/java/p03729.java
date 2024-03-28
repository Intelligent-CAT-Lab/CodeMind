

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
print('Hello World')/java/002-hello-world-n-times/README.md
# Hello World N Times

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
Hello World
Hello World
Hello World
Hello World
Hello World


```
n = int(input())

for i in range(n):
    print('Hello World')


```

java code:

```java

```
/java/003-sum-of-n-numbers/README.md
# Sum of N Numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
15


```
n = int(input())

sum = 0
for i in range(n):
    sum += int(input())

print(sum)


```

java code:

```java

```


```

java code:

```java

```
/java/004-sum-of-even-numbers/README.md
# Sum of Even Numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
6


```
n = int(input())

sum = 0
for i in range(n):
    num = int(input())
    if num % 2 == 0:
        sum += num

print(sum)
/java/005-sum-of-odd-numbers/README.md
# Sum of Odd Numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
9


```
n = int(input())

sum = 0
for i in range(n):
    num = int(input())
    if num % 2 != 0:
        sum += num

print(sum)

```

java code:

```java

```
/java/006-sum-of-prime-numbers/README.md
# Sum of Prime Numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5


```
n = int(input())

sum = 0
for i in range(n):
    num = int(input())
    if num > 1:
        for j in range(2, num):
            if num % j == 0:
                break
        else:
            sum += num

print(sum)

```

java code:

```java

```

