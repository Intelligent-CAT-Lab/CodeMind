def f(string):
    tmp = string.lower()
    for char in string.lower():
        if char in tmp:
            tmp = tmp.replace(char, '', 1)
    return tmp