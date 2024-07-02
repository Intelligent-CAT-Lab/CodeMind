def sort_sublists(list1):
    result = list(map(sorted,list1)) 
    return result
sort_sublists([['green', 'orange'], ['black', 'white'], ['white', 'black', 'orange']])