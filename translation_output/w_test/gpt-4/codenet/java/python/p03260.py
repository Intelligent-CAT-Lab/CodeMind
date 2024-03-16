Here's the translated Python code for the given Java snippet. To mimic the Java code, I'll use the built-in input() function to read from standard input (stdin) and print the result to standard output (stdout).

```python
def check_odd_product():
    values = input().split()
    n = int(values[0])
    k = int(values[1])

    if (n * k) % 2 == 1:
        print("Yes")
    else:
        print("No")

check_odd_product()
```

You can use the above Python function to process the sample test case. It will read the input '3 1' from stdin, and you should see the expected output 'Yes' printed to stdout.
