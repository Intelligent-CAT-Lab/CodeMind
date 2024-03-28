Here's the Python equivalent of your provided Java code:

```python
# Python's built-in function 'input' is used to receive input from the user.
N = int(input())
print(f"{(N + 1) // 2}")
```

In Python, you don't need to close the standard input (as is done with `Scanner` in Java), and we use integer division `//` to get the integer result of the division, since Python's `/` operator performs floating-point division. The `f-string` feature is used for formatting the output in a similar way to `System.out.printf` in Java.
