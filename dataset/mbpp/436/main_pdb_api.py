def neg_nos(list1):
  out = []
  for num in list1: 
    if num < 0: 
      out.append(num)
  return out 
neg_nos([-1,4,5,-6])