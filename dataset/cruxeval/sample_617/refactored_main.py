text = "<<<<"
if text.isascii():
    return_value = 'ascii'
else:
    return_value = 'non ascii'
print(return_value)