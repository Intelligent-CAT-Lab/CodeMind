def min_k(test_list, K):
  res = sorted(test_list, key = lambda x: x[1])[:K]
  return (res) 
min_k([('Manjeet', 10), ('Akshat', 4), ('Akash', 2), ('Nikhil', 8)], 2)