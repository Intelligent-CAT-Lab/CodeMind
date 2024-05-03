Here is the Python equivalent of the Java code:

```python
try:
    A, P = map(int, input().split())
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception :", e)
```

In Python, we use the `input()` function to read a line of text from the user. The `split()` function is used to split the input into a list of words, and the `map()` function is used to convert each word in the list to an integer. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
