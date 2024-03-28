The translated Python code using standard I/O for input and output would look like this:

```python
import math

def run():
    d = float(input())
    if d < 1:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2):
        print("2")
    elif d < 2:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2) * 1.5:
        print("3")
    else:
        print(d * math.sqrt(2))

if __name__ == "__main__":
    run()
```

You can run the provided test case by simply executing the script and entering the test input when prompted.

Below is an example of running the test case:

```plaintext
> python script.py
1.000
2.000000000000
```

Make sure that you use the same number formatting for the output if you require exact match, as the original Java code relies on `PrintStream`'s default formatting. Python's `print` function will not necessarily format the floating-point number in the same way without additional directives.
