def f(dictionary):
    dictionary[1049] = 55
    key, value = dictionary.popitem()
    dictionary[key] = value
    return dictionary