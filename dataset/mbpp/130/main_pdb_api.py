from collections import defaultdict
def max_occurrences(nums):
    dict = defaultdict(int)
    for i in nums:
        dict[i] += 1
    result = max(dict.items(), key=lambda x: x[1]) 
    return result[0]
max_occurrences([2,3,8,4,7,9,8,2,6,5,1,6,1,2,3,2,4,6,9,1,2])