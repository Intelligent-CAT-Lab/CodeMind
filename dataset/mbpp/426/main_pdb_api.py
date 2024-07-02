def filter_oddnumbers(nums):
 odd_nums = list(filter(lambda x: x%2 != 0, nums))
 return odd_nums
filter_oddnumbers([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])