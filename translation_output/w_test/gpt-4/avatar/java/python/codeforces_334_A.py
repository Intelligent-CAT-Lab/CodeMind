Here is the equivalent Python code:

```python
n = int(input())
square = n * n
odd = []
even = []

for i in range(1, square + 1):
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)

loop = square // n
div = loop // 2

for i in range(1, loop + 1):
    for j in range(div):
        if i % 2 == 1:
            print(f"{odd.pop(0)} {even.pop()}", end=" ")
        else:
            print(f"{even.pop(0)} {odd.pop()}", end=" ")
    print()
```

Please note that Python's `print()` function automatically adds a space between the arguments when they are separated by a comma. Also, `pop(0)` and `pop()` methods are used to simulate the `remove(0)` and `remove(even.size() - 1)` operations in Java, removing from the beginning and the end of the list respectively. However, be aware that `pop(0)` in Python involves shifting all elements to the left, which is an O(n) operation, while the Java `ArrayList`'s `remove(0)` method might have different performance characteristics depending on the implementation.

You can use the test input provided by simply including it before running the Python code above.
