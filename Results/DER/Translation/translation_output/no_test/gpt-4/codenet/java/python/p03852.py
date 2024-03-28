Here is the translated Python code:

```python
def p03852():
    c = input()

    if c in ['a', 'i', 'u', 'e', 'o']:
        print("vowel")
    else:
        print("consonant")

# Call the function
p03852()
```

Note that in the Python code, instead of using multiple `if` and `else if` conditions to check for each vowel, we use a list containing all vowels and then use the `in` operator to check if the input character is in the list.
