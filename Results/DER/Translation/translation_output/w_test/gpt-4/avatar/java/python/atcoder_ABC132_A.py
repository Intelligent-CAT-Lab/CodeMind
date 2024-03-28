Below is the equivalent Python code to the Java code you've provided. Note that in Python, there's no need for a class to read input, as Python's standard input/output is typically much simpler to use.

```python
def main():
    s = input().strip()
    chars = set(s)
    if len(chars) == 2 and all(s.count(char) == 2 for char in chars):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
The converted code includes a main function that reads a string from the standard input, creates a set of the characters in the string, and then checks if there are exactly 2 different characters and that each character appears exactly 2 times. If this condition is met, it outputs "Yes", otherwise it outputs "No."

This Python version makes use of the `input()` function to read from the standard input and the `set` data structure to store unique characters. It also directly checks the count of each character in the original string, rather than using a tokenizer as in the Java version.

Here's how you can use this Python code with your provided test case:

```sh
echo "STOP" | python atcoder_ABC132_A.py
```

Expected output:
```
No
```
