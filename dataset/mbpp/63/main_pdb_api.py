def max_difference(test_list):
  temp = [abs(b - a) for a, b in test_list]
  res = max(temp)
  return (res) 
max_difference([(3, 5), (1, 7), (10, 3), (1, 2)])