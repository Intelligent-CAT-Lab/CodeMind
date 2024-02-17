def f(dict):
    even_keys = []
    for key in dict.keys():
        if key % 2 == 0:
            even_keys.append(key)
    return even_keys