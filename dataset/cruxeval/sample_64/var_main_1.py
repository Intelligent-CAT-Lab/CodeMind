def f(text, size):
    counter = len(text)	## counter = CLRJ | text = CLRJ
    for i in range(size-int(size%2)):	## i = CLRJ | size = CLRJ
        text = ' '+text+' '	## text = CLRJ
        counter += 2	## counter = CLRJ
        if counter >= size:	## counter = CLRJ | size = CLRJ
            return text	## text = CLRJ
