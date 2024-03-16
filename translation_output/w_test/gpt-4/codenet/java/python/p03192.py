Here is the Python equivalent of the Java code you've provided. This script will count the number of '2's in the input string.

```python
# Get input from user
string = input("Enter a string: ")
count = 0

# Count the number of '2's in the string
for char in string:
    if char == '2':
        count += 1

# Print the result
print(count)
```

You can test this code with your provided input (1222) and you should expect the following output:

```
Enter a string: 1222
3
```

This assumes that you will run the code in an environment where you can input data (for instance, through a command line interface). The prompt 'Enter a string: ' will appear, you enter '1222', and the script will print '3'.
