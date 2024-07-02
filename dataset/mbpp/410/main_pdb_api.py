def min_val(listval):
     min_val = min(i for i in listval if isinstance(i, int))
     return min_val
min_val(['Python', 3, 2, 4, 5, 'version'])