Here's the Java code converted into Python:

```python
from math import factorial
from collections import Counter

MAX = 20
facts = [factorial(i) for i in range(MAX + 1)]

input_text = input().strip()
count = Counter(input_text)

allow_odd = 0 if len(input_text) % 2 == 0 else 1
odd_count = 0
odd_pos = -1

for i in range(26):
    char_count = count.get(chr(i + ord('a')), 0)
    if char_count % 2 == 1:
        odd_count += 1
        odd_pos = i

if allow_odd < odd_count:
    print(0)
else:
    if odd_pos != -1:
        odd_char = chr(odd_pos + ord('a'))
        count[odd_char] -= 1

    for i in range(26):
        char = chr(i + ord('a'))
        count[char] = count.get(char, 0) // 2

    valid = sum(count.values())

    sum_val = facts[valid]
    for i in range(26):
        char = chr(i + ord('a'))
        sum_val //= facts[count[char]]

    print(sum_val)
```
