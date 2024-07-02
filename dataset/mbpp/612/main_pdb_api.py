def merge(lst):  
    return [list(ele) for ele in list(zip(*lst))] 
merge([['x', 'y'], ['a', 'b'], ['m', 'n']])