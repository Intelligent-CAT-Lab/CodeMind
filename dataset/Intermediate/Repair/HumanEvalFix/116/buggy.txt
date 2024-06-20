def sort_array(arr):
    return sorted(sorted(arr), key=lambda x: arr.count('1'))
