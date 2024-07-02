import heapq
def merge_sorted_list(num1,num2,num3):
  num1=sorted(num1)
  num2=sorted(num2)
  num3=sorted(num3)
  result = heapq.merge(num1,num2,num3)
  return list(result)
merge_sorted_list([25, 24, 15, 4, 5, 29, 110],[19, 20, 11, 56, 25, 233, 154],[24, 26, 54, 48])