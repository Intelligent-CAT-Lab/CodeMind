def add_dict_to_tuple(test_tup, test_dict):
  test_tup = list(test_tup)
  test_tup.append(test_dict)
  test_tup = tuple(test_tup)
  return (test_tup) 
add_dict_to_tuple((4, 5, 6), {"MSAM" : 1, "is" : 2, "best" : 3} )