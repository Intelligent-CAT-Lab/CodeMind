text = 'm4n2o'
ans = []
for char in text:
    if char.isdigit():
        ans.append(char)
    else:
        ans.append(' ')
print(''.join(ans))