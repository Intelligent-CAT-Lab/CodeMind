arr = [-1, 2, -3, 4, 5, 6, -7, 8, 9]
n = 9
j=0
for i in range(0, n):
    if (arr[i] < 0):
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        j = j + 1
print(arr)