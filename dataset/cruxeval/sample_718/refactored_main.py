text = 'ThisIsSoAtrocious'
t = text
for i in text:
    text = text.replace(i, '')
print(str(len(text)) + t)