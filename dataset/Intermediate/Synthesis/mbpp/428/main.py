def shell_sort(my_list):
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

    return my_list