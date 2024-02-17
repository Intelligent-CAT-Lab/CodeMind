def f(names):
    count = len(names)
    numberOfNames = 0
    for i in names:
        if i.isalpha():
            numberOfNames += 1
    return numberOfNames