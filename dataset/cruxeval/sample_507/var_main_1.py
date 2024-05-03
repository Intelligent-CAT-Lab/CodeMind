def f(text, search):
    result = text.lower()	## result = CLRJ | text = CLRJ
    return result.find(search.lower())	## result = CLRJ | search = CLRJ
