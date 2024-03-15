Here's the translated Python code with equivalent functionality:

```python
import sys

def main():
    N, M, K = map(int, input().split())
    
    for i in range(N + 1):
        for j in range(M + 1):
            sum = M * i + N * j - (i * j * 2)
            if sum == K:
                print("Yes")
                return
    print("No")

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def __str__(self):
        return "{{{}, {}}}".format(self.key, self.value)

    def __lt__(self, other):
        return (self.value / self.key) < (other.value / other.key)

    def __gt__(self, other):
        return (self.value / self.key) > (other.value / other.key)

    def __eq__(self, other):
        return (self.value / self.key) == (other.value / other.key)

def debug(*args):
    if is_debug:
        print(*args, file=sys.stderr)

is_debug = 'sun.desktop' in sys.environ

if __name__ == '__main__':
    main()
```

Notes on the translation:
- In Python, it is common to use `input()` to read input from standard input.
- Instead of creating a custom `Scanner` class, the built-in `input()` is sufficient when paired with `map(int, input().split())`.
- The `print()` function in Python is used instead of `System.out.println()` in Java.
- Since the `Scanner` and debug functions are not used in the translated Python code, they are omitted. The Python code is simplified to use the standard Python I/O methods.
- Python classes do not require explicitly implemented comparison methods (such as `compareTo` in Java); instead, you can define the rich comparison methods like `__lt__`, `__gt__`, and `__eq__` to handle less than, greater than, and equality, respectively.
- I kept the `Pair` and `debug` classes in case they're needed for other parts of the program that may not be shown here, but they are not directly used in the translation of the provided Java code.
- Python does not have a direct equivalent to Java's `System.getProperty()`, but you can check the environment variables using `sys.environ`.
- In Python, you do not need to declare `throws Exception`. Python has its own exception handling mechanism which doesn't require such declarations.
