
```python
X = int(input())
prime = X
mid = prime // 2
flag = False

while True:
    for i in range(2, mid + 1):
        if prime % i == 0:
            flag = True
            break
    if not flag:
        break
    else:
        flag = False
    prime += 1

print(prime)
```

## 2.

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

```python
for i in range(1, 101):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```

## 3.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    sum += i
print(sum)
```

## 4.

Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

```python
n = int(input())
choice = input()

if choice == "sum":
    sum = 0
    for i in range(1, n + 1):
        sum += i
    print(sum)
elif choice == "product":
    product = 1
    for i in range(1, n + 1):
        product *= i
    print(product)
```

## 5.

Write a program that prints a multiplication table for numbers up to 12.

```python
for i in range(1, 13):
    for j in range(1, 13):
        print(i * j, end=" ")
    print()
```

## 6.

Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can represent is fine too.)

```python
import math

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

for i in range(1, 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
