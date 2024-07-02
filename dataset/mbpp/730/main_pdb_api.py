from itertools import groupby
def consecutive_duplicates(nums):
    return [key for key, group in groupby(nums)] 
consecutive_duplicates([0, 0, 1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 4, 4 ])