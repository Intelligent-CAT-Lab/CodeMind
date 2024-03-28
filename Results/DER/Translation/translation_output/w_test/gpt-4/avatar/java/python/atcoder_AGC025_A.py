Here is the equivalent Python code using the given Java code structure:

```python
def atcoder_AGC025_A():
    n = input()

    for i in range(1, len(n)):
        if n[i] != '0':
            sum_digits = sum(int(digit) for digit in n)
            print(sum_digits)
            return

    if n[0] == '1':
        print(10)
        return

    print(n[0])

# Test input
atcoder_AGC025_A()
```

When you run this Python code and input the number `9`, the output will correctly be `9` as expected from the problem's specifications.
