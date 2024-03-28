Below is the equivalent Python code for the Java code provided:

```python
# Reading the input as integers
a, b, c, d = map(int, input().split())

# Calculating the absolute differences
ab = abs(a - b)
ac = abs(a - c)
bc = abs(b - c)

# Checking the conditions and printing the result
if ac <= d or (ab <= d and bc <= d):
    print("Yes")
else:
    print("No")
```

You can use this Python script to check the provided test case. Just run the code and enter the input when prompted:

Test input: `4 7 9 3`  
Expected output: `Yes`
