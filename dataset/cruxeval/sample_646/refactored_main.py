text = 'aBc, ,SzY'
count = 2
for i in range(count):
    text = ''.join(reversed(text))
print(text)