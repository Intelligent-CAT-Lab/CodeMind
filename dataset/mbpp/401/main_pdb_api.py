def add_nested_tuples(test_tup1, test_tup2):
  res = tuple(tuple(a + b for a, b in zip(tup1, tup2))
   for tup1, tup2 in zip(test_tup1, test_tup2))
  return (res) 
add_nested_tuples(((1, 3), (4, 5), (2, 9), (1, 10)), ((6, 7), (3, 9), (1, 1), (7, 3)))