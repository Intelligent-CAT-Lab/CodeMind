def first_odd(nums):
  first_odd = next((el for el in nums if el%2!=0),-1)
  return first_odd