Here's the Python equivalent of the provided Java code. In Python, we don't need a class or a `main` function to execute the code. Instead, we can just use the built-in `input()` function to get the user input and an array (in Python, a list) to store the integer sequence. 

```python
def main():
    a = [1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]
    k = int(input())
    print(a[k-1])

if __name__ == "__main__":
    main()
```

You can run this script, and when prompted for input, entering `6` (as in the test case) should output `2` to the console.
