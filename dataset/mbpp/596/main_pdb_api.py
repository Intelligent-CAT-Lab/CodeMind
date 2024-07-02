import sys 
def tuple_size(tuple_list):
  return (sys.getsizeof(tuple_list)) 
tuple_size(("A", 1, "B", 2, "C", 3) )