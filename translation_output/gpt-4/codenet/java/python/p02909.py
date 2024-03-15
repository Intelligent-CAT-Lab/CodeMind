Sure, here's the equivalent Python code for the given Java code snippet:

```python
# No import is needed for input in Python

def main():
    str_input = input()

    if str_input == "Sunny":
        print("Cloudy")
    if str_input == "Cloudy":
        print("Rainy")
    if str_input == "Rainy":
        print("Sunny")

if __name__ == "__main__":
    main()
```

In Python, `input()` is used to get user input as a string. Also, print statements in Python do not require a call to `System.out.println`. The equality check between strings remains the same (`==` instead of `.equals()`). The overall structure of the Python code is also more simplified due to Python's syntax simplicity.
