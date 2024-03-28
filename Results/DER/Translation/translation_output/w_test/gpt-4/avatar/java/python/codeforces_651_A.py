Here is the Python equivalent of the given Java code:

```python
num1, num2 = map(int, input().split())
counter = 0

while num1 != 0 and num2 != 0:
    if num1 == 1 and num2 == 1:
        break

    if num1 <= num2:
        num1 += 1
        num2 -= 2
    else:
        num1 -= 2
        num2 += 1

    counter += 1

print(counter)
```

Using this Python code with the provided test input, "100 25", will produce the expected output, "122".
