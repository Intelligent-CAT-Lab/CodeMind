def largest_smallest_integers(lst):
    smallest = list(filter(lambda x: x < 0, lst))	## smallest = CLRJ|x = CLRJ|lst = CLRJ
    largest = list(filter(lambda x: x > 0, lst))	## largest = CLRJ|x = CLRJ|lst = CLRJ
    return (max(smallest) if smallest else None, min(largest) if largest else None)	## smallest = CLRJ|largest = CLRJ
