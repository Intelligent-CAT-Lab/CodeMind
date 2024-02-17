text = 'damdrodm'
suffix = 'm'
if text.endswith(suffix):
    text = text[:-1] + text[-1:].swapcase()
print(text)