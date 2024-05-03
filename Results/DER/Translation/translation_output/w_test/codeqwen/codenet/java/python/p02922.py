Here is the Python equivalent of the Java code:

```python
a, b = map(int, input().split())

ans = (b-1)//(a-1)
if (b-1)%(a-1)==0:
    print(ans)
else:
    print(ans+1)
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the quotient of the second integer minus one divided by the first integer minus one, and then prints the result. If the remainder of the division is zero, it prints the quotient; otherwise, it prints the quotient plus one.
