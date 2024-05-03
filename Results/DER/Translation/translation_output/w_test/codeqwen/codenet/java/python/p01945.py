Here is the Python equivalent of the Java code:

```python
import re

def main():
    # Read input from the user
    str = input()

    # Remove all occurrences of "()"
    while "()" in str:
        str = str.replace("()", "")

    # Convert the string to a list of characters
    input = list(str)

    # Find the index of the first '*' character
    star_index = input.index('*')

    # Initialize variables to keep track of the number of valid pairs
    left = star_index - 1
    right = star_index + 1
    result = 0

    # Iterate over the list from the left to the right
    while left >= 0:
        # If the current character is '(', find the corresponding ')'
        if input[left] == '(':
            while right <= len(input) - 1:
                if input[right] == ')':
                    result += 1
                    break
                right += 1
        
        left -= 1

    # Print the result
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, removes all occurrences of "()", converts the string to a list of characters, finds the index of the first '*' character, and then iterates over the list from the left to the right to find all valid pairs of '(' and ')'. The number of valid pairs is then printed to the console.
