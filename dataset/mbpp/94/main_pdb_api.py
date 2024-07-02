from operator import itemgetter 
def index_minimum(test_list):
  res = min(test_list, key = itemgetter(1))[0]
  return (res) 
index_minimum([('Rash', 143), ('Manjeet', 200), ('Varsha', 100)])