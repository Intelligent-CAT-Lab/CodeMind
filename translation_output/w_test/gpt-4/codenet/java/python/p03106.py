Here is the equivalent Python code for the given Java program:

```python
A, B, K = map(int, input().split())
s = []
z = 1
y = 0
while z <= A and z <= B:
    if A % z == 0 and B % z == 0:
        s.append(z)
        y += 1
    z += 1
print(s[y - K])
```

To test the code with the given input, you can run the above Python code and input "8 12 2" when prompted. You should expect the output to be "2".
