Below is the translated Java code into Python:

```python
# Read input from user
S = input()
correct = "CODEFESTIVAL2016"
num = 0

# Compare each character
for i in range(16):
    if S[i] != correct[i]:
        num += 1

# Print the result
print(num)
```

When you input "C0DEFESTIVAL2O16", you should get the expected output "2".
