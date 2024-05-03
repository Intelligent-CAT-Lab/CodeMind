def f(text, value):
    length = len(text)	## length = [] | text = []
    letters = list(text)	## letters = [] | text = []
    if value not in letters:	## value = [] | letters = []
        value = letters[0]
    return value * length	## value = [] | length = []
