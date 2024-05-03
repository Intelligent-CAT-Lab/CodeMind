def f(marks):
    highest = 0	## <state>highest = CLRJ</state>
    lowest = 100	## <state>lowest = CLRJ</state>
    for value in marks.values():	## <state>value = CLRJ | marks = CLRJ</state>
        if value > highest:	## <state>value = CLRJ | highest = CLRJ</state>
            highest = value	## <state>highest = CLRJ | value = CLRJ</state>
        if value < lowest:	## <state>value = CLRJ | lowest = CLRJ</state>
            lowest = value	## <state>lowest = CLRJ | value = CLRJ</state>
    return highest, lowest	## <state>highest = CLRJ | lowest = CLRJ</state>
