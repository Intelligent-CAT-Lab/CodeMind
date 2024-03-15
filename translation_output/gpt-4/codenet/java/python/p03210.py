Here is the converted code from Java to Python:

```python
# No import needed for basic input-output

def main():
    age = int(input())  # Reading integer input
    
    if age in (3, 5, 7):  # Python 'in' keyword checks if value is in the tuple
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
``` 

The Python code removes the need for importing Scanner and BigDecimal, as they serve no purpose in this code snippet. We use the built-in `input()` function to get user input, which returns input as a string. This is then cast to an integer with `int()`. The condition is simplified by using a tuple `(3, 5, 7)` and the `in` keyword in Python to check if `age` is one of the specified values.
