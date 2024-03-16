Here's the equivalent Python code for the provided Java code:

```python
# Importing the sys module for standard input operations
import sys

# Define the main function
def main():
    for line in sys.stdin:
        numbers = list(map(int, line.split()))  # Splitting the input line and converting elements to integers
        if not numbers:  # Check if the line is empty
            continue  # Skip empty lines
        H, R = numbers  # Unpacking the input values into H and R
        
        # Performing the checks and printing the results as per conditions
        if H < 0 and abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)

# Call the main function
if __name__ == '__main__':
    main()
```

This code handles the user's input from the standard input stream, just like the Java version. It reads the input line by line, and for each line, it splits the line by whitespace, maps the split strings to integers, and performs the given operations. Note that in Python, we don't need to check for `hasNextInt()` since we're reading from the standard input stream until it's closed or interrupted.
