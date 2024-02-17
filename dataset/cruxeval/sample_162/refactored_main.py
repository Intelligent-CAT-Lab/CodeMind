text = 'с bishop.Swift'
result = ''
for char in text:
    if char.isalnum():
        result += char.upper()
print(result)