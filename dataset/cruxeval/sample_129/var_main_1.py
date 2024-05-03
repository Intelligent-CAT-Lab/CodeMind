def f(text, search_string):
    indexes = []	## indexes = CLRJ
    while search_string in text:	## search_string = CLRJ | text = CLRJ
        indexes.append(text.rindex(search_string))	## indexes = CLRJ | text = CLRJ | search_string = CLRJ
        text = text[:text.rindex(search_string)]	## text = CLRJ | search_string = CLRJ
    return indexes	## indexes = CLRJ
