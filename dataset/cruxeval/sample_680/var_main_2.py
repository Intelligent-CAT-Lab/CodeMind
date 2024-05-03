def f(text):
    letters = ''	## letters = []
    for i in range(len(text)):	## i = [] | text = []
        if text[i].isalnum():	## text = [] | i = []
            letters += text[i]	## letters = [] | text = [] | i = []
    return letters	## letters = []
