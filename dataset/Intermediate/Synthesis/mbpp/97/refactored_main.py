list1 = [[1, 2, 3, 2], [4, 5, 6, 2], [7, 8, 9, 5]]
list1 = [item for sublist in list1 for item in sublist]
dic_data = {}
for num in list1:
    if num in dic_data.keys():
        dic_data[num] += 1
    else:
        key = num
        value = 1
        dic_data[key] = value
print(dic_data)