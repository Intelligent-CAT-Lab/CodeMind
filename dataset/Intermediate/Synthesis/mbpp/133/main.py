def sum_negativenum(nums):
  sum_negativenum = list(filter(lambda nums:nums<0,nums))
  return sum(sum_negativenum)