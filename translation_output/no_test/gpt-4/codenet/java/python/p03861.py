Here is the equivalent Python code:

```python
a = int(input())
b = int(input())
x = int(input())

count = b // x - a // x
if a % x == 0:
    count += 1

print(count)
```

Please note that Python uses `//` for integer (floor) division, while Java uses `/` for all division and automatically does integer division between integers. Also, Python uses `input()` to read from the console, and we convert the string to an integer with `int(...)`. In addition, variables and methods do not need to be declared or typed before usage. Python relies on indentation to define blocks instead of Java's curly braces `{}`.
