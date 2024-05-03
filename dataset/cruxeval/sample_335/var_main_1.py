def f(text, to_remove):
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    if to_remove in new_text:	## to_remove = CLRJ | new_text = CLRJ
        index = new_text.index(to_remove)	## index = CLRJ | new_text = CLRJ | to_remove = CLRJ
        new_text.remove(to_remove)	## new_text = CLRJ | to_remove = CLRJ
        new_text.insert(index, '?')	## new_text = CLRJ | index = CLRJ
        new_text.remove('?')	## new_text = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
