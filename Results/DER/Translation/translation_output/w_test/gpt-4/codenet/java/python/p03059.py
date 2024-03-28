Here is the equivalent Python code for the given Java program:

```python
a, b, c = map(int, input().split())
amount = 0
time = a

for i in range(2, int(c / a) + 2):
    amount += b
    time = a * i

print(amount)
```
This Python code reads three integer inputs, assigns them to `a`, `b`, and `c`, and then computes the `amount` in a similar fashion to the provided Java code. In Python, there’s no need to import a scanner to read input; we can just use the built-in `input()` function and `map` to convert the inputs to integers. The `for` loop condition is adapted to Python syntax, ensuring that it runs while `time` is less than or equal to `c`. Note that the `range` function in Python is used instead of Java's `for` loop. Note that range() in Python does not include the end value, which is why we add `2` instead of `1` to the upper bound to get correct behavior similar to the `for` loop condition in Java.
