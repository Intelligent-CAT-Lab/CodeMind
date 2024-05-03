def f(marks):
    highest = 0	## highest = CLRJ
    lowest = 100	## lowest = CLRJ
    for value in marks.values():	## value = CLRJ | marks = CLRJ
        if value > highest:	## value = CLRJ | highest = CLRJ
            highest = value	## highest = CLRJ | value = CLRJ
        if value < lowest:	## value = CLRJ | lowest = CLRJ
            lowest = value	## lowest = CLRJ | value = CLRJ
    return highest, lowest	## highest = CLRJ | lowest = CLRJ
