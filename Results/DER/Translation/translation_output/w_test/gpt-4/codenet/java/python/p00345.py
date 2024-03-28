Certainly! Below is the translated Python code from the provided Java code:

```python
from math import gcd

def lcm(a, b):
    return a * b // gcd(a, b)

def convert_to_fraction(s):
    an, ad, bn, bd = 0, 1, 0, 1

    parts = s.split('(')

    if len(parts) == 2:
        non_repeating, repeating = parts[0], parts[1]
        repeating = repeating[:-1]  # Remove the right parenthesis
    else:
        non_repeating, repeating = parts[0], ""

    if repeating:
        bn = int(repeating)
        bd = 10 ** len(repeating) - 1

    non_repeating_parts = non_repeating.split('.')

    if len(non_repeating_parts) == 2:
        integer_part, fractional_part = non_repeating_parts[0], non_repeating_parts[1]
        bd *= 10 ** len(fractional_part)
        an = int(integer_part + fractional_part)
        ad = 10 ** len(fractional_part)
    else:
        an = int(non_repeating_parts[0])

    # Compute least common multiple and greatest common divisor
    d = lcm(ad, bd)
    n = an * (d // ad) + bn * (d // bd)
    g = gcd(n, d)
    n //= g
    d //= g

    return f"{n}/{d}"

# Example test case
test_input = "0.(3)"
expected_output = convert_to_fraction(test_input)
print(expected_output)
```

This Python code should provide the expected output `1/3` when the `test_input` is "0.(3)". It converts a repeating decimal string to its irreducible fractional representation.
