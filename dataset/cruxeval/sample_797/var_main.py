def f(dct):
    lst = []	## {"lst" : ''}
    for key in sorted(dct):	## {"key" : '',"dct" : ''}
        lst.append((key, dct[key]))	## {"lst" : '',"key" : '',"dct" : ''}
    return lst	## {"lst" : ''}
