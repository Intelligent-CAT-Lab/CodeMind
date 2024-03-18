Here's the Java code translated into Python:

```python
def main():
    cnt = int(input())
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10 ** 9 + 7)
    print(int(power))

if __name__ == "__main__":
    main()
```

Sample test run for the translated Python code:

Test input:
```
3
```

Expected output:
```
-48
```

Note: The Java code seems to calculate the factorial of a number modulo `(10**9 + 7)`, but the expected output `-48` does not correspond to this. The provided expected output might not be correct. For the input `3`, the output should be the factorial of `3 (which is 6)` modulo `(10**9 + 7)` which is `6`, not `-48`. If the expected output `-48` is really needed, the problem specification might have to be reviewed or explained further.
