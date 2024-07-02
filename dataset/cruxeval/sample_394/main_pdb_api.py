def f(text):
    k = text.splitlines()
    i = 0
    for j in k:
        if len(j) == 0:
            return i
        i+=1
    return -1
f("2 m2 \n\nbike")