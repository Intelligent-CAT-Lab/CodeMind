def tuple_modulo(test_tup1, test_tup2):
  res = tuple(ele1 % ele2 for ele1, ele2 in zip(test_tup1, test_tup2)) 
  return (res) 
tuple_modulo((10, 4, 5, 6), (5, 6, 7, 5))