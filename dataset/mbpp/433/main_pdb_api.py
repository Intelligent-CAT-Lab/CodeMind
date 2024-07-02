def check_greater(arr, number):
  arr.sort()
  return number > arr[-1]
check_greater([1, 2, 3, 4, 5], 4)