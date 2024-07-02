def add_pairwise(test_tup):
  res = tuple(i + j for i, j in zip(test_tup, test_tup[1:]))
  return (res) 
add_pairwise((1, 5, 7, 8, 10))