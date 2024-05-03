def f(text):
    arr = text.split()	## arr = [] | text = []
    result = []	## result = []
    for item in arr:	## item = [] | arr = []
        if item.endswith('day'):	## item = []
            item += 'y'
        else:
            item += 'day'	## item = []
        result.append(item)	## result = [] | item = []
    return ' '.join(result)	## result = []
