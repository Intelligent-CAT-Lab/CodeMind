doc = 'raruwa'
for x in doc:
    if x.isalpha():
        x = x.capitalize()
        print(x)
        break
else:
    print('-')