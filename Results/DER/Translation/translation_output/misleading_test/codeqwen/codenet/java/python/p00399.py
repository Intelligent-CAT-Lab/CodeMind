Here is the Python equivalent of the Java code:

```python
def main():
    result = 0
    num_dog = input().split()
    for i in range(len(num_dog)):
        result += int(num_dog[i])
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into a list of strings, converts each string to an integer, and adds it to the result. The result is then printed to the console.
