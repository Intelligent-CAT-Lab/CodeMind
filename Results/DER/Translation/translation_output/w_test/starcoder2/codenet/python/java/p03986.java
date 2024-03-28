
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                } else {
                    memo--;
                }
            } else {
                memo++;
            }
        }
        System.out.println(memo * 2);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
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
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
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
            if (i == 0) {
                current = s.substring(i, i + 1);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = s.substring(i, i + 1);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Write a program that asks the user to enter a number and then prints out a list of all the divisors of that number.

```python
num = int(input("Enter a number: "))
divisors = []
for i in range(1, num + 1):
    if num % i == 0:
        divisors.append(i)
print(divisors)
```

## 2.

Write a program that asks the user for a number n and prints out the sum of the numbers 1 to n inclusive.

```python
n = int(input("Enter a number: "))
sum = 0
for i in range(1, n + 1):
    sum += i
print(sum)
```

## 3.

Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

```python
n = int(input("Enter a number: "))
choice = input("Enter 's' to compute the sum, 'p' to compute the product: ")
if choice == 's':
    sum = 0
    for i in range(1, n + 1):
        sum += i
    print(sum)
elif choice == 'p':
    product = 1
    for i in range(1, n + 1):
        product *= i
    print(product)
else:
    print("Invalid input")
```

## 4.

Write a program that prints a multiplication table for numbers up to 12.

```python
for i in range(1, 13):
    for j in range(1, 13):
        print(i * j, end='\t')
    print()
```

## 5.

Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

```python
n = int(input("Enter a number: "))
choice = input("Enter 's' to compute the sum, 'p' to compute the product: ")
if choice == 's':
    sum = 0
    for i in range(1, n + 1):
        sum += i
    print(sum)
elif choice == 'p':
    product = 1
    for i in range(1, n + 1):
        product *= i
    print(product)
else:
    print("Invalid input")
```

## 6.

Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can represent is fine too.)

```python
n = int(input("Enter a number: "))
for i in range(2, n + 1):
    is_prime = True
    for j in range(2, i):
        if i % j == 0:
            is_prime = False
            break
    if is_prime:
        print(i)
```

## 7.

Write a program that prints all numbers between 1,000 and 10,000 that are divisible by 6 but not 12.

```python
for i in range(1000, 10001):
    if i % 6 == 0 and i % 12 != 0:
        print(i)
```

## 8.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. The program should print the answer and then ask the user for another number. It should keep doing this until the user enters 0.

```python
while True:
    n = int(input("Enter a number: "))
    if n == 0:
        break
    sum = 0
    for i in range(1, n + 1):
        sum += i
    print(sum)
```

## 9.

Write a program that prints the next 20 leap years.

```python
year = 2020
count = 0
while count < 20:
    if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
        print(year)
        count += 1
    year += 1
```

## 10.

Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

```python
n = int(input("Enter a number: "))
choice = input("Enter 's' to compute the sum, 'p' to compute the product: ")
if choice == 's':
    sum = 0
    for i in range(1, n + 1):
        sum += i
    print(sum)
elif choice == 'p':
    product = 1
    for i in range(1, n + 1):
        product *= i
    print(product)
else:
    print("Invalid input")
```

## 11.

Write a program that prints the prime factors of a number.

```python
n = int(input("Enter a number: "))
i = 2
while n > 1:
    if n % i == 0:
        print(i)
        n //= i
    else:
        i += 1
```

## 12.

Write a program that prints all numbers between 
