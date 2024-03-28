Here is the translated version of the given Java code to Python:

```python
def main():
    a = int(input())
    t = int(input())
    r = int(input())
    print(r * t / a)

if __name__ == "__main__":
    main()
```

Notes on translation: 

- In Python, we don't need to import a Scanner or similar utility as we can use the built-in `input()` function for user input. 
- Type conversions are explicit in Python when reading from the input, hence `int(input())` is used for simulating `scan.nextInt()`.
- The `print` function is used in Python instead of `System.out.println`.
- The class and method declarations are not necessary in Python, as it's not mandatory to structure the code within classes.
- It's common practice in Python to check if the script is run as the main program using `if __name__ == "__main__":`.
