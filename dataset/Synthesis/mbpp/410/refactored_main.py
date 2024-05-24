listval = ['Python', 3, 2, 4, 5, 'version']
min_val = min(i for i in listval if isinstance(i, int))
print(min_val)