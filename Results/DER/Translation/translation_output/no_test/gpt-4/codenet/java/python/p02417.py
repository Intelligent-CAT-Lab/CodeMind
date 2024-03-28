Certainly! The Java code you provided counts the occurrences of each letter in the input text, ignoring case. Here's how you could achieve the same functionality in Python:

```python
from collections import defaultdict
import sys

def main():
    # Using defaultdict to initialize counts to zero
    res = defaultdict(int)

    # Read lines until EOF
    for line in sys.stdin:
        # Process each character in the line
        for c in line.strip():
            # Check for alphabetical characters and update the counter
            if c.isalpha():
                res[c.lower()] += 1

    # Print the results
    for i in range(26):
        print(f"{chr(97 + i)} : {res[chr(97 + i)]}")

if __name__ == "__main__":
    main()
```

This code reads from standard input until an End-Of-File (EOF) is reached, just like the original code using `Scanner.hasNext()`. Each character is checked to determine if it's a letter, and then it's converted to lower case to count it in a case-insensitive way. Finally, the counts are printed for each letter of the alphabet.

Note that `sys.stdin` is used here to maintain the behavior of reading until EOF. In practice, for non-interactive scripts, you might want to read from a file or another source.
