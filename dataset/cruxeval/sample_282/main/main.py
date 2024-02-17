def f(s1, s2):
    position = 1
    count = 0
    while position > 0:
        position = s1.find(s2, position)
        count += 1
        position += 1
    return count