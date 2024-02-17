def f(dictionary):
    while not dictionary.get(1, len(dictionary)):
        dictionary.clear()
        break
    return dictionary