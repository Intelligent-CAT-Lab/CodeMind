Input = [('x', 'y'), ('x', 'z'), ('w', 't')]
out = {} 
for elem in Input: 
    try: 
        out[elem[0]].extend(elem[1:]) 
    except KeyError: 
        out[elem[0]] = list(elem) 
print([tuple(values) for values in out.values()])