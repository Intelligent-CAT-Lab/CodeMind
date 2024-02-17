def f(string):
    if string.isupper():
        return string.lower()
    elif string.islower():
        return string.upper()
    return string