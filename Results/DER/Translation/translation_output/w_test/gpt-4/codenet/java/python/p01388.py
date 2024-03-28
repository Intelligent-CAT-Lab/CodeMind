Below is the translated Java code to Python:

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
    print(min(c))

if __name__ == "__main__":
    run()
```

The provided input and expected output:

```
# Test input:
s = "KUPCkupcKUPC"

# Expected output:
# 2
``` 

Note that when running this in a Python environment, you provide the input as standard input. If you want to use the test input directly in the script, you can replace `s = input()` with `s = "KUPCkupcKUPC"` and comment out or remove the `if __name__ == "__main__": run()` block.
