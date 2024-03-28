Here's the translated code from Java to Python:

```python
a, b = map(int, input().split())
res = a

while a >= b:
    res += a // b
    a = (a // b) + (a % b)
    
print(res)
```

Below is how you can use the translated Python code with the given test case:

Test input:
80 970

Expected output:
80

You can run this test case in Python by simply running the provided Python code and entering the test input when prompted. The program should then output the expected result.
