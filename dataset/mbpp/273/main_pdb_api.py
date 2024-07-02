def substract_elements(test_tup1, test_tup2):
  res = tuple(map(lambda i, j: i - j, test_tup1, test_tup2))
  return (res) 
substract_elements((10, 4, 5), (2, 5, 18))