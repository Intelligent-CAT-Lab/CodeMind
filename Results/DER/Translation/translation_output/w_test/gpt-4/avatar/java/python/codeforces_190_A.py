Here is the translated code in Python:

```python
# Read the input as integers
n, m = map(int, input().split())

# Check the conditions as per the Java code and print accordingly
if n == 0:
    if m != 0:
        print("Impossible")
    else:
        print(0, 0)
else:
    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
    else:
        print(m, m + n - 1)
```

To validate with the provided test input `59 96`, you would run:

```python
# Sample test case code
input_string = '59 96'
input_values = input_string.split()

n, m = map(int, input_values)

if n == 0:
    if m != 0:
        print("Impossible")
    else:
        print(0, 0)
else:
    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
    else:
        print(m, m + n - 1)
```

When the test case is run, the expected output '96 154' will be printed.
