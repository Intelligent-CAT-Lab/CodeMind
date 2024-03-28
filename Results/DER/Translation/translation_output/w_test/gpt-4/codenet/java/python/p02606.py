Here's the equivalent Python code for the provided Java example:

```python
def count_divisibles(L, R, d):
    ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            ans += 1
    return ans

if __name__ == "__main__":
    L, R, d = map(int, input().split())
    print(count_divisibles(L, R, d))
```

When the test input of `5 10 2` is provided to this Python program, the expected output would be `3`, which is the result of counting how many numbers between 5 and 10 (inclusive) are divisible by 2.
