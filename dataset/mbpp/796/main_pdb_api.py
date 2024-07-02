def return_sum(dict):
  sum = 0
  for i in dict.values():
    sum = sum + i
  return sum
return_sum({'a': 100, 'b':200, 'c':300})