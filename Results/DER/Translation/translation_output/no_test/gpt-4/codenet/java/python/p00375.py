Here's the translated code from Java to Python:

```python
# No import is necessary for standard input in Python

def main():
    a = int(input())
    print((a - 30) // 2)  # Use // for integer division in Python

if __name__ == "__main__":
    main()
``` 

Note: In Python's `print` function, you don't need to explicitly use `System.out.println` as you would in Java. The `input()` function is used to capture input from the standard input, similarly to `Scanner` in Java, and it always returns a string, which we convert to an integer using `int()`. We use `//` for floor division to imitate the integer division behavior from Java.
