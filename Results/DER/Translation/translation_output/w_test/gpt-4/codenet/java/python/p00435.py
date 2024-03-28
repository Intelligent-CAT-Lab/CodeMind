Here is the equivalent code in Python:

```python
s = input()
output = "".join([chr((ord(c) - 42) % 26 + 65) for c in s])
print(output)
```

If you have the input "MRL", you can run the following test case:

```python
s = "MRL"
output = "".join([chr((ord(c) - 42) % 26 + 65) for c in s])
print(output)  # Expected output: "JOI"
```

When you run this Python code with the input "MRL", it should generate the expected output "JOI".
