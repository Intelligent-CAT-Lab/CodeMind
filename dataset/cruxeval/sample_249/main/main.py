def f(s):
    count = {}
    for i in s:
        if i.islower():
            count[i.lower()] = s.count(i.lower()) + count.get(i.lower(), 0)
        else:
            count[i.lower()] = s.count(i.upper()) + count.get(i.lower(), 0)
    return count