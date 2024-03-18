The Java code provided is for a program that reads three integers from the standard input, and checks if any two of these integers sum to the third one. If so, it prints "Yes", otherwise it prints "No".

Below is the equivalent Python code for the provided Java code:

```python
def read_ints():
    return map(int, input().strip().split())

a, b, c = read_ints()

i = (a + b == c)
j = (a + c == b)
k = (b + c == a)

if i or j or k:
    print("Yes")
else:
    print("No")
```

To test the provided input "10 30 20":

```python
# Run this block with the above Python code.

input_str = "10 30 20"
original_input = input  # Save the original input function just in case
input = lambda: input_str

a, b, c = read_ints()

i = (a + b == c)
j = (a + c == b)
k = (b + c == a)

if i or j or k:
    print("Yes")
else:
    print("No")

input = original_input  # Restore the original input function
```

Expected output:
```
Yes
```
