Here is the Java code translated to Python:

```python
import sys

class p03582:

    @staticmethod
    def solve(a):
        lst = []
        for j in range(3):
            for i in range(a[j]):
                lst.append(chr(ord('a') + j))

        while len(lst) > 1:
            lst.sort()
            s = lst[0] + lst[-1]
            lst[0] = s
            lst.pop()
        
        print(lst[0])

def na(n):
    return list(map(int, input().split()))

def ni():
    return int(input())

def main():
    a = na(3)
    p03582.solve(a)

if __name__ == "__main__":
    # Assuming the input will come from standard input (stdin)
    main()

# If other helper functions are needed, they will have to be implemented in Python.
# For example, ni(), na(), etc. are not provided in this snippet
# and are assumed to be implemented elsewhere in this Python translation.
```

Here are a few important notes about this translation:
- I removed the threading part because Python does not use threads in the same way as Java due to the Global Interpreter Lock (GIL). Moreover, for this simple example, threads are likely not needed.
- I replaced the list management part with Python lists, which are more flexible than Java's ArrayList, making the code more concise.
- `ni()` and `na()` functions are used to read integers and arrays of integers from the standard input. I've shown them being called but haven't provided their implementations because they'll simply be wrappers around Python's input mechanisms.
- I removed the time measurement and debug parts for simplicity and because they would likely not be used in typical Python scripting.
- Python does not have a built-in equivalent to Java's `Collections.sort()`. Python's lists have a built-in `sort()` method, which is used here instead.
- The method `solve` does not need to be static in Python; I kept it static to resemble the Java code's structure.
- Error handling around input operations has been omitted for simplicity; Python will raise exceptions if there are issues with the input.
