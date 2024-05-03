def f(dictionary):
    dictionary[1049] = 55	## dictionary = []
    key, value = dictionary.popitem()	## key = [] | value = [] | dictionary = []
    dictionary[key] = value	## dictionary = [] | key = [] | value = []
    return dictionary	## dictionary = []
