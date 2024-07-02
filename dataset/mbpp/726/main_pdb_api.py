def multiply_elements(test_tup):
  res = tuple(i * j for i, j in zip(test_tup, test_tup[1:]))
  return (res) 
multiply_elements((1, 5, 7, 8, 10))