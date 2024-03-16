Here's your Java code translated to Python:

```python
def main():
    try:
        cmd = input()  # Reading input from stdin
        str_parts = cmd.split(" ")  # Splitting the input string on space
        
        # Parsing integers from split strings
        x = int(str_parts[0])
        y = int(str_parts[1])
        
        # Comparing x and y
        if x == y:
            print("a == b")
        if x < y:
            print("a < b")
        if x > y:
            print("a > b")

if __name__ == "__main__":
    main()
```

This Python script mirrors the functionality of the given Java code, reading a string from the standard input, splitting it, converting the separate parts to integers, and then performing comparisons on those integers. The results are printed to the standard output based on the comparisons. The exception handling is kept simple with a `try` block, and if there were an error (which is highly unlikely with the `input()` function), it would be automatically raised without an explicit `catch` block as in Java.
