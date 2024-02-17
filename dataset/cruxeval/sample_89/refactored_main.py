char = 'o'
if char not in 'aeiouAEIOU':
    result = None
if char in 'AEIOU':
    result = char.lower()
else:
    result = char.upper()
print(result)