def f(dct):
    values = dct.values()	## {"dct" : ''}
    result = {}
    for value in values:
        item = value.split('.')[0]+'@pinc.uk'
        result[value] = item
    return result