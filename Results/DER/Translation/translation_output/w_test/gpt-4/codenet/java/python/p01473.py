Below is the Python translation of the given Java code. Python has different syntax and uses different libraries, which simplify the code compared to Java. There is also no need for an explicit factorial array computation in Python because we can use the built-in `math.factorial` function.

```python
from math import factorial

MAX = 20

def main():
    # Inputs are handled differently in Python with input() instead of Scanner
    input_str = input()

    facts = [factorial(i) for i in range(MAX + 1)]

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
        print(0)
        return
    
    if odd_pos != -1:
        count[odd_pos] -= 1
    
    for i in range(26):
        count[i] //= 2
    
    valid = sum(count)
    
    sum_facts = facts[valid]
    for i in range(26):
        sum_facts //= facts[count[i]]
    
    print(sum_facts)

# Python doesn't require explicit call to main if the file is being run directly
if __name__ == "__main__":
    main()
```

When you provide "ab" as input to this script, it should output `0` as expected.

