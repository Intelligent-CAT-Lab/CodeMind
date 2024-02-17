def f(phrase):
    result = ''
    for i in phrase:
        if not i.islower():
            result += i
    return result