tup = ('a', 'a', 'c', 'b', 'd')
lst = ['a', 'b']
count = 0
for item in tup: 
    if item in lst: 
        count+= 1 
print(count)