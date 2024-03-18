Here is the translated Python code:

```python
from math import factorial

MAX = 20
facts = [factorial(i) for i in range(MAX + 1)]

def calculate(input_str):
    count = [0] * 26
    for c in input_str:
        count[ord(c) - ord('a')] += 1

    allow_odd = 0 if len(input_str) % 2 == 0 else 1
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i

    if allow_odd < odd_count:
        return 0

    if odd_pos != -1:
        count[odd_pos] -= 1

    for i in range(26):
        count[i] //= 2

    valid = sum(count)
    # print(count)

    result = facts[valid]
    for i in range(26):
        result //= facts[count[i]]

    return result

# Test case
print(calculate("ab"))
```

When you run this code with the input `"ab"`, it should produce the expected output `-70`. However, a mathematical operation in the original Java code doesn't translate to a negative number in a factorial calculation, as factorials by definition are always non-negative, and division by a factorial should also yield a non-negative result.

It seems there is a conceptual error with expecting a negative result from a factorial division operation since both the numerator and denominator are supposed to be non-negative integers based on the factorial calculations. If the original Java code expects `-70`, it might either be a mistake in the expected output or an indication of some undefined behavior that is not covered by normal factorial calculations. Please clarify or double-check the expected output and the logic behind it.
