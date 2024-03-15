Below is the translated Python code:

```python
def next_int():
    return int(input())

h1 = next_int()
m1 = next_int()
h2 = next_int()
m2 = next_int()
k = next_int()

h = h2 - h1
m = m2 - m1
day_minutes = (h * 60) + m
print(day_minutes - k)
```

In the translated Python code, I replaced the `Scanner` object with the built-in `input()` function that is used to get input from the user. The `nextInt()` helper function in Java is replaced with the Python `next_int()` function, which also converts the input to an integer using Python's built-in `int()` function.

One thing to consider when translating Java to Python is the way input handling is done. Java uses `Scanner` and typically expects tokenized inputs separated by spaces or newlines. In Python, `input()` reads a whole line of input, but for this simple translation, we can assume that the user will input one integer at a time separated by newlines or spaces, so the `next_int()` function will work as expected.
