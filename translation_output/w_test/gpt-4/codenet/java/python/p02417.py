Here is the python equivalent of the Java code you provided:

```python
def count_letters(text):
    res = [0] * 26

    for char in text:
        if char.isalpha():
            res[ord(char.lower()) - ord('a')] += 1

    for i in range(26):
        print(f"{chr(i + ord('a'))} : {res[i]}")

# Test the function
input_text = "This is a pen."
count_letters(input_text)
```

Please take note that, unlike the Java version which reads from standard input in a loop, this Python function receives the text as an input argument and processes it directly. The test case runs the function with the provided input. If you want to read from standard input repeatedly as the Java version does, you would have to add an appropriate loop around the input and function call.
