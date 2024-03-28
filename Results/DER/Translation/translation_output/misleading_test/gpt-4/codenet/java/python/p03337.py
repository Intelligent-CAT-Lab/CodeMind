```python
import sys

def main():
    a, b = map(int, input().split())
    print(max(a + b, a - b, a * b))

if __name__ == "__main__":
    # Redirect input from sys.stdin to accommodate the test case format
    sys.stdin = open("input.txt", "r")
    
    main()

# To run the test case provided using Python, you can create an 'input.txt'
# file with the content "3 1", and the script will read from that file instead
# of the standard input. To revert back to standard input, you can remove or comment
# out the 'sys.stdin = open("input.txt", "r")' line.
```

Python handles input and output quite differently from Java. In the above Python code, I assume that you would like to read from an `input.txt` file as per the provided test case format. If you wish to read from the standard input, you can simply use `input()` without redirecting `sys.stdin`.

Keep in mind that the behavior of the Python code when run interactively will differ from the Java code because of the `sys.stdin` redirection. The redirection in the above code is specifically for the purpose of testing with a file named "input.txt," and this approach is not used in typical Python scripts that interact with users via the command line.
