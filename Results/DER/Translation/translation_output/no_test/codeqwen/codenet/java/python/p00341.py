Here is the Python equivalent of the Java code:

```python
from collections import Counter
from typing import List

def main():
    e: List[int] = []
    for _ in range(12):
        e.append(int(input()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    for num in set(e):
        each = e.count(num)
        if each not in [4, 8, 12]:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads 12 integers from the user, checks if there are more than 3 distinct numbers, sorts the list, and then checks if each distinct number appears 4, 8, or 12 times. If any of these conditions are not met, it prints "no" and returns. If all conditions are met, it prints "yes".
