text = "7"
size = 10
counter = len(text)
for i in range(size-int(size%2)):
    text = ' '+text+' '
    counter += 2
    if counter >= size:
        print(text)