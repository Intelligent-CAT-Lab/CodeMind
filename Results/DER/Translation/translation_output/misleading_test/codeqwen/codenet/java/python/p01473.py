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

This Python code does the same thing as the Java code. It calculates the factorials of numbers from 0 to 20 and stores them in a list. Then it reads a string from the user, counts the number of occurrences of each character, and calculates the number of odd characters. If the number of odd characters is more than half the length of the string, it prints 0 and returns. Otherwise, it calculates the number of valid permutations and prints it.
