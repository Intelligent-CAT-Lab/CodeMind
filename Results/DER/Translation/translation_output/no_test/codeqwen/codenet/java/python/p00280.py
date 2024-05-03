Here is the Python equivalent of the Java code:

```python
def run():
    a = int(input())
    b = int(input())
    slove(0, 0, "")

def slove(x, y, s):
    if ((x == 5 and y < b and y != 4) or y == 5 and x < a and x != 4):
        return
    if (x == a + 1 or y == b + 1):
        return
    if (x == a and y == b):
        print(s)
    for i in range(2):
        if i == 0:
            slove(x + 1, y, s + "A")
        else:
            slove(x, y + 1, s + "B")

a, b = 0, 0
run()
```

Please note that Python doesn't have a built-in equivalent to Java's `Scanner` class for reading input from the console. Instead, Python uses the built-in `input()` function. Also, Python doesn't have a built-in equivalent to Java's `main()` method. Instead, Python uses the `if __name__ == "__main__":` block to define the main entry point of the program.
