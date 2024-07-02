def extract_freq(test_list):
  res = len(list(set(tuple(sorted(sub)) for sub in test_list)))
  return (res)
extract_freq([(3, 4), (1, 2), (4, 3), (5, 6)] )