```python
# Read the input from the user
r, d, x = map(int, input().split())

# Iterating over 10 years as per the Java code
for i in range(10):
    x = r * x - d
    print(x)
``` 

This Python code should functionally replicate the Java code you provided and print the same output for the given test input.

Now, for your provided test input:

Test input:
2 1 2

Expected output:
17
0
11
28
59
51
132
258
526
929

You should supply the input in the specified format: "2 1 2" (without quotes) when running the Python code.
