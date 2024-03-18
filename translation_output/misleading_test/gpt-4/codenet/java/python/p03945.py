Here's the translated Python code equivalent to the given Java code:

```python
s = input()
counter = 0

for i in range(len(s) - 1):
    if s[i] != s[i + 1]:
        counter += 1

print(counter)
```

If you run this Python code with the input `BBBWW`, it will produce the expected output `1`. However, the expected output `44` mentioned in your example does not correspond to the expected behavior of the given code with input `BBBWW`. The Java code counts the number of transitions between different characters in a string, so for `BBBWW`, there is only one transition, from `B` to `W`, resulting in a count of `1`. If you meant the expected output to be `1`, then the translation works as expected.
