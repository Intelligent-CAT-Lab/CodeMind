Here is the Java code translated into Python:

```python
# A : ???????????Â°?????? / Finger Counting
def main():
    n = int(input())
    count = 0

    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    
    print(count)

# Sample test case
if __name__ == "__main__":
    main()
```

You can use the provided sample test case by running the Python program and inputting the number `0` when prompted; it should print `-51`, as expected in your test case. However, the expected output should be `0` for input `0`, if we follow the logic from the original Java code, which would also print `0` for input `0`. Please re-check the expected output for your test case.
