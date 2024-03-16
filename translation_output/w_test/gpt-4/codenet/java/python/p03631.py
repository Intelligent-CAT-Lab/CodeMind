Here is the python version of the Java code you provided:

```python
# Test input
a = 575

a100 = a // 100
a10 = (a // 10) - a100 * 10
a1 = a - a100 * 100 - a10 * 10
rev = a1 * 100 + a10 * 10 + a100

if a == rev:
    ans = "Yes"
else:
    ans = "No"

# Expected output
print(ans)
```

Please note that I have statically assigned the test input `a = 575` in the Python code instead of taking it as an input from the console. If you need to accept user input, replace that line with `a = int(input())`.
