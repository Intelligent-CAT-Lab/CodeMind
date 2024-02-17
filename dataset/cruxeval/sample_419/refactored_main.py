text = 'mmfbifen'
value = 'i'
if not value in text:
    result = ''
else:
    result = text.rpartition(value)[0]
print(result)