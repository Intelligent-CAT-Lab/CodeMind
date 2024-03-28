Here is the translated Python code from the provided Java code:

```python
import sys

class p03079:
    def solve(self):
        a, b, c = self.read_ints()
        if a == b and b == c:
            print("Yes")
        else:
            print("No")

    def read_ints(self):
        return map(int, input().split())

# Sample Test case
def main():
    mainObj = p03079()
    mainObj.solve()

if __name__ == "__main__":
    main()
```

This translation does away with the FastScanner class and directly uses Python's built-in functionality to read input. 

Please note that Python uses `input()` to read a line from standard input and `split()` to tokenize the string. `map(int, input().split())` is a Pythonic way to read multiple integers from a single line of input by mapping the `int` function to each tokenized string segment.

To run the test case with input "2 2 2", you can either input it manually when the script prompts for input, or you can pipe the input to the script in a shell environment like this:

```
echo "2 2 2" | python script_name.py
```

Replace `script_name.py` with the name of the Python script file.
