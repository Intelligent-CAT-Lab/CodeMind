Here is the Python equivalent of the Java code:

```python
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print("ab")
elif n == 3:
    print("abc")
else:
    for i in range(n // 4):
        print("abcd", end="")
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print("ab")
    elif t == 3:
        print("abc")
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints out a string of 'a', 'ab', 'abc', or 'abcd' characters depending on the value of the input. If the input is a multiple of 4, it prints out 4 'abcd' characters. If the input is not a multiple of 4, it prints out the remainder of the input divided by 4 'abcd' characters, followed by the appropriate number of 'a', 'ab', or 'abc' characters.
