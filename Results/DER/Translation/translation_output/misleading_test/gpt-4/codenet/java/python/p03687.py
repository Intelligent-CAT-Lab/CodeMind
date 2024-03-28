Here is the translated code from Java to Python:

```python
def main():
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_dist = 0
        cur_dist = 0
        for char in s:
            if char == target:
                cur_dist = 0
            else:
                cur_dist += 1
                max_dist = max(max_dist, cur_dist)
        ans = min(ans, max_dist)
    
    print(ans)

if __name__ == "__main__":
    main()
```

The Python code follows:

- A similar approach to iterate over the alphabet using `range(26)` and adding `ord('a')` to get the ASCII value for the letters.
- It iterates through the string `s` using a `for` loop, incrementing the `cur_dist` each time a character is not equal to the target character, and resetting it to 0 when it matches.
- The Python code uses built-in functions `max()` and `min()` just like the Java version uses `Math.max()` and `Math.min()`.
- Instead of declaring a new `Scanner` object, Python uses `input()` to read from standard input.
- Finally, the result is printed using `print()`.

