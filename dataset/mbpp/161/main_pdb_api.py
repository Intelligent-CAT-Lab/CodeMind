def remove_elements(list1, list2):
    result = [x for x in list1 if x not in list2]
    return result
remove_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [2, 4, 6, 8])