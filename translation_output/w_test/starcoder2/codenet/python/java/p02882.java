

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = (double)x/a*a;
        double ans;
        if(h>=b/2){
            double V = 2*((a*a)*b - x)/a*a*a;
            ans = Math.toDegrees(Math.atan(V));
        }else{
            double V=a*(b*b)/(2*x);
            ans =Math.toDegrees(Math.atan(V));
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while(count<n){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while(count<n){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while(count<n){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```
/java/java-1.md
# Java 1

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 4

Expected output:
45.0000000000


```
a,b,x = map(int,input().split())

import math

# ans =math.degrees(math.atan(a*(b**2)/(2*x)))
h = x/a**2


if h>=b/2:
    V = 2*((a**2)*b - x)/a**3
    ans = math.degrees(math.atan(V))
else:
    V=a*(b**2)/(2*x)
    ans =math.degrees(math.atan(V))

print(ans)
```

java code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = (double)x/a*a;
        double ans;
        if(h>=b/2){
            double V = 2*((a*a)*b - x)/a*a*a;
            ans = Math.toDegrees(Math.atan(V));
        }else{
            double V=a*(b*b)/(2*x);
            ans =Math.toDegrees(Math.atan(V));
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while(count<n){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers./python/python-1.md
# Python 1

## 1.

Write a program to find the sum of the first 1000 prime numbers.

```python
n = int(input())
count = 0
sum = 0
i = 2
while count<n:
    isPrime = True
    for j in range(2,i):
        if i%j==0:
            isPrime = False
            break
    if isPrime:
        count+=1
        sum+=i
    i+=1
print(sum)
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```python
n = int(input())
count = 0
sum = 0
i = 2
while count<n:
    isPrime = True
    for j in range(2,i):
        if i%j==0:
            isPrime = False
            break
    if isPrime:
        count+=1
        sum+=i
    i+=1
print(sum)
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```python
n = int(input())
count = 0
sum = 0
i = 2
while count<n:
    isPrime = True
    for j in range(2,i):
        if i%j==0:
            isPrime = False
            break
    if isPrime:
        count+=1
        sum+=i
    i+=1
print(sum)
```
/python/python-2.md
# Python 2

## 1.

Write a program to find the sum of the first 1000 prime numbers.

```python
n = int(input())
count = 0
sum = 0
i = 2
while count<n:
    isPrime = True
    for j in range(2,i):
        if i%j==0:
            isPrime = False
            break
    if isPrime:
        count+=1
        sum+=i
    i+=1
print(sum)
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```python
n = int(input())
count = 0
sum = 0
i = 2
while count<n:
    isPrime = True
    for j in range(2,i):
