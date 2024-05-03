def f(text, new_ending):
    result = list(text)	## result = CLRJ | text = CLRJ
    result.extend(new_ending)	## result = CLRJ | new_ending = CLRJ
    return ''.join(result)	## result = CLRJ
