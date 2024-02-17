text = 'wlace A'
count = len(text)
for i in range(-count+1, 0):
    text = text + text[i]
print(text)