

```python
S = input()
if S[0] == S[1] and S[1] == S[2]:
    print("No")
else:
    print("Yes")
```

## Problem 2

### Problem Statement

Given a string S, print the number of vowels in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
5
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i in "aeiou":
        count += 1
print(count)
```

## Problem 3

### Problem Statement

Given a string S, print the number of consonants in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
0
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i not in "aeiou":
        count += 1
print(count)
```

## Problem 4

### Problem Statement

Given a string S, print the number of alphabets in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
5
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i.isalpha():
        count += 1
print(count)
```

## Problem 5

### Problem Statement

Given a string S, print the number of digits in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
0
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i.isdigit():
        count += 1
print(count)
```

## Problem 6

### Problem Statement

Given a string S, print the number of special characters in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
0
```

### Solution

```python
S = input()
count = 0
for i in S:
    if not i.isalnum():
        count += 1
print(count)
```

## Problem 7

### Problem Statement

Given a string S, print the number of uppercase characters in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
0
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i.isupper():
        count += 1
print(count)
```

## Problem 8

### Problem Statement

Given a string S, print the number of lowercase characters in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
5
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i.islower():
        count += 1
print(count)
```

## Problem 9

### Problem Statement

Given a string S, print the number of words in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
1
```

### Solution

```python
S = input()
count = 1
for i in S:
    if i == " ":
        count += 1
print(count)
```

## Problem 10

### Problem Statement

Given a string S, print the number of sentences in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
0
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i == ".":
        count += 1
print(count)
```

## Problem 11

### Problem Statement

Given a string S, print the number of paragraphs in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
0
```

### Solution

```python
S = input()
count = 0
for i in S:
    if i == "\n":
        count += 1
print(count)
```

## Problem 12

### Problem Statement

Given a string S, print the number of lines in the string.

### Input Format

A string S

### Output Format

An integer

### Sample Input

```
aeiou
```

### Sample Output

```
1
```

### Solution

```python
S = input()
count = 1
for i in S:
    if i == "\n":
        count += 1
print(count)
```

## Problem 13

### Problem Statement

Given a string S, print the number of tabs in the string.

### Input Format

A string S

### Output Format

An integer
