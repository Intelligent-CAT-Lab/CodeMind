string = "cA"
if string.isupper():
    converted_string = string.lower()
elif string.islower():
    converted_string = string.upper()
else:
    converted_string = string
print(converted_string)