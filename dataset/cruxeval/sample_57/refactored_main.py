text = 'ax'
text = text.upper()
count_upper = 0
for char in text:
    if char.isupper():
        count_upper += 1
    else:
        print('no')
        break
else:
    print(count_upper // 2)