def count_first_elements(test_tup):
  for count, ele in enumerate(test_tup):
    if isinstance(ele, tuple):
      break
  return (count) 
count_first_elements((1, 5, 7, (4, 6), 10) )