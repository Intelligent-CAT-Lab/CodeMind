Here's the Python translation of your Java code:

```python
def find_longest_word(input_str):
    # Replace egg and chicken with single characters.
    line = input_str.replace("egg", "e").replace("chicken", "c")
    # Split the string on spaces after replacing double letters with spaced letters
    line = (line.replace("ee", "e e").replace("ee", "e e")
                .replace("cc", "c c").replace("cc", "c c"))
    strs = line.split(" ")
    max_length = 0
    ans = ""
    # Iterate through the split strings and find the longest one.
    for s in strs:
        if max_length < len(s):
            max_length = len(s)
            ans = "egg" if s[-1] == 'e' else "chicken"
    return ans

# Test case
test_input = "eggchickenegg"
expected_output = "egzg"
print(find_longest_word(test_input))
```

Please note that in the expected output you provided, "egzg" does not seem to relate to the Java code provided. The Java code is designed to replace occurrences of "egg" and "chicken" with "e" and "c", respectively, and then find the longest substring of 'e' or 'c', then output "egg" or "chicken" accordingly.

If you have any specific logic behind the expected output "egzg" that differs from the Java code provided, please let me know, and I can help adjust the Python code accordingly.
