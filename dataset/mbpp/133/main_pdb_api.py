def sum_negativenum(nums):
  sum_negativenum = list(filter(lambda nums:nums<0,nums))
  return sum(sum_negativenum)
sum_negativenum([2, 4, -6, -9, 11, -12, 14, -5, 17])