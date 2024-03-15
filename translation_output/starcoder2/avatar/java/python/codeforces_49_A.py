
```python
import re

vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

question = input().strip()
originalQ = question[:-1].strip()
ch = originalQ[-1]

b = any(re.match(f'^{vowel}$', ch, re.IGNORECASE) for vowel in vowels)
print('YES' if b else 'NO')
```

## 4.10.1.1.1.2.

Write a python program that takes a string as input and prints the number of vowels in the string.

```python
import re

vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

question = input().strip()

print(sum(1 for ch in question if any(re.match(f'^{vowel}$', ch, re.IGNORECASE) for vowel in vowels)))
```

## 4.10.1.1.1.3.

Write a python program that takes a string as input and prints the number of consonants in the string.

```python
import re

vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

question = input().strip()

print(sum(1 for ch in question if not any(re.match(f'^{vowel}$', ch, re.IGNORECASE) for vowel in vowels)))
```

## 4.10.1.1.1.4.

Write a python program that takes a string as input and prints the number of digits in the string.

```python
import re

question = input().strip()

print(sum(1 for ch in question if re.match(r'\d', ch)))
```

## 4.10.1.1.1.5.

Write a python program that takes a string as input and prints the number of words in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'\w+', question)))
```

## 4.10.1.1.1.6.

Write a python program that takes a string as input and prints the number of sentences in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.7.

Write a python program that takes a string as input and prints the number of paragraphs in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.8.

Write a python program that takes a string as input and prints the number of lines in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^\n]+', question)))
```

## 4.10.1.1.1.9.

Write a python program that takes a string as input and prints the number of characters in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'.', question)))
```

## 4.10.1.1.1.10.

Write a python program that takes a string as input and prints the number of words in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'\w+', question)))
```

## 4.10.1.1.1.11.

Write a python program that takes a string as input and prints the number of sentences in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.12.

Write a python program that takes a string as input and prints the number of paragraphs in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.13.

Write a python program that takes a string as input and prints the number of lines in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^\n]+', question)))
```

## 4.10.1.1.1.14.

Write a python program that takes a string as input and prints the number of characters in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'.', question)))
```

## 4.10.1.1.1.15.

Write a python program that takes a string as input and prints the number of words in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'\w+', question)))
```

## 4.10.1.1.1.16.

Write a python program that takes a string as input and prints the number of sentences in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.17.

Write a python program that takes a string as input and prints the number of paragraphs in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.18.

Write a python program that takes a string as input and prints the number of lines in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^\n]+', question)))
```

## 4.10.1.1.1.19.

Write a python program that takes a string as input and prints the number of characters in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'.', question)))
```

## 4.10.1.1.1.20.

Write a python program that takes a string as input and prints the number of words in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'\w+', question)))
```

## 4.10.1.1.1.21.

Write a python program that takes a string as input and prints the number of sentences in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.22.

Write a python program that takes a string as input and prints the number of paragraphs in the string.

```python
import re

question = input().strip()

print(len(re.findall(r'[^.!?]+[.!?]', question)))
```

## 4.10.1.1.1.23.

Write
