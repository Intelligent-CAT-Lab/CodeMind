Here's the Java code above translated into Python:

```python
if __name__ == "__main__":
    word = input()
    uppercase = 0
    lowercase = 0

    for ch in word:
        if ch.isupper():
            uppercase += 1
        else:
            lowercase += 1

    if uppercase > lowercase:
        print(word.upper())
    else:
        print(word.lower())
```

Note that Python's `str` class has methods `isupper()` and `islower()` to check the case of a character, as well as `upper()` and `lower()` to convert a string to uppercase or lowercase, respectively. Python's `input()` function is used to read a string from standard input, similar to Java's `Scanner.next()`.
