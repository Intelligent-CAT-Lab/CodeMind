Here is the translated code from Java to Python:

```python
class p00017:
    def compute(self):
        while True:
            try:
                S = input()
            except EOFError:
                break

            for i in range(26):
                converted = ""
                for c in S:
                    if 'a' <= c <= 'z':
                        offset = ord(c) + i
                        if offset > ord('z'):
                            offset -= 26
                        converted += chr(offset)
                    else:
                        converted += c

                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

if __name__ == "__main__":
    solver = p00017()
    solver.compute()
```

Note that:
- I've used a simpler loop to read the input until EOF (end of file) is detected, which is common when input is given from file redirection or piping.
- Python strings are immutable; thus, we capture characters and construct a new string, rather than modifying the string in place.
- We use `ord` to get the ASCII code of a character and `chr` to convert back from ASCII code to character.
- The input is automatically split by newline when using `input()`. If you need specific delimiter behavior or advanced input handling, you might need to customize input reading further.
- This Python code should be run using Python 3 where `input()` reads a line from STDIN as a string.
- The `if __name__ == "__main__":` block is used to ensure that the `compute` method is called when the script is run directly.
