text = 'qpfi jzm'
char = 'j'
index = text.rindex(char)
result = list(text)
while index > 0:
    result[index] = result[index-1]
    result[index-1] = char
    index -= 2
print(''.join(result))