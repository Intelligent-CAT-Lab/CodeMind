list_data = [10, 20, 30, 40, 20, 50, 60, 40]
temp = list(set(list_data))
p = 1
for i in temp:
    p *= i
print(p)