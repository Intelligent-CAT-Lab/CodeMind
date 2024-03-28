Here's the translated Python code:

```python
import sys

MODULO = int(1e9 + 7)

def main():
    s = input().strip()
    alternating = all(s[i] != s[i + 1] for i in range(len(s) - 1))
    if alternating:
        print(1)
        return

    sum_vals = [0] * (len(s) + 1)
    for i, char in enumerate(s):
        sum_vals[i + 1] = sum_vals[i]
        if char == 'a':
            sum_vals[i + 1] += 1
        elif char == 'b':
            sum_vals[i + 1] += 2
        else:
            raise Exception("Unknown character encountered.")
        sum_vals[i + 1] %= 3
        
    next_vals = [[len(s) + 1] * (len(s) + 2) for _ in range(3)]
    for pos in range(len(s), -1, -1):
        for i in range(3):
            next_vals[i][pos] = next_vals[i][pos + 1]
        next_vals[sum_vals[pos]][pos] = pos
        
    total = sum_vals[len(s)]
    ways = [0] * (len(s) + 2)
    ways[0] = 1
    for i in range(len(s) + 1):
        for add in range(1, 3):
            need = (sum_vals[i] + add) % 3
            ways[next_vals[need][i]] += ways[i]
            ways[next_vals[need][i]] %= MODULO
            
    res = sum(ways[i] for i in range(1, len(s) + 1) if sum_vals[i] == total) % MODULO
    print(res)

if __name__ == "__main__":
    main()
```

In the Python code, I've made the following conversions:
- The `main` method is now just a regular `main` function that is called if the script is run as the main module.
- The `solve` method is integrated into the `main` function since Python scripts are typically procedural.
- The `InputReader` Java class is not necessary because we can use Python's built-in input function to read from standard input.
- Array declarations have changed to list comprehensions, and arrays have become lists.
- String character access is the same (`s[i]`) for both Java and Python.
- Loops and conditional statements are adjusted to Python's syntax.
- Increment and modulo operations have also been translated to Python's syntax.
- Exception raising is done using Python's `raise Exception("message")` syntax.
- The printWriter from Java is replaced by Python's built-in print function.
