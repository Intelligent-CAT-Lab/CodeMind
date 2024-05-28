def max_difference(test_list):
  temp = [abs(b - a) for a, b in test_list]
  res = max(temp)
  return (res) 