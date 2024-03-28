The translated Python code will look like this:

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
print(s[y-K])
```

This code will take three integer inputs `A`, `B`, and `K` from the user and calculate the `K`-th greatest common divisor (GCD) of `A` and `B`.

To run this code, you'd just provide the input (for example, "8 12 2") followed by the [Enter] key, and it should output the expected result (which is 62 in the provided test case).
