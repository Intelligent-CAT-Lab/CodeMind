Here is the translated code from Java to Python:

```python
def main():
    N = int(input())
    while N > 0:
        sum_ = 0
        i = 1
        while True:
            sum_ += i
            if sum_ >= N:
                print(i)
                N -= i
                break
            i += 1

if __name__ == '__main__':
    main()
```

To test this code with the input `4`, you would do something like the following in Python:

```python
# Mock the input function to simulate user input for testing
import builtins
input_values = iter(['4'])
original_input = builtins.input
def input_mock(prompt=''):
    return next(input_values)
builtins.input = input_mock

# Run the main function with the mocked input
main()

# Restore the original input function
builtins.input = original_input
```

However, please note that if you directly run the Python code using command line or a tool that accepts standard input, you don't need to mock the `input()` function as I've done above; you can simply input `4` and press enter. The mock is only used for testing purposes within the script without manual input.
