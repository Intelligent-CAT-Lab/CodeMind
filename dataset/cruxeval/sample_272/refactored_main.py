base_list = [9, 7, 5, 3, 1]
nums = [2, 4, 6, 8, 0]
base_list.extend(nums)
res = base_list.copy()
for i in range(-len(nums), 0):
    res.append(res[i])
print(res)