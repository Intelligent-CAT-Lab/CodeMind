Below is the Python translation of the given Java code. The Python code uses recursion to generate permutations of a string formed by the numbers from 1 to `n` (inclusive).

```python
def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if ans:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if not ans:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])

def main():
    n = int(input())
    str_ = "".join(str(i) for i in range(1, n + 1))
    permutation(str_, "")

if __name__ == "__main__":
    main()
```

Now, let's execute this Python code with the given test input to verify the expected output:

Test input:
```
2
```

Expected output:
```
1 2
2 1
```
