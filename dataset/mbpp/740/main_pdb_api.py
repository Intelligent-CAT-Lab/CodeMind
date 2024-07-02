def tuple_to_dict(test_tup):
  res = dict(test_tup[idx : idx + 2] for idx in range(0, len(test_tup), 2))
  return (res) 
tuple_to_dict((1, 5, 7, 10, 13, 5))