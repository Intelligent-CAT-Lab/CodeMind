def f(marks):
    highest = 0
    lowest = 100
    for value in list(marks.values()):
        if value > highest:
            highest = value
        if value < lowest:
            lowest = value
    return highest, lowest