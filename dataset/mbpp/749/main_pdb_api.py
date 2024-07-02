def sort_numeric_strings(nums_str):
    result = [int(x) for x in nums_str]
    result.sort()
    return result
sort_numeric_strings( ['4','12','45','7','0','100','200','-12','-500'])