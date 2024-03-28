Here's the equivalent Python code based on the Java code provided:

```python
import sys

def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_punctuation(c):
    return c in ['.', ',', '!', '?']

def main():
    s = input()
    result = [s[0]]
    n = len(s)
    
    for i in range(1, n):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                result.append(' ')
            result.append(c)
        elif is_punctuation(c):
            result.append(c)
    
    print(''.join(result))

if __name__ == "__main__":
    main()
```

Note: In the Python version, I used `input()` to get the input from the standard input and `print()` to output the result, which is the common practice with Python scripts. Also, since Python strings are iterable, we do not need a `BufferedReader` and we can directly loop over the characters of the string. In addition, the `sys` module was imported in case you need to alter standard input/output behavior in a more advanced scenario, but it's not necessary for this particular translation.
