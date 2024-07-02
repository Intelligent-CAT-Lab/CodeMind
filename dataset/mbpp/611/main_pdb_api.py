def max_of_nth(test_list, N):
  res = max([sub[N] for sub in test_list])
  return (res) 
max_of_nth([[5, 6, 7], [1, 3, 5], [8, 9, 19]], 2)