text = 'llomnrpc'
char = 'x'
char_index = text.find(char)
result = []
if char_index > 0:
    result = list(text[:char_index])
result.extend(list(char)+list(text[char_index+len(char):]))
print(''.join(result))