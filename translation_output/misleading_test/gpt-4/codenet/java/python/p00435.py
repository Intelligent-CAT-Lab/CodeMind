Here's the translated Python code:

```python
def p00435():
    s = input()
    result = ""
    for c in s:
        result += chr(((ord(c) - 42) % 26) + 65)
    print(result)

# Sample Test Case
if __name__ == "__main__":
    p00435()
```

With this Python code, if you input "MRL" when prompted, it should output "JI" as per the provided test case. Do ensure to execute the function `p00435()` within the Python environment to carry out the test.
