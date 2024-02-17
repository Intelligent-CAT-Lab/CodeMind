val = 'o'
text = 'fnmart'
indices = [index for index in range(len(text)) if text[index] == val]
if len(indices) == 0:
    print(-1)
else:
    print(indices[0])