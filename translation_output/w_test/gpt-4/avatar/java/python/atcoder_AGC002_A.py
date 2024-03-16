Here is the translated Python code for the provided Java example:

```python
def atcoder_AGC002_A():
    a, b = map(int, input().split())

    if a <= 0 and b >= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

# Sample test case input:
# -1000000000 -1
# Expected output: Positive
atcoder_AGC002_A()
```

Please note that in the original Java code, there is a redundant condition `if (a <= 0 && b >= 0 || a <= 0 && b >= 0)`. It seems like this is likely a mistake, as both parts of the condition are the same. In the translated Python code, I have included it only once. If this is not a mistake and you need both parts to be different, please clarify what the second condition should be.
