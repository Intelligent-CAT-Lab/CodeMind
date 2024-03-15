Here's the translated code in Python:

```python
def main():
    string = input()
    is_not_found = False

    count = [0] * 26
    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    for char in string:
        count[ord(char) - 97] += 1
        
    for i in range(len(count)):
        if count[i] == 0:
            is_not_found = True
            break
            
    if is_not_found:
        print(alphabet[i])
    else:
        print("None")

if __name__ == "__main__":
    main()
```

A few notes on the changes made during translation:

- Python does not need a strict class structure for simple scripts, so the method is defined as a standalone `main` function.
- Variable declaration and type specification are not required in Python. It uses dynamic typing.
- The `Scanner` class is replaced with the built-in `input()` function in Python.
- Looping through characters in a string is more straightforward in Python, as you can iterate directly over the string without converting it to a character array.
- Python's print function replaces the `System.out.println()` method from Java.
- Python indexes start from 0, similar to Java, so the -97 calculation is used to map 'a' to index 0, 'b' to index 1, and so forth.
- I've included the `if __name__ == "__main__":` guard to ensure that `main()` is called when the script is executed as the main module.
