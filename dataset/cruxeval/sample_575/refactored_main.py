nums = [10, 4]
val = 3
new_list = []
[new_list.extend([i] * val) for i in nums]
print(sum(new_list))