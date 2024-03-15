Here is the Java code translated into Python:

```python
# Create a function which replicates the behavior of the main method in Java
def main():
    a = int(input())
    b = int(input())
    c = int(input())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return
    print("NO")

# Call the main function
if __name__ == "__main__":
    main()
```

In Python, there is no need to import a Scanner class since the `input()` function can be used to get input directly from the user. The `input()` function retrieves user input as a string, hence the explicit conversion to an integer with `int()`. Additionally, Python uses `print` instead of `System.out.println` for output. The `if __name__ == "__main__":` construct ensures that the `main()` function is called when the script is run directly.
