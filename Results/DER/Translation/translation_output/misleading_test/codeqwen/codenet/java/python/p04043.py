Here is the Python equivalent of the Java code:

```python
a, b, c = map(int, input().split())

if a == 5 and b == 7 and c == 5:
    print("YES")
elif a == 5 and b == 5 and c == 7:
    print("YES")
elif a == 7 and b == 5 and c == 5:
    print("YES")
else:
    print("NO")
```

In this Python code, we use the `input()` function to get the input from the user. The `split()` function is used to split the input string into a list of strings, and then the `map()` function is used to convert each string in the list to an integer. The `a, b, c = map(int, input().split())` line is a more Pythonic way of getting multiple inputs in a single line.
