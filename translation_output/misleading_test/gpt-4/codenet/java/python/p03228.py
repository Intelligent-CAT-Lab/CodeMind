Below is the translated Python code for the provided Java code snippet:

```python
# Welcome to online Python execution.
# Online Python execution is an online compiler and debugger tool for Python, Java, PHP, Ruby, Perl,
# C, C++, C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
# Write, Compile, Execute and Debug code online from anywhere in the world.

def main():
    a, b, op = map(int, input().split())

    for i in range(op):
        if i % 2 == 0:
            b += a // 2
            a //= 2
        else:
            a += b // 2
            b //= 2

    print(a)
    print(b)

if __name__ == '__main__':
    main()
```  

Here's how you can test it with the sample input:

```python
# Include the code above here
# Now, simulate the test

import io
import sys

# Use io.StringIO() to simulate stdin
test_input = io.StringIO('5 4 2')
sys.stdin = test_input

# Call main function to test
main()

# Reset stdin if necessary for further tests
sys.stdin = sys.__stdin__
```

When you run the Python code with the sample input `5 4 2`, the expected output `5` (along with `b`'s final value) will be printed to STDOUT.
