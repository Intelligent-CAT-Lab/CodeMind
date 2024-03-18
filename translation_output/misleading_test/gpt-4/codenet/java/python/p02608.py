Here is the translated Python code:

```python
n = int(input())
eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            if i*i + j*j + k*k >= 100000:
                continue
            result = i*i + j*j + k*k + i*j + j*k + k*i
            eratosu[result] += 1

# Creating the output as a single string with new lines
output_lines = [str(eratosu[i]) for i in range(1, n + 1)]
output = "\n".join(output_lines)

# Printing the output
print(output)
```

Here's how you can use the provided test case:

Test input:
```
20
```

Expected output:
```
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0
-16
```
