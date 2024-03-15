Here's the Java code translated into Python, enclosed within triple backticks for formatting:

```python
import math

def main():
    n = int(input())

    if n == 1:
        print(0)
        return

    p_map = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            p_map[i] = count
    
    if n != 1:
        p_map[n] = 1

    ans = 0
    for p_count in p_map.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    print(ans)

if __name__ == '__main__':
    main()
```

Some key differences to be aware of when translating Java to Python:

1. The Python `int` type can also handle large integer values and is not directly limited like Java's `long`, `int`, `short`, etc.
2. In the Python code, we import the `math` module to use `math.sqrt()`.
3. Python dictionaries (`dict`) are used instead of Java's `HashMap`.
4. Python does not require declaring the variable types.
5. The class and method definitions in Java are replaced with a simple Python `main` function.
6. The equivalent for Java `System.out.println` in Python is `print`.
7. The end-of-file conditional `if __name__ == '__main__':` is a Python idiom which means "run the following code block if this script is the entry point to the program".

