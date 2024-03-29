Here's the translated Python code based on the given Java code:

```python
# Get input from user
s = input()

answer = ""

# Loop through the string with step -2 to check for equal halves
for i in range(len(s), 1, -2):
    current_string = s[:i]
    
    s1 = current_string[:len(current_string) // 2]
    s2 = current_string[len(current_string) // 2:]
    
    if s1 == s2 and len(current_string) != len(s):
        answer = current_string
        break

# Print the length of the answer
print(len(answer))
```

You can run this 'python' snippet and input the test case "abaababaab". The expected output would be 6.
