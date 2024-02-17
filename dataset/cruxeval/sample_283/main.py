def f(dictionary, key):
    del dictionary[key]
    if min(dictionary) == key:
        key = list(dictionary)[0]
    return key