text = 'a'
num = 19
req = num - len(text)
text = text.center(num, '*')
print(text[:req // 2: -req // 2])