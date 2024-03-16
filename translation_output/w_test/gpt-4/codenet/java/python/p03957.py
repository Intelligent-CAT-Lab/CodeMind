Below is the Python conversion of the provided Java code. This Python script reads a string from standard input and checks if it contains a 'C' before an 'F'. If it does, it will output 'Yes'; if not, it will output 'No'. 

```python
import sys

def solve(s):
    c_index = s.find('C')
    f_index = s.rfind('F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        return "No"
    else:
        return "Yes"

def main():
    s = input().strip()  # Read input from standard input
    result = solve(s)
    print(result)  # Print the result to standard output

if __name__ == "__main__":
    main()
```

To test this code with the test input provided, you can use the command line to run the Python script and type in the input 'CODEFESTIVAL', or you can pipe input to your Python script using an echo command in a Unix-like terminal:

```shell
echo "CODEFESTIVAL" | python your_script.py
```

Replace `your_script.py` with the path to the Python script you have saved with the provided Python code. It should output:

```
Yes
```

Keep in mind the Python code above is intended to be used as a script, not as a module, and that it reads its input from standard input (`sys.stdin`). If you want to use it in a different context, some modifications might be needed.
