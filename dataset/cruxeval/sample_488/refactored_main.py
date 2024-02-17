text = 'tezmgvn 651h'
char ='6'
count = text.count(char)
chars = list(text)
if count > 0:
    index = chars.index(char) + 1
    chars[:index:index+1] = [c for c in chars[index:index+count:1]]
print(''.join(chars))