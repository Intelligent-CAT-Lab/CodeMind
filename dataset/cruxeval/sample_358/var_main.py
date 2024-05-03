def f(text, value):
    indexes = []	## {"indexes" : ''}
    for i in range(len(text)):	## {"i" : '',"text" : ''}
        if text[i] == value and (i == 0 or text[i-1] != value):	## {"text" : '',"i" : '',"value" : ''}
            indexes.append(i) 	## {"indexes" : '',"i" : ''}
    if len(indexes) % 2 == 1:	## {"indexes" : ''}
        return text
    return text[indexes[0]+1:indexes[-1]]	## {"text" : '',"indexes" : ''}
