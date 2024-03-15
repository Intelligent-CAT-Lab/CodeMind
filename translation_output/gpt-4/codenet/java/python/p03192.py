Here's the translated code from Java to Python:

```python
# No import needed for Python's built-in functions

# Renaming class to follow Python naming conventions
class P03192:

    # There is no need for a separate main method in Python.
    # We can use the if __name__ == '__main__' guard for the entry point.

    def main():
        # Python uses the input() function for reading input from the user.
        string = input()  # Read a string from stdin
        count = 0
        for char in string:  # Python strings are iterable
            if char == '2':
                count += 1
        print(count)  # Use print() function in Python

# This line checks if this script is being run as the main program
if __name__ == '__main__':
    P03192.main()  # Call the main method
```

Keep in mind that in Python, we don't usually encapsulate scripts in classes, but I preserved the original class structure from your Java example for a closer correspondence. Normally, the method and entry point guard would be sufficient. Here's what it would look like without the class:

```python
if __name__ == '__main__':
    string = input()
    count = 0
    for char in string:
        if char == '2':
            count += 1
    print(count)
``` 

In everyday Python scripts, the latter, class-free version is more common.
