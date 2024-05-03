Here is the Python equivalent of the Java code:

```python
def swap_fruit_names(input_str):
    fruit_dict = {"apple": "wwwp", "peach": "wwwa"}
    for fruit, replacement in fruit_dict.items():
        input_str = input_str.replace(fruit, replacement)
    for fruit, replacement in fruit_dict.items():
        input_str = input_str.replace(replacement, fruit)
    return input_str

input_str = input("Enter a sentence: ")
print(swap_fruit_names(input_str))
```

This Python code defines a function `swap_fruit_names` that takes a string as input and replaces all occurrences of "apple" and "peach" with temporary placeholders ("wwwp" and "wwwa" respectively). Then it replaces all occurrences of the temporary placeholders with the actual fruit names. The function returns the modified string.

The main part of the code prompts the user to enter a sentence, calls the `swap_fruit_names` function with the input sentence, and prints the result.
