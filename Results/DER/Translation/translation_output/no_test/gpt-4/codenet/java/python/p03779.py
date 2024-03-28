Here's the equivalent Python code for the Java code you provided:

```python
# No import needed for standard input

def main():
    x = int(input())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break

    print(ans)

if __name__ == "__main__":
    main()
```

Note that in Python, we use `input()` to read input from the console and `int(input())` to convert the input to an integer. The `//` operator in Python performs integer (floor) division. Also, Python does not have a `main` method as Java does, but we define a `main` function for a similar effect and call it if the script is run as the main program.
