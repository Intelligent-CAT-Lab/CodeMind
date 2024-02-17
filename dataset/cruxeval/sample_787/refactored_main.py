text = 'xzd'
if len(text) == 0:
    returned_value = ''
text = text.lower()
returned_value = text[0].upper() + text[1:]
print(returned_value)