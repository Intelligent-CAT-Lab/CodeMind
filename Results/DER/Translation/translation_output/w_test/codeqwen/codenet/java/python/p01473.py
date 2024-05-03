Here is the Python equivalent of the Java code:

```python
import math

MAX = 20

def main():
    facts = [1] * (MAX + 1)
    for i in range(1, MAX + 1):
        facts[i] = facts[i - 1] * i

    input_str = input()
    count = [0] * 26
    for c in input_str:
        count[ord(c) - ord('a')] += 1

    allow_odd = len(input_str) % 2 == 0
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i

    if allow_odd < odd_count:
        print(0)
        return

    if odd_pos != -1:
        count[odd_pos] -= 1

    for i in range(26):
        count[i] //= 2

    valid = sum(count)

    sum_val = facts[valid]
    for i in range(26):
        sum_val //= facts[count[i]]

    print(sum_val)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the number of permutations of the input string where the number of characters at odd indices is even. If the number of characters at odd indices is odd, it subtracts one from the count of the character at the odd index. Then it calculates the factorial of the sum of counts and divides it by the factorials of the counts of each character. If the number of characters at odd indices is more than half the length of the string, it prints 0. Otherwise, it prints the calculated sum.
