array = [1,2,3,4,5,6,7,8,9,10]
x = 11
i = 4
if i < -len(array) or i > len(array) - 1:
    print('no')
temp = array[i]
array[i] = x
print(array)