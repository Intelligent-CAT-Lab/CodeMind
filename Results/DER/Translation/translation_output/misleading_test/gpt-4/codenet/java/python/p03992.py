Here's the code translated from Java to Python:

```python
def process_string(input_str):
    sb = []
    for i, c in enumerate(input_str):
        if i == 4:
            sb.append(" ")
        sb.append(c)
    return ''.join(sb)

# Sample Test case
input_str = "CODEFESTIVAL"
output_str = process_string(input_str)
print(output_str)
```

If you are running this in an environment where you need to take the input from stdin and print it to stdout (simulating the Java code using BufferedReader for input and PrintWriter for output), you can use this code as an alternative:

```python
def process_string(input_str):
    sb = []
    for i, c in enumerate(input_str):
        if i == 4:
            sb.append(" ")
        sb.append(c)
    return ''.join(sb)

if __name__ == "__main__":
    input_str = input()
    output_str = process_string(input_str)
    print(output_str)
```

Both snippets will provide the same output for the given sample test case.
