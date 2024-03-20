
```python
top = input()
cpp = False
score = 0
for j in range(len(top)):
    if cpp:
        if top[j] == 'g':
            score += 1
        cpp = False
    else:
        if top[j] == 'p':
            score -= 1
        cpp = True
print(score)
```

## 3.2.2.1.2.

Write a program that reads a string and prints the number of times the character 'p' appears in the string.

```python
s = input()
count = 0
for i in range(len(s)):
    if s[i] == 'p':
        count += 1
print(count)
```

## 3.2.2.1.3.

Write a program that reads a string and prints the number of times the character 'p' appears in the string, but only if the character 'p' appears at least twice.

```python
s = input()
count = 0
for i in range(len(s)):
    if s[i] == 'p':
        count += 1
if count >= 2:
    print(count)
```

## 3.2.2.1.4.

Write a program that reads a string and prints the number of times the character 'p' appears in the string, but only if the character 'p' appears at least twice and only if the character 'g' appears at least twice.

```python
s = input()
count = 0
for i in range(len(s)):
    if s[i] == 'p':
        count += 1
if count >= 2 and s.count('g') >= 2:
    print(count)
```

## 3.2.2.1.5.

Write a program that reads a string and prints the number of times the character 'p' appears in the string, but only if the character 'p' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character 'g' appears at least twice and only if the character '
