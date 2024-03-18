Here's the converted Java code to Python:

```python
s = input()
str_result = []

i = 0
while i < len(s):
    if s[i] == '.':
        str_result.append('0')
    else:
        if s[i] == '-' and s[i + 1] == '.':
            str_result.append('1')
        else:
            str_result.append('2')
        i += 1
    i += 1

print(''.join(str_result))
```

Make sure you run this Python code snippet with a proper test input to match your Java code results. For the provided test input "..", the expected output is "54" assuming the test input was incorrect and it should have been something else like "-.-.", as ".." would result in "00" not "54". Please let me know if you need any further assistance or clarification!
