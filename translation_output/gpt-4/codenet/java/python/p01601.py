Below is the translated version of the provided Java code into Python:

```python
def is_palin(s):
    return s == s[::-1]

def run():
    n = int(input())
    i = 0
    while True:
        if is_palin(str(n - i)):
            print(n - i)
            break
        if is_palin(str(n + i)):
            print(n + i)
            break
        i += 1

# The main code entry
if __name__ == '__main__':
    run()
```

This code snippet defines a function `is_palin` which checks if a string `s` is a palindrome, which is done by comparing the string to its reverse. Then in `run`, it reads an integer `n` and searches for the nearest palindrome number by first decreasing `n` and then increasing it, in each step until a palindrome is found. When a palindrome is found, it is printed, and the loop breaks. The `if __name__ == '__main__':` block is used to call the `run` function when the script is run as the main program.
