def f(s):
    count = 0
    for c in s:
        if s.rindex(c) != s.index(c):
            count+=1
    return count