text = "d khqw whi fwi bbn 41"
a = text.strip().split(' ')
for i in range(len(a)):
    if a[i].isdigit() is False:
        print('-')
        break
else:
    print(" ".join(a))