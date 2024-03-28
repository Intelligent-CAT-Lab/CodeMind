Here's the equivalent code in Python:

```python
input_str = input()

current_char = input_str[0]
count = 0
for i in range(1, len(input_str)):
    if input_str[i] != current_char:
        count += 1
        current_char = input_str[i]

print(count)
```

Now if you use the test input "BBBWW" with this Python code, you will get the expected output:

```
1
```
