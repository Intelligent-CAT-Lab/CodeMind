def swap_fruit_names(input_str):
    fruit_dict = {"apple": "wwwp", "peach": "wwwa"}
    for fruit, replacement in fruit_dict.items():
        input_str = input_str.replace(fruit, replacement)
    for fruit, replacement in fruit_dict.items():
        input_str = input_str.replace(replacement, fruit)
    return input_str

input_str = input("Enter a sentence: ")
print(swap_fruit_names(input_str))