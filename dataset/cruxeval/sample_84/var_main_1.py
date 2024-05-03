def f(text):
    arr = text.split()	## arr = CLRJ | text = CLRJ
    result = []	## result = CLRJ
    for item in arr:	## item = CLRJ | arr = CLRJ
        if item.endswith('day'):	## item = CLRJ
            item += 'y'
        else:
            item += 'day'	## item = CLRJ
        result.append(item)	## result = CLRJ | item = CLRJ
    return ' '.join(result)	## result = CLRJ
