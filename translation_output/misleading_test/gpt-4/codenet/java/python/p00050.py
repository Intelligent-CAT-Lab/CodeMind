Here's the translated Python code:

```python
# Get the input from user
str_input = input()

# Replace the words by using intermediate placeholders
ans = str_input.replace("apple", "wwwp")
ans = ans.replace("peach", "wwwa")
ans = ans.replace("wwwp", "peach")
ans = ans.replace("wwwa", "apple")

# Print the result
print(ans)
```

You can run the above code snippet in your Python environment. It takes an input string from the user, replaces 'apple' with 'peach' and vice versa, and then prints out the result.
