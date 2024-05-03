def f(letters):
    a = [] 	## a = []
    for i in range(len(letters)):	## i = [] | letters = []
        if letters[i] in a:	## letters = [] | i = [] | a = []
            return 'no'
        a.append(letters[i]) 	## a = [] | letters = [] | i = []
    return 'yes'