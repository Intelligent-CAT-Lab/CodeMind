def cummulative_sum(test_list):
  res = sum(map(sum, test_list))
  return (res)
cummulative_sum([(1, 3), (5, 6, 7), (2, 6)])