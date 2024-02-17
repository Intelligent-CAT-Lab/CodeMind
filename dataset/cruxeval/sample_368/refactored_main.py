string = '4327'
numbers = [2, 8, 9, 2, 7, 1]
arr = []
for num in numbers:
    arr.append(string.zfill(num))
print(' '.join(arr))