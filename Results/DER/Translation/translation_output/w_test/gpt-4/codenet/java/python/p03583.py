Here's the Java code translated into Python, according to the provided test case and expected output:

```python
def p03583(n):
    # a
    for i in range(1, 3510):
        # b
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                return (i, j, si // bo)

# Sample test case
n = int(input())
result = p03583(n)
print(result[0], result[1], result[2])

```
When you run this Python code with the input `2`, it should produce the expected output `1 2 2`.
