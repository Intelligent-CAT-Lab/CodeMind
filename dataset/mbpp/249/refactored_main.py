array_nums1 = [1, 2, 3, 5, 7, 8, 9, 10]
array_nums2 = [1, 2, 4, 8, 9]
result = list(filter(lambda x: x in array_nums1, array_nums2)) 
print(result)