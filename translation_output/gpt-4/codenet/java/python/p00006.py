Here is the Java code translated into Python:

```python
import sys

def main():
    str_input = input()
    ret = ""
    for i in range(len(str_input)):
        ch = str_input[len(str_input) - i - 1]
        ret += ch
    print(ret)

if __name__ == "__main__":
    main()
```

You can run this Python script, and it will perform similar functionality to the Java code provided: reading a line from standard input and printing its reverse.
