text = '816'
if text.isidentifier():
    result = ''.join(c for c in text if c.isdigit())
else:
    result = ''.join(text)
print(result)