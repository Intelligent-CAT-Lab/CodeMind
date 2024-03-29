Below is the translated code from Java to Python. In Python, input reading can be done with built-in functions, without the need for a separate `Scanner` class.

```python
# Function to determine if the word is "Bad" or "Good"
def is_bad_word(word):
    for i in range(len(word) - 1):
        if word[i] == word[i + 1]:
            return "Bad"
    return "Good"

# Reading input from the user (assumed to be a number as a string)
word = input().strip()

# Printing the result
print(is_bad_word(word))
```

With the given test input `3776`, this Python code would output:

```
Bad
```
