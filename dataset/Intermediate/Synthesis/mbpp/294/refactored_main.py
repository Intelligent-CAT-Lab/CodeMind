listval = ['Python', 3, 2, 4, 5, 'version']
max_val = max(i for i in listval if isinstance(i, int)) 
print(max_val)