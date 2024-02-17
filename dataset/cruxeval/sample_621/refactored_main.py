text = '13:45:56'
encoding = 'shift_jis'
try:
    result = text.encode(encoding)
except LookupError:
    result = str(LookupError)
print(result)