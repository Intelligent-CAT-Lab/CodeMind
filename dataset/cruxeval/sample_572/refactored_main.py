data = {1: 9, 2: 10, 3: 1}
num = 1
new_dict = {}
temp = list(data.items())
for i in range(len(temp) - 1, num - 1, -1):
    new_dict[temp[i]] = None
print(temp[num:] + list(new_dict.items()))