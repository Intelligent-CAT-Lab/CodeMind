text = 'wrazugizoernmgzu'
for i in range(len(text)-1):
    if text[i:].islower():
        print(text[i + 1:])
        break
else:
    print('')