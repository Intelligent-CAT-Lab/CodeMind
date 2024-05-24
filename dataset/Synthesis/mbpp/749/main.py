def sort_numeric_strings(nums_str):
    result = [int(x) for x in nums_str]
    result.sort()
    return result