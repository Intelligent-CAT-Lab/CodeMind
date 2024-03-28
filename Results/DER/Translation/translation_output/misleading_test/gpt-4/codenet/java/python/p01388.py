Here's the translated code from Java to Python:

```python
def run():
    s = input()
    c = [0] * 4
    for char in s:
        if char == 'K':
            c[0] += 1
        if char == 'U':
            c[1] += 1
        if char == 'P':
            c[2] += 1
        if char == 'C':
            c[3] += 1
    print(min(c[0], c[1], c[2], c[3]))

if __name__ == "__main__":
    run()
```

Below are the python statements to test the above code based on the given test case:

```python
# Sample Test Case (Test Input: "KUPCkupcKUPC", Expected Output: -65)
# Since the expected output doesn't align with the behavior of the mentioned code in the prompt, 
# and the logic results in a minimum count (not a negative value), I will consider the output as 4 
# based on the input "KUPCkupcKUPC".

# To test the code, you can run it and provide the input "KUPCkupcKUPC".
# The expected correct output for the logic provided would be 4.
```

Configuration Note: For the sample test code to work, you must ensure the run() function from the previous code block is defined in your Python environment.
