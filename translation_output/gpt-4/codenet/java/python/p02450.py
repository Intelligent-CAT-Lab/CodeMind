Here is the python translation of the provided Java code:

```python
from itertools import permutations

def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if len(ans) != 0:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i + 1:], ans + q[i])
            else:
                permutation(q[:i] + q[i + 1:], ans + " " + q[i])

def main():
    n = int(input())
    str_seq = ""

    for i in range(1, n + 1):
        str_seq += str(i)

    permutation(str_seq, "")

if __name__ == "__main__":
    main()
```

Note that the original Java code is using a global variable `scan` for input scanning and direct string concatenation for building the sequence to be permuted. I replaced the Scanner with Python's `input()` function inside the `main` function. Additionally, I mimicked the string concatenation used in your Java code to match the expected behavior. However, a more idiomatic Python approach would use list comprehensions or generator expressions.
