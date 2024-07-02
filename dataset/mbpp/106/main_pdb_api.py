def add_lists(test_list, test_tup):
  res = tuple(list(test_tup) + test_list)
  return (res) 
add_lists([5, 6, 7], (9, 10))