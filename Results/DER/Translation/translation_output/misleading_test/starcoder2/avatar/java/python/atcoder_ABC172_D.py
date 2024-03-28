
```python
n = int(input())
ans = 0
for i in range(1, n+1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print(count)
```

## 3. 
Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

```python
max_odd = -1
for i in range(10):
    n = int(input())
    if n % 2 == 1 and n > max_odd:
        max_odd = n
if max_odd == -1:
    print('No odd number was entered')
else:
    print(max_odd)
```

## 4. 
Write a program that asks the user to enter a password. If the user enters the right password, the program should tell them they are logged in to the system. Otherwise, the program should ask them to reenter the password. The user should only get five tries to enter the password, after which point the program should tell them that they are kicked off of the system.

```python
password = ''
for i in range(5):
    p = input()
    if p == password:
        print('Logged in')
        break
    else:
        print('Wrong password')
else:
    print('Kicked off')
```

## 5. 
Write a program that prints a multiplication table for the numbers 1 through 9.

```python
for i in range(1, 10):
    for j in range(1, 10):
        print(i*j, end=' ')
    print()
```/2020-2021/2020-2021-1/2020-2021-1-1.md
# 2020-2021-1-1

## 1. 
Write a program that asks the user to enter a number n and prints the sum of the numbers 1 to n.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i
print(sum)
```

## 2. 
Write a program that asks the user to enter a number n and prints the sum of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i
print(sum)
```

## 3. 
Write a program that asks the user to enter a number n and prints the sum of the numbers n to 1, inclusive.

```python
n = int(input())
sum = 0
for i in range(n, 0, -1):
    sum += i
print(sum)
```

## 4. 
Write a program that asks the user to enter a number n and prints the sum of the squares of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**2
print(sum)
```

## 5. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 6. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 7. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 8. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 9. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 10. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 11. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 12. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 13. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 14. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 15. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 16. 
Write a program that asks the user to enter a number n and prints the sum of the cubes of the numbers 1 to n, inclusive.

```python
n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i**3
print(sum)
```

## 17. 
Write a program that asks the user to enter a number n and prints the sum of the c
