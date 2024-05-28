my_list = [12, 23, 4, 5, 3, 2, 12, 81, 56, 95]
gap = len(my_list) // 2
while gap > 0:
    for i in range(gap, len(my_list)):
        current_item = my_list[i]
        j = i
        while j >= gap and my_list[j - gap] > current_item:
            my_list[j] = my_list[j - gap]
            j -= gap
        my_list[j] = current_item
    gap //= 2
print(my_list)