def max_val(listval):
     max_val = max(i for i in listval if isinstance(i, int)) 
     return(max_val)
max_val(['Python', 3, 2, 4, 5, 'version'])