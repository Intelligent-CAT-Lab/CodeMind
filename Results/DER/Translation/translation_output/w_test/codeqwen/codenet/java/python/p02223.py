Here is the Python equivalent of the Java code:

```python
N = int(input())
if N == 1:
    print(1)
    print("0")
elif N == 2:
    print(2)
    print("0")
    print("11")
else:
    print(N - 1)
    for i in range(2, N + 1):
        s = '1' * i
        s = s[0] + s[i - 1] + s[1:-1] + s[-1]
        print(s)
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints the appropriate output based on the value of the integer. If the integer is 1, it prints 1 and 0. If the integer is 2, it prints 2, 0, and 11. If the integer is greater than 2, it prints N - 1, and then for each integer from 2 to N, it prints a string of '1's of length N, with the first and last characters being '0'. The middle characters are replaced with the characters from the previous string, but in reverse order.
