Here is the equivalent Python code for the provided Java code:

```python
a, b, c = map(int, input().split())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:
    print("NO")
```

In this Python code, we are using a `for-else` structure. In Python, the `else` block after a for loop is executed only if the for loop is not terminated by a break statement, which makes it appropriate to handle the "NO" case when the condition `a * i % b == c` is never met within the loop.
