def f(marks):
    highest = 0	## {"highest" : ''}
    lowest = 100	## {"lowest" : ''}
    for value in marks.values():	## {"value" : '',"marks" : ''}
        if value > highest:	## {"value" : '',"highest" : ''}
            highest = value	## {"highest" : '',"value" : ''}
        if value < lowest:	## {"value" : '',"lowest" : ''}
            lowest = value	## {"lowest" : '',"value" : ''}
    return highest, lowest	## {"highest" : '',"lowest" : ''}
