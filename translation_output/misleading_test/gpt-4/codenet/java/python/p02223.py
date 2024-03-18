Here's the translated code from Java to Python:

```python
N = int(input())

if N == 1:
    print(1)
    print("0")
elif N == 2:
    print(2)
    print("0")
    print("11")
else:
    print(N - 1)
    for i in range(2, N + 1):
        s = ['1'] * i
        s[0] = s[-1] = '0'
        print(''.join(s))
```

To run a test case with an input of `2` as mentioned in your example, you can do the following:

```python
# Run this part in a separate environment where you can provide inputs
# since the script above directly awaits input from the user.

# Test case
print("Test Input:")
print("2")

# Expected output for test case
print("\nExpected Output:")
test_input = 2
if test_input == 1:
    print(1)
    print("0")
elif test_input == 2:
    print(2)
    print("0")
    print("11")
else:
    print(test_input - 1)
    for i in range(2, test_input + 1):
        s = ['1'] * i
        s[0] = s[-1] = '0'
        print(''.join(s))
```

This code will take an integer input from the user as the value for N and then produce the specified output.
