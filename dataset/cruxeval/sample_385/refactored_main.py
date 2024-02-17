lst = [0, 2, 1, 2, 6, 2, 6, 3, 0]
i = 0
new_list = []
while i < len(lst):
    if lst[i] in lst[i+1:]:
        new_list.append(lst[i])
        if len(new_list) == 3:
            print(new_list)
            break
    i += 1
print(new_list)