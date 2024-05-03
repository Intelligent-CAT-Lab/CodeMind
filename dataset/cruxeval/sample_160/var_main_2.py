def f(dictionary):
    while not dictionary.get(1, len(dictionary)):	## dictionary = []
        dictionary.clear()
        break
    return dictionary	## dictionary = []
