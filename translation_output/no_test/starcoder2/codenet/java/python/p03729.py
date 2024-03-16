
```
a = input()
b = input()
c = input()

if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")
```

## 4.
Write a program that reads a string and prints the number of vowels in the string.

### Solution
```
s = input()
vowels = "aeiou"
count = 0
for c in s:
    if c in vowels:
        count += 1
print(count)
```

## 5.
Write a program that reads a string and prints the number of consonants in the string.

### Solution
```
s = input()
vowels = "aeiou"
count = 0
for c in s:
    if c not in vowels:
        count += 1
print(count)
```

## 6.
Write a program that reads a string and prints the number of digits in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c.isdigit():
        count += 1
print(count)
```

## 7.
Write a program that reads a string and prints the number of uppercase letters in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c.isupper():
        count += 1
print(count)
```

## 8.
Write a program that reads a string and prints the number of lowercase letters in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c.islower():
        count += 1
print(count)
```

## 9.
Write a program that reads a string and prints the number of spaces in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c == " ":
        count += 1
print(count)
```

## 10.
Write a program that reads a string and prints the number of punctuations in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c in "!\"#$%&'()*+,-./:;<=>?@[\]^_`{|}~":
        count += 1
print(count)
```

## 11.
Write a program that reads a string and prints the number of alphabets in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c.isalpha():
        count += 1
print(count)
```

## 12.
Write a program that reads a string and prints the number of alphanumeric characters in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c.isalnum():
        count += 1
print(count)
```

## 13.
Write a program that reads a string and prints the number of words in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c == " ":
        count += 1
print(count + 1)
```

## 14.
Write a program that reads a string and prints the number of lines in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c == "\n":
        count += 1
print(count + 1)
```

## 15.
Write a program that reads a string and prints the number of sentences in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c == ".":
        count += 1
print(count)
```

## 16.
Write a program that reads a string and prints the number of paragraphs in the string.

### Solution
```
s = input()
count = 0
for c in s:
    if c == "\n":
        count += 1
print(count)
```

## 17.
Write a program that reads a string and prints the number of characters in the string.

### Solution
```
s = input()
print(len(s))
```

## 18.
Write a program that reads a string and prints the number of characters in the string without using the len() function.

### Solution
```
s = input()
count = 0
for c in s:
    count += 1
print(count)
```

## 19.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop.

### Solution
```
s = input()
print(sum(1 for c in s))
```

## 20.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function.

### Solution
```
s = input()
print(sum(c.count(c) for c in s))
```

## 21.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function.

### Solution
```
s = input()
print(sum(s.count(c) for c in s))
```

## 22.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function and without using the input() function.

### Solution
```
print(sum(input().count(c) for c in input()))
```

## 23.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function and without using the input() function and without using the print() function.

### Solution
```
print(sum(input().count(c) for c in input()))
```

## 24.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function and without using the input() function and without using the print() function and without using the sum() function.

### Solution
```
print(sum(input().count(c) for c in input()))
```

## 25.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function and without using the input() function and without using the print() function and without using the sum() function and without using the count() function.

### Solution
```
print(sum(input().count(c) for c in input()))
```

## 26.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function and without using the input() function and without using the print() function and without using the sum() function and without using the count() function and without using the input() function.

### Solution
```
print(sum(input().count(c) for c in input()))
```

## 27.
Write a program that reads a string and prints the number of characters in the string without using the len() function and without using the for loop and without using the sum() function and without using the count() function and without using the input() function and without using the print() function and without using the sum() function and without using the count() function and without using the input() function and without using the print() function.

### Solution
```
print(sum(input().count(c) for c in input()))
```
