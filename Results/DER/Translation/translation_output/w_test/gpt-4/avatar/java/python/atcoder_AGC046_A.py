Here is the equivalent Python code for the given Java program:

```python
def main():
    k = 360
    j = 1

    try:
        # The input function is used in python for reading input.
        i = int(input()) 

        if 1 <= i <= 179:
            while (i * j) % k != 0:
                j += 1
            print(j)
        else:
            print("Please enter an angle between 1 ~ 179.") # translated error message
    except ValueError:
        # The ValueError exception is raised if the input is not an integer.
        print("Please enter an integer.")

if __name__ == "__main__":
    main()
```

Test this code with the test input `1` to get the expected output `360`.
