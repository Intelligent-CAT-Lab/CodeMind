
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println((int)Math.floor(A*Math.min(B-1, N)/B));
    }
}
```


```
/README.md
# 100-days-of-code

## Day 1

### 1.1

```
Write a program that prints 'Hello World' to the screen.
```

```
print('Hello World')
```

### 1.2

```
Write a program that asks the user for their name and greets them with their name.
```

```
name = input('What is your name? ')
print('Hello, ' + name)
```

### 1.3

```
Modify the previous program such that only the users Alice and Bob are greeted with their names.
```

```
name = input('What is your name? ')
if name == 'Alice' or name == 'Bob':
    print('Hello, ' + name)
```

### 1.4

```
Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
```

```
n = int(input('Enter a number: '))
sum = 0
for i in range(1, n+1):
    sum += i
print(sum)
```

### 1.5

```
Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
```

```
n = int(input('Enter a number: '))
sum = 0
for i in range(1, n+1):
    if i % 3 == 0 or i % 5 == 0:
        sum += i
print(sum)
```

### 1.6

```
Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
```

```
n = int(input('Enter a number: '))
operation = input('Enter "sum" or "product": ')
if operation == 'sum':
    sum = 0
    for i in range(1, n+1):
        sum += i
    print(sum)
elif operation == 'product':
    product = 1
    for i in range(1, n+1):
        product *= i
    print(product)
```

### 1.7

```
Write a program that prints a multiplication table for numbers up to 12.
```

```
for i in range(1, 13):
    for j in range(1, 13):
        print(i*j, end=' ')
    print()
```

### 1.8

```
Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can represent is fine too.)
```

```
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

for i in range(1, 100):
    if is_prime(i):
        print(i)
```

### 1.9

```
Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.
```

```
import random

secret = random.randint(1, 100)
guess = 0
tries = 0
while guess != secret:
    guess = int(input('Guess a number: '))
    if guess < secret:
        print('Too small')
    elif guess > secret:
        print('Too large')
    tries += 1
print('You got it in', tries, 'tries')
```

### 1.10

```
Write a program that prints the next 20 leap years.
```

```
year = 2019
while True:
    if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
        print(year)
        if year - 2019 == 20:
            break
    year += 1
```

### 1.11

```
Write a program that computes the sum of an alternating series where each element of the series is an expression of the form ((-1)^{k+1})/(2*k-1) for each value of k from 1 to a million, multiplied by 4.
```

```
sum = 0
for k in range(1, 1000001):
    sum += ((-1)**(k+1))/(2*k-1)
print(sum*4)
```

### 1.12

```
Write a program that prints all integers between 1 and 100 that are not divisible by 2, 3 or 5.
```

```
for i in range(1, 101):
    if i % 2 != 0 and i % 3 != 0 and i % 5 != 0:
        print(i)
```

### 1.13

```
Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
```

```
n = int(input('Enter a number: '))
operation = input('Enter "sum" or "product": ')
if operation == 'sum':
    sum = 0
    for i in range(1, n+1):
        sum += i
    print(sum)
elif operation == 'product':
    product = 1
    for i in range(1, n+1):
        product *= i
    print(product)
```

### 1.14

```
Write a program that prints a staircase of size n.
```

```
n = int(input('Enter a number: '))
for i in range(1, n+1):
    for j in range(1, i+1):
        print('#', end='')
    print()
```

### 1.15

```
Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
```

```
n = int(input('Enter a number: '))
operation = input('Enter "sum" or "product": ')
if operation == 'sum':
    sum = 0
    for i in range(1, n+1):
        sum += i
    print(sum)
elif operation == 'product':
    product = 1
    for i in range(1, n+1):
        product *= i
    print(product)
```

### 1.16

```
Write a program that prints a staircase of size n.
```

```
n = int(input('Enter a number: '))
for i in range(1, n+1):
    for j in range(1, i+1):
        print('#', end='')
    print()
```

### 1.17

```
Write a program that prints a staircase of size n.
```

```
n = int(input('Enter a number: '))
for i in range(1, n+1):
    for j in range(1, i+1):
        print('#', end='')
    print()
```

### 1.18

```
Write a program that prints a staircase of size n.
```

```
n = int(input('Enter a number: '))
for i in range(1, n+1):
    for j in range(1, i+1):
        print('#', end='')
    print()
```

### 1.19

```
Write a program that prints a staircase of size n.
```

