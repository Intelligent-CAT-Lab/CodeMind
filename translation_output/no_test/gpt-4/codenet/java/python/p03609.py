Here is the equivalent Python code for the provided Java sample:

```python
if __name__ == "__main__":
    x = int(input())
    t = int(input())
    
    if x > t:
        print(x - t)
    else:
        print("0")
```

I've made some assumptions here, based on the Java code:
- I'm using `int(input())` to mimic the functionality of `Scanner.nextInt()`, assuming the inputs will be provided on separate lines (as `Scanner.nextInt()` reads the next token of input as an int).
- I've used a standard `if/else` block as Python doesn't require an `else if` for a simple condition like this.
- In Python, there’s no need to declare a `main` function or a class, but `if __name__ == "__main__":` is used to ensure that the code only runs if the script is executed as the main program and not imported as a module.
- I am directly printing the results without using `System.out.println`. Python's `print()` function does not need to be accessed via a system class or any other module.
