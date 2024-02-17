arr = [4,2,3]
if(len(arr) == 0): 
    print([]) 
evens = list(filter(lambda x: x%2 == 0, arr))
if(evens == []): 
    print([])
print([min(evens), arr.index(min(evens))])