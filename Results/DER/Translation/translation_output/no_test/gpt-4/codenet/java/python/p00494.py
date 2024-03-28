Below is the translated Python code from the provided Java code:

```python
def main():
    # Adding '$' at the beginning and end of the input string
    str_input = "$" + input() + "$"
    ans = 0
    s = 0
    for i in range(1, len(str_input)):
        if str_input[i] == 'O' and str_input[i - 1] != 'O':
            s = i
        if str_input[i] == 'O' and str_input[i + 1] != 'O':
            l = i - s + 1
            if s >= l and len(str_input) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if str_input[s - 1 - j] != 'J' or str_input[i + 1 + j] != 'I':
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    print(ans)

if __name__ == "__main__":
    main()
```

Notes on differences between the Java and Python code:

1. In Python, there's no need for a separate `Scanner` class to handle input; we use the built-in `input()` function to get the user's input.

2. In Python, strings can be indexed directly, so there's no need to convert them to character arrays.

3. We use `len(str_input)` to get the length of the string in Python, whereas in Java we use `str.length`.

4. The loop in Python uses `range(1, len(str_input))` to iterate over indices of the string, whereas in Java we use traditional `for` loop indexing.

5. The `Math.max` function in Java is replaced by the built-in `max` function in Python.

6. Print statements in Python do not require the `System.out` prefix.

7. We run the function in a `main` guard to ensure that it only executes when the script is run directly, not when imported as a module.
