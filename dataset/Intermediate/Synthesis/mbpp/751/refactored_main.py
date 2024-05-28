arr = [1, 2, 3, 4, 5, 6]
i = 0
def check_min_heap_helper(arr, i):
    if 2 * i + 2 > len(arr):
        return True
    left_child = (arr[i] <= arr[2 * i + 1]) and check_min_heap_helper(arr, 2 * i + 1)
    right_child = (2 * i + 2 == len(arr)) or (arr[i] <= arr[2 * i + 2] 
                                      and check_min_heap_helper(arr, 2 * i + 2))
    return left_child and right_child

print(check_min_heap_helper(arr, 0))