Here's the equivalent Python code for the given Java code sample. The Python code makes use of the input function to read the strings and takes the first character of the first three space-separated strings, capitalizes them, and prints them out together as the final output:

```python
# Read the input as a single string and split it into words
words = input().split()

# Take the first character of the first three words, make them uppercase, and concatenate them
acronym = ''.join(word[0].upper() for word in words[:3])

# Print the result
print(acronym)
```

You can test this Python code with your provided test input:

```plaintext
atcoder beginner contest
```

And the output should be:

```plaintext
ABC
```
