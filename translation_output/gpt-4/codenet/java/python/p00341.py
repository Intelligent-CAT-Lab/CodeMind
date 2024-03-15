Here's the equivalent Python code:

```python
from collections import Counter

def main():
    e = [int(input()) for _ in range(12)]

    distinct_elements = set(e)

    if len(distinct_elements) > 3:
        print("no")
        return

    counts = Counter(e)
    
    for count in counts.values():
        if count not in {4, 8, 12}:
            print("no")
            return
    
    print("yes")

if __name__ == "__main__":
    main()
```

Explanation of the changes:
- Python uses lists instead of Java's `LinkedList`, and in Python, you can generate a list with comprehension.
- `set(e)` is used in Python to get the distinct elements directly.
- The built-in `collections.Counter` class in Python is used to count occurrences of each element, replacing Java's stream filtering.
- `print()` is used in Python instead of `System.out.println()`.
- Iterating through the dictionary returned by `Counter` directly provides the counts of each number.
- The main method now contains the logic part and is called at the bottom in the `if __name__ == "__main__":` guard to prevent the code from being run when the module is imported.
