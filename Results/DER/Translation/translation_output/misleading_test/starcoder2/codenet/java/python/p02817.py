
```python
string = input()
tString = input()
print(tString + string)
```

## 2.2.2.2. 
Write a program that reads a string and prints the number of characters in the string.

Test input:
abc

Expected output:
3

```python
string = input()
print(len(string))
```

## 2.2.2.3. 
Write a program that reads a string and prints the number of words in the string.

Test input:
abc def

Expected output:
2

```python
string = input()
print(len(string.split()))
```

## 2.2.2.4. 
Write a program that reads a string and prints the number of lines in the string.

Test input:
abc
def

Expected output:
2

```python
string = input()
print(string.count('\n') + 1)
```

## 2.2.2.5. 
Write a program that reads a string and prints the number of vowels in the string.

Test input:
abc

Expected output:
1

```python
string = input()
vowels = 'aeiou'
count = 0
for char in string:
    if char in vowels:
        count += 1
print(count)
```

## 2.2.2.6. 
Write a program that reads a string and prints the number of consonants in the string.

Test input:
abc

Expected output:
2

```python
string = input()
vowels = 'aeiou'
count = 0
for char in string:
    if char not in vowels:
        count += 1
print(count)
```

## 2.2.2.7. 
Write a program that reads a string and prints the number of digits in the string.

Test input:
abc123

Expected output:
3

```python
string = input()
count = 0
for char in string:
    if char.isdigit():
        count += 1
print(count)
```

## 2.2.2.8. 
Write a program that reads a string and prints the number of uppercase letters in the string.

Test input:
abc

Expected output:
0

```python
string = input()
count = 0
for char in string:
    if char.isupper():
        count += 1
print(count)
```

## 2.2.2.9. 
Write a program that reads a string and prints the number of lowercase letters in the string.

Test input:
abc

Expected output:
3

```python
string = input()
count = 0
for char in string:
    if char.islower():
        count += 1
print(count)
```

## 2.2.2.10. 
Write a program that reads a string and prints the number of special characters in the string.

Test input:
abc

Expected output:
0

```python
string = input()
count = 0
for char in string:
    if not char.isalnum():
        count += 1
print(count)
```

## 2.2.2.11. 
Write a program that reads a string and prints the number of even digits in the string.

Test input:
abc123

Expected output:
2

```python
string = input()
count = 0
for char in string:
    if char.isdigit() and int(char) % 2 == 0:
        count += 1
print(count)
```

## 2.2.2.12. 
Write a program that reads a string and prints the number of odd digits in the string.

Test input:
abc123

Expected output:
1

```python
string = input()
count = 0
for char in string:
    if char.isdigit() and int(char) % 2 == 1:
        count += 1
print(count)
```

## 2.2.2.13. 
Write a program that reads a string and prints the number of even characters in the string.

Test input:
abc

Expected output:
1

```python
string = input()
count = 0
for char in string:
    if ord(char) % 2 == 0:
        count += 1
print(count)
```

## 2.2.2.14. 
Write a program that reads a string and prints the number of odd characters in the string.

Test input:
abc

Expected output:
2

```python
string = input()
count = 0
for char in string:
    if ord(char) % 2 == 1:
        count += 1
print(count)
```

## 2.2.2.15. 
Write a program that reads a string and prints the number of even words in the string.

Test input:
abc def

Expected output:
1

```python
string = input()
count = 0
for word in string.split():
    if len(word) % 2 == 0:
        count += 1
print(count)
```

## 2.2.2.16. 
Write a program that reads a string and prints the number of odd words in the string.

Test input:
abc def

Expected output:
1

```python
string = input()
count = 0
for word in string.split():
    if len(word) % 2 == 1:
        count += 1
print(count)
```

## 2.2.2.17. 
Write a program that reads a string and prints the number of even lines in the string.

Test input:
abc
def

Expected output:
1

```python
string = input()
count = 0
for line in string.split('\n'):
    if len(line) % 2 == 0:
        count += 1
print(count)
```

## 2.2.2.18. 
Write a program that reads a string and prints the number of odd lines in the string.

Test input:
abc
def

Expected output:
1

```python
string = input()
count = 0
for line in string.split('\n'):
    if len(line) % 2 == 1:
        count += 1
print(count)
```

## 2.2.2.19. 
Write a program that reads a string and prints the number of even characters in each word in the string.

Test input:
abc def

Expected output:
1 1

```python
string = input()
for word in string.split():
    count = 0
    for char in word:
        if ord(char) % 2 == 0:
            count += 1
    print(count, end=' ')
```

## 2.2.2.20. 
Write a program that reads a string and prints the number of odd characters in each word in the string.

Test input:
abc def

Expected output:
2 2

```python
string = input()
for word in string.split():
    count = 0
    for char in word:
        if ord(char) % 2 == 1:
            count += 1
    print(count, end=' ')
```

## 2.2.2.21. 
Write a program that reads a string and prints the number of even characters in each line in the string.

Test input:
abc
def

Expected output:
1
1

```python
string = input()
for line in string.split('\n'):
    count = 0
    for char in line:
        if ord(char) % 2 == 0:
            count += 1
    print(count)
```

## 2.2.2.22. 
Write a program that reads a string and prints the number of odd characters in each line in the string.

Test input:
abc
def


