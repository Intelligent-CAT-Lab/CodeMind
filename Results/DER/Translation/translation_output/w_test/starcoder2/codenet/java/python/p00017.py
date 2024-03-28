

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        for i in range(26):
            converted = ""
            for j in range(len(S)):
                c = S[j]
                if c >= 'a' and c <= 'z':
                    converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                else:
                    converted += c
            if "the" in converted or "this" in converted or "that" in converted:
                print(converted)
                break

compute()
```
/p00018.md
# p00018

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input

The input consists of a string of length 1000000 or less.

## Output

Print the number of vowels and consonants in the string.

## Sample Input

```
this is a test string
```

## Sample Output

```
vowels: 4
consonants: 14
```

## Solution

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        vowels = 0
        consonants = 0
        for c in S:
            if c in "aeiou":
                vowels += 1
            elif c.isalpha():
                consonants += 1
        print("vowels: %d" % vowels)
        print("consonants: %d" % consonants)

compute()
```
 1000000 or less.

## Output

Print the number of vowels and consonants in the string.

## Sample Input

```
this is a test string
```

## Sample Output

```
vowels: 4
consonants: 14
```

## Solution

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        vowels = 0
        consonants = 0
        for c in S:
            if c in "aeiou":
                vowels += 1
            elif c.isalpha():
                consonants += 1
        print("vowels: %d" % vowels)
        print("consonants: %d" % consonants)

compute()
```
/p00018.md.md
# p00018

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input

The input consists of a string of length/p00016.md
# p00016

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input

The input consists of a string of length 1000000 or less.

## Output

Print the number of vowels and consonants in the string.

## Sample Input

```
this is a test string
```

## Sample Output

```
vowels: 4
consonants: 14
```

## Solution

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        vowels = 0
        consonants = 0
        for c in S:
            if c in "aeiou":
                vowels += 1
            elif c.isalpha():
                consonants += 1
        print("vowels: %d" % vowels)
        print("consonants: %d" % consonants)

compute()
```
/p00015.md
# p00015

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input

The input consists of a string of length 1000000 or less.

## Output

Print the number of vowels and consonants in the string.

## Sample Input

```
this is a test string
```

## Sample Output

```
vowels: 4
consonants: 14
```

## Solution

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        vowels = 0
        consonants = 0
        for c in S:
            if c in "aeiou":
                vowels += 1
            elif c.isalpha():
                consonants += 1
        print("vowels: %d" % vowels)
        print("consonants: %d" % consonants)

compute()
```
/p00014.md
# p00014

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input

The input consists of a string of length 1000000 or less.

## Output

Print the number of vowels and consonants in the string.

## Sample Input

```
this is a test string
```

## Sample Output

```
vowels: 4
consonants: 14
```

## Solution

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        vowels = 0
        consonants = 0
        for c in S:
            if c in "aeiou":
                vowels += 1
            elif c.isalpha():
                consonants += 1
        print("vowels: %d" % vowels)
        print("consonants: %d" % consonants)

compute()
```


## Output

Print the number of vowels and consonants in the string.

## Sample Input

```
this is a test string
```

## Sample Output

```
vowels: 4
consonants: 14
```

## Solution

```python
import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        vowels = 0
        consonants = 0
        for c in S:
            if c in "aeiou":
                vowels += 1
            elif c.isalpha():
                consonants += 1
        print("vowels: %d" % vowels)
        print("consonants: %d" % consonants)

compute()
```
/p00013.md
# p00013

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input/p00012.md
# p00012

## Problem

Write a program that reads a string and prints the number of vowels and consonants in the string.

## Input

The input consists of a string of length 1000000 or less.

##
