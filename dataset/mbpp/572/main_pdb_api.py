def two_unique_nums(nums):
  return [i for i in nums if nums.count(i)==1]
two_unique_nums([1,2,3,2,3,4,5])