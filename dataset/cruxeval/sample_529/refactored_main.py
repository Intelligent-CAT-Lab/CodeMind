array = [1, 2, 3]
prev = array[0]
newArray = array[:]
for i in range(1, len(array)):
    if prev != array[i]:
        newArray[i] = array[i]
    else:
        del newArray[i]
    prev = array[i]
print(newArray)