def f(marks):
    highest = 0
    lowest = 100
    for value in marks.values():
        if value > highest:
            highest = value
        if value < lowest:
            lowest = value
    return highest, lowest
f({'x': 67, 'v': 89, '': 4, 'alij': 11, 'kgfsd': 72, 'yafby': 83})