def f(dictionary):
    while not dictionary.get(1, len(dictionary)):
        dictionary.clear()
        break
    return dictionary
f({1: 47698, 1: 32849, 1: 38381, 3: 83607})