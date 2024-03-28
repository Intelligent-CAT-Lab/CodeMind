# Equivalent Python code for the Java sample provided

input_str = input()

# Translation of the logic into Python
output_str = ''
for char in input_str:
    if char.islower():
        output_str += char.upper()
    elif char.isupper():
        output_str += char.lower()
    #