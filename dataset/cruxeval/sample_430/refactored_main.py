arr1 = [5, 1, 3, 7, 8]
arr2 = ['', 0, -1, []]

new_arr = arr1.copy()
new_arr.extend(arr2)
print(new_arr)