def nth_nums(nums,n):
 nth_nums = list(map(lambda x: x ** n, nums))
 return nth_nums
nth_nums([1, 2, 3, 4, 5, 6, 7, 8, 9, 10],2)