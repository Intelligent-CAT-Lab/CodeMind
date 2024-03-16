Here is the equivalent Python code for the Java code you provided:

```python
s = input().strip()

count = 0
black = 0
for i in range(len(s)):
    if s[i] == 'W':
        count += black
    else:
        black += 1

print(count)
```

To test the input `"BBW"`, you can simply run the code and input it when prompted:

```shell
$ python your_python_script.py
BBW
2
```
