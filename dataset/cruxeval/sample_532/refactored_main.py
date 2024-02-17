n = 1
array = [1, 2, 3]
final = [array.copy()] 
for i in range(n):
    arr = array.copy()
    arr.extend(final[-1])
    final.append(arr)
print(final)