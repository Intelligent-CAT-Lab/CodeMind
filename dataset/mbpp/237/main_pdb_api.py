from collections import Counter 
def check_occurences(test_list):
  res = dict(Counter(tuple(ele) for ele in map(sorted, test_list)))
  return  (res) 
check_occurences([(3, 1), (1, 3), (2, 5), (5, 2), (6, 3)] )