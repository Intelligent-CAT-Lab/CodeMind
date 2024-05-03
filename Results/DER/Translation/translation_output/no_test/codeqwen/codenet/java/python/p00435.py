Here is the Python equivalent of the Java code:

```python
class p00435:
    def main(self):
        s = ""
        for c in input().upper():
            s += chr((ord(c) - 65) % 26 + 65)
        print(s)

p00435().main()
```

This Python code does the same thing as the Java code. It reads a string from the user, converts each character to uppercase, and then shifts each character by 65 places in the alphabet. The modulo operation ensures that the shift wraps around from 'Z' to 'A'. The result is printed to the console.
