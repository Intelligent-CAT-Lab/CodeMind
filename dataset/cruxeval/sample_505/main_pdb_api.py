def f(string):
    while string:
        if string[-1].isalpha():
            return string
        string = string[:-1]
    return string
f('--4/0-209')