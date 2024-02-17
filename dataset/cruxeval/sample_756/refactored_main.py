text = ''
if text.isalnum() and all(i.isdigit() for i in text):
    refactored_function = 'integer'
else:
    refactored_function = 'string'
print(refactored_function)