import heapq
def merge_sorted_list(num1,num2,num3):
  num1=sorted(num1)
  num2=sorted(num2)
  num3=sorted(num3)
  result = heapq.merge(num1,num2,num3)
  return list(result)