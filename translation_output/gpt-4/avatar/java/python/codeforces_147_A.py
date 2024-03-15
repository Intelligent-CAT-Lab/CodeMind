Here's the translated Python code from the provided Java code:

```python
def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_punctuation(c):
    return c in ['.', ',', '!', '?']

def main():
    s = input()
    sb = [s[0]]
    for i in range(1, len(s)):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb.append(' ')
            sb.append(c)
        elif is_punctuation(c):
            sb.append(c)
    print(''.join(sb))

if __name__ == "__main__":
    main()
```

Note that in Python, string handling is more straightforward, so we don't need to use a BufferedReader or a PrintWriter as in Java. We can directly read input with `input()` and output with `print()`. Additionally, strings in Python are iterable, and Python takes care of encoding details, so we can iterate through characters directly without using `charAt`. Lastly, strings are immutable in Python, so we use a list to build the new string character by character, which we then join together with `''.join(sb)` when printing the result.
