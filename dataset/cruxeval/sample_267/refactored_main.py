text = 'sowpf'
space = -7
if space < 0:
    result = text
else:
    result = text.ljust(len(text) // 2 + space)
print(result)