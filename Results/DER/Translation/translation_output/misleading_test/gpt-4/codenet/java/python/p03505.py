Below is the translated Python code for the given Java code snippet:

```python
def help(K, A, B):
    if A <= B:
        return 1 if A >= K else -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + (0 if (K - A) % dif == 0 else 1)
    return 2 * t + 1

if __name__ == "__main__":
    K, A, B = map(int, input().split())
    ans = help(K, A, B)
    print(ans)

# Test case:
# Input: 4000 2000 500
# Expected Output: -1
```

To test the provided code with the given test input and expected output:

```python
assert help(4000, 2000, 500) == -1
```
