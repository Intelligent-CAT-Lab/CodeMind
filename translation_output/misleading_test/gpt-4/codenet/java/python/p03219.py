Below is the translated Python code:

```python
import math
import sys

def main():
    x, y = map(int, input().split())
    put(x + y // 2)


def upper_bound(a, val, l=0, r=None):
    if r is None:
       r = len(a)
    while l < r:
        mid = (l + r) // 2
        if a[mid] > val:
            r = mid
        else:
            l = mid + 1
    return l


def lower_bound(a, val, l=0, r=None):
    if r is None:
        r = len(a)
    while l < r:
        mid = (l + r) // 2
        if a[mid] < val:
            l = mid + 1
        else:
            r = mid
    return l


def put(*args):
    print(*args)

  
if __name__ == "__main__":
    main()
```

Please note that the methods `upper_bound` and `lower_bound` are translated but not used in the `main` function, so they are included for completeness. The `Scanner` Java class was replaced by Python's built-in input function and exception handling in `nextInt()` and others are not translated as Python's input parsing does not throw these exceptions.

The `FixedPair`, `Tuple`, `LowerBoundComparator`, `UpperBoundComparator`, and `Util` classes are also not translated because they are not used in the given Java main method scope. Python has its native tuples, and sorting using custom comparators can be done with lambda functions if needed. Python also does not need explicit type comparators or specialized functions for printing as in Java, since its dynamic typing and built-in functions handle these cases. The `put` function is completely replaced with Python's `print` to keep things simple. 

Finally, the `main` method is called within a Python `if __name__ == "__main__":` block to mimic the behavior of Java's `main` method to ensure that it only runs when the script is executed directly.
