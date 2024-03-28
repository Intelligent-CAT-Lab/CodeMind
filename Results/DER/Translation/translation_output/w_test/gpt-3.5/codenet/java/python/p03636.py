```python
def abbreviate_word(word):
    length = len(word)
    return word[0] + str(length-2) + word[length-1]

# Test case
input_word = "internationalization"
output = abbreviate_word(input_word)
print(output)
```
