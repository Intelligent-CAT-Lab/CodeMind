def fix_spaces(text):
    new_text = ""	## new_text = CLRJ
    i = 0	## i = CLRJ
    start, end = 0, 0	## start = CLRJ|end = CLRJ
    while i < len(text):	## i = CLRJ|text = CLRJ
        if text[i] == " ":	## text = CLRJ|i = CLRJ
            end += 1
        else:
            if end - start > 2:	## end = CLRJ|start = CLRJ
                new_text += "-"+text[i]
            elif end - start > 0:	## end = CLRJ|start = CLRJ
                new_text += "_"*(end - start)+text[i]
            else:
                new_text += text[i]	## new_text = CLRJ|text = CLRJ|i = CLRJ
            start, end = i+1, i+1	## start = CLRJ|end = CLRJ|i = CLRJ
        i+=1	## i = CLRJ
    if end - start > 2:	## end = CLRJ|start = CLRJ
        new_text += "-"
    elif end - start > 0:	## end = CLRJ|start = CLRJ
        new_text += "_"
    return new_text	## new_text = CLRJ
