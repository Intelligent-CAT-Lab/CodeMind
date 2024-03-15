Here's the translated code in Python:

```python
def run():
    n, m = map(int, input().split())
    base = n * 100 + m * 1800
    print(base << m)

if __name__ == "__main__":
    run()
```

Python does not require a class structure for simple scripts, so I've removed the class and translated the `run()` method to a regular function. The `Scanner` class is replaced by the `input()` function combined with `map()` and `split()` to handle the user input. The bit shifting operation (`<<`) is similar in both Java and Python. Note that `print()` is used instead of `System.out.println()`.
