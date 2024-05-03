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

This Python code defines a function `swap_fruit_names` that takes a string as input and replaces all occurrences of "apple" and "peach" with temporary placeholders ("wwwp" and "wwwa" respectively). Then it swaps the placeholders back to their original fruit names. The function is then called with user input and the result is printed.
