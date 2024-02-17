def f(dct):
    values = list(dct.values())
    result = {}
    for value in values:
        item = value.split('.')[0]+'@pinc.uk'
        result[value] = item
    return result