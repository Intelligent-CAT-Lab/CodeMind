Here is the Java code translated to Python:

```python
x1, y1, x2, y2 = map(int, input().split())
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)
print(x3, y3, x4, y4)
``` 

In this Python version of the code, `input().split()` is used to read space-separated inputs and `map` is applied to cast each input to an integer. Then the logic is directly translated with Python's syntax, and we use `print` to output the results. Note that Python's `print` function by default prints its arguments separated by spaces, which aligns with the original Java output.
